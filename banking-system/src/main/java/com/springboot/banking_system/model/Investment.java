package com.springboot.banking_system.model;


import java.time.LocalDate;


import com.springboot.banking_system.enums.Type;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Investment {

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable =false)
	private String status;
	
	@Column(nullable =false)
	private LocalDate purchase_date;
	
	@Enumerated(EnumType.STRING)
	private Type type;
	
	@OneToMany
	private Account account;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(LocalDate purchase_date) {
		this.purchase_date = purchase_date;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}

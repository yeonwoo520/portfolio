package com.cafe24.radev.vo;
/**
 * 공업사별 부품목록 vo
 * @author Administrator
 *
 */
public class Part {
	private String partCode;
	private String partNumber;
	private String bigCate;
	private String midCate;
	private String partName;
	private String partMany;
	private String partPrice;
	private String partWrite;
	private String partUpdateDate;
	private String bsCode;
	
	
	public String getPartCode() {
		return partCode;
	}
	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}
	public String getBsCode() {
		return bsCode;
	}
	public void setBsCode(String bsCode) {
		this.bsCode = bsCode;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getBigCate() {
		return bigCate;
	}
	public void setBigCate(String bigCate) {
		this.bigCate = bigCate;
	}
	public String getMidCate() {
		return midCate;
	}
	public void setMidCate(String midCate) {
		this.midCate = midCate;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getPartMany() {
		return partMany;
	}
	public void setPartMany(String partMany) {
		this.partMany = partMany;
	}
	public String getPartPrice() {
		return partPrice;
	}
	public void setPartPrice(String partPrice) {
		this.partPrice = partPrice;
	}
	public String getPartWrite() {
		return partWrite;
	}
	public void setPartWrite(String partWrite) {
		this.partWrite = partWrite;
	}
	public String getPartUpdateDate() {
		return partUpdateDate;
	}
	public void setPartUpdateDate(String partUpdateDate) {
		this.partUpdateDate = partUpdateDate;
	}
}

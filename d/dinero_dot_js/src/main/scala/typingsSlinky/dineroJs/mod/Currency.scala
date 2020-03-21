package typingsSlinky.dineroJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ISO 4217 CURRENCY CODES as specified in the documentation
  * Taken from https://www.iso.org/iso-4217-currency-codes.html
  * sorted and parsed
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dineroJs.dineroJsStrings.AED
  - typingsSlinky.dineroJs.dineroJsStrings.AFN
  - typingsSlinky.dineroJs.dineroJsStrings.ALL
  - typingsSlinky.dineroJs.dineroJsStrings.AMD
  - typingsSlinky.dineroJs.dineroJsStrings.ANG
  - typingsSlinky.dineroJs.dineroJsStrings.AOA
  - typingsSlinky.dineroJs.dineroJsStrings.ARS
  - typingsSlinky.dineroJs.dineroJsStrings.AUD
  - typingsSlinky.dineroJs.dineroJsStrings.AWG
  - typingsSlinky.dineroJs.dineroJsStrings.AZN
  - typingsSlinky.dineroJs.dineroJsStrings.BAM
  - typingsSlinky.dineroJs.dineroJsStrings.BBD
  - typingsSlinky.dineroJs.dineroJsStrings.BDT
  - typingsSlinky.dineroJs.dineroJsStrings.BGN
  - typingsSlinky.dineroJs.dineroJsStrings.BHD
  - typingsSlinky.dineroJs.dineroJsStrings.BIF
  - typingsSlinky.dineroJs.dineroJsStrings.BMD
  - typingsSlinky.dineroJs.dineroJsStrings.BND
  - typingsSlinky.dineroJs.dineroJsStrings.BOB
  - typingsSlinky.dineroJs.dineroJsStrings.BOV
  - typingsSlinky.dineroJs.dineroJsStrings.BRL
  - typingsSlinky.dineroJs.dineroJsStrings.BSD
  - typingsSlinky.dineroJs.dineroJsStrings.BTN
  - typingsSlinky.dineroJs.dineroJsStrings.BWP
  - typingsSlinky.dineroJs.dineroJsStrings.BYN
  - typingsSlinky.dineroJs.dineroJsStrings.BZD
  - typingsSlinky.dineroJs.dineroJsStrings.CAD
  - typingsSlinky.dineroJs.dineroJsStrings.CDF
  - typingsSlinky.dineroJs.dineroJsStrings.CHE
  - typingsSlinky.dineroJs.dineroJsStrings.CHF
  - typingsSlinky.dineroJs.dineroJsStrings.CHW
  - typingsSlinky.dineroJs.dineroJsStrings.CLF
  - typingsSlinky.dineroJs.dineroJsStrings.CLP
  - typingsSlinky.dineroJs.dineroJsStrings.CNY
  - typingsSlinky.dineroJs.dineroJsStrings.COP
  - typingsSlinky.dineroJs.dineroJsStrings.COU
  - typingsSlinky.dineroJs.dineroJsStrings.CRC
  - typingsSlinky.dineroJs.dineroJsStrings.CUC
  - typingsSlinky.dineroJs.dineroJsStrings.CUP
  - typingsSlinky.dineroJs.dineroJsStrings.CVE
  - typingsSlinky.dineroJs.dineroJsStrings.CZK
  - typingsSlinky.dineroJs.dineroJsStrings.DJF
  - typingsSlinky.dineroJs.dineroJsStrings.DKK
  - typingsSlinky.dineroJs.dineroJsStrings.DOP
  - typingsSlinky.dineroJs.dineroJsStrings.DZD
  - typingsSlinky.dineroJs.dineroJsStrings.EGP
  - typingsSlinky.dineroJs.dineroJsStrings.ERN
  - typingsSlinky.dineroJs.dineroJsStrings.ETB
  - typingsSlinky.dineroJs.dineroJsStrings.EUR
  - typingsSlinky.dineroJs.dineroJsStrings.FJD
  - typingsSlinky.dineroJs.dineroJsStrings.FKP
  - typingsSlinky.dineroJs.dineroJsStrings.GBP
  - typingsSlinky.dineroJs.dineroJsStrings.GEL
  - typingsSlinky.dineroJs.dineroJsStrings.GHS
  - typingsSlinky.dineroJs.dineroJsStrings.GIP
  - typingsSlinky.dineroJs.dineroJsStrings.GMD
  - typingsSlinky.dineroJs.dineroJsStrings.GNF
  - typingsSlinky.dineroJs.dineroJsStrings.GTQ
  - typingsSlinky.dineroJs.dineroJsStrings.GYD
  - typingsSlinky.dineroJs.dineroJsStrings.HKD
  - typingsSlinky.dineroJs.dineroJsStrings.HNL
  - typingsSlinky.dineroJs.dineroJsStrings.HRK
  - typingsSlinky.dineroJs.dineroJsStrings.HTG
  - typingsSlinky.dineroJs.dineroJsStrings.HUF
  - typingsSlinky.dineroJs.dineroJsStrings.IDR
  - typingsSlinky.dineroJs.dineroJsStrings.ILS
  - typingsSlinky.dineroJs.dineroJsStrings.INR
  - typingsSlinky.dineroJs.dineroJsStrings.IQD
  - typingsSlinky.dineroJs.dineroJsStrings.IRR
  - typingsSlinky.dineroJs.dineroJsStrings.ISK
  - typingsSlinky.dineroJs.dineroJsStrings.JMD
  - typingsSlinky.dineroJs.dineroJsStrings.JOD
  - typingsSlinky.dineroJs.dineroJsStrings.JPY
  - typingsSlinky.dineroJs.dineroJsStrings.KES
  - typingsSlinky.dineroJs.dineroJsStrings.KGS
  - typingsSlinky.dineroJs.dineroJsStrings.KHR
  - typingsSlinky.dineroJs.dineroJsStrings.KMF
  - typingsSlinky.dineroJs.dineroJsStrings.KPW
  - typingsSlinky.dineroJs.dineroJsStrings.KRW
  - typingsSlinky.dineroJs.dineroJsStrings.KWD
  - typingsSlinky.dineroJs.dineroJsStrings.KYD
  - typingsSlinky.dineroJs.dineroJsStrings.KZT
  - typingsSlinky.dineroJs.dineroJsStrings.LAK
  - typingsSlinky.dineroJs.dineroJsStrings.LBP
  - typingsSlinky.dineroJs.dineroJsStrings.LKR
  - typingsSlinky.dineroJs.dineroJsStrings.LRD
  - typingsSlinky.dineroJs.dineroJsStrings.LSL
  - typingsSlinky.dineroJs.dineroJsStrings.LYD
  - typingsSlinky.dineroJs.dineroJsStrings.MAD
  - typingsSlinky.dineroJs.dineroJsStrings.MDL
  - typingsSlinky.dineroJs.dineroJsStrings.MGA
  - typingsSlinky.dineroJs.dineroJsStrings.MKD
  - typingsSlinky.dineroJs.dineroJsStrings.MMK
  - typingsSlinky.dineroJs.dineroJsStrings.MNT
  - typingsSlinky.dineroJs.dineroJsStrings.MOP
  - typingsSlinky.dineroJs.dineroJsStrings.MRU
  - typingsSlinky.dineroJs.dineroJsStrings.MUR
  - typingsSlinky.dineroJs.dineroJsStrings.MVR
  - typingsSlinky.dineroJs.dineroJsStrings.MWK
  - typingsSlinky.dineroJs.dineroJsStrings.MXN
  - typingsSlinky.dineroJs.dineroJsStrings.MXV
  - typingsSlinky.dineroJs.dineroJsStrings.MYR
  - typingsSlinky.dineroJs.dineroJsStrings.MZN
  - typingsSlinky.dineroJs.dineroJsStrings.NAD
  - typingsSlinky.dineroJs.dineroJsStrings.NGN
  - typingsSlinky.dineroJs.dineroJsStrings.NIO
  - typingsSlinky.dineroJs.dineroJsStrings.NOK
  - typingsSlinky.dineroJs.dineroJsStrings.NPR
  - typingsSlinky.dineroJs.dineroJsStrings.NZD
  - typingsSlinky.dineroJs.dineroJsStrings.OMR
  - typingsSlinky.dineroJs.dineroJsStrings.PAB
  - typingsSlinky.dineroJs.dineroJsStrings.PEN
  - typingsSlinky.dineroJs.dineroJsStrings.PGK
  - typingsSlinky.dineroJs.dineroJsStrings.PHP
  - typingsSlinky.dineroJs.dineroJsStrings.PKR
  - typingsSlinky.dineroJs.dineroJsStrings.PLN
  - typingsSlinky.dineroJs.dineroJsStrings.PYG
  - typingsSlinky.dineroJs.dineroJsStrings.QAR
  - typingsSlinky.dineroJs.dineroJsStrings.RON
  - typingsSlinky.dineroJs.dineroJsStrings.RSD
  - typingsSlinky.dineroJs.dineroJsStrings.RUB
  - typingsSlinky.dineroJs.dineroJsStrings.RWF
  - typingsSlinky.dineroJs.dineroJsStrings.SAR
  - typingsSlinky.dineroJs.dineroJsStrings.SBD
  - typingsSlinky.dineroJs.dineroJsStrings.SCR
  - typingsSlinky.dineroJs.dineroJsStrings.SDG
  - typingsSlinky.dineroJs.dineroJsStrings.SEK
  - typingsSlinky.dineroJs.dineroJsStrings.SGD
  - typingsSlinky.dineroJs.dineroJsStrings.SHP
  - typingsSlinky.dineroJs.dineroJsStrings.SLL
  - typingsSlinky.dineroJs.dineroJsStrings.SOS
  - typingsSlinky.dineroJs.dineroJsStrings.SRD
  - typingsSlinky.dineroJs.dineroJsStrings.SSP
  - typingsSlinky.dineroJs.dineroJsStrings.STN
  - typingsSlinky.dineroJs.dineroJsStrings.SVC
  - typingsSlinky.dineroJs.dineroJsStrings.SYP
  - typingsSlinky.dineroJs.dineroJsStrings.SZL
  - typingsSlinky.dineroJs.dineroJsStrings.THB
  - typingsSlinky.dineroJs.dineroJsStrings.TJS
  - typingsSlinky.dineroJs.dineroJsStrings.TMT
  - typingsSlinky.dineroJs.dineroJsStrings.TND
  - typingsSlinky.dineroJs.dineroJsStrings.TOP
  - typingsSlinky.dineroJs.dineroJsStrings.TRY
  - typingsSlinky.dineroJs.dineroJsStrings.TTD
  - typingsSlinky.dineroJs.dineroJsStrings.TWD
  - typingsSlinky.dineroJs.dineroJsStrings.TZS
  - typingsSlinky.dineroJs.dineroJsStrings.UAH
  - typingsSlinky.dineroJs.dineroJsStrings.UGX
  - typingsSlinky.dineroJs.dineroJsStrings.USD
  - typingsSlinky.dineroJs.dineroJsStrings.USN
  - typingsSlinky.dineroJs.dineroJsStrings.UYI
  - typingsSlinky.dineroJs.dineroJsStrings.UYU
  - typingsSlinky.dineroJs.dineroJsStrings.UYW
  - typingsSlinky.dineroJs.dineroJsStrings.UZS
  - typingsSlinky.dineroJs.dineroJsStrings.VES
  - typingsSlinky.dineroJs.dineroJsStrings.VND
  - typingsSlinky.dineroJs.dineroJsStrings.VUV
  - typingsSlinky.dineroJs.dineroJsStrings.WST
  - typingsSlinky.dineroJs.dineroJsStrings.XAF
  - typingsSlinky.dineroJs.dineroJsStrings.XAG
  - typingsSlinky.dineroJs.dineroJsStrings.XAU
  - typingsSlinky.dineroJs.dineroJsStrings.XBA
  - typingsSlinky.dineroJs.dineroJsStrings.XBB
  - typingsSlinky.dineroJs.dineroJsStrings.XBC
  - typingsSlinky.dineroJs.dineroJsStrings.XBD
  - typingsSlinky.dineroJs.dineroJsStrings.XCD
  - typingsSlinky.dineroJs.dineroJsStrings.XDR
  - typingsSlinky.dineroJs.dineroJsStrings.XOF
  - typingsSlinky.dineroJs.dineroJsStrings.XPD
  - typingsSlinky.dineroJs.dineroJsStrings.XPF
  - typingsSlinky.dineroJs.dineroJsStrings.XPT
  - typingsSlinky.dineroJs.dineroJsStrings.XSU
  - typingsSlinky.dineroJs.dineroJsStrings.XTS
  - typingsSlinky.dineroJs.dineroJsStrings.XUA
  - typingsSlinky.dineroJs.dineroJsStrings.XXX
  - typingsSlinky.dineroJs.dineroJsStrings.YER
  - typingsSlinky.dineroJs.dineroJsStrings.ZAR
  - typingsSlinky.dineroJs.dineroJsStrings.ZMW
  - typingsSlinky.dineroJs.dineroJsStrings.ZWL
*/
trait Currency extends js.Object

object Currency {
  @scala.inline
  def AED: typingsSlinky.dineroJs.dineroJsStrings.AED = this.cast("AED")
  @scala.inline
  def AFN: typingsSlinky.dineroJs.dineroJsStrings.AFN = this.cast("AFN")
  @scala.inline
  def ALL: typingsSlinky.dineroJs.dineroJsStrings.ALL = this.cast("ALL")
  @scala.inline
  def AMD: typingsSlinky.dineroJs.dineroJsStrings.AMD = this.cast("AMD")
  @scala.inline
  def ANG: typingsSlinky.dineroJs.dineroJsStrings.ANG = this.cast("ANG")
  @scala.inline
  def AOA: typingsSlinky.dineroJs.dineroJsStrings.AOA = this.cast("AOA")
  @scala.inline
  def ARS: typingsSlinky.dineroJs.dineroJsStrings.ARS = this.cast("ARS")
  @scala.inline
  def AUD: typingsSlinky.dineroJs.dineroJsStrings.AUD = this.cast("AUD")
  @scala.inline
  def AWG: typingsSlinky.dineroJs.dineroJsStrings.AWG = this.cast("AWG")
  @scala.inline
  def AZN: typingsSlinky.dineroJs.dineroJsStrings.AZN = this.cast("AZN")
  @scala.inline
  def BAM: typingsSlinky.dineroJs.dineroJsStrings.BAM = this.cast("BAM")
  @scala.inline
  def BBD: typingsSlinky.dineroJs.dineroJsStrings.BBD = this.cast("BBD")
  @scala.inline
  def BDT: typingsSlinky.dineroJs.dineroJsStrings.BDT = this.cast("BDT")
  @scala.inline
  def BGN: typingsSlinky.dineroJs.dineroJsStrings.BGN = this.cast("BGN")
  @scala.inline
  def BHD: typingsSlinky.dineroJs.dineroJsStrings.BHD = this.cast("BHD")
  @scala.inline
  def BIF: typingsSlinky.dineroJs.dineroJsStrings.BIF = this.cast("BIF")
  @scala.inline
  def BMD: typingsSlinky.dineroJs.dineroJsStrings.BMD = this.cast("BMD")
  @scala.inline
  def BND: typingsSlinky.dineroJs.dineroJsStrings.BND = this.cast("BND")
  @scala.inline
  def BOB: typingsSlinky.dineroJs.dineroJsStrings.BOB = this.cast("BOB")
  @scala.inline
  def BOV: typingsSlinky.dineroJs.dineroJsStrings.BOV = this.cast("BOV")
  @scala.inline
  def BRL: typingsSlinky.dineroJs.dineroJsStrings.BRL = this.cast("BRL")
  @scala.inline
  def BSD: typingsSlinky.dineroJs.dineroJsStrings.BSD = this.cast("BSD")
  @scala.inline
  def BTN: typingsSlinky.dineroJs.dineroJsStrings.BTN = this.cast("BTN")
  @scala.inline
  def BWP: typingsSlinky.dineroJs.dineroJsStrings.BWP = this.cast("BWP")
  @scala.inline
  def BYN: typingsSlinky.dineroJs.dineroJsStrings.BYN = this.cast("BYN")
  @scala.inline
  def BZD: typingsSlinky.dineroJs.dineroJsStrings.BZD = this.cast("BZD")
  @scala.inline
  def CAD: typingsSlinky.dineroJs.dineroJsStrings.CAD = this.cast("CAD")
  @scala.inline
  def CDF: typingsSlinky.dineroJs.dineroJsStrings.CDF = this.cast("CDF")
  @scala.inline
  def CHE: typingsSlinky.dineroJs.dineroJsStrings.CHE = this.cast("CHE")
  @scala.inline
  def CHF: typingsSlinky.dineroJs.dineroJsStrings.CHF = this.cast("CHF")
  @scala.inline
  def CHW: typingsSlinky.dineroJs.dineroJsStrings.CHW = this.cast("CHW")
  @scala.inline
  def CLF: typingsSlinky.dineroJs.dineroJsStrings.CLF = this.cast("CLF")
  @scala.inline
  def CLP: typingsSlinky.dineroJs.dineroJsStrings.CLP = this.cast("CLP")
  @scala.inline
  def CNY: typingsSlinky.dineroJs.dineroJsStrings.CNY = this.cast("CNY")
  @scala.inline
  def COP: typingsSlinky.dineroJs.dineroJsStrings.COP = this.cast("COP")
  @scala.inline
  def COU: typingsSlinky.dineroJs.dineroJsStrings.COU = this.cast("COU")
  @scala.inline
  def CRC: typingsSlinky.dineroJs.dineroJsStrings.CRC = this.cast("CRC")
  @scala.inline
  def CUC: typingsSlinky.dineroJs.dineroJsStrings.CUC = this.cast("CUC")
  @scala.inline
  def CUP: typingsSlinky.dineroJs.dineroJsStrings.CUP = this.cast("CUP")
  @scala.inline
  def CVE: typingsSlinky.dineroJs.dineroJsStrings.CVE = this.cast("CVE")
  @scala.inline
  def CZK: typingsSlinky.dineroJs.dineroJsStrings.CZK = this.cast("CZK")
  @scala.inline
  def DJF: typingsSlinky.dineroJs.dineroJsStrings.DJF = this.cast("DJF")
  @scala.inline
  def DKK: typingsSlinky.dineroJs.dineroJsStrings.DKK = this.cast("DKK")
  @scala.inline
  def DOP: typingsSlinky.dineroJs.dineroJsStrings.DOP = this.cast("DOP")
  @scala.inline
  def DZD: typingsSlinky.dineroJs.dineroJsStrings.DZD = this.cast("DZD")
  @scala.inline
  def EGP: typingsSlinky.dineroJs.dineroJsStrings.EGP = this.cast("EGP")
  @scala.inline
  def ERN: typingsSlinky.dineroJs.dineroJsStrings.ERN = this.cast("ERN")
  @scala.inline
  def ETB: typingsSlinky.dineroJs.dineroJsStrings.ETB = this.cast("ETB")
  @scala.inline
  def EUR: typingsSlinky.dineroJs.dineroJsStrings.EUR = this.cast("EUR")
  @scala.inline
  def FJD: typingsSlinky.dineroJs.dineroJsStrings.FJD = this.cast("FJD")
  @scala.inline
  def FKP: typingsSlinky.dineroJs.dineroJsStrings.FKP = this.cast("FKP")
  @scala.inline
  def GBP: typingsSlinky.dineroJs.dineroJsStrings.GBP = this.cast("GBP")
  @scala.inline
  def GEL: typingsSlinky.dineroJs.dineroJsStrings.GEL = this.cast("GEL")
  @scala.inline
  def GHS: typingsSlinky.dineroJs.dineroJsStrings.GHS = this.cast("GHS")
  @scala.inline
  def GIP: typingsSlinky.dineroJs.dineroJsStrings.GIP = this.cast("GIP")
  @scala.inline
  def GMD: typingsSlinky.dineroJs.dineroJsStrings.GMD = this.cast("GMD")
  @scala.inline
  def GNF: typingsSlinky.dineroJs.dineroJsStrings.GNF = this.cast("GNF")
  @scala.inline
  def GTQ: typingsSlinky.dineroJs.dineroJsStrings.GTQ = this.cast("GTQ")
  @scala.inline
  def GYD: typingsSlinky.dineroJs.dineroJsStrings.GYD = this.cast("GYD")
  @scala.inline
  def HKD: typingsSlinky.dineroJs.dineroJsStrings.HKD = this.cast("HKD")
  @scala.inline
  def HNL: typingsSlinky.dineroJs.dineroJsStrings.HNL = this.cast("HNL")
  @scala.inline
  def HRK: typingsSlinky.dineroJs.dineroJsStrings.HRK = this.cast("HRK")
  @scala.inline
  def HTG: typingsSlinky.dineroJs.dineroJsStrings.HTG = this.cast("HTG")
  @scala.inline
  def HUF: typingsSlinky.dineroJs.dineroJsStrings.HUF = this.cast("HUF")
  @scala.inline
  def IDR: typingsSlinky.dineroJs.dineroJsStrings.IDR = this.cast("IDR")
  @scala.inline
  def ILS: typingsSlinky.dineroJs.dineroJsStrings.ILS = this.cast("ILS")
  @scala.inline
  def INR: typingsSlinky.dineroJs.dineroJsStrings.INR = this.cast("INR")
  @scala.inline
  def IQD: typingsSlinky.dineroJs.dineroJsStrings.IQD = this.cast("IQD")
  @scala.inline
  def IRR: typingsSlinky.dineroJs.dineroJsStrings.IRR = this.cast("IRR")
  @scala.inline
  def ISK: typingsSlinky.dineroJs.dineroJsStrings.ISK = this.cast("ISK")
  @scala.inline
  def JMD: typingsSlinky.dineroJs.dineroJsStrings.JMD = this.cast("JMD")
  @scala.inline
  def JOD: typingsSlinky.dineroJs.dineroJsStrings.JOD = this.cast("JOD")
  @scala.inline
  def JPY: typingsSlinky.dineroJs.dineroJsStrings.JPY = this.cast("JPY")
  @scala.inline
  def KES: typingsSlinky.dineroJs.dineroJsStrings.KES = this.cast("KES")
  @scala.inline
  def KGS: typingsSlinky.dineroJs.dineroJsStrings.KGS = this.cast("KGS")
  @scala.inline
  def KHR: typingsSlinky.dineroJs.dineroJsStrings.KHR = this.cast("KHR")
  @scala.inline
  def KMF: typingsSlinky.dineroJs.dineroJsStrings.KMF = this.cast("KMF")
  @scala.inline
  def KPW: typingsSlinky.dineroJs.dineroJsStrings.KPW = this.cast("KPW")
  @scala.inline
  def KRW: typingsSlinky.dineroJs.dineroJsStrings.KRW = this.cast("KRW")
  @scala.inline
  def KWD: typingsSlinky.dineroJs.dineroJsStrings.KWD = this.cast("KWD")
  @scala.inline
  def KYD: typingsSlinky.dineroJs.dineroJsStrings.KYD = this.cast("KYD")
  @scala.inline
  def KZT: typingsSlinky.dineroJs.dineroJsStrings.KZT = this.cast("KZT")
  @scala.inline
  def LAK: typingsSlinky.dineroJs.dineroJsStrings.LAK = this.cast("LAK")
  @scala.inline
  def LBP: typingsSlinky.dineroJs.dineroJsStrings.LBP = this.cast("LBP")
  @scala.inline
  def LKR: typingsSlinky.dineroJs.dineroJsStrings.LKR = this.cast("LKR")
  @scala.inline
  def LRD: typingsSlinky.dineroJs.dineroJsStrings.LRD = this.cast("LRD")
  @scala.inline
  def LSL: typingsSlinky.dineroJs.dineroJsStrings.LSL = this.cast("LSL")
  @scala.inline
  def LYD: typingsSlinky.dineroJs.dineroJsStrings.LYD = this.cast("LYD")
  @scala.inline
  def MAD: typingsSlinky.dineroJs.dineroJsStrings.MAD = this.cast("MAD")
  @scala.inline
  def MDL: typingsSlinky.dineroJs.dineroJsStrings.MDL = this.cast("MDL")
  @scala.inline
  def MGA: typingsSlinky.dineroJs.dineroJsStrings.MGA = this.cast("MGA")
  @scala.inline
  def MKD: typingsSlinky.dineroJs.dineroJsStrings.MKD = this.cast("MKD")
  @scala.inline
  def MMK: typingsSlinky.dineroJs.dineroJsStrings.MMK = this.cast("MMK")
  @scala.inline
  def MNT: typingsSlinky.dineroJs.dineroJsStrings.MNT = this.cast("MNT")
  @scala.inline
  def MOP: typingsSlinky.dineroJs.dineroJsStrings.MOP = this.cast("MOP")
  @scala.inline
  def MRU: typingsSlinky.dineroJs.dineroJsStrings.MRU = this.cast("MRU")
  @scala.inline
  def MUR: typingsSlinky.dineroJs.dineroJsStrings.MUR = this.cast("MUR")
  @scala.inline
  def MVR: typingsSlinky.dineroJs.dineroJsStrings.MVR = this.cast("MVR")
  @scala.inline
  def MWK: typingsSlinky.dineroJs.dineroJsStrings.MWK = this.cast("MWK")
  @scala.inline
  def MXN: typingsSlinky.dineroJs.dineroJsStrings.MXN = this.cast("MXN")
  @scala.inline
  def MXV: typingsSlinky.dineroJs.dineroJsStrings.MXV = this.cast("MXV")
  @scala.inline
  def MYR: typingsSlinky.dineroJs.dineroJsStrings.MYR = this.cast("MYR")
  @scala.inline
  def MZN: typingsSlinky.dineroJs.dineroJsStrings.MZN = this.cast("MZN")
  @scala.inline
  def NAD: typingsSlinky.dineroJs.dineroJsStrings.NAD = this.cast("NAD")
  @scala.inline
  def NGN: typingsSlinky.dineroJs.dineroJsStrings.NGN = this.cast("NGN")
  @scala.inline
  def NIO: typingsSlinky.dineroJs.dineroJsStrings.NIO = this.cast("NIO")
  @scala.inline
  def NOK: typingsSlinky.dineroJs.dineroJsStrings.NOK = this.cast("NOK")
  @scala.inline
  def NPR: typingsSlinky.dineroJs.dineroJsStrings.NPR = this.cast("NPR")
  @scala.inline
  def NZD: typingsSlinky.dineroJs.dineroJsStrings.NZD = this.cast("NZD")
  @scala.inline
  def OMR: typingsSlinky.dineroJs.dineroJsStrings.OMR = this.cast("OMR")
  @scala.inline
  def PAB: typingsSlinky.dineroJs.dineroJsStrings.PAB = this.cast("PAB")
  @scala.inline
  def PEN: typingsSlinky.dineroJs.dineroJsStrings.PEN = this.cast("PEN")
  @scala.inline
  def PGK: typingsSlinky.dineroJs.dineroJsStrings.PGK = this.cast("PGK")
  @scala.inline
  def PHP: typingsSlinky.dineroJs.dineroJsStrings.PHP = this.cast("PHP")
  @scala.inline
  def PKR: typingsSlinky.dineroJs.dineroJsStrings.PKR = this.cast("PKR")
  @scala.inline
  def PLN: typingsSlinky.dineroJs.dineroJsStrings.PLN = this.cast("PLN")
  @scala.inline
  def PYG: typingsSlinky.dineroJs.dineroJsStrings.PYG = this.cast("PYG")
  @scala.inline
  def QAR: typingsSlinky.dineroJs.dineroJsStrings.QAR = this.cast("QAR")
  @scala.inline
  def RON: typingsSlinky.dineroJs.dineroJsStrings.RON = this.cast("RON")
  @scala.inline
  def RSD: typingsSlinky.dineroJs.dineroJsStrings.RSD = this.cast("RSD")
  @scala.inline
  def RUB: typingsSlinky.dineroJs.dineroJsStrings.RUB = this.cast("RUB")
  @scala.inline
  def RWF: typingsSlinky.dineroJs.dineroJsStrings.RWF = this.cast("RWF")
  @scala.inline
  def SAR: typingsSlinky.dineroJs.dineroJsStrings.SAR = this.cast("SAR")
  @scala.inline
  def SBD: typingsSlinky.dineroJs.dineroJsStrings.SBD = this.cast("SBD")
  @scala.inline
  def SCR: typingsSlinky.dineroJs.dineroJsStrings.SCR = this.cast("SCR")
  @scala.inline
  def SDG: typingsSlinky.dineroJs.dineroJsStrings.SDG = this.cast("SDG")
  @scala.inline
  def SEK: typingsSlinky.dineroJs.dineroJsStrings.SEK = this.cast("SEK")
  @scala.inline
  def SGD: typingsSlinky.dineroJs.dineroJsStrings.SGD = this.cast("SGD")
  @scala.inline
  def SHP: typingsSlinky.dineroJs.dineroJsStrings.SHP = this.cast("SHP")
  @scala.inline
  def SLL: typingsSlinky.dineroJs.dineroJsStrings.SLL = this.cast("SLL")
  @scala.inline
  def SOS: typingsSlinky.dineroJs.dineroJsStrings.SOS = this.cast("SOS")
  @scala.inline
  def SRD: typingsSlinky.dineroJs.dineroJsStrings.SRD = this.cast("SRD")
  @scala.inline
  def SSP: typingsSlinky.dineroJs.dineroJsStrings.SSP = this.cast("SSP")
  @scala.inline
  def STN: typingsSlinky.dineroJs.dineroJsStrings.STN = this.cast("STN")
  @scala.inline
  def SVC: typingsSlinky.dineroJs.dineroJsStrings.SVC = this.cast("SVC")
  @scala.inline
  def SYP: typingsSlinky.dineroJs.dineroJsStrings.SYP = this.cast("SYP")
  @scala.inline
  def SZL: typingsSlinky.dineroJs.dineroJsStrings.SZL = this.cast("SZL")
  @scala.inline
  def THB: typingsSlinky.dineroJs.dineroJsStrings.THB = this.cast("THB")
  @scala.inline
  def TJS: typingsSlinky.dineroJs.dineroJsStrings.TJS = this.cast("TJS")
  @scala.inline
  def TMT: typingsSlinky.dineroJs.dineroJsStrings.TMT = this.cast("TMT")
  @scala.inline
  def TND: typingsSlinky.dineroJs.dineroJsStrings.TND = this.cast("TND")
  @scala.inline
  def TOP: typingsSlinky.dineroJs.dineroJsStrings.TOP = this.cast("TOP")
  @scala.inline
  def TRY: typingsSlinky.dineroJs.dineroJsStrings.TRY = this.cast("TRY")
  @scala.inline
  def TTD: typingsSlinky.dineroJs.dineroJsStrings.TTD = this.cast("TTD")
  @scala.inline
  def TWD: typingsSlinky.dineroJs.dineroJsStrings.TWD = this.cast("TWD")
  @scala.inline
  def TZS: typingsSlinky.dineroJs.dineroJsStrings.TZS = this.cast("TZS")
  @scala.inline
  def UAH: typingsSlinky.dineroJs.dineroJsStrings.UAH = this.cast("UAH")
  @scala.inline
  def UGX: typingsSlinky.dineroJs.dineroJsStrings.UGX = this.cast("UGX")
  @scala.inline
  def USD: typingsSlinky.dineroJs.dineroJsStrings.USD = this.cast("USD")
  @scala.inline
  def USN: typingsSlinky.dineroJs.dineroJsStrings.USN = this.cast("USN")
  @scala.inline
  def UYI: typingsSlinky.dineroJs.dineroJsStrings.UYI = this.cast("UYI")
  @scala.inline
  def UYU: typingsSlinky.dineroJs.dineroJsStrings.UYU = this.cast("UYU")
  @scala.inline
  def UYW: typingsSlinky.dineroJs.dineroJsStrings.UYW = this.cast("UYW")
  @scala.inline
  def UZS: typingsSlinky.dineroJs.dineroJsStrings.UZS = this.cast("UZS")
  @scala.inline
  def VES: typingsSlinky.dineroJs.dineroJsStrings.VES = this.cast("VES")
  @scala.inline
  def VND: typingsSlinky.dineroJs.dineroJsStrings.VND = this.cast("VND")
  @scala.inline
  def VUV: typingsSlinky.dineroJs.dineroJsStrings.VUV = this.cast("VUV")
  @scala.inline
  def WST: typingsSlinky.dineroJs.dineroJsStrings.WST = this.cast("WST")
  @scala.inline
  def XAF: typingsSlinky.dineroJs.dineroJsStrings.XAF = this.cast("XAF")
  @scala.inline
  def XAG: typingsSlinky.dineroJs.dineroJsStrings.XAG = this.cast("XAG")
  @scala.inline
  def XAU: typingsSlinky.dineroJs.dineroJsStrings.XAU = this.cast("XAU")
  @scala.inline
  def XBA: typingsSlinky.dineroJs.dineroJsStrings.XBA = this.cast("XBA")
  @scala.inline
  def XBB: typingsSlinky.dineroJs.dineroJsStrings.XBB = this.cast("XBB")
  @scala.inline
  def XBC: typingsSlinky.dineroJs.dineroJsStrings.XBC = this.cast("XBC")
  @scala.inline
  def XBD: typingsSlinky.dineroJs.dineroJsStrings.XBD = this.cast("XBD")
  @scala.inline
  def XCD: typingsSlinky.dineroJs.dineroJsStrings.XCD = this.cast("XCD")
  @scala.inline
  def XDR: typingsSlinky.dineroJs.dineroJsStrings.XDR = this.cast("XDR")
  @scala.inline
  def XOF: typingsSlinky.dineroJs.dineroJsStrings.XOF = this.cast("XOF")
  @scala.inline
  def XPD: typingsSlinky.dineroJs.dineroJsStrings.XPD = this.cast("XPD")
  @scala.inline
  def XPF: typingsSlinky.dineroJs.dineroJsStrings.XPF = this.cast("XPF")
  @scala.inline
  def XPT: typingsSlinky.dineroJs.dineroJsStrings.XPT = this.cast("XPT")
  @scala.inline
  def XSU: typingsSlinky.dineroJs.dineroJsStrings.XSU = this.cast("XSU")
  @scala.inline
  def XTS: typingsSlinky.dineroJs.dineroJsStrings.XTS = this.cast("XTS")
  @scala.inline
  def XUA: typingsSlinky.dineroJs.dineroJsStrings.XUA = this.cast("XUA")
  @scala.inline
  def XXX: typingsSlinky.dineroJs.dineroJsStrings.XXX = this.cast("XXX")
  @scala.inline
  def YER: typingsSlinky.dineroJs.dineroJsStrings.YER = this.cast("YER")
  @scala.inline
  def ZAR: typingsSlinky.dineroJs.dineroJsStrings.ZAR = this.cast("ZAR")
  @scala.inline
  def ZMW: typingsSlinky.dineroJs.dineroJsStrings.ZMW = this.cast("ZMW")
  @scala.inline
  def ZWL: typingsSlinky.dineroJs.dineroJsStrings.ZWL = this.cast("ZWL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


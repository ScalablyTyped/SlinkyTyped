package typingsSlinky.dineroDotJs.dineroDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ISO 4217 CURRENCY CODES as specified in the documentation
  * Taken from https://www.iso.org/iso-4217-currency-codes.html
  * sorted and parsed
  */
/* Rewritten from type alias, can be one of: 
  - typings.dineroDotJs.dineroDotJsStrings.AED
  - typings.dineroDotJs.dineroDotJsStrings.AFN
  - typings.dineroDotJs.dineroDotJsStrings.ALL
  - typings.dineroDotJs.dineroDotJsStrings.AMD
  - typings.dineroDotJs.dineroDotJsStrings.ANG
  - typings.dineroDotJs.dineroDotJsStrings.AOA
  - typings.dineroDotJs.dineroDotJsStrings.ARS
  - typings.dineroDotJs.dineroDotJsStrings.AUD
  - typings.dineroDotJs.dineroDotJsStrings.AWG
  - typings.dineroDotJs.dineroDotJsStrings.AZN
  - typings.dineroDotJs.dineroDotJsStrings.BAM
  - typings.dineroDotJs.dineroDotJsStrings.BBD
  - typings.dineroDotJs.dineroDotJsStrings.BDT
  - typings.dineroDotJs.dineroDotJsStrings.BGN
  - typings.dineroDotJs.dineroDotJsStrings.BHD
  - typings.dineroDotJs.dineroDotJsStrings.BIF
  - typings.dineroDotJs.dineroDotJsStrings.BMD
  - typings.dineroDotJs.dineroDotJsStrings.BND
  - typings.dineroDotJs.dineroDotJsStrings.BOB
  - typings.dineroDotJs.dineroDotJsStrings.BOV
  - typings.dineroDotJs.dineroDotJsStrings.BRL
  - typings.dineroDotJs.dineroDotJsStrings.BSD
  - typings.dineroDotJs.dineroDotJsStrings.BTN
  - typings.dineroDotJs.dineroDotJsStrings.BWP
  - typings.dineroDotJs.dineroDotJsStrings.BYN
  - typings.dineroDotJs.dineroDotJsStrings.BZD
  - typings.dineroDotJs.dineroDotJsStrings.CAD
  - typings.dineroDotJs.dineroDotJsStrings.CDF
  - typings.dineroDotJs.dineroDotJsStrings.CHE
  - typings.dineroDotJs.dineroDotJsStrings.CHF
  - typings.dineroDotJs.dineroDotJsStrings.CHW
  - typings.dineroDotJs.dineroDotJsStrings.CLF
  - typings.dineroDotJs.dineroDotJsStrings.CLP
  - typings.dineroDotJs.dineroDotJsStrings.CNY
  - typings.dineroDotJs.dineroDotJsStrings.COP
  - typings.dineroDotJs.dineroDotJsStrings.COU
  - typings.dineroDotJs.dineroDotJsStrings.CRC
  - typings.dineroDotJs.dineroDotJsStrings.CUC
  - typings.dineroDotJs.dineroDotJsStrings.CUP
  - typings.dineroDotJs.dineroDotJsStrings.CVE
  - typings.dineroDotJs.dineroDotJsStrings.CZK
  - typings.dineroDotJs.dineroDotJsStrings.DJF
  - typings.dineroDotJs.dineroDotJsStrings.DKK
  - typings.dineroDotJs.dineroDotJsStrings.DOP
  - typings.dineroDotJs.dineroDotJsStrings.DZD
  - typings.dineroDotJs.dineroDotJsStrings.EGP
  - typings.dineroDotJs.dineroDotJsStrings.ERN
  - typings.dineroDotJs.dineroDotJsStrings.ETB
  - typings.dineroDotJs.dineroDotJsStrings.EUR
  - typings.dineroDotJs.dineroDotJsStrings.FJD
  - typings.dineroDotJs.dineroDotJsStrings.FKP
  - typings.dineroDotJs.dineroDotJsStrings.GBP
  - typings.dineroDotJs.dineroDotJsStrings.GEL
  - typings.dineroDotJs.dineroDotJsStrings.GHS
  - typings.dineroDotJs.dineroDotJsStrings.GIP
  - typings.dineroDotJs.dineroDotJsStrings.GMD
  - typings.dineroDotJs.dineroDotJsStrings.GNF
  - typings.dineroDotJs.dineroDotJsStrings.GTQ
  - typings.dineroDotJs.dineroDotJsStrings.GYD
  - typings.dineroDotJs.dineroDotJsStrings.HKD
  - typings.dineroDotJs.dineroDotJsStrings.HNL
  - typings.dineroDotJs.dineroDotJsStrings.HRK
  - typings.dineroDotJs.dineroDotJsStrings.HTG
  - typings.dineroDotJs.dineroDotJsStrings.HUF
  - typings.dineroDotJs.dineroDotJsStrings.IDR
  - typings.dineroDotJs.dineroDotJsStrings.ILS
  - typings.dineroDotJs.dineroDotJsStrings.INR
  - typings.dineroDotJs.dineroDotJsStrings.IQD
  - typings.dineroDotJs.dineroDotJsStrings.IRR
  - typings.dineroDotJs.dineroDotJsStrings.ISK
  - typings.dineroDotJs.dineroDotJsStrings.JMD
  - typings.dineroDotJs.dineroDotJsStrings.JOD
  - typings.dineroDotJs.dineroDotJsStrings.JPY
  - typings.dineroDotJs.dineroDotJsStrings.KES
  - typings.dineroDotJs.dineroDotJsStrings.KGS
  - typings.dineroDotJs.dineroDotJsStrings.KHR
  - typings.dineroDotJs.dineroDotJsStrings.KMF
  - typings.dineroDotJs.dineroDotJsStrings.KPW
  - typings.dineroDotJs.dineroDotJsStrings.KRW
  - typings.dineroDotJs.dineroDotJsStrings.KWD
  - typings.dineroDotJs.dineroDotJsStrings.KYD
  - typings.dineroDotJs.dineroDotJsStrings.KZT
  - typings.dineroDotJs.dineroDotJsStrings.LAK
  - typings.dineroDotJs.dineroDotJsStrings.LBP
  - typings.dineroDotJs.dineroDotJsStrings.LKR
  - typings.dineroDotJs.dineroDotJsStrings.LRD
  - typings.dineroDotJs.dineroDotJsStrings.LSL
  - typings.dineroDotJs.dineroDotJsStrings.LYD
  - typings.dineroDotJs.dineroDotJsStrings.MAD
  - typings.dineroDotJs.dineroDotJsStrings.MDL
  - typings.dineroDotJs.dineroDotJsStrings.MGA
  - typings.dineroDotJs.dineroDotJsStrings.MKD
  - typings.dineroDotJs.dineroDotJsStrings.MMK
  - typings.dineroDotJs.dineroDotJsStrings.MNT
  - typings.dineroDotJs.dineroDotJsStrings.MOP
  - typings.dineroDotJs.dineroDotJsStrings.MRU
  - typings.dineroDotJs.dineroDotJsStrings.MUR
  - typings.dineroDotJs.dineroDotJsStrings.MVR
  - typings.dineroDotJs.dineroDotJsStrings.MWK
  - typings.dineroDotJs.dineroDotJsStrings.MXN
  - typings.dineroDotJs.dineroDotJsStrings.MXV
  - typings.dineroDotJs.dineroDotJsStrings.MYR
  - typings.dineroDotJs.dineroDotJsStrings.MZN
  - typings.dineroDotJs.dineroDotJsStrings.NAD
  - typings.dineroDotJs.dineroDotJsStrings.NGN
  - typings.dineroDotJs.dineroDotJsStrings.NIO
  - typings.dineroDotJs.dineroDotJsStrings.NOK
  - typings.dineroDotJs.dineroDotJsStrings.NPR
  - typings.dineroDotJs.dineroDotJsStrings.NZD
  - typings.dineroDotJs.dineroDotJsStrings.OMR
  - typings.dineroDotJs.dineroDotJsStrings.PAB
  - typings.dineroDotJs.dineroDotJsStrings.PEN
  - typings.dineroDotJs.dineroDotJsStrings.PGK
  - typings.dineroDotJs.dineroDotJsStrings.PHP
  - typings.dineroDotJs.dineroDotJsStrings.PKR
  - typings.dineroDotJs.dineroDotJsStrings.PLN
  - typings.dineroDotJs.dineroDotJsStrings.PYG
  - typings.dineroDotJs.dineroDotJsStrings.QAR
  - typings.dineroDotJs.dineroDotJsStrings.RON
  - typings.dineroDotJs.dineroDotJsStrings.RSD
  - typings.dineroDotJs.dineroDotJsStrings.RUB
  - typings.dineroDotJs.dineroDotJsStrings.RWF
  - typings.dineroDotJs.dineroDotJsStrings.SAR
  - typings.dineroDotJs.dineroDotJsStrings.SBD
  - typings.dineroDotJs.dineroDotJsStrings.SCR
  - typings.dineroDotJs.dineroDotJsStrings.SDG
  - typings.dineroDotJs.dineroDotJsStrings.SEK
  - typings.dineroDotJs.dineroDotJsStrings.SGD
  - typings.dineroDotJs.dineroDotJsStrings.SHP
  - typings.dineroDotJs.dineroDotJsStrings.SLL
  - typings.dineroDotJs.dineroDotJsStrings.SOS
  - typings.dineroDotJs.dineroDotJsStrings.SRD
  - typings.dineroDotJs.dineroDotJsStrings.SSP
  - typings.dineroDotJs.dineroDotJsStrings.STN
  - typings.dineroDotJs.dineroDotJsStrings.SVC
  - typings.dineroDotJs.dineroDotJsStrings.SYP
  - typings.dineroDotJs.dineroDotJsStrings.SZL
  - typings.dineroDotJs.dineroDotJsStrings.THB
  - typings.dineroDotJs.dineroDotJsStrings.TJS
  - typings.dineroDotJs.dineroDotJsStrings.TMT
  - typings.dineroDotJs.dineroDotJsStrings.TND
  - typings.dineroDotJs.dineroDotJsStrings.TOP
  - typings.dineroDotJs.dineroDotJsStrings.TRY
  - typings.dineroDotJs.dineroDotJsStrings.TTD
  - typings.dineroDotJs.dineroDotJsStrings.TWD
  - typings.dineroDotJs.dineroDotJsStrings.TZS
  - typings.dineroDotJs.dineroDotJsStrings.UAH
  - typings.dineroDotJs.dineroDotJsStrings.UGX
  - typings.dineroDotJs.dineroDotJsStrings.USD
  - typings.dineroDotJs.dineroDotJsStrings.USN
  - typings.dineroDotJs.dineroDotJsStrings.UYI
  - typings.dineroDotJs.dineroDotJsStrings.UYU
  - typings.dineroDotJs.dineroDotJsStrings.UYW
  - typings.dineroDotJs.dineroDotJsStrings.UZS
  - typings.dineroDotJs.dineroDotJsStrings.VES
  - typings.dineroDotJs.dineroDotJsStrings.VND
  - typings.dineroDotJs.dineroDotJsStrings.VUV
  - typings.dineroDotJs.dineroDotJsStrings.WST
  - typings.dineroDotJs.dineroDotJsStrings.XAF
  - typings.dineroDotJs.dineroDotJsStrings.XAG
  - typings.dineroDotJs.dineroDotJsStrings.XAU
  - typings.dineroDotJs.dineroDotJsStrings.XBA
  - typings.dineroDotJs.dineroDotJsStrings.XBB
  - typings.dineroDotJs.dineroDotJsStrings.XBC
  - typings.dineroDotJs.dineroDotJsStrings.XBD
  - typings.dineroDotJs.dineroDotJsStrings.XCD
  - typings.dineroDotJs.dineroDotJsStrings.XDR
  - typings.dineroDotJs.dineroDotJsStrings.XOF
  - typings.dineroDotJs.dineroDotJsStrings.XPD
  - typings.dineroDotJs.dineroDotJsStrings.XPF
  - typings.dineroDotJs.dineroDotJsStrings.XPT
  - typings.dineroDotJs.dineroDotJsStrings.XSU
  - typings.dineroDotJs.dineroDotJsStrings.XTS
  - typings.dineroDotJs.dineroDotJsStrings.XUA
  - typings.dineroDotJs.dineroDotJsStrings.XXX
  - typings.dineroDotJs.dineroDotJsStrings.YER
  - typings.dineroDotJs.dineroDotJsStrings.ZAR
  - typings.dineroDotJs.dineroDotJsStrings.ZMW
  - typings.dineroDotJs.dineroDotJsStrings.ZWL
*/
trait Currency extends js.Object

object Currency {
  @scala.inline
  def AED: typingsSlinky.dineroDotJs.dineroDotJsStrings.AED = this.cast("AED")
  @scala.inline
  def AFN: typingsSlinky.dineroDotJs.dineroDotJsStrings.AFN = this.cast("AFN")
  @scala.inline
  def ALL: typingsSlinky.dineroDotJs.dineroDotJsStrings.ALL = this.cast("ALL")
  @scala.inline
  def AMD: typingsSlinky.dineroDotJs.dineroDotJsStrings.AMD = this.cast("AMD")
  @scala.inline
  def ANG: typingsSlinky.dineroDotJs.dineroDotJsStrings.ANG = this.cast("ANG")
  @scala.inline
  def AOA: typingsSlinky.dineroDotJs.dineroDotJsStrings.AOA = this.cast("AOA")
  @scala.inline
  def ARS: typingsSlinky.dineroDotJs.dineroDotJsStrings.ARS = this.cast("ARS")
  @scala.inline
  def AUD: typingsSlinky.dineroDotJs.dineroDotJsStrings.AUD = this.cast("AUD")
  @scala.inline
  def AWG: typingsSlinky.dineroDotJs.dineroDotJsStrings.AWG = this.cast("AWG")
  @scala.inline
  def AZN: typingsSlinky.dineroDotJs.dineroDotJsStrings.AZN = this.cast("AZN")
  @scala.inline
  def BAM: typingsSlinky.dineroDotJs.dineroDotJsStrings.BAM = this.cast("BAM")
  @scala.inline
  def BBD: typingsSlinky.dineroDotJs.dineroDotJsStrings.BBD = this.cast("BBD")
  @scala.inline
  def BDT: typingsSlinky.dineroDotJs.dineroDotJsStrings.BDT = this.cast("BDT")
  @scala.inline
  def BGN: typingsSlinky.dineroDotJs.dineroDotJsStrings.BGN = this.cast("BGN")
  @scala.inline
  def BHD: typingsSlinky.dineroDotJs.dineroDotJsStrings.BHD = this.cast("BHD")
  @scala.inline
  def BIF: typingsSlinky.dineroDotJs.dineroDotJsStrings.BIF = this.cast("BIF")
  @scala.inline
  def BMD: typingsSlinky.dineroDotJs.dineroDotJsStrings.BMD = this.cast("BMD")
  @scala.inline
  def BND: typingsSlinky.dineroDotJs.dineroDotJsStrings.BND = this.cast("BND")
  @scala.inline
  def BOB: typingsSlinky.dineroDotJs.dineroDotJsStrings.BOB = this.cast("BOB")
  @scala.inline
  def BOV: typingsSlinky.dineroDotJs.dineroDotJsStrings.BOV = this.cast("BOV")
  @scala.inline
  def BRL: typingsSlinky.dineroDotJs.dineroDotJsStrings.BRL = this.cast("BRL")
  @scala.inline
  def BSD: typingsSlinky.dineroDotJs.dineroDotJsStrings.BSD = this.cast("BSD")
  @scala.inline
  def BTN: typingsSlinky.dineroDotJs.dineroDotJsStrings.BTN = this.cast("BTN")
  @scala.inline
  def BWP: typingsSlinky.dineroDotJs.dineroDotJsStrings.BWP = this.cast("BWP")
  @scala.inline
  def BYN: typingsSlinky.dineroDotJs.dineroDotJsStrings.BYN = this.cast("BYN")
  @scala.inline
  def BZD: typingsSlinky.dineroDotJs.dineroDotJsStrings.BZD = this.cast("BZD")
  @scala.inline
  def CAD: typingsSlinky.dineroDotJs.dineroDotJsStrings.CAD = this.cast("CAD")
  @scala.inline
  def CDF: typingsSlinky.dineroDotJs.dineroDotJsStrings.CDF = this.cast("CDF")
  @scala.inline
  def CHE: typingsSlinky.dineroDotJs.dineroDotJsStrings.CHE = this.cast("CHE")
  @scala.inline
  def CHF: typingsSlinky.dineroDotJs.dineroDotJsStrings.CHF = this.cast("CHF")
  @scala.inline
  def CHW: typingsSlinky.dineroDotJs.dineroDotJsStrings.CHW = this.cast("CHW")
  @scala.inline
  def CLF: typingsSlinky.dineroDotJs.dineroDotJsStrings.CLF = this.cast("CLF")
  @scala.inline
  def CLP: typingsSlinky.dineroDotJs.dineroDotJsStrings.CLP = this.cast("CLP")
  @scala.inline
  def CNY: typingsSlinky.dineroDotJs.dineroDotJsStrings.CNY = this.cast("CNY")
  @scala.inline
  def COP: typingsSlinky.dineroDotJs.dineroDotJsStrings.COP = this.cast("COP")
  @scala.inline
  def COU: typingsSlinky.dineroDotJs.dineroDotJsStrings.COU = this.cast("COU")
  @scala.inline
  def CRC: typingsSlinky.dineroDotJs.dineroDotJsStrings.CRC = this.cast("CRC")
  @scala.inline
  def CUC: typingsSlinky.dineroDotJs.dineroDotJsStrings.CUC = this.cast("CUC")
  @scala.inline
  def CUP: typingsSlinky.dineroDotJs.dineroDotJsStrings.CUP = this.cast("CUP")
  @scala.inline
  def CVE: typingsSlinky.dineroDotJs.dineroDotJsStrings.CVE = this.cast("CVE")
  @scala.inline
  def CZK: typingsSlinky.dineroDotJs.dineroDotJsStrings.CZK = this.cast("CZK")
  @scala.inline
  def DJF: typingsSlinky.dineroDotJs.dineroDotJsStrings.DJF = this.cast("DJF")
  @scala.inline
  def DKK: typingsSlinky.dineroDotJs.dineroDotJsStrings.DKK = this.cast("DKK")
  @scala.inline
  def DOP: typingsSlinky.dineroDotJs.dineroDotJsStrings.DOP = this.cast("DOP")
  @scala.inline
  def DZD: typingsSlinky.dineroDotJs.dineroDotJsStrings.DZD = this.cast("DZD")
  @scala.inline
  def EGP: typingsSlinky.dineroDotJs.dineroDotJsStrings.EGP = this.cast("EGP")
  @scala.inline
  def ERN: typingsSlinky.dineroDotJs.dineroDotJsStrings.ERN = this.cast("ERN")
  @scala.inline
  def ETB: typingsSlinky.dineroDotJs.dineroDotJsStrings.ETB = this.cast("ETB")
  @scala.inline
  def EUR: typingsSlinky.dineroDotJs.dineroDotJsStrings.EUR = this.cast("EUR")
  @scala.inline
  def FJD: typingsSlinky.dineroDotJs.dineroDotJsStrings.FJD = this.cast("FJD")
  @scala.inline
  def FKP: typingsSlinky.dineroDotJs.dineroDotJsStrings.FKP = this.cast("FKP")
  @scala.inline
  def GBP: typingsSlinky.dineroDotJs.dineroDotJsStrings.GBP = this.cast("GBP")
  @scala.inline
  def GEL: typingsSlinky.dineroDotJs.dineroDotJsStrings.GEL = this.cast("GEL")
  @scala.inline
  def GHS: typingsSlinky.dineroDotJs.dineroDotJsStrings.GHS = this.cast("GHS")
  @scala.inline
  def GIP: typingsSlinky.dineroDotJs.dineroDotJsStrings.GIP = this.cast("GIP")
  @scala.inline
  def GMD: typingsSlinky.dineroDotJs.dineroDotJsStrings.GMD = this.cast("GMD")
  @scala.inline
  def GNF: typingsSlinky.dineroDotJs.dineroDotJsStrings.GNF = this.cast("GNF")
  @scala.inline
  def GTQ: typingsSlinky.dineroDotJs.dineroDotJsStrings.GTQ = this.cast("GTQ")
  @scala.inline
  def GYD: typingsSlinky.dineroDotJs.dineroDotJsStrings.GYD = this.cast("GYD")
  @scala.inline
  def HKD: typingsSlinky.dineroDotJs.dineroDotJsStrings.HKD = this.cast("HKD")
  @scala.inline
  def HNL: typingsSlinky.dineroDotJs.dineroDotJsStrings.HNL = this.cast("HNL")
  @scala.inline
  def HRK: typingsSlinky.dineroDotJs.dineroDotJsStrings.HRK = this.cast("HRK")
  @scala.inline
  def HTG: typingsSlinky.dineroDotJs.dineroDotJsStrings.HTG = this.cast("HTG")
  @scala.inline
  def HUF: typingsSlinky.dineroDotJs.dineroDotJsStrings.HUF = this.cast("HUF")
  @scala.inline
  def IDR: typingsSlinky.dineroDotJs.dineroDotJsStrings.IDR = this.cast("IDR")
  @scala.inline
  def ILS: typingsSlinky.dineroDotJs.dineroDotJsStrings.ILS = this.cast("ILS")
  @scala.inline
  def INR: typingsSlinky.dineroDotJs.dineroDotJsStrings.INR = this.cast("INR")
  @scala.inline
  def IQD: typingsSlinky.dineroDotJs.dineroDotJsStrings.IQD = this.cast("IQD")
  @scala.inline
  def IRR: typingsSlinky.dineroDotJs.dineroDotJsStrings.IRR = this.cast("IRR")
  @scala.inline
  def ISK: typingsSlinky.dineroDotJs.dineroDotJsStrings.ISK = this.cast("ISK")
  @scala.inline
  def JMD: typingsSlinky.dineroDotJs.dineroDotJsStrings.JMD = this.cast("JMD")
  @scala.inline
  def JOD: typingsSlinky.dineroDotJs.dineroDotJsStrings.JOD = this.cast("JOD")
  @scala.inline
  def JPY: typingsSlinky.dineroDotJs.dineroDotJsStrings.JPY = this.cast("JPY")
  @scala.inline
  def KES: typingsSlinky.dineroDotJs.dineroDotJsStrings.KES = this.cast("KES")
  @scala.inline
  def KGS: typingsSlinky.dineroDotJs.dineroDotJsStrings.KGS = this.cast("KGS")
  @scala.inline
  def KHR: typingsSlinky.dineroDotJs.dineroDotJsStrings.KHR = this.cast("KHR")
  @scala.inline
  def KMF: typingsSlinky.dineroDotJs.dineroDotJsStrings.KMF = this.cast("KMF")
  @scala.inline
  def KPW: typingsSlinky.dineroDotJs.dineroDotJsStrings.KPW = this.cast("KPW")
  @scala.inline
  def KRW: typingsSlinky.dineroDotJs.dineroDotJsStrings.KRW = this.cast("KRW")
  @scala.inline
  def KWD: typingsSlinky.dineroDotJs.dineroDotJsStrings.KWD = this.cast("KWD")
  @scala.inline
  def KYD: typingsSlinky.dineroDotJs.dineroDotJsStrings.KYD = this.cast("KYD")
  @scala.inline
  def KZT: typingsSlinky.dineroDotJs.dineroDotJsStrings.KZT = this.cast("KZT")
  @scala.inline
  def LAK: typingsSlinky.dineroDotJs.dineroDotJsStrings.LAK = this.cast("LAK")
  @scala.inline
  def LBP: typingsSlinky.dineroDotJs.dineroDotJsStrings.LBP = this.cast("LBP")
  @scala.inline
  def LKR: typingsSlinky.dineroDotJs.dineroDotJsStrings.LKR = this.cast("LKR")
  @scala.inline
  def LRD: typingsSlinky.dineroDotJs.dineroDotJsStrings.LRD = this.cast("LRD")
  @scala.inline
  def LSL: typingsSlinky.dineroDotJs.dineroDotJsStrings.LSL = this.cast("LSL")
  @scala.inline
  def LYD: typingsSlinky.dineroDotJs.dineroDotJsStrings.LYD = this.cast("LYD")
  @scala.inline
  def MAD: typingsSlinky.dineroDotJs.dineroDotJsStrings.MAD = this.cast("MAD")
  @scala.inline
  def MDL: typingsSlinky.dineroDotJs.dineroDotJsStrings.MDL = this.cast("MDL")
  @scala.inline
  def MGA: typingsSlinky.dineroDotJs.dineroDotJsStrings.MGA = this.cast("MGA")
  @scala.inline
  def MKD: typingsSlinky.dineroDotJs.dineroDotJsStrings.MKD = this.cast("MKD")
  @scala.inline
  def MMK: typingsSlinky.dineroDotJs.dineroDotJsStrings.MMK = this.cast("MMK")
  @scala.inline
  def MNT: typingsSlinky.dineroDotJs.dineroDotJsStrings.MNT = this.cast("MNT")
  @scala.inline
  def MOP: typingsSlinky.dineroDotJs.dineroDotJsStrings.MOP = this.cast("MOP")
  @scala.inline
  def MRU: typingsSlinky.dineroDotJs.dineroDotJsStrings.MRU = this.cast("MRU")
  @scala.inline
  def MUR: typingsSlinky.dineroDotJs.dineroDotJsStrings.MUR = this.cast("MUR")
  @scala.inline
  def MVR: typingsSlinky.dineroDotJs.dineroDotJsStrings.MVR = this.cast("MVR")
  @scala.inline
  def MWK: typingsSlinky.dineroDotJs.dineroDotJsStrings.MWK = this.cast("MWK")
  @scala.inline
  def MXN: typingsSlinky.dineroDotJs.dineroDotJsStrings.MXN = this.cast("MXN")
  @scala.inline
  def MXV: typingsSlinky.dineroDotJs.dineroDotJsStrings.MXV = this.cast("MXV")
  @scala.inline
  def MYR: typingsSlinky.dineroDotJs.dineroDotJsStrings.MYR = this.cast("MYR")
  @scala.inline
  def MZN: typingsSlinky.dineroDotJs.dineroDotJsStrings.MZN = this.cast("MZN")
  @scala.inline
  def NAD: typingsSlinky.dineroDotJs.dineroDotJsStrings.NAD = this.cast("NAD")
  @scala.inline
  def NGN: typingsSlinky.dineroDotJs.dineroDotJsStrings.NGN = this.cast("NGN")
  @scala.inline
  def NIO: typingsSlinky.dineroDotJs.dineroDotJsStrings.NIO = this.cast("NIO")
  @scala.inline
  def NOK: typingsSlinky.dineroDotJs.dineroDotJsStrings.NOK = this.cast("NOK")
  @scala.inline
  def NPR: typingsSlinky.dineroDotJs.dineroDotJsStrings.NPR = this.cast("NPR")
  @scala.inline
  def NZD: typingsSlinky.dineroDotJs.dineroDotJsStrings.NZD = this.cast("NZD")
  @scala.inline
  def OMR: typingsSlinky.dineroDotJs.dineroDotJsStrings.OMR = this.cast("OMR")
  @scala.inline
  def PAB: typingsSlinky.dineroDotJs.dineroDotJsStrings.PAB = this.cast("PAB")
  @scala.inline
  def PEN: typingsSlinky.dineroDotJs.dineroDotJsStrings.PEN = this.cast("PEN")
  @scala.inline
  def PGK: typingsSlinky.dineroDotJs.dineroDotJsStrings.PGK = this.cast("PGK")
  @scala.inline
  def PHP: typingsSlinky.dineroDotJs.dineroDotJsStrings.PHP = this.cast("PHP")
  @scala.inline
  def PKR: typingsSlinky.dineroDotJs.dineroDotJsStrings.PKR = this.cast("PKR")
  @scala.inline
  def PLN: typingsSlinky.dineroDotJs.dineroDotJsStrings.PLN = this.cast("PLN")
  @scala.inline
  def PYG: typingsSlinky.dineroDotJs.dineroDotJsStrings.PYG = this.cast("PYG")
  @scala.inline
  def QAR: typingsSlinky.dineroDotJs.dineroDotJsStrings.QAR = this.cast("QAR")
  @scala.inline
  def RON: typingsSlinky.dineroDotJs.dineroDotJsStrings.RON = this.cast("RON")
  @scala.inline
  def RSD: typingsSlinky.dineroDotJs.dineroDotJsStrings.RSD = this.cast("RSD")
  @scala.inline
  def RUB: typingsSlinky.dineroDotJs.dineroDotJsStrings.RUB = this.cast("RUB")
  @scala.inline
  def RWF: typingsSlinky.dineroDotJs.dineroDotJsStrings.RWF = this.cast("RWF")
  @scala.inline
  def SAR: typingsSlinky.dineroDotJs.dineroDotJsStrings.SAR = this.cast("SAR")
  @scala.inline
  def SBD: typingsSlinky.dineroDotJs.dineroDotJsStrings.SBD = this.cast("SBD")
  @scala.inline
  def SCR: typingsSlinky.dineroDotJs.dineroDotJsStrings.SCR = this.cast("SCR")
  @scala.inline
  def SDG: typingsSlinky.dineroDotJs.dineroDotJsStrings.SDG = this.cast("SDG")
  @scala.inline
  def SEK: typingsSlinky.dineroDotJs.dineroDotJsStrings.SEK = this.cast("SEK")
  @scala.inline
  def SGD: typingsSlinky.dineroDotJs.dineroDotJsStrings.SGD = this.cast("SGD")
  @scala.inline
  def SHP: typingsSlinky.dineroDotJs.dineroDotJsStrings.SHP = this.cast("SHP")
  @scala.inline
  def SLL: typingsSlinky.dineroDotJs.dineroDotJsStrings.SLL = this.cast("SLL")
  @scala.inline
  def SOS: typingsSlinky.dineroDotJs.dineroDotJsStrings.SOS = this.cast("SOS")
  @scala.inline
  def SRD: typingsSlinky.dineroDotJs.dineroDotJsStrings.SRD = this.cast("SRD")
  @scala.inline
  def SSP: typingsSlinky.dineroDotJs.dineroDotJsStrings.SSP = this.cast("SSP")
  @scala.inline
  def STN: typingsSlinky.dineroDotJs.dineroDotJsStrings.STN = this.cast("STN")
  @scala.inline
  def SVC: typingsSlinky.dineroDotJs.dineroDotJsStrings.SVC = this.cast("SVC")
  @scala.inline
  def SYP: typingsSlinky.dineroDotJs.dineroDotJsStrings.SYP = this.cast("SYP")
  @scala.inline
  def SZL: typingsSlinky.dineroDotJs.dineroDotJsStrings.SZL = this.cast("SZL")
  @scala.inline
  def THB: typingsSlinky.dineroDotJs.dineroDotJsStrings.THB = this.cast("THB")
  @scala.inline
  def TJS: typingsSlinky.dineroDotJs.dineroDotJsStrings.TJS = this.cast("TJS")
  @scala.inline
  def TMT: typingsSlinky.dineroDotJs.dineroDotJsStrings.TMT = this.cast("TMT")
  @scala.inline
  def TND: typingsSlinky.dineroDotJs.dineroDotJsStrings.TND = this.cast("TND")
  @scala.inline
  def TOP: typingsSlinky.dineroDotJs.dineroDotJsStrings.TOP = this.cast("TOP")
  @scala.inline
  def TRY: typingsSlinky.dineroDotJs.dineroDotJsStrings.TRY = this.cast("TRY")
  @scala.inline
  def TTD: typingsSlinky.dineroDotJs.dineroDotJsStrings.TTD = this.cast("TTD")
  @scala.inline
  def TWD: typingsSlinky.dineroDotJs.dineroDotJsStrings.TWD = this.cast("TWD")
  @scala.inline
  def TZS: typingsSlinky.dineroDotJs.dineroDotJsStrings.TZS = this.cast("TZS")
  @scala.inline
  def UAH: typingsSlinky.dineroDotJs.dineroDotJsStrings.UAH = this.cast("UAH")
  @scala.inline
  def UGX: typingsSlinky.dineroDotJs.dineroDotJsStrings.UGX = this.cast("UGX")
  @scala.inline
  def USD: typingsSlinky.dineroDotJs.dineroDotJsStrings.USD = this.cast("USD")
  @scala.inline
  def USN: typingsSlinky.dineroDotJs.dineroDotJsStrings.USN = this.cast("USN")
  @scala.inline
  def UYI: typingsSlinky.dineroDotJs.dineroDotJsStrings.UYI = this.cast("UYI")
  @scala.inline
  def UYU: typingsSlinky.dineroDotJs.dineroDotJsStrings.UYU = this.cast("UYU")
  @scala.inline
  def UYW: typingsSlinky.dineroDotJs.dineroDotJsStrings.UYW = this.cast("UYW")
  @scala.inline
  def UZS: typingsSlinky.dineroDotJs.dineroDotJsStrings.UZS = this.cast("UZS")
  @scala.inline
  def VES: typingsSlinky.dineroDotJs.dineroDotJsStrings.VES = this.cast("VES")
  @scala.inline
  def VND: typingsSlinky.dineroDotJs.dineroDotJsStrings.VND = this.cast("VND")
  @scala.inline
  def VUV: typingsSlinky.dineroDotJs.dineroDotJsStrings.VUV = this.cast("VUV")
  @scala.inline
  def WST: typingsSlinky.dineroDotJs.dineroDotJsStrings.WST = this.cast("WST")
  @scala.inline
  def XAF: typingsSlinky.dineroDotJs.dineroDotJsStrings.XAF = this.cast("XAF")
  @scala.inline
  def XAG: typingsSlinky.dineroDotJs.dineroDotJsStrings.XAG = this.cast("XAG")
  @scala.inline
  def XAU: typingsSlinky.dineroDotJs.dineroDotJsStrings.XAU = this.cast("XAU")
  @scala.inline
  def XBA: typingsSlinky.dineroDotJs.dineroDotJsStrings.XBA = this.cast("XBA")
  @scala.inline
  def XBB: typingsSlinky.dineroDotJs.dineroDotJsStrings.XBB = this.cast("XBB")
  @scala.inline
  def XBC: typingsSlinky.dineroDotJs.dineroDotJsStrings.XBC = this.cast("XBC")
  @scala.inline
  def XBD: typingsSlinky.dineroDotJs.dineroDotJsStrings.XBD = this.cast("XBD")
  @scala.inline
  def XCD: typingsSlinky.dineroDotJs.dineroDotJsStrings.XCD = this.cast("XCD")
  @scala.inline
  def XDR: typingsSlinky.dineroDotJs.dineroDotJsStrings.XDR = this.cast("XDR")
  @scala.inline
  def XOF: typingsSlinky.dineroDotJs.dineroDotJsStrings.XOF = this.cast("XOF")
  @scala.inline
  def XPD: typingsSlinky.dineroDotJs.dineroDotJsStrings.XPD = this.cast("XPD")
  @scala.inline
  def XPF: typingsSlinky.dineroDotJs.dineroDotJsStrings.XPF = this.cast("XPF")
  @scala.inline
  def XPT: typingsSlinky.dineroDotJs.dineroDotJsStrings.XPT = this.cast("XPT")
  @scala.inline
  def XSU: typingsSlinky.dineroDotJs.dineroDotJsStrings.XSU = this.cast("XSU")
  @scala.inline
  def XTS: typingsSlinky.dineroDotJs.dineroDotJsStrings.XTS = this.cast("XTS")
  @scala.inline
  def XUA: typingsSlinky.dineroDotJs.dineroDotJsStrings.XUA = this.cast("XUA")
  @scala.inline
  def XXX: typingsSlinky.dineroDotJs.dineroDotJsStrings.XXX = this.cast("XXX")
  @scala.inline
  def YER: typingsSlinky.dineroDotJs.dineroDotJsStrings.YER = this.cast("YER")
  @scala.inline
  def ZAR: typingsSlinky.dineroDotJs.dineroDotJsStrings.ZAR = this.cast("ZAR")
  @scala.inline
  def ZMW: typingsSlinky.dineroDotJs.dineroDotJsStrings.ZMW = this.cast("ZMW")
  @scala.inline
  def ZWL: typingsSlinky.dineroDotJs.dineroDotJsStrings.ZWL = this.cast("ZWL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


package typingsSlinky.dineroJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def AED: typingsSlinky.dineroJs.dineroJsStrings.AED = "AED".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.AED]
  
  @scala.inline
  def AFN: typingsSlinky.dineroJs.dineroJsStrings.AFN = "AFN".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.AFN]
  
  @scala.inline
  def ALL: typingsSlinky.dineroJs.dineroJsStrings.ALL = "ALL".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.ALL]
  
  @scala.inline
  def AMD: typingsSlinky.dineroJs.dineroJsStrings.AMD = "AMD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.AMD]
  
  @scala.inline
  def ANG: typingsSlinky.dineroJs.dineroJsStrings.ANG = "ANG".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.ANG]
  
  @scala.inline
  def AOA: typingsSlinky.dineroJs.dineroJsStrings.AOA = "AOA".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.AOA]
  
  @scala.inline
  def ARS: typingsSlinky.dineroJs.dineroJsStrings.ARS = "ARS".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.ARS]
  
  @scala.inline
  def AUD: typingsSlinky.dineroJs.dineroJsStrings.AUD = "AUD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.AUD]
  
  @scala.inline
  def AWG: typingsSlinky.dineroJs.dineroJsStrings.AWG = "AWG".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.AWG]
  
  @scala.inline
  def AZN: typingsSlinky.dineroJs.dineroJsStrings.AZN = "AZN".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.AZN]
  
  @scala.inline
  def BAM: typingsSlinky.dineroJs.dineroJsStrings.BAM = "BAM".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BAM]
  
  @scala.inline
  def BBD: typingsSlinky.dineroJs.dineroJsStrings.BBD = "BBD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BBD]
  
  @scala.inline
  def BDT: typingsSlinky.dineroJs.dineroJsStrings.BDT = "BDT".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BDT]
  
  @scala.inline
  def BGN: typingsSlinky.dineroJs.dineroJsStrings.BGN = "BGN".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BGN]
  
  @scala.inline
  def BHD: typingsSlinky.dineroJs.dineroJsStrings.BHD = "BHD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BHD]
  
  @scala.inline
  def BIF: typingsSlinky.dineroJs.dineroJsStrings.BIF = "BIF".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BIF]
  
  @scala.inline
  def BMD: typingsSlinky.dineroJs.dineroJsStrings.BMD = "BMD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BMD]
  
  @scala.inline
  def BND: typingsSlinky.dineroJs.dineroJsStrings.BND = "BND".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BND]
  
  @scala.inline
  def BOB: typingsSlinky.dineroJs.dineroJsStrings.BOB = "BOB".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BOB]
  
  @scala.inline
  def BOV: typingsSlinky.dineroJs.dineroJsStrings.BOV = "BOV".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BOV]
  
  @scala.inline
  def BRL: typingsSlinky.dineroJs.dineroJsStrings.BRL = "BRL".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BRL]
  
  @scala.inline
  def BSD: typingsSlinky.dineroJs.dineroJsStrings.BSD = "BSD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BSD]
  
  @scala.inline
  def BTN: typingsSlinky.dineroJs.dineroJsStrings.BTN = "BTN".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BTN]
  
  @scala.inline
  def BWP: typingsSlinky.dineroJs.dineroJsStrings.BWP = "BWP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BWP]
  
  @scala.inline
  def BYN: typingsSlinky.dineroJs.dineroJsStrings.BYN = "BYN".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BYN]
  
  @scala.inline
  def BZD: typingsSlinky.dineroJs.dineroJsStrings.BZD = "BZD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.BZD]
  
  @scala.inline
  def CAD: typingsSlinky.dineroJs.dineroJsStrings.CAD = "CAD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.CAD]
  
  @scala.inline
  def CDF: typingsSlinky.dineroJs.dineroJsStrings.CDF = "CDF".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.CDF]
  
  @scala.inline
  def CHE: typingsSlinky.dineroJs.dineroJsStrings.CHE = "CHE".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.CHE]
  
  @scala.inline
  def CHF: typingsSlinky.dineroJs.dineroJsStrings.CHF = "CHF".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.CHF]
  
  @scala.inline
  def CHW: typingsSlinky.dineroJs.dineroJsStrings.CHW = "CHW".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.CHW]
  
  @scala.inline
  def CLF: typingsSlinky.dineroJs.dineroJsStrings.CLF = "CLF".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.CLF]
  
  @scala.inline
  def CLP: typingsSlinky.dineroJs.dineroJsStrings.CLP = "CLP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.CLP]
  
  @scala.inline
  def CNY: typingsSlinky.dineroJs.dineroJsStrings.CNY = "CNY".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.CNY]
  
  @scala.inline
  def COP: typingsSlinky.dineroJs.dineroJsStrings.COP = "COP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.COP]
  
  @scala.inline
  def COU: typingsSlinky.dineroJs.dineroJsStrings.COU = "COU".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.COU]
  
  @scala.inline
  def CRC: typingsSlinky.dineroJs.dineroJsStrings.CRC = "CRC".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.CRC]
  
  @scala.inline
  def CUC: typingsSlinky.dineroJs.dineroJsStrings.CUC = "CUC".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.CUC]
  
  @scala.inline
  def CUP: typingsSlinky.dineroJs.dineroJsStrings.CUP = "CUP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.CUP]
  
  @scala.inline
  def CVE: typingsSlinky.dineroJs.dineroJsStrings.CVE = "CVE".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.CVE]
  
  @scala.inline
  def CZK: typingsSlinky.dineroJs.dineroJsStrings.CZK = "CZK".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.CZK]
  
  @scala.inline
  def DJF: typingsSlinky.dineroJs.dineroJsStrings.DJF = "DJF".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.DJF]
  
  @scala.inline
  def DKK: typingsSlinky.dineroJs.dineroJsStrings.DKK = "DKK".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.DKK]
  
  @scala.inline
  def DOP: typingsSlinky.dineroJs.dineroJsStrings.DOP = "DOP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.DOP]
  
  @scala.inline
  def DZD: typingsSlinky.dineroJs.dineroJsStrings.DZD = "DZD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.DZD]
  
  @scala.inline
  def EGP: typingsSlinky.dineroJs.dineroJsStrings.EGP = "EGP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.EGP]
  
  @scala.inline
  def ERN: typingsSlinky.dineroJs.dineroJsStrings.ERN = "ERN".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.ERN]
  
  @scala.inline
  def ETB: typingsSlinky.dineroJs.dineroJsStrings.ETB = "ETB".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.ETB]
  
  @scala.inline
  def EUR: typingsSlinky.dineroJs.dineroJsStrings.EUR = "EUR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.EUR]
  
  @scala.inline
  def FJD: typingsSlinky.dineroJs.dineroJsStrings.FJD = "FJD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.FJD]
  
  @scala.inline
  def FKP: typingsSlinky.dineroJs.dineroJsStrings.FKP = "FKP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.FKP]
  
  @scala.inline
  def GBP: typingsSlinky.dineroJs.dineroJsStrings.GBP = "GBP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.GBP]
  
  @scala.inline
  def GEL: typingsSlinky.dineroJs.dineroJsStrings.GEL = "GEL".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.GEL]
  
  @scala.inline
  def GHS: typingsSlinky.dineroJs.dineroJsStrings.GHS = "GHS".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.GHS]
  
  @scala.inline
  def GIP: typingsSlinky.dineroJs.dineroJsStrings.GIP = "GIP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.GIP]
  
  @scala.inline
  def GMD: typingsSlinky.dineroJs.dineroJsStrings.GMD = "GMD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.GMD]
  
  @scala.inline
  def GNF: typingsSlinky.dineroJs.dineroJsStrings.GNF = "GNF".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.GNF]
  
  @scala.inline
  def GTQ: typingsSlinky.dineroJs.dineroJsStrings.GTQ = "GTQ".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.GTQ]
  
  @scala.inline
  def GYD: typingsSlinky.dineroJs.dineroJsStrings.GYD = "GYD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.GYD]
  
  @scala.inline
  def HKD: typingsSlinky.dineroJs.dineroJsStrings.HKD = "HKD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.HKD]
  
  @scala.inline
  def HNL: typingsSlinky.dineroJs.dineroJsStrings.HNL = "HNL".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.HNL]
  
  @scala.inline
  def HRK: typingsSlinky.dineroJs.dineroJsStrings.HRK = "HRK".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.HRK]
  
  @scala.inline
  def HTG: typingsSlinky.dineroJs.dineroJsStrings.HTG = "HTG".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.HTG]
  
  @scala.inline
  def HUF: typingsSlinky.dineroJs.dineroJsStrings.HUF = "HUF".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.HUF]
  
  @scala.inline
  def IDR: typingsSlinky.dineroJs.dineroJsStrings.IDR = "IDR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.IDR]
  
  @scala.inline
  def ILS: typingsSlinky.dineroJs.dineroJsStrings.ILS = "ILS".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.ILS]
  
  @scala.inline
  def INR: typingsSlinky.dineroJs.dineroJsStrings.INR = "INR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.INR]
  
  @scala.inline
  def IQD: typingsSlinky.dineroJs.dineroJsStrings.IQD = "IQD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.IQD]
  
  @scala.inline
  def IRR: typingsSlinky.dineroJs.dineroJsStrings.IRR = "IRR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.IRR]
  
  @scala.inline
  def ISK: typingsSlinky.dineroJs.dineroJsStrings.ISK = "ISK".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.ISK]
  
  @scala.inline
  def JMD: typingsSlinky.dineroJs.dineroJsStrings.JMD = "JMD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.JMD]
  
  @scala.inline
  def JOD: typingsSlinky.dineroJs.dineroJsStrings.JOD = "JOD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.JOD]
  
  @scala.inline
  def JPY: typingsSlinky.dineroJs.dineroJsStrings.JPY = "JPY".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.JPY]
  
  @scala.inline
  def KES: typingsSlinky.dineroJs.dineroJsStrings.KES = "KES".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.KES]
  
  @scala.inline
  def KGS: typingsSlinky.dineroJs.dineroJsStrings.KGS = "KGS".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.KGS]
  
  @scala.inline
  def KHR: typingsSlinky.dineroJs.dineroJsStrings.KHR = "KHR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.KHR]
  
  @scala.inline
  def KMF: typingsSlinky.dineroJs.dineroJsStrings.KMF = "KMF".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.KMF]
  
  @scala.inline
  def KPW: typingsSlinky.dineroJs.dineroJsStrings.KPW = "KPW".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.KPW]
  
  @scala.inline
  def KRW: typingsSlinky.dineroJs.dineroJsStrings.KRW = "KRW".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.KRW]
  
  @scala.inline
  def KWD: typingsSlinky.dineroJs.dineroJsStrings.KWD = "KWD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.KWD]
  
  @scala.inline
  def KYD: typingsSlinky.dineroJs.dineroJsStrings.KYD = "KYD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.KYD]
  
  @scala.inline
  def KZT: typingsSlinky.dineroJs.dineroJsStrings.KZT = "KZT".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.KZT]
  
  @scala.inline
  def LAK: typingsSlinky.dineroJs.dineroJsStrings.LAK = "LAK".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.LAK]
  
  @scala.inline
  def LBP: typingsSlinky.dineroJs.dineroJsStrings.LBP = "LBP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.LBP]
  
  @scala.inline
  def LKR: typingsSlinky.dineroJs.dineroJsStrings.LKR = "LKR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.LKR]
  
  @scala.inline
  def LRD: typingsSlinky.dineroJs.dineroJsStrings.LRD = "LRD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.LRD]
  
  @scala.inline
  def LSL: typingsSlinky.dineroJs.dineroJsStrings.LSL = "LSL".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.LSL]
  
  @scala.inline
  def LYD: typingsSlinky.dineroJs.dineroJsStrings.LYD = "LYD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.LYD]
  
  @scala.inline
  def MAD: typingsSlinky.dineroJs.dineroJsStrings.MAD = "MAD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MAD]
  
  @scala.inline
  def MDL: typingsSlinky.dineroJs.dineroJsStrings.MDL = "MDL".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MDL]
  
  @scala.inline
  def MGA: typingsSlinky.dineroJs.dineroJsStrings.MGA = "MGA".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MGA]
  
  @scala.inline
  def MKD: typingsSlinky.dineroJs.dineroJsStrings.MKD = "MKD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MKD]
  
  @scala.inline
  def MMK: typingsSlinky.dineroJs.dineroJsStrings.MMK = "MMK".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MMK]
  
  @scala.inline
  def MNT: typingsSlinky.dineroJs.dineroJsStrings.MNT = "MNT".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MNT]
  
  @scala.inline
  def MOP: typingsSlinky.dineroJs.dineroJsStrings.MOP = "MOP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MOP]
  
  @scala.inline
  def MRU: typingsSlinky.dineroJs.dineroJsStrings.MRU = "MRU".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MRU]
  
  @scala.inline
  def MUR: typingsSlinky.dineroJs.dineroJsStrings.MUR = "MUR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MUR]
  
  @scala.inline
  def MVR: typingsSlinky.dineroJs.dineroJsStrings.MVR = "MVR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MVR]
  
  @scala.inline
  def MWK: typingsSlinky.dineroJs.dineroJsStrings.MWK = "MWK".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MWK]
  
  @scala.inline
  def MXN: typingsSlinky.dineroJs.dineroJsStrings.MXN = "MXN".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MXN]
  
  @scala.inline
  def MXV: typingsSlinky.dineroJs.dineroJsStrings.MXV = "MXV".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MXV]
  
  @scala.inline
  def MYR: typingsSlinky.dineroJs.dineroJsStrings.MYR = "MYR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MYR]
  
  @scala.inline
  def MZN: typingsSlinky.dineroJs.dineroJsStrings.MZN = "MZN".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.MZN]
  
  @scala.inline
  def NAD: typingsSlinky.dineroJs.dineroJsStrings.NAD = "NAD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.NAD]
  
  @scala.inline
  def NGN: typingsSlinky.dineroJs.dineroJsStrings.NGN = "NGN".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.NGN]
  
  @scala.inline
  def NIO: typingsSlinky.dineroJs.dineroJsStrings.NIO = "NIO".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.NIO]
  
  @scala.inline
  def NOK: typingsSlinky.dineroJs.dineroJsStrings.NOK = "NOK".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.NOK]
  
  @scala.inline
  def NPR: typingsSlinky.dineroJs.dineroJsStrings.NPR = "NPR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.NPR]
  
  @scala.inline
  def NZD: typingsSlinky.dineroJs.dineroJsStrings.NZD = "NZD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.NZD]
  
  @scala.inline
  def OMR: typingsSlinky.dineroJs.dineroJsStrings.OMR = "OMR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.OMR]
  
  @scala.inline
  def PAB: typingsSlinky.dineroJs.dineroJsStrings.PAB = "PAB".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.PAB]
  
  @scala.inline
  def PEN: typingsSlinky.dineroJs.dineroJsStrings.PEN = "PEN".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.PEN]
  
  @scala.inline
  def PGK: typingsSlinky.dineroJs.dineroJsStrings.PGK = "PGK".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.PGK]
  
  @scala.inline
  def PHP: typingsSlinky.dineroJs.dineroJsStrings.PHP = "PHP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.PHP]
  
  @scala.inline
  def PKR: typingsSlinky.dineroJs.dineroJsStrings.PKR = "PKR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.PKR]
  
  @scala.inline
  def PLN: typingsSlinky.dineroJs.dineroJsStrings.PLN = "PLN".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.PLN]
  
  @scala.inline
  def PYG: typingsSlinky.dineroJs.dineroJsStrings.PYG = "PYG".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.PYG]
  
  @scala.inline
  def QAR: typingsSlinky.dineroJs.dineroJsStrings.QAR = "QAR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.QAR]
  
  @scala.inline
  def RON: typingsSlinky.dineroJs.dineroJsStrings.RON = "RON".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.RON]
  
  @scala.inline
  def RSD: typingsSlinky.dineroJs.dineroJsStrings.RSD = "RSD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.RSD]
  
  @scala.inline
  def RUB: typingsSlinky.dineroJs.dineroJsStrings.RUB = "RUB".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.RUB]
  
  @scala.inline
  def RWF: typingsSlinky.dineroJs.dineroJsStrings.RWF = "RWF".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.RWF]
  
  @scala.inline
  def SAR: typingsSlinky.dineroJs.dineroJsStrings.SAR = "SAR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SAR]
  
  @scala.inline
  def SBD: typingsSlinky.dineroJs.dineroJsStrings.SBD = "SBD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SBD]
  
  @scala.inline
  def SCR: typingsSlinky.dineroJs.dineroJsStrings.SCR = "SCR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SCR]
  
  @scala.inline
  def SDG: typingsSlinky.dineroJs.dineroJsStrings.SDG = "SDG".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SDG]
  
  @scala.inline
  def SEK: typingsSlinky.dineroJs.dineroJsStrings.SEK = "SEK".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SEK]
  
  @scala.inline
  def SGD: typingsSlinky.dineroJs.dineroJsStrings.SGD = "SGD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SGD]
  
  @scala.inline
  def SHP: typingsSlinky.dineroJs.dineroJsStrings.SHP = "SHP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SHP]
  
  @scala.inline
  def SLL: typingsSlinky.dineroJs.dineroJsStrings.SLL = "SLL".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SLL]
  
  @scala.inline
  def SOS: typingsSlinky.dineroJs.dineroJsStrings.SOS = "SOS".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SOS]
  
  @scala.inline
  def SRD: typingsSlinky.dineroJs.dineroJsStrings.SRD = "SRD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SRD]
  
  @scala.inline
  def SSP: typingsSlinky.dineroJs.dineroJsStrings.SSP = "SSP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SSP]
  
  @scala.inline
  def STN: typingsSlinky.dineroJs.dineroJsStrings.STN = "STN".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.STN]
  
  @scala.inline
  def SVC: typingsSlinky.dineroJs.dineroJsStrings.SVC = "SVC".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SVC]
  
  @scala.inline
  def SYP: typingsSlinky.dineroJs.dineroJsStrings.SYP = "SYP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SYP]
  
  @scala.inline
  def SZL: typingsSlinky.dineroJs.dineroJsStrings.SZL = "SZL".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.SZL]
  
  @scala.inline
  def THB: typingsSlinky.dineroJs.dineroJsStrings.THB = "THB".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.THB]
  
  @scala.inline
  def TJS: typingsSlinky.dineroJs.dineroJsStrings.TJS = "TJS".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.TJS]
  
  @scala.inline
  def TMT: typingsSlinky.dineroJs.dineroJsStrings.TMT = "TMT".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.TMT]
  
  @scala.inline
  def TND: typingsSlinky.dineroJs.dineroJsStrings.TND = "TND".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.TND]
  
  @scala.inline
  def TOP: typingsSlinky.dineroJs.dineroJsStrings.TOP = "TOP".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.TOP]
  
  @scala.inline
  def TRY: typingsSlinky.dineroJs.dineroJsStrings.TRY = "TRY".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.TRY]
  
  @scala.inline
  def TTD: typingsSlinky.dineroJs.dineroJsStrings.TTD = "TTD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.TTD]
  
  @scala.inline
  def TWD: typingsSlinky.dineroJs.dineroJsStrings.TWD = "TWD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.TWD]
  
  @scala.inline
  def TZS: typingsSlinky.dineroJs.dineroJsStrings.TZS = "TZS".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.TZS]
  
  @scala.inline
  def UAH: typingsSlinky.dineroJs.dineroJsStrings.UAH = "UAH".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.UAH]
  
  @scala.inline
  def UGX: typingsSlinky.dineroJs.dineroJsStrings.UGX = "UGX".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.UGX]
  
  @scala.inline
  def USD: typingsSlinky.dineroJs.dineroJsStrings.USD = "USD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.USD]
  
  @scala.inline
  def USN: typingsSlinky.dineroJs.dineroJsStrings.USN = "USN".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.USN]
  
  @scala.inline
  def UYI: typingsSlinky.dineroJs.dineroJsStrings.UYI = "UYI".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.UYI]
  
  @scala.inline
  def UYU: typingsSlinky.dineroJs.dineroJsStrings.UYU = "UYU".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.UYU]
  
  @scala.inline
  def UYW: typingsSlinky.dineroJs.dineroJsStrings.UYW = "UYW".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.UYW]
  
  @scala.inline
  def UZS: typingsSlinky.dineroJs.dineroJsStrings.UZS = "UZS".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.UZS]
  
  @scala.inline
  def VES: typingsSlinky.dineroJs.dineroJsStrings.VES = "VES".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.VES]
  
  @scala.inline
  def VND: typingsSlinky.dineroJs.dineroJsStrings.VND = "VND".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.VND]
  
  @scala.inline
  def VUV: typingsSlinky.dineroJs.dineroJsStrings.VUV = "VUV".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.VUV]
  
  @scala.inline
  def WST: typingsSlinky.dineroJs.dineroJsStrings.WST = "WST".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.WST]
  
  @scala.inline
  def XAF: typingsSlinky.dineroJs.dineroJsStrings.XAF = "XAF".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XAF]
  
  @scala.inline
  def XAG: typingsSlinky.dineroJs.dineroJsStrings.XAG = "XAG".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XAG]
  
  @scala.inline
  def XAU: typingsSlinky.dineroJs.dineroJsStrings.XAU = "XAU".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XAU]
  
  @scala.inline
  def XBA: typingsSlinky.dineroJs.dineroJsStrings.XBA = "XBA".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XBA]
  
  @scala.inline
  def XBB: typingsSlinky.dineroJs.dineroJsStrings.XBB = "XBB".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XBB]
  
  @scala.inline
  def XBC: typingsSlinky.dineroJs.dineroJsStrings.XBC = "XBC".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XBC]
  
  @scala.inline
  def XBD: typingsSlinky.dineroJs.dineroJsStrings.XBD = "XBD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XBD]
  
  @scala.inline
  def XCD: typingsSlinky.dineroJs.dineroJsStrings.XCD = "XCD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XCD]
  
  @scala.inline
  def XDR: typingsSlinky.dineroJs.dineroJsStrings.XDR = "XDR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XDR]
  
  @scala.inline
  def XOF: typingsSlinky.dineroJs.dineroJsStrings.XOF = "XOF".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XOF]
  
  @scala.inline
  def XPD: typingsSlinky.dineroJs.dineroJsStrings.XPD = "XPD".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XPD]
  
  @scala.inline
  def XPF: typingsSlinky.dineroJs.dineroJsStrings.XPF = "XPF".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XPF]
  
  @scala.inline
  def XPT: typingsSlinky.dineroJs.dineroJsStrings.XPT = "XPT".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XPT]
  
  @scala.inline
  def XSU: typingsSlinky.dineroJs.dineroJsStrings.XSU = "XSU".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XSU]
  
  @scala.inline
  def XTS: typingsSlinky.dineroJs.dineroJsStrings.XTS = "XTS".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XTS]
  
  @scala.inline
  def XUA: typingsSlinky.dineroJs.dineroJsStrings.XUA = "XUA".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XUA]
  
  @scala.inline
  def XXX: typingsSlinky.dineroJs.dineroJsStrings.XXX = "XXX".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.XXX]
  
  @scala.inline
  def YER: typingsSlinky.dineroJs.dineroJsStrings.YER = "YER".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.YER]
  
  @scala.inline
  def ZAR: typingsSlinky.dineroJs.dineroJsStrings.ZAR = "ZAR".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.ZAR]
  
  @scala.inline
  def ZMW: typingsSlinky.dineroJs.dineroJsStrings.ZMW = "ZMW".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.ZMW]
  
  @scala.inline
  def ZWL: typingsSlinky.dineroJs.dineroJsStrings.ZWL = "ZWL".asInstanceOf[typingsSlinky.dineroJs.dineroJsStrings.ZWL]
}

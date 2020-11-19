package typingsSlinky.oracleOraclejet.ojvalidationDatetimeMod

import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojvalidation-datetime", "DateTimeConverter")
@js.native
abstract class DateTimeConverter () extends Converter[String] {
  
  def calculateWeek(value: String): js.UndefOr[Double] = js.native
  
  def compareISODates(isoStr: String, isoStr2: String): Double = js.native
  
  def getAvailableTimeZones(): js.Array[_] = js.native
  
  def isDayNameSet(): Boolean = js.native
  
  def isDaySet(): Boolean = js.native
  
  def isHourInAMPMSet(): Boolean = js.native
  
  def isHourInDaySet(): Boolean = js.native
  
  def isMilliSecondSet(): Boolean = js.native
  
  def isMinuteSet(): Boolean = js.native
  
  def isMonthSet(): Boolean = js.native
  
  def isSecondSet(): Boolean = js.native
  
  def isYearSet(): Boolean = js.native
}

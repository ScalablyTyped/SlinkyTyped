package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.abbreviated
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.narrow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojlocaledata", JSImport.Namespace)
@js.native
object ojlocaledataMod extends js.Object {
  
  def getDayNames(): js.Array[String] = js.native
  @JSName("getDayNames")
  def getDayNames_abbreviated(`type`: abbreviated): js.Array[String] = js.native
  @JSName("getDayNames")
  def getDayNames_narrow(`type`: narrow): js.Array[String] = js.native
  @JSName("getDayNames")
  def getDayNames_wide(`type`: wide): js.Array[String] = js.native
  
  def getFirstDayOfWeek(): Double = js.native
  
  def getMonthNames(): js.Array[String] = js.native
  @JSName("getMonthNames")
  def getMonthNames_abbreviated(`type`: abbreviated): js.Array[String] = js.native
  @JSName("getMonthNames")
  def getMonthNames_narrow(`type`: narrow): js.Array[String] = js.native
  @JSName("getMonthNames")
  def getMonthNames_wide(`type`: wide): js.Array[String] = js.native
  
  def getWeekendEnd(): Double = js.native
  
  def getWeekendStart(): Double = js.native
  
  def isMonthPriorToYear(): Boolean = js.native
  
  def setBundle(bundle: js.Object): Unit = js.native
}

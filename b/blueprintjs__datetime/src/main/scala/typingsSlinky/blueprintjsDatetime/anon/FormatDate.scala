package typingsSlinky.blueprintjsDatetime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatDate extends js.Object {
  
  def formatDate(date: js.Date): String = js.native
  def formatDate(date: js.Date, format: js.UndefOr[scala.Nothing], locale: String): String = js.native
  def formatDate(date: js.Date, format: String): String = js.native
  def formatDate(date: js.Date, format: String, locale: String): String = js.native
  def formatDate(date: js.Date, format: js.Array[String]): String = js.native
  def formatDate(date: js.Date, format: js.Array[String], locale: String): String = js.native
  
  def formatDay(day: js.Date): String = js.native
  def formatDay(day: js.Date, locale: String): String = js.native
  
  def formatMonthTitle(month: js.Date): String = js.native
  def formatMonthTitle(month: js.Date, locale: String): String = js.native
  
  def formatWeekdayLong(weekday: Double): String = js.native
  def formatWeekdayLong(weekday: Double, locale: String): String = js.native
  
  def formatWeekdayShort(weekday: Double): String = js.native
  def formatWeekdayShort(weekday: Double, locale: String): String = js.native
  
  def getFirstDayOfWeek(): Double = js.native
  def getFirstDayOfWeek(locale: String): Double = js.native
  
  def getMonths(): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
  def getMonths(locale: String): js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
  
  def parseDate(str: String): js.Date = js.native
  def parseDate(str: String, format: js.UndefOr[scala.Nothing], locale: String): js.Date = js.native
  def parseDate(str: String, format: String): js.Date = js.native
  def parseDate(str: String, format: String, locale: String): js.Date = js.native
}

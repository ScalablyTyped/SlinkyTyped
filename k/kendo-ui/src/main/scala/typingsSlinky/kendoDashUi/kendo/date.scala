package typingsSlinky.kendoDashUi.kendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.date")
@js.native
object date extends js.Object {
  var MS_PER_DAY: Double = js.native
  var MS_PER_HOUR: Double = js.native
  var MS_PER_MINUTE: Double = js.native
  def addDays(targetDate: js.Date, numberOfDaysToAdd: Double): js.Date = js.native
  def dayOfWeek(targetDate: js.Date, dayOfWeek: Double, direction: Double): js.Date = js.native
  def firstDayOfMonth(targetDate: js.Date): js.Date = js.native
  def getDate(date: js.Date): js.Date = js.native
  def getMilliseconds(targetDate: js.Date): Double = js.native
  def isInDateRange(targetDate: js.Date, lowerLimitDate: js.Date, upperLimitDate: js.Date): Boolean = js.native
  def isInTimeRange(targetDate: js.Date, lowerLimitDate: js.Date, upperLimitDate: js.Date): Boolean = js.native
  def isToday(targetDate: js.Date): Boolean = js.native
  def lastDayOfMonth(targetDate: js.Date): js.Date = js.native
  def nextDay(targetDate: js.Date): js.Date = js.native
  def previousDay(targetDate: js.Date): js.Date = js.native
  def setDayOfWeek(targetDate: js.Date, dayOfWeek: Double, direction: Double): Unit = js.native
  def setHours(targetDate: js.Date, sourceDate: Double): js.Date = js.native
  def setTime(targetDate: js.Date, millisecondsToAdd: Double, ignoreDST: Boolean): Unit = js.native
  def toInvariantTime(targetDate: js.Date): js.Date = js.native
  def toUtcTime(targetDate: js.Date): Double = js.native
  def today(): js.Date = js.native
  def weekInYear(date: js.Date): Double = js.native
  def weekInYear(date: js.Date, weekStart: Double): Double = js.native
}


package typingsSlinky.kendoUi.global.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object date {
  
  @JSGlobal("kendo.date")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("kendo.date.MS_PER_DAY")
  @js.native
  def MS_PER_DAY: Double = js.native
  @scala.inline
  def MS_PER_DAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MS_PER_DAY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.date.MS_PER_HOUR")
  @js.native
  def MS_PER_HOUR: Double = js.native
  @scala.inline
  def MS_PER_HOUR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MS_PER_HOUR")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.date.MS_PER_MINUTE")
  @js.native
  def MS_PER_MINUTE: Double = js.native
  @scala.inline
  def MS_PER_MINUTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MS_PER_MINUTE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.date.addDays")
  @js.native
  def addDays(targetDate: js.Date, numberOfDaysToAdd: Double): js.Date = js.native
  
  @JSGlobal("kendo.date.dayOfWeek")
  @js.native
  def dayOfWeek(targetDate: js.Date, dayOfWeek: Double, direction: Double): js.Date = js.native
  
  @JSGlobal("kendo.date.firstDayOfMonth")
  @js.native
  def firstDayOfMonth(targetDate: js.Date): js.Date = js.native
  
  @JSGlobal("kendo.date.getDate")
  @js.native
  def getDate(date: js.Date): js.Date = js.native
  
  @JSGlobal("kendo.date.getMilliseconds")
  @js.native
  def getMilliseconds(targetDate: js.Date): Double = js.native
  
  @JSGlobal("kendo.date.isInDateRange")
  @js.native
  def isInDateRange(targetDate: js.Date, lowerLimitDate: js.Date, upperLimitDate: js.Date): Boolean = js.native
  
  @JSGlobal("kendo.date.isInTimeRange")
  @js.native
  def isInTimeRange(targetDate: js.Date, lowerLimitDate: js.Date, upperLimitDate: js.Date): Boolean = js.native
  
  @JSGlobal("kendo.date.isToday")
  @js.native
  def isToday(targetDate: js.Date): Boolean = js.native
  
  @JSGlobal("kendo.date.lastDayOfMonth")
  @js.native
  def lastDayOfMonth(targetDate: js.Date): js.Date = js.native
  
  @JSGlobal("kendo.date.nextDay")
  @js.native
  def nextDay(targetDate: js.Date): js.Date = js.native
  
  @JSGlobal("kendo.date.previousDay")
  @js.native
  def previousDay(targetDate: js.Date): js.Date = js.native
  
  @JSGlobal("kendo.date.setDayOfWeek")
  @js.native
  def setDayOfWeek(targetDate: js.Date, dayOfWeek: Double, direction: Double): Unit = js.native
  
  @JSGlobal("kendo.date.setHours")
  @js.native
  def setHours(targetDate: js.Date, sourceDate: Double): js.Date = js.native
  
  @JSGlobal("kendo.date.setTime")
  @js.native
  def setTime(targetDate: js.Date, millisecondsToAdd: Double, ignoreDST: Boolean): Unit = js.native
  
  @JSGlobal("kendo.date.toInvariantTime")
  @js.native
  def toInvariantTime(targetDate: js.Date): js.Date = js.native
  
  @JSGlobal("kendo.date.toUtcTime")
  @js.native
  def toUtcTime(targetDate: js.Date): Double = js.native
  
  @JSGlobal("kendo.date.today")
  @js.native
  def today(): js.Date = js.native
  
  @JSGlobal("kendo.date.weekInYear")
  @js.native
  def weekInYear(date: js.Date): Double = js.native
  @JSGlobal("kendo.date.weekInYear")
  @js.native
  def weekInYear(date: js.Date, weekStart: Double): Double = js.native
}

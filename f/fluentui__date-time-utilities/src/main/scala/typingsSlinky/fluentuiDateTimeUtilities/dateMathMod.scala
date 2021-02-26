package typingsSlinky.fluentuiDateTimeUtilities

import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typingsSlinky.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMathMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "addDays")
  @js.native
  def addDays(date: js.Date, days: Double): js.Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "addMonths")
  @js.native
  def addMonths(date: js.Date, months: Double): js.Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "addWeeks")
  @js.native
  def addWeeks(date: js.Date, weeks: Double): js.Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "addYears")
  @js.native
  def addYears(date: js.Date, years: Double): js.Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "compareDatePart")
  @js.native
  def compareDatePart(date1: js.Date, date2: js.Date): Number = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "compareDates")
  @js.native
  def compareDates(date1: js.Date, date2: js.Date): Boolean = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getDatePartHashValue")
  @js.native
  def getDatePartHashValue(date: js.Date): Double = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(date: js.Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[js.Date] = js.native
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.UndefOr[scala.Nothing],
    daysToSelectInDayView: Double
  ): js.Array[js.Date] = js.native
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[js.Date] = js.native
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[js.Date] = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getEndDateOfWeek")
  @js.native
  def getEndDateOfWeek(date: js.Date, firstDayOfWeek: DayOfWeek): js.Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getMonthEnd")
  @js.native
  def getMonthEnd(date: js.Date): js.Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getMonthStart")
  @js.native
  def getMonthStart(date: js.Date): js.Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getStartDateOfWeek")
  @js.native
  def getStartDateOfWeek(date: js.Date, firstDayOfWeek: DayOfWeek): js.Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getWeekNumber")
  @js.native
  def getWeekNumber(date: js.Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getWeekNumbersInMonth")
  @js.native
  def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: js.Date
  ): js.Array[Double] = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getYearEnd")
  @js.native
  def getYearEnd(date: js.Date): js.Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "getYearStart")
  @js.native
  def getYearStart(date: js.Date): js.Date = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "isInDateRangeArray")
  @js.native
  def isInDateRangeArray(date: js.Date, dateRange: js.Array[js.Date]): Boolean = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateMath/dateMath", "setMonth")
  @js.native
  def setMonth(date: js.Date, month: Double): js.Date = js.native
}

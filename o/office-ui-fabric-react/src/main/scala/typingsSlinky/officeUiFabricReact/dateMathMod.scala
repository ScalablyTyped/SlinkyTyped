package typingsSlinky.officeUiFabricReact

import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typingsSlinky.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMathMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "addDays")
  @js.native
  def addDays(date: js.Date, days: Double): js.Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "addMonths")
  @js.native
  def addMonths(date: js.Date, months: Double): js.Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "addWeeks")
  @js.native
  def addWeeks(date: js.Date, weeks: Double): js.Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "addYears")
  @js.native
  def addYears(date: js.Date, years: Double): js.Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "compareDatePart")
  @js.native
  def compareDatePart(date1: js.Date, date2: js.Date): Number = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "compareDates")
  @js.native
  def compareDates(date1: js.Date, date2: js.Date): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getDatePartHashValue")
  @js.native
  def getDatePartHashValue(date: js.Date): Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(date: js.Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[js.Date] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.UndefOr[scala.Nothing],
    daysToSelectInDayView: Double
  ): js.Array[js.Date] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[js.Date] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getDateRangeArray")
  @js.native
  def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[js.Date] = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getEndDateOfWeek")
  @js.native
  def getEndDateOfWeek(date: js.Date, firstDayOfWeek: DayOfWeek): js.Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getMonthEnd")
  @js.native
  def getMonthEnd(date: js.Date): js.Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getMonthStart")
  @js.native
  def getMonthStart(date: js.Date): js.Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getStartDateOfWeek")
  @js.native
  def getStartDateOfWeek(date: js.Date, firstDayOfWeek: DayOfWeek): js.Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getWeekNumber")
  @js.native
  def getWeekNumber(date: js.Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getWeekNumbersInMonth")
  @js.native
  def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: js.Date
  ): js.Array[Double] = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getYearEnd")
  @js.native
  def getYearEnd(date: js.Date): js.Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "getYearStart")
  @js.native
  def getYearStart(date: js.Date): js.Date = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "isInDateRangeArray")
  @js.native
  def isInDateRangeArray(date: js.Date, dateRange: js.Array[js.Date]): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", "setMonth")
  @js.native
  def setMonth(date: js.Date, month: Double): js.Date = js.native
}

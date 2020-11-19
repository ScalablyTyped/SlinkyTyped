package typingsSlinky.fluentuiDateTimeUtilities

import typingsSlinky.fluentuiDateTimeUtilities.dateFormattingTypesMod.ICalendarStrings
import typingsSlinky.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateFormatting
import typingsSlinky.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateGridStrings
import typingsSlinky.fluentuiDateTimeUtilities.dateGridTypesMod.IAvailableDateOptions
import typingsSlinky.fluentuiDateTimeUtilities.dateGridTypesMod.IDay
import typingsSlinky.fluentuiDateTimeUtilities.dateGridTypesMod.IDayGridOptions
import typingsSlinky.fluentuiDateTimeUtilities.dateGridTypesMod.IRestrictedDatesOptions
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear
import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluentui/date-time-utilities", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val DAYS_IN_WEEK: /* 7 */ Double = js.native
  
  val DEFAULT_CALENDAR_STRINGS: ICalendarStrings = js.native
  
  val DEFAULT_DATE_FORMATTING: IDateFormatting = js.native
  
  val DEFAULT_LOCALIZED_STRINGS: IDateGridStrings = js.native
  
  def addDays(date: js.Date, days: Double): js.Date = js.native
  
  def addMonths(date: js.Date, months: Double): js.Date = js.native
  
  def addWeeks(date: js.Date, weeks: Double): js.Date = js.native
  
  def addYears(date: js.Date, years: Double): js.Date = js.native
  
  def compareDatePart(date1: js.Date, date2: js.Date): Number = js.native
  
  def compareDates(date1: js.Date, date2: js.Date): Boolean = js.native
  
  def findAvailableDate(options: IAvailableDateOptions): js.UndefOr[js.Date] = js.native
  
  def formatDay(date: js.Date): String = js.native
  
  def formatMonthDayYear(date: js.Date, strings: IDateGridStrings): String = js.native
  
  def formatMonthYear(date: js.Date, strings: IDateGridStrings): String = js.native
  
  def formatYear(date: js.Date): String = js.native
  
  def getBoundedDateRange(dateRange: js.Array[js.Date]): js.Array[js.Date] = js.native
  def getBoundedDateRange(dateRange: js.Array[js.Date], minDate: js.UndefOr[scala.Nothing], maxDate: js.Date): js.Array[js.Date] = js.native
  def getBoundedDateRange(dateRange: js.Array[js.Date], minDate: js.Date): js.Array[js.Date] = js.native
  def getBoundedDateRange(dateRange: js.Array[js.Date], minDate: js.Date, maxDate: js.Date): js.Array[js.Date] = js.native
  
  def getDateRangeArray(date: js.Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[js.Date] = js.native
  def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.UndefOr[scala.Nothing],
    daysToSelectInDayView: Double
  ): js.Array[js.Date] = js.native
  def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[js.Date] = js.native
  def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[js.Date] = js.native
  
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.UndefOr[scala.Nothing], firstDayOfWeek: DayOfWeek): DateRangeType = js.native
  def getDateRangeTypeToUse(dateRangeType: DateRangeType, workWeekDays: js.Array[DayOfWeek], firstDayOfWeek: DayOfWeek): DateRangeType = js.native
  
  def getDayGrid(options: IDayGridOptions): js.Array[js.Array[IDay]] = js.native
  
  def getMonthEnd(date: js.Date): js.Date = js.native
  
  def getMonthStart(date: js.Date): js.Date = js.native
  
  def getStartDateOfWeek(date: js.Date, firstDayOfWeek: DayOfWeek): js.Date = js.native
  
  def getWeekNumber(date: js.Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = js.native
  
  def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: js.Date
  ): js.Array[Double] = js.native
  
  def getYearEnd(date: js.Date): js.Date = js.native
  
  def getYearStart(date: js.Date): js.Date = js.native
  
  def isAfterMaxDate(date: js.Date, options: IRestrictedDatesOptions): Boolean = js.native
  
  def isBeforeMinDate(date: js.Date, options: IRestrictedDatesOptions): Boolean = js.native
  
  def isContiguous(days: js.Array[DayOfWeek], isSingleWeek: Boolean, firstDayOfWeek: DayOfWeek): Boolean = js.native
  
  def isInDateRangeArray(date: js.Date, dateRange: js.Array[js.Date]): Boolean = js.native
  
  def isRestrictedDate(date: js.Date, options: IRestrictedDatesOptions): Boolean = js.native
  
  def setMonth(date: js.Date, month: Double): js.Date = js.native
  
  @js.native
  object DateRangeType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType with Double] = js.native
    
    /* 0 */ val Day: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Day with Double = js.native
    
    /* 2 */ val Month: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Month with Double = js.native
    
    /* 1 */ val Week: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.Week with Double = js.native
    
    /* 3 */ val WorkWeek: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType.WorkWeek with Double = js.native
  }
  
  @js.native
  object DayOfWeek extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek with Double] = js.native
    
    /* 5 */ val Friday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Friday with Double = js.native
    
    /* 1 */ val Monday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Monday with Double = js.native
    
    /* 6 */ val Saturday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Saturday with Double = js.native
    
    /* 0 */ val Sunday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Sunday with Double = js.native
    
    /* 4 */ val Thursday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Thursday with Double = js.native
    
    /* 2 */ val Tuesday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Tuesday with Double = js.native
    
    /* 3 */ val Wednesday: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek.Wednesday with Double = js.native
  }
  
  @js.native
  object FirstWeekOfYear extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear with Double
      ] = js.native
    
    /* 0 */ val FirstDay: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstDay with Double = js.native
    
    /* 2 */ val FirstFourDayWeek: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFourDayWeek with Double = js.native
    
    /* 1 */ val FirstFullWeek: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.FirstWeekOfYear.FirstFullWeek with Double = js.native
  }
  
  @js.native
  object MonthOfYear extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear with Double] = js.native
    
    /* 3 */ val April: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.April with Double = js.native
    
    /* 7 */ val August: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.August with Double = js.native
    
    /* 11 */ val December: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.December with Double = js.native
    
    /* 1 */ val February: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.February with Double = js.native
    
    /* 0 */ val January: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.January with Double = js.native
    
    /* 6 */ val July: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.July with Double = js.native
    
    /* 5 */ val June: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.June with Double = js.native
    
    /* 2 */ val March: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.March with Double = js.native
    
    /* 4 */ val May: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.May with Double = js.native
    
    /* 10 */ val November: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.November with Double = js.native
    
    /* 9 */ val October: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.October with Double = js.native
    
    /* 8 */ val September: typingsSlinky.fluentuiDateTimeUtilities.dateValuesMod.MonthOfYear.September with Double = js.native
  }
}

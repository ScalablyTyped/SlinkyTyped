package typingsSlinky.blueprintjsDatetime

import typingsSlinky.blueprintjsDatetime.anon.PartialIDateInputProps
import typingsSlinky.blueprintjsDatetime.anon.PartialIDateRangeInputPro
import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeStrings.millisecond
import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeStrings.minute
import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeStrings.second
import typingsSlinky.blueprintjsDatetime.dateInputMod.IDateInputProps
import typingsSlinky.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typingsSlinky.blueprintjsDatetime.dateRangeInputMod.IDateRangeInputProps
import typingsSlinky.blueprintjsDatetime.dateRangeMod.DateRange
import typingsSlinky.blueprintjsDatetime.dateRangePickerMod.IDateRangePickerProps
import typingsSlinky.blueprintjsDatetime.dateTimePickerMod.IDateTimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Classes {
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEINPUT")
    @js.native
    val DATEINPUT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEINPUT_POPOVER")
    @js.native
    val DATEINPUT_POPOVER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER")
    @js.native
    val DATEPICKER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_CAPTION")
    @js.native
    val DATEPICKER_CAPTION: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_CAPTION_CARET")
    @js.native
    val DATEPICKER_CAPTION_CARET: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_CAPTION_MEASURE")
    @js.native
    val DATEPICKER_CAPTION_MEASURE: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_CAPTION_SELECT")
    @js.native
    val DATEPICKER_CAPTION_SELECT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_DAY")
    @js.native
    val DATEPICKER_DAY: /* "DayPicker-Day" */ String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_DAY_DISABLED")
    @js.native
    val DATEPICKER_DAY_DISABLED: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_DAY_IS_TODAY")
    @js.native
    val DATEPICKER_DAY_IS_TODAY: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_DAY_OUTSIDE")
    @js.native
    val DATEPICKER_DAY_OUTSIDE: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_DAY_SELECTED")
    @js.native
    val DATEPICKER_DAY_SELECTED: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_DAY_WRAPPER")
    @js.native
    val DATEPICKER_DAY_WRAPPER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_FOOTER")
    @js.native
    val DATEPICKER_FOOTER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_MONTH_SELECT")
    @js.native
    val DATEPICKER_MONTH_SELECT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_NAVBAR")
    @js.native
    val DATEPICKER_NAVBAR: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_NAVBUTTON")
    @js.native
    val DATEPICKER_NAVBUTTON: /* "DayPicker-NavButton" */ String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_TIMEPICKER_WRAPPER")
    @js.native
    val DATEPICKER_TIMEPICKER_WRAPPER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATEPICKER_YEAR_SELECT")
    @js.native
    val DATEPICKER_YEAR_SELECT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER")
    @js.native
    val DATERANGEPICKER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER_CONTIGUOUS")
    @js.native
    val DATERANGEPICKER_CONTIGUOUS: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER_DAY_HOVERED_RANGE")
    @js.native
    val DATERANGEPICKER_DAY_HOVERED_RANGE: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER_DAY_SELECTED_RANGE")
    @js.native
    val DATERANGEPICKER_DAY_SELECTED_RANGE: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER_SHORTCUTS")
    @js.native
    val DATERANGEPICKER_SHORTCUTS: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER_SINGLE_MONTH")
    @js.native
    val DATERANGEPICKER_SINGLE_MONTH: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATERANGEPICKER_TIMEPICKERS")
    @js.native
    val DATERANGEPICKER_TIMEPICKERS: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.DATETIMEPICKER")
    @js.native
    val DATETIMEPICKER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER")
    @js.native
    val TIMEPICKER: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_AMPM_SELECT")
    @js.native
    val TIMEPICKER_AMPM_SELECT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_ARROW_BUTTON")
    @js.native
    val TIMEPICKER_ARROW_BUTTON: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_ARROW_ROW")
    @js.native
    val TIMEPICKER_ARROW_ROW: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_DIVIDER_TEXT")
    @js.native
    val TIMEPICKER_DIVIDER_TEXT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_HOUR")
    @js.native
    val TIMEPICKER_HOUR: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_INPUT")
    @js.native
    val TIMEPICKER_INPUT: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_INPUT_ROW")
    @js.native
    val TIMEPICKER_INPUT_ROW: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_MILLISECOND")
    @js.native
    val TIMEPICKER_MILLISECOND: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_MINUTE")
    @js.native
    val TIMEPICKER_MINUTE: String = js.native
    
    @JSImport("@blueprintjs/datetime", "Classes.TIMEPICKER_SECOND")
    @js.native
    val TIMEPICKER_SECOND: String = js.native
  }
  
  @JSImport("@blueprintjs/datetime", "DateInput")
  @js.native
  class DateInput protected ()
    extends typingsSlinky.blueprintjsDatetime.dateInputMod.DateInput {
    def this(props: IDateInputProps) = this()
    def this(props: IDateInputProps, context: js.Any) = this()
  }
  /* static members */
  object DateInput {
    
    @JSImport("@blueprintjs/datetime", "DateInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "DateInput.defaultProps")
    @js.native
    def defaultProps: PartialIDateInputProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialIDateInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "DateInput.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/datetime", "DatePicker")
  @js.native
  class DatePicker protected ()
    extends typingsSlinky.blueprintjsDatetime.datePickerMod.DatePicker {
    def this(props: IDatePickerProps) = this()
    def this(props: IDatePickerProps, context: js.Any) = this()
  }
  /* static members */
  object DatePicker {
    
    @JSImport("@blueprintjs/datetime", "DatePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "DatePicker.defaultProps")
    @js.native
    def defaultProps: IDatePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDatePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "DatePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/datetime", "DateRangeInput")
  @js.native
  class DateRangeInput protected ()
    extends typingsSlinky.blueprintjsDatetime.dateRangeInputMod.DateRangeInput {
    def this(props: IDateRangeInputProps) = this()
    def this(props: IDateRangeInputProps, context: js.Any) = this()
  }
  /* static members */
  object DateRangeInput {
    
    @JSImport("@blueprintjs/datetime", "DateRangeInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "DateRangeInput.defaultProps")
    @js.native
    def defaultProps: PartialIDateRangeInputPro = js.native
    @scala.inline
    def defaultProps_=(x: PartialIDateRangeInputPro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "DateRangeInput.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/datetime", "DateRangePicker")
  @js.native
  class DateRangePicker protected ()
    extends typingsSlinky.blueprintjsDatetime.dateRangePickerMod.DateRangePicker {
    def this(props: IDateRangePickerProps) = this()
    def this(props: IDateRangePickerProps, context: js.Any) = this()
  }
  /* static members */
  object DateRangePicker {
    
    @JSImport("@blueprintjs/datetime", "DateRangePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "DateRangePicker.defaultProps")
    @js.native
    def defaultProps: IDateRangePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDateRangePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "DateRangePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/datetime", "DateTimePicker")
  @js.native
  class DateTimePicker ()
    extends typingsSlinky.blueprintjsDatetime.dateTimePickerMod.DateTimePicker {
    def this(props: IDateTimePickerProps) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
    def this(props: IDateTimePickerProps, context: js.Any) = this()
  }
  /* static members */
  object DateTimePicker {
    
    @JSImport("@blueprintjs/datetime", "DateTimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "DateTimePicker.defaultProps")
    @js.native
    def defaultProps: IDateTimePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDateTimePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "DateTimePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object DateUtils {
    
    @JSImport("@blueprintjs/datetime", "DateUtils.areEqual")
    @js.native
    def areEqual(date1: js.Date, date2: js.Date): Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.areRangesEqual")
    @js.native
    def areRangesEqual(dateRange1: DateRange, dateRange2: DateRange): Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.areSameDay")
    @js.native
    def areSameDay(date1: js.Date, date2: js.Date): Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.areSameMonth")
    @js.native
    def areSameMonth(date1: js.Date, date2: js.Date): Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.areSameTime")
    @js.native
    def areSameTime(date1: js.Date, date2: js.Date): Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.clone")
    @js.native
    def clone_(d: js.Date): js.Date = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.convert24HourMeridiem")
    @js.native
    def convert24HourMeridiem(hour: Double, toPm: Boolean): Double = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.get12HourFrom24Hour")
    @js.native
    def get12HourFrom24Hour(hour: Double): Double = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.get24HourFrom12Hour")
    @js.native
    def get24HourFrom12Hour(hour: Double, isPm: Boolean): Double = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.getDateBetween")
    @js.native
    def getDateBetween(dateRange: DateRange): js.Date = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.getDateNextMonth")
    @js.native
    def getDateNextMonth(date: js.Date): js.Date = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.getDateOnlyWithTime")
    @js.native
    def getDateOnlyWithTime(date: js.Date): js.Date = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.getDatePreviousMonth")
    @js.native
    def getDatePreviousMonth(date: js.Date): js.Date = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.getDateTime")
    @js.native
    def getDateTime(): js.Date = js.native
    @JSImport("@blueprintjs/datetime", "DateUtils.getDateTime")
    @js.native
    def getDateTime(date: js.Date): js.Date = js.native
    @JSImport("@blueprintjs/datetime", "DateUtils.getDateTime")
    @js.native
    def getDateTime(date: js.Date, time: js.Date): js.Date = js.native
    @JSImport("@blueprintjs/datetime", "DateUtils.getDateTime")
    @js.native
    def getDateTime(date: Null, time: js.Date): js.Date = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.getIsPmFrom24Hour")
    @js.native
    def getIsPmFrom24Hour(hour: Double): Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.getTimeInRange")
    @js.native
    def getTimeInRange(time: js.Date, minTime: js.Date, maxTime: js.Date): js.Date = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.isDateValid")
    @js.native
    def isDateValid(): /* is std.Date */ Boolean = js.native
    @JSImport("@blueprintjs/datetime", "DateUtils.isDateValid")
    @js.native
    def isDateValid(date: js.Date): /* is std.Date */ Boolean = js.native
    @JSImport("@blueprintjs/datetime", "DateUtils.isDateValid")
    @js.native
    def isDateValid_false(date: `false`): /* is std.Date */ Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.isDayInRange")
    @js.native
    def isDayInRange(date: js.Date, dateRange: DateRange): Boolean = js.native
    @JSImport("@blueprintjs/datetime", "DateUtils.isDayInRange")
    @js.native
    def isDayInRange(date: js.Date, dateRange: DateRange, exclusive: Boolean): Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.isDayRangeInRange")
    @js.native
    def isDayRangeInRange(innerRange: DateRange, outerRange: DateRange): Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.isMonthInRange")
    @js.native
    def isMonthInRange(date: js.Date, dateRange: DateRange): Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.isTimeEqualOrGreaterThan")
    @js.native
    def isTimeEqualOrGreaterThan(time: js.Date, timeToCompare: js.Date): Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.isTimeEqualOrSmallerThan")
    @js.native
    def isTimeEqualOrSmallerThan(time: js.Date, timeToCompare: js.Date): Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.isTimeInRange")
    @js.native
    def isTimeInRange(date: js.Date, minDate: js.Date, maxDate: js.Date): Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.isTimeSameOrAfter")
    @js.native
    def isTimeSameOrAfter(date: js.Date, dateToCompare: js.Date): Boolean = js.native
    
    @JSImport("@blueprintjs/datetime", "DateUtils.isToday")
    @js.native
    def isToday(date: js.Date): Boolean = js.native
  }
  
  @JSImport("@blueprintjs/datetime", "Months")
  @js.native
  object Months extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.blueprintjsDatetime.monthsMod.Months with Double] = js.native
    
    /* 3 */ val APRIL: typingsSlinky.blueprintjsDatetime.monthsMod.Months.APRIL with Double = js.native
    
    /* 7 */ val AUGUST: typingsSlinky.blueprintjsDatetime.monthsMod.Months.AUGUST with Double = js.native
    
    /* 11 */ val DECEMBER: typingsSlinky.blueprintjsDatetime.monthsMod.Months.DECEMBER with Double = js.native
    
    /* 1 */ val FEBRUARY: typingsSlinky.blueprintjsDatetime.monthsMod.Months.FEBRUARY with Double = js.native
    
    /* 0 */ val JANUARY: typingsSlinky.blueprintjsDatetime.monthsMod.Months.JANUARY with Double = js.native
    
    /* 6 */ val JULY: typingsSlinky.blueprintjsDatetime.monthsMod.Months.JULY with Double = js.native
    
    /* 5 */ val JUNE: typingsSlinky.blueprintjsDatetime.monthsMod.Months.JUNE with Double = js.native
    
    /* 2 */ val MARCH: typingsSlinky.blueprintjsDatetime.monthsMod.Months.MARCH with Double = js.native
    
    /* 4 */ val MAY: typingsSlinky.blueprintjsDatetime.monthsMod.Months.MAY with Double = js.native
    
    /* 10 */ val NOVEMBER: typingsSlinky.blueprintjsDatetime.monthsMod.Months.NOVEMBER with Double = js.native
    
    /* 9 */ val OCTOBER: typingsSlinky.blueprintjsDatetime.monthsMod.Months.OCTOBER with Double = js.native
    
    /* 8 */ val SEPTEMBER: typingsSlinky.blueprintjsDatetime.monthsMod.Months.SEPTEMBER with Double = js.native
  }
  
  @JSImport("@blueprintjs/datetime", "TimePicker")
  @js.native
  class TimePicker ()
    extends typingsSlinky.blueprintjsDatetime.timePickerMod.TimePicker {
    def this(props: ITimePickerProps) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
    def this(props: ITimePickerProps, context: js.Any) = this()
  }
  /* static members */
  object TimePicker {
    
    @JSImport("@blueprintjs/datetime", "TimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "TimePicker.defaultProps")
    @js.native
    def defaultProps: ITimePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: ITimePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "TimePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object TimePrecision {
    
    @JSImport("@blueprintjs/datetime", "TimePrecision")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/datetime", "TimePrecision.MILLISECOND")
    @js.native
    def MILLISECOND: millisecond = js.native
    @scala.inline
    def MILLISECOND_=(x: millisecond): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLISECOND")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "TimePrecision.MINUTE")
    @js.native
    def MINUTE: minute = js.native
    @scala.inline
    def MINUTE_=(x: minute): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/datetime", "TimePrecision.SECOND")
    @js.native
    def SECOND: second = js.native
    @scala.inline
    def SECOND_=(x: second): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECOND")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/datetime", "TimeUnit")
  @js.native
  object TimeUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.blueprintjsDatetime.timeUnitMod.TimeUnit with String] = js.native
    
    /* "hour12" */ val HOUR_12: typingsSlinky.blueprintjsDatetime.timeUnitMod.TimeUnit.HOUR_12 with String = js.native
    
    /* "hour24" */ val HOUR_24: typingsSlinky.blueprintjsDatetime.timeUnitMod.TimeUnit.HOUR_24 with String = js.native
    
    /* "minute" */ val MINUTE: typingsSlinky.blueprintjsDatetime.timeUnitMod.TimeUnit.MINUTE with String = js.native
    
    /* "ms" */ val MS: typingsSlinky.blueprintjsDatetime.timeUnitMod.TimeUnit.MS with String = js.native
    
    /* "second" */ val SECOND: typingsSlinky.blueprintjsDatetime.timeUnitMod.TimeUnit.SECOND with String = js.native
  }
  
  @js.native
  trait IDatePickerLocaleUtils extends StObject {
    
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
}

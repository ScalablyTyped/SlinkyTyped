package typingsSlinky.dateIoCore

import typingsSlinky.dateIoCore.dateIoCoreStrings.am
import typingsSlinky.dateIoCore.dateIoCoreStrings.dayOfMonth
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullDate
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullDateTime
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullDateTime12h
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullDateTime24h
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullDateWithWeekday
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullTime
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullTime12h
import typingsSlinky.dateIoCore.dateIoCoreStrings.fullTime24h
import typingsSlinky.dateIoCore.dateIoCoreStrings.hours12h
import typingsSlinky.dateIoCore.dateIoCoreStrings.hours24h
import typingsSlinky.dateIoCore.dateIoCoreStrings.keyboardDate
import typingsSlinky.dateIoCore.dateIoCoreStrings.keyboardDateTime
import typingsSlinky.dateIoCore.dateIoCoreStrings.keyboardDateTime12h
import typingsSlinky.dateIoCore.dateIoCoreStrings.keyboardDateTime24h
import typingsSlinky.dateIoCore.dateIoCoreStrings.minutes
import typingsSlinky.dateIoCore.dateIoCoreStrings.month
import typingsSlinky.dateIoCore.dateIoCoreStrings.monthAndDate
import typingsSlinky.dateIoCore.dateIoCoreStrings.monthAndYear
import typingsSlinky.dateIoCore.dateIoCoreStrings.monthShort
import typingsSlinky.dateIoCore.dateIoCoreStrings.normalDate
import typingsSlinky.dateIoCore.dateIoCoreStrings.normalDateWithWeekday
import typingsSlinky.dateIoCore.dateIoCoreStrings.pm
import typingsSlinky.dateIoCore.dateIoCoreStrings.seconds
import typingsSlinky.dateIoCore.dateIoCoreStrings.shortDate
import typingsSlinky.dateIoCore.dateIoCoreStrings.weekday
import typingsSlinky.dateIoCore.dateIoCoreStrings.weekdayShort
import typingsSlinky.dateIoCore.dateIoCoreStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait DateIOFormats[TLibFormatToken] extends StObject {
    
    /** Day format string @example "1" */
    var dayOfMonth: TLibFormatToken = js.native
    
    /** Localized full date @example "Jan 1, 2019" */
    var fullDate: TLibFormatToken = js.native
    
    /** Date & time format string with localized time @example "Jan 1, 2018 11:44 PM" */
    var fullDateTime: TLibFormatToken = js.native
    
    /** Not localized date & Time format 12h @example "Jan 1, 2018 11:44 PM" */
    var fullDateTime12h: TLibFormatToken = js.native
    
    /** Not localized date & Time format 24h @example "Jan 1, 2018 23:44" */
    var fullDateTime24h: TLibFormatToken = js.native
    
    /** Partially localized full date with weekday, useful for text-to-speech accessibility @example "Tuesday, January 1, 2019" */
    var fullDateWithWeekday: TLibFormatToken = js.native
    
    /** Full time localized format string @example "11:44 PM" for US, "23:44" for Europe */
    var fullTime: TLibFormatToken = js.native
    
    /** Not localized full time format string @example "11:44 PM" */
    var fullTime12h: TLibFormatToken = js.native
    
    /** Not localized full time format string @example "23:44" */
    var fullTime24h: TLibFormatToken = js.native
    
    /** Hours format string @example "11" */
    var hours12h: TLibFormatToken = js.native
    
    /** Hours format string @example "23" */
    var hours24h: TLibFormatToken = js.native
    
    /** Localized keyboard input friendly date format @example "02/13/2020 */
    var keyboardDate: TLibFormatToken = js.native
    
    /** Localized keyboard input friendly date/time format @example "02/13/2020 23:44" */
    var keyboardDateTime: TLibFormatToken = js.native
    
    /** Partially localized keyboard input friendly date/time 12h format @example "02/13/2020 11:44 PM" */
    var keyboardDateTime12h: TLibFormatToken = js.native
    
    /** Partially localized keyboard input friendly date/time 24h format @example "02/13/2020 23:44" */
    var keyboardDateTime24h: TLibFormatToken = js.native
    
    /** Minutes format string @example "44" */
    var minutes: TLibFormatToken = js.native
    
    /** Month format string @example "January" */
    var month: TLibFormatToken = js.native
    
    /** Month with date format string @example "January 1" */
    var monthAndDate: TLibFormatToken = js.native
    
    /** Short month format string @example "January 2018" */
    var monthAndYear: TLibFormatToken = js.native
    
    /** Short month format string @example "Jan" */
    var monthShort: TLibFormatToken = js.native
    
    /** Date format string with month and day of month @example "1 January" */
    var normalDate: TLibFormatToken = js.native
    
    /** Date format string with weekday, month and day of month @example "Wed, Jan 1" */
    var normalDateWithWeekday: TLibFormatToken = js.native
    
    /** Seconds format string @example "00" */
    var seconds: TLibFormatToken = js.native
    
    /** Shorter day format @example "Jan 1" */
    var shortDate: TLibFormatToken = js.native
    
    /** Weekday format string @example "Wednesday" */
    var weekday: TLibFormatToken = js.native
    
    /** Short weekday format string @example "Wed" */
    var weekdayShort: TLibFormatToken = js.native
    
    /** Year format string @example "2019" */
    var year: TLibFormatToken = js.native
  }
  object DateIOFormats {
    
    @scala.inline
    def apply[TLibFormatToken](
      dayOfMonth: TLibFormatToken,
      fullDate: TLibFormatToken,
      fullDateTime: TLibFormatToken,
      fullDateTime12h: TLibFormatToken,
      fullDateTime24h: TLibFormatToken,
      fullDateWithWeekday: TLibFormatToken,
      fullTime: TLibFormatToken,
      fullTime12h: TLibFormatToken,
      fullTime24h: TLibFormatToken,
      hours12h: TLibFormatToken,
      hours24h: TLibFormatToken,
      keyboardDate: TLibFormatToken,
      keyboardDateTime: TLibFormatToken,
      keyboardDateTime12h: TLibFormatToken,
      keyboardDateTime24h: TLibFormatToken,
      minutes: TLibFormatToken,
      month: TLibFormatToken,
      monthAndDate: TLibFormatToken,
      monthAndYear: TLibFormatToken,
      monthShort: TLibFormatToken,
      normalDate: TLibFormatToken,
      normalDateWithWeekday: TLibFormatToken,
      seconds: TLibFormatToken,
      shortDate: TLibFormatToken,
      weekday: TLibFormatToken,
      weekdayShort: TLibFormatToken,
      year: TLibFormatToken
    ): DateIOFormats[TLibFormatToken] = {
      val __obj = js.Dynamic.literal(dayOfMonth = dayOfMonth.asInstanceOf[js.Any], fullDate = fullDate.asInstanceOf[js.Any], fullDateTime = fullDateTime.asInstanceOf[js.Any], fullDateTime12h = fullDateTime12h.asInstanceOf[js.Any], fullDateTime24h = fullDateTime24h.asInstanceOf[js.Any], fullDateWithWeekday = fullDateWithWeekday.asInstanceOf[js.Any], fullTime = fullTime.asInstanceOf[js.Any], fullTime12h = fullTime12h.asInstanceOf[js.Any], fullTime24h = fullTime24h.asInstanceOf[js.Any], hours12h = hours12h.asInstanceOf[js.Any], hours24h = hours24h.asInstanceOf[js.Any], keyboardDate = keyboardDate.asInstanceOf[js.Any], keyboardDateTime = keyboardDateTime.asInstanceOf[js.Any], keyboardDateTime12h = keyboardDateTime12h.asInstanceOf[js.Any], keyboardDateTime24h = keyboardDateTime24h.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], monthAndDate = monthAndDate.asInstanceOf[js.Any], monthAndYear = monthAndYear.asInstanceOf[js.Any], monthShort = monthShort.asInstanceOf[js.Any], normalDate = normalDate.asInstanceOf[js.Any], normalDateWithWeekday = normalDateWithWeekday.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any], weekdayShort = weekdayShort.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateIOFormats[TLibFormatToken]]
    }
    
    @scala.inline
    implicit class DateIOFormatsMutableBuilder[Self <: DateIOFormats[_], TLibFormatToken] (val x: Self with DateIOFormats[TLibFormatToken]) extends AnyVal {
      
      @scala.inline
      def setDayOfMonth(value: TLibFormatToken): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullDate(value: TLibFormatToken): Self = StObject.set(x, "fullDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullDateTime(value: TLibFormatToken): Self = StObject.set(x, "fullDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullDateTime12h(value: TLibFormatToken): Self = StObject.set(x, "fullDateTime12h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullDateTime24h(value: TLibFormatToken): Self = StObject.set(x, "fullDateTime24h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullDateWithWeekday(value: TLibFormatToken): Self = StObject.set(x, "fullDateWithWeekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullTime(value: TLibFormatToken): Self = StObject.set(x, "fullTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullTime12h(value: TLibFormatToken): Self = StObject.set(x, "fullTime12h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullTime24h(value: TLibFormatToken): Self = StObject.set(x, "fullTime24h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHours12h(value: TLibFormatToken): Self = StObject.set(x, "hours12h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHours24h(value: TLibFormatToken): Self = StObject.set(x, "hours24h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardDate(value: TLibFormatToken): Self = StObject.set(x, "keyboardDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardDateTime(value: TLibFormatToken): Self = StObject.set(x, "keyboardDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardDateTime12h(value: TLibFormatToken): Self = StObject.set(x, "keyboardDateTime12h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardDateTime24h(value: TLibFormatToken): Self = StObject.set(x, "keyboardDateTime24h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutes(value: TLibFormatToken): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: TLibFormatToken): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthAndDate(value: TLibFormatToken): Self = StObject.set(x, "monthAndDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthAndYear(value: TLibFormatToken): Self = StObject.set(x, "monthAndYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthShort(value: TLibFormatToken): Self = StObject.set(x, "monthShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalDate(value: TLibFormatToken): Self = StObject.set(x, "normalDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalDateWithWeekday(value: TLibFormatToken): Self = StObject.set(x, "normalDateWithWeekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeconds(value: TLibFormatToken): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortDate(value: TLibFormatToken): Self = StObject.set(x, "shortDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekday(value: TLibFormatToken): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayShort(value: TLibFormatToken): Self = StObject.set(x, "weekdayShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: TLibFormatToken): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IUtils[TDate] extends StObject {
    
    def addDays(value: TDate, count: Double): TDate = js.native
    
    def addHours(value: TDate, count: Double): TDate = js.native
    
    def addMinutes(value: TDate, count: Double): TDate = js.native
    
    def addMonths(value: TDate, count: Double): TDate = js.native
    
    def addSeconds(value: TDate, count: Double): TDate = js.native
    
    def addWeeks(value: TDate, count: Double): TDate = js.native
    
    // constructor (options?: { formats?: DateIOFormats, locale?: any, instance?: any });
    def date(): TDate | Null = js.native
    def date(value: js.Any): TDate | Null = js.native
    
    var dayjs: js.UndefOr[js.Any] = js.native
    
    def endOfDay(value: TDate): TDate = js.native
    
    def endOfMonth(value: TDate): TDate = js.native
    
    def endOfWeek(value: TDate): TDate = js.native
    
    def format(
      value: TDate,
      formatKey: /* keyof @date-io/core.@date-io/core/IUtils.DateIOFormats<string> */ fullDate | fullDateWithWeekday | normalDate | normalDateWithWeekday | shortDate | year | month | monthShort | monthAndYear | monthAndDate | weekday | weekdayShort | dayOfMonth | hours12h | hours24h | minutes | seconds | fullTime | fullTime12h | fullTime24h | fullDateTime | fullDateTime12h | fullDateTime24h | keyboardDate | keyboardDateTime | keyboardDateTime12h | keyboardDateTime24h
    ): String = js.native
    
    def formatByString(value: TDate, formatString: String): String = js.native
    
    def formatNumber(numberToFormat: String): String = js.native
    
    var formats: DateIOFormats[_] = js.native
    
    def getCurrentLocaleCode(): String = js.native
    
    def getDaysInMonth(value: TDate): Double = js.native
    
    def getDiff(value: TDate, comparing: TDate): Double = js.native
    def getDiff(value: TDate, comparing: TDate, unit: Unit): Double = js.native
    def getDiff(value: TDate, comparing: String): Double = js.native
    def getDiff(value: TDate, comparing: String, unit: Unit): Double = js.native
    
    /** Returns user readable format (taking into account localized format tokens), useful to render helper text for input (e.g. placeholder). For luxon always returns empty string. */
    def getFormatHelperText(format: String): String = js.native
    
    def getHours(value: TDate): Double = js.native
    
    /** Allow to customize displaying "am/pm" strings */
    @JSName("getMeridiemText")
    def getMeridiemText_am(ampm: am): String = js.native
    @JSName("getMeridiemText")
    def getMeridiemText_pm(ampm: pm): String = js.native
    
    def getMinutes(value: TDate): Double = js.native
    
    def getMonth(value: TDate): Double = js.native
    
    def getMonthArray(value: TDate): js.Array[TDate] = js.native
    
    def getNextMonth(value: TDate): TDate = js.native
    
    def getPreviousMonth(value: TDate): TDate = js.native
    
    def getSeconds(value: TDate): Double = js.native
    
    def getWeekArray(date: TDate): js.Array[js.Array[TDate]] = js.native
    
    def getWeekdays(): js.Array[String] = js.native
    
    def getYear(value: TDate): Double = js.native
    
    def getYearRange(start: TDate, end: TDate): js.Array[TDate] = js.native
    
    def is12HourCycleInCurrentLocale(): Boolean = js.native
    
    def isAfter(value: TDate, comparing: TDate): Boolean = js.native
    
    def isAfterDay(value: TDate, comparing: TDate): Boolean = js.native
    
    def isAfterYear(value: TDate, comparing: TDate): Boolean = js.native
    
    def isBefore(value: TDate, comparing: TDate): Boolean = js.native
    
    def isBeforeDay(value: TDate, comparing: TDate): Boolean = js.native
    
    def isBeforeYear(value: TDate, comparing: TDate): Boolean = js.native
    
    def isEqual(value: js.Any, comparing: js.Any): Boolean = js.native
    
    def isNull(): Boolean = js.native
    def isNull(value: TDate): Boolean = js.native
    
    def isSameDay(value: TDate, comparing: TDate): Boolean = js.native
    
    def isSameHour(value: TDate, comparing: TDate): Boolean = js.native
    
    def isSameMonth(value: TDate, comparing: TDate): Boolean = js.native
    
    def isSameYear(value: TDate, comparing: TDate): Boolean = js.native
    
    def isValid(value: js.Any): Boolean = js.native
    
    def isWithinRange(value: TDate, range: js.Tuple2[TDate, TDate]): Boolean = js.native
    
    /** Name of the library that is used right now */
    var lib: String = js.native
    
    var locale: js.UndefOr[js.Any] = js.native
    
    def mergeDateAndTime(date: TDate, time: TDate): TDate = js.native
    
    var moment: js.UndefOr[js.Any] = js.native
    
    def parse(value: String, format: String): TDate | Null = js.native
    
    def setHours(value: TDate, count: Double): TDate = js.native
    
    def setMinutes(value: TDate, count: Double): TDate = js.native
    
    def setMonth(value: TDate, count: Double): TDate = js.native
    
    def setSeconds(value: TDate, count: Double): TDate = js.native
    
    def setYear(value: TDate, count: Double): TDate = js.native
    
    def startOfDay(value: TDate): TDate = js.native
    
    def startOfMonth(value: TDate): TDate = js.native
    
    def startOfWeek(value: TDate): TDate = js.native
    
    def toJsDate(value: TDate): js.Date = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.dateIoCore.dateIoCoreStrings.years
    - typingsSlinky.dateIoCore.dateIoCoreStrings.quarters
    - typingsSlinky.dateIoCore.dateIoCoreStrings.months
    - typingsSlinky.dateIoCore.dateIoCoreStrings.weeks
    - typingsSlinky.dateIoCore.dateIoCoreStrings.days
    - typingsSlinky.dateIoCore.dateIoCoreStrings.hours
    - typingsSlinky.dateIoCore.dateIoCoreStrings.minutes
    - typingsSlinky.dateIoCore.dateIoCoreStrings.seconds
    - typingsSlinky.dateIoCore.dateIoCoreStrings.milliseconds
  */
  trait Unit extends StObject
  object Unit {
    
    @scala.inline
    def days: typingsSlinky.dateIoCore.dateIoCoreStrings.days = "days".asInstanceOf[typingsSlinky.dateIoCore.dateIoCoreStrings.days]
    
    @scala.inline
    def hours: typingsSlinky.dateIoCore.dateIoCoreStrings.hours = "hours".asInstanceOf[typingsSlinky.dateIoCore.dateIoCoreStrings.hours]
    
    @scala.inline
    def milliseconds: typingsSlinky.dateIoCore.dateIoCoreStrings.milliseconds = "milliseconds".asInstanceOf[typingsSlinky.dateIoCore.dateIoCoreStrings.milliseconds]
    
    @scala.inline
    def minutes: typingsSlinky.dateIoCore.dateIoCoreStrings.minutes = "minutes".asInstanceOf[typingsSlinky.dateIoCore.dateIoCoreStrings.minutes]
    
    @scala.inline
    def months: typingsSlinky.dateIoCore.dateIoCoreStrings.months = "months".asInstanceOf[typingsSlinky.dateIoCore.dateIoCoreStrings.months]
    
    @scala.inline
    def quarters: typingsSlinky.dateIoCore.dateIoCoreStrings.quarters = "quarters".asInstanceOf[typingsSlinky.dateIoCore.dateIoCoreStrings.quarters]
    
    @scala.inline
    def seconds: typingsSlinky.dateIoCore.dateIoCoreStrings.seconds = "seconds".asInstanceOf[typingsSlinky.dateIoCore.dateIoCoreStrings.seconds]
    
    @scala.inline
    def weeks: typingsSlinky.dateIoCore.dateIoCoreStrings.weeks = "weeks".asInstanceOf[typingsSlinky.dateIoCore.dateIoCoreStrings.weeks]
    
    @scala.inline
    def years: typingsSlinky.dateIoCore.dateIoCoreStrings.years = "years".asInstanceOf[typingsSlinky.dateIoCore.dateIoCoreStrings.years]
  }
}

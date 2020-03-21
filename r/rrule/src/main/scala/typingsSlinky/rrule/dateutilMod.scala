package typingsSlinky.rrule

import typingsSlinky.rrule.datetimeMod.Time
import typingsSlinky.rrule.rruleNumbers.`9999`
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/dateutil", JSImport.Namespace)
@js.native
object dateutilMod extends js.Object {
  @js.native
  object dateutil extends js.Object {
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.MAXYEAR>
      */
    val MAXYEAR: `9999` = js.native
    val MONTH_DAYS: js.Array[Double] = js.native
    /**
      * Number of milliseconds of one day
      */
    val ONE_DAY: Double = js.native
    /**
      * Python uses 1-Jan-1 as the base for calculating ordinals but we don't
      * want to confuse the JS engine with milliseconds > Number.MAX_NUMBER,
      * therefore we use 1-Jan-1970 instead
      */
    val ORDINAL_BASE: js.Date = js.native
    /**
      * Python: MO-SU: 0 - 6
      * JS: SU-SAT 0 - 6
      */
    val PY_WEEKDAYS: js.Array[Double] = js.native
    def clone(date: Time): js.Date = js.native
    def clone(date: Date): js.Date = js.native
    def cloneDates(dates: js.Array[js.Date | Time]): js.Array[js.Date] = js.native
    def combine(date: js.Date, time: Time): js.Date = js.native
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.datetime.combine>
      */
    def combine(date: js.Date, time: Date): js.Date = js.native
    /**
      * @see: <http://www.mcfedries.com/JavaScript/DaysBetween.asp>
      */
    def daysBetween(date1: js.Date, date2: js.Date): Double = js.native
    /**
      * @see - <http://docs.python.org/library/datetime.html#datetime.date.fromordinal>
      */
    def fromOrdinal(ordinal: Double): js.Date = js.native
    def getMonthDays(date: js.Date): Double = js.native
    /**
      * @return {Number} python-like weekday
      */
    def getWeekday(date: js.Date): Double = js.native
    /**
      * py_date.timetuple()[7]
      */
    def getYearDay(date: js.Date): Double = js.native
    def isDate(value: js.Any): /* is std.Date */ Boolean = js.native
    def isLeapYear(year: Double): Boolean = js.native
    def isValidDate(value: js.Any): /* is std.Date */ Boolean = js.native
    /**
      * @see: <http://docs.python.org/library/calendar.html#calendar.monthrange>
      */
    def monthRange(year: Double, month: Double): js.Array[Double] = js.native
    /**
      * Sorts an array of Date or dateutil.Time objects
      */
    def sort[T /* <: PickDategetTime */](dates: js.Array[T]): Unit = js.native
    def timeToUntilString(time: Double): String = js.native
    def timeToUntilString(time: Double, utc: Boolean): String = js.native
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.date.toordinal>
      */
    def toOrdinal(date: js.Date): Double = js.native
    /**
      * @return {Number} the date's timezone offset in ms
      */
    def tzOffset(date: js.Date): Double = js.native
    def untilStringToDate(until: String): js.Date = js.native
  }
  
  @js.native
  object default extends js.Object {
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.MAXYEAR>
      */
    val MAXYEAR: `9999` = js.native
    val MONTH_DAYS: js.Array[Double] = js.native
    /**
      * Number of milliseconds of one day
      */
    val ONE_DAY: Double = js.native
    /**
      * Python uses 1-Jan-1 as the base for calculating ordinals but we don't
      * want to confuse the JS engine with milliseconds > Number.MAX_NUMBER,
      * therefore we use 1-Jan-1970 instead
      */
    val ORDINAL_BASE: js.Date = js.native
    /**
      * Python: MO-SU: 0 - 6
      * JS: SU-SAT 0 - 6
      */
    val PY_WEEKDAYS: js.Array[Double] = js.native
    def clone(date: Time): js.Date = js.native
    def clone(date: Date): js.Date = js.native
    def cloneDates(dates: js.Array[js.Date | Time]): js.Array[js.Date] = js.native
    def combine(date: js.Date, time: Time): js.Date = js.native
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.datetime.combine>
      */
    def combine(date: js.Date, time: Date): js.Date = js.native
    /**
      * @see: <http://www.mcfedries.com/JavaScript/DaysBetween.asp>
      */
    def daysBetween(date1: js.Date, date2: js.Date): Double = js.native
    /**
      * @see - <http://docs.python.org/library/datetime.html#datetime.date.fromordinal>
      */
    def fromOrdinal(ordinal: Double): js.Date = js.native
    def getMonthDays(date: js.Date): Double = js.native
    /**
      * @return {Number} python-like weekday
      */
    def getWeekday(date: js.Date): Double = js.native
    /**
      * py_date.timetuple()[7]
      */
    def getYearDay(date: js.Date): Double = js.native
    def isDate(value: js.Any): /* is std.Date */ Boolean = js.native
    def isLeapYear(year: Double): Boolean = js.native
    def isValidDate(value: js.Any): /* is std.Date */ Boolean = js.native
    /**
      * @see: <http://docs.python.org/library/calendar.html#calendar.monthrange>
      */
    def monthRange(year: Double, month: Double): js.Array[Double] = js.native
    /**
      * Sorts an array of Date or dateutil.Time objects
      */
    def sort[T /* <: PickDategetTime */](dates: js.Array[T]): Unit = js.native
    def timeToUntilString(time: Double): String = js.native
    def timeToUntilString(time: Double, utc: Boolean): String = js.native
    /**
      * @see: <http://docs.python.org/library/datetime.html#datetime.date.toordinal>
      */
    def toOrdinal(date: js.Date): Double = js.native
    /**
      * @return {Number} the date's timezone offset in ms
      */
    def tzOffset(date: js.Date): Double = js.native
    def untilStringToDate(until: String): js.Date = js.native
  }
  
}


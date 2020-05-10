package typingsSlinky.gregorianCalendar.mod

import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GregorianCalendar extends js.Object {
  /**
    * add the day of month of the given calendar field.
    */
  def addDayOfMonth(amount: Number): Unit = js.native
  /**
    * add the hour of day of the given calendar field.
    */
  def addHourOfDay(amount: Number): Unit = js.native
  /**
    * add the millisecond of the given calendar field.
    */
  def addMilliSecond(amount: Number): Unit = js.native
  /**
    * add the minute of the given calendar field.
    */
  def addMinute(amount: Number): Unit = js.native
  /**
    * add the month of the given calendar field.
    */
  def addMonth(amount: Number): Unit = js.native
  /**
    * add the second of the given calendar field.
    */
  def addSecond(amount: Number): Unit = js.native
  /**
    * add the year of the given calendar field.
    */
  def addYear(amount: Number): Unit = js.native
  /**
    * clear all field of current instance
    */
  def clear(): Unit = js.native
  /**
    * compare this object and other by day. return -1 0 or 1
    */
  def compareToDay(other: GregorianCalendar): Number = js.native
  def equals(other: GregorianCalendar): Boolean = js.native
  /**
    * Returns the day of month of the given calendar field.
    */
  def getDayOfMonth(): Number = js.native
  /**
    * Returns the day of week of the given calendar field. sunday is 0, monday is 1
    */
  def getDayOfWeek(): Number = js.native
  /**
    * Returns the day of week in month of the given calendar field.
    */
  def getDayOfWeekInMonth(): Number = js.native
  /**
    * Returns the day of year of the given calendar field.
    */
  def getDayOfYear(): Number = js.native
  /**
    * Returns the hour of day for the given calendar field.
    */
  def getHourOfDay(): Number = js.native
  /**
    * Returns the millisecond of the given calendar field.
    */
  def getMilliSeconds(): Number = js.native
  /**
    * Returns the minute of the given calendar field.
    */
  def getMinutes(): Number = js.native
  /**
    * Returns the month of the given calendar field.
    */
  def getMonth(): Number = js.native
  /**
    * Returns the second of the given calendar field.
    */
  def getSeconds(): Number = js.native
  /**
    * get absolute time for current instance
    */
  def getTime(): Number = js.native
  /**
    * current date instance's timezone offset (in minutes)
    */
  def getTimezoneOffset(): Number = js.native
  /**
    * Returns the week of month of the given calendar field.
    */
  def getWeekOfMonth(): Number = js.native
  /**
    * Returns the week of year of the given calendar field.
    */
  def getWeekOfYear(): Number = js.native
  /**
    * Returns the week number of year represented by this GregorianCalendar.
    */
  def getWeekYear(): Number = js.native
  /**
    * Returns the number of weeks in the week year
    */
  def getWeeksInWeekYear(): Number = js.native
  /**
    * Returns the year of the given calendar field.
    */
  def getYear(): Number = js.native
  /**
    * set the month of the given calendar field without influence month.
    * 2015-09-29 -> setMonth(2) -> 2015-03-01
    * 2015-09-29 -> rollSetMonth(2) -> 2015-02-28
    */
  def rollSetMonth(month: Number): Unit = js.native
  /**
    * same as call setYear, setMonth, setDayOfMonth ....
    */
  def set(
    year: Number,
    month: Number,
    dayOfMonth: Number,
    hourOfDay: Number,
    minutes: Number,
    seconds: Number,
    milliseconds: Number
  ): Unit = js.native
  /**
    * set the day of month of the given calendar field.
    */
  def setDayOfMonth(day: Number): Unit = js.native
  /**
    * set the hour of day for the given calendar field.
    */
  def setHourOfDay(hour: Number): Unit = js.native
  /**
    * set the millisecond of the given calendar field.
    */
  def setMilliSeconds(second: Number): Unit = js.native
  /**
    * set the minute of the given calendar field.
    */
  def setMinutes(minute: Number): Unit = js.native
  /**
    * set the month of the given calendar field. January is 0, you can use enum
    */
  def setMonth(month: Number): Unit = js.native
  /**
    * set the second of the given calendar field.
    */
  def setSeconds(second: Number): Unit = js.native
  /**
    * set absolute time for current instance
    */
  def setTime(time: Number): Unit = js.native
  /**
    * set current date instance's timezone offset (in minutes)
    */
  def setTimezoneOffset(timezoneOffset: Number): Unit = js.native
  /**
    * Sets this GregorianCalendar to the date given by the date specifiers - weekYear, weekOfYear, and dayOfWeek.
    * weekOfYear follows the WEEK_OF_YEAR numbering.
    * The dayOfWeek value must be one of the DAY_OF_WEEK values: SUNDAY to SATURDAY.
    *        weekYear: the week year
    *         weekOfYear: the week number based on weekYear
    *         dayOfWeek: the day of week value
    */
  def setWeekDate(weekYear: Number, weekOfYear: Number, dayOfWeek: Number): Unit = js.native
  /**
    * set the year of the given calendar field.
    */
  def setYear(year: Number): Unit = js.native
}

object GregorianCalendar {
  @scala.inline
  def apply(
    addDayOfMonth: Number => Unit,
    addHourOfDay: Number => Unit,
    addMilliSecond: Number => Unit,
    addMinute: Number => Unit,
    addMonth: Number => Unit,
    addSecond: Number => Unit,
    addYear: Number => Unit,
    clear: () => Unit,
    compareToDay: GregorianCalendar => Number,
    equals: GregorianCalendar => Boolean,
    getDayOfMonth: () => Number,
    getDayOfWeek: () => Number,
    getDayOfWeekInMonth: () => Number,
    getDayOfYear: () => Number,
    getHourOfDay: () => Number,
    getMilliSeconds: () => Number,
    getMinutes: () => Number,
    getMonth: () => Number,
    getSeconds: () => Number,
    getTime: () => Number,
    getTimezoneOffset: () => Number,
    getWeekOfMonth: () => Number,
    getWeekOfYear: () => Number,
    getWeekYear: () => Number,
    getWeeksInWeekYear: () => Number,
    getYear: () => Number,
    rollSetMonth: Number => Unit,
    set: (Number, Number, Number, Number, Number, Number, Number) => Unit,
    setDayOfMonth: Number => Unit,
    setHourOfDay: Number => Unit,
    setMilliSeconds: Number => Unit,
    setMinutes: Number => Unit,
    setMonth: Number => Unit,
    setSeconds: Number => Unit,
    setTime: Number => Unit,
    setTimezoneOffset: Number => Unit,
    setWeekDate: (Number, Number, Number) => Unit,
    setYear: Number => Unit
  ): GregorianCalendar = {
    val __obj = js.Dynamic.literal(addDayOfMonth = js.Any.fromFunction1(addDayOfMonth), addHourOfDay = js.Any.fromFunction1(addHourOfDay), addMilliSecond = js.Any.fromFunction1(addMilliSecond), addMinute = js.Any.fromFunction1(addMinute), addMonth = js.Any.fromFunction1(addMonth), addSecond = js.Any.fromFunction1(addSecond), addYear = js.Any.fromFunction1(addYear), clear = js.Any.fromFunction0(clear), compareToDay = js.Any.fromFunction1(compareToDay), equals = js.Any.fromFunction1(equals), getDayOfMonth = js.Any.fromFunction0(getDayOfMonth), getDayOfWeek = js.Any.fromFunction0(getDayOfWeek), getDayOfWeekInMonth = js.Any.fromFunction0(getDayOfWeekInMonth), getDayOfYear = js.Any.fromFunction0(getDayOfYear), getHourOfDay = js.Any.fromFunction0(getHourOfDay), getMilliSeconds = js.Any.fromFunction0(getMilliSeconds), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getTimezoneOffset = js.Any.fromFunction0(getTimezoneOffset), getWeekOfMonth = js.Any.fromFunction0(getWeekOfMonth), getWeekOfYear = js.Any.fromFunction0(getWeekOfYear), getWeekYear = js.Any.fromFunction0(getWeekYear), getWeeksInWeekYear = js.Any.fromFunction0(getWeeksInWeekYear), getYear = js.Any.fromFunction0(getYear), rollSetMonth = js.Any.fromFunction1(rollSetMonth), set = js.Any.fromFunction7(set), setDayOfMonth = js.Any.fromFunction1(setDayOfMonth), setHourOfDay = js.Any.fromFunction1(setHourOfDay), setMilliSeconds = js.Any.fromFunction1(setMilliSeconds), setMinutes = js.Any.fromFunction1(setMinutes), setMonth = js.Any.fromFunction1(setMonth), setSeconds = js.Any.fromFunction1(setSeconds), setTime = js.Any.fromFunction1(setTime), setTimezoneOffset = js.Any.fromFunction1(setTimezoneOffset), setWeekDate = js.Any.fromFunction3(setWeekDate), setYear = js.Any.fromFunction1(setYear))
    __obj.asInstanceOf[GregorianCalendar]
  }
  @scala.inline
  implicit class GregorianCalendarOps[Self <: GregorianCalendar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDayOfMonth(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDayOfMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddHourOfDay(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHourOfDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddMilliSecond(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMilliSecond")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddMinute(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMinute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddMonth(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddSecond(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSecond")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddYear(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompareToDay(value: GregorianCalendar => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareToDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquals(value: GregorianCalendar => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDayOfMonth(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDayOfMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDayOfWeek(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDayOfWeek")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDayOfWeekInMonth(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDayOfWeekInMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDayOfYear(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDayOfYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHourOfDay(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHourOfDay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMilliSeconds(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMilliSeconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinutes(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinutes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMonth(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSeconds(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSeconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTime(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimezoneOffset(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimezoneOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWeekOfMonth(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeekOfMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWeekOfYear(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeekOfYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWeekYear(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeekYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWeeksInWeekYear(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeeksInWeekYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetYear(value: () => Number): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRollSetMonth(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollSetMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (Number, Number, Number, Number, Number, Number, Number) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withSetDayOfMonth(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDayOfMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHourOfDay(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHourOfDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMilliSeconds(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMilliSeconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMinutes(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinutes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMonth(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSeconds(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSeconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTime(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTimezoneOffset(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimezoneOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWeekDate(value: (Number, Number, Number) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWeekDate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetYear(value: Number => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYear")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


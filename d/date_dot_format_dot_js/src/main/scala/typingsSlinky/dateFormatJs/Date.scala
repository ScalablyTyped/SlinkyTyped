package typingsSlinky.dateFormatJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date extends js.Object {
  
  /**
    * This is a convenience addition to the Date prototype
    * Returns a formatted version of the date.
    * The mask defaults to dateFormat.masks.default.
    * @param {string=} mask
    * @param {boolean=} utc
    */
  def format(): String = js.native
  def format(mask: js.UndefOr[scala.Nothing], utc: Boolean): String = js.native
  def format(mask: String): String = js.native
  def format(mask: String, utc: Boolean): String = js.native
  
  /** Gets the day-of-the-month, using local time. */
  def getDate(): Double = js.native
  
  /** Gets the day of the week, using local time. */
  def getDay(): Double = js.native
  
  /** Gets the year, using local time. */
  def getFullYear(): Double = js.native
  
  /** Gets the hours in a date, using local time. */
  def getHours(): Double = js.native
  
  /** Gets the milliseconds of a Date, using local time. */
  def getMilliseconds(): Double = js.native
  
  /** Gets the minutes of a Date object, using local time. */
  def getMinutes(): Double = js.native
  
  /** Gets the month, using local time. */
  def getMonth(): Double = js.native
  
  /** Gets the seconds of a Date object, using local time. */
  def getSeconds(): Double = js.native
  
  /** Gets the time value in milliseconds. */
  def getTime(): Double = js.native
  
  /** Gets the difference in minutes between the time on the local computer and Universal Coordinated Time (UTC). */
  def getTimezoneOffset(): Double = js.native
  
  /** Gets the day-of-the-month, using Universal Coordinated Time (UTC). */
  def getUTCDate(): Double = js.native
  
  /** Gets the day of the week using Universal Coordinated Time (UTC). */
  def getUTCDay(): Double = js.native
  
  /** Gets the year using Universal Coordinated Time (UTC). */
  def getUTCFullYear(): Double = js.native
  
  /** Gets the hours value in a Date object using Universal Coordinated Time (UTC). */
  def getUTCHours(): Double = js.native
  
  /** Gets the milliseconds of a Date object using Universal Coordinated Time (UTC). */
  def getUTCMilliseconds(): Double = js.native
  
  /** Gets the minutes of a Date object using Universal Coordinated Time (UTC). */
  def getUTCMinutes(): Double = js.native
  
  /** Gets the month of a Date object using Universal Coordinated Time (UTC). */
  def getUTCMonth(): Double = js.native
  
  /** Gets the seconds of a Date object using Universal Coordinated Time (UTC). */
  def getUTCSeconds(): Double = js.native
  
  /**
    * Sets the numeric day-of-the-month value of the Date object using local time.
    * @param date A numeric value equal to the day of the month.
    */
  def setDate(date: Double): Unit = js.native
  
  /**
    * Sets the year of the Date object using local time.
    * @param year A numeric value for the year.
    * @param month A zero-based numeric value for the month (0 for January, 11 for December). Must be specified if numDate is specified.
    * @param date A numeric value equal for the day of the month.
    */
  def setFullYear(year: Double): Unit = js.native
  def setFullYear(year: Double, month: js.UndefOr[scala.Nothing], date: Double): Unit = js.native
  def setFullYear(year: Double, month: Double): Unit = js.native
  def setFullYear(year: Double, month: Double, date: Double): Unit = js.native
  
  /**
    * Sets the hour value in the Date object using local time.
    * @param hours A numeric value equal to the hours value.
    * @param min A numeric value equal to the minutes value.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  def setHours(hours: Double): Unit = js.native
  def setHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: js.UndefOr[scala.Nothing], ms: Double): Unit = js.native
  def setHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double): Unit = js.native
  def setHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double, ms: Double): Unit = js.native
  def setHours(hours: Double, min: Double): Unit = js.native
  def setHours(hours: Double, min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): Unit = js.native
  def setHours(hours: Double, min: Double, sec: Double): Unit = js.native
  def setHours(hours: Double, min: Double, sec: Double, ms: Double): Unit = js.native
  
  /**
    * Sets the milliseconds value in the Date object using local time.
    * @param ms A numeric value equal to the millisecond value.
    */
  def setMilliseconds(ms: Double): Unit = js.native
  
  /**
    * Sets the minutes value in the Date object using local time.
    * @param min A numeric value equal to the minutes value.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  def setMinutes(min: Double): Unit = js.native
  def setMinutes(min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): Unit = js.native
  def setMinutes(min: Double, sec: Double): Unit = js.native
  def setMinutes(min: Double, sec: Double, ms: Double): Unit = js.native
  
  /**
    * Sets the month value in the Date object using local time.
    * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively.
    * @param date A numeric value representing the day of the month. If this value is not supplied, the value from a call to the getDate method is used.
    */
  def setMonth(month: Double): Unit = js.native
  def setMonth(month: Double, date: Double): Unit = js.native
  
  /**
    * Sets the seconds value in the Date object using local time.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  def setSeconds(sec: Double): Unit = js.native
  def setSeconds(sec: Double, ms: Double): Unit = js.native
  
  /**
    * Sets the date and time value in the Date object.
    * @param time A numeric value representing the number of elapsed milliseconds since midnight, January 1, 1970 GMT.
    */
  def setTime(time: Double): Unit = js.native
  
  /**
    * Sets the numeric day of the month in the Date object using Universal Coordinated Time (UTC).
    * @param date A numeric value equal to the day of the month.
    */
  def setUTCDate(date: Double): Unit = js.native
  
  /**
    * Sets the year value in the Date object using Universal Coordinated Time (UTC).
    * @param year A numeric value equal to the year.
    * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively. Must be supplied if numDate is supplied.
    * @param date A numeric value equal to the day of the month.
    */
  def setUTCFullYear(year: Double): Unit = js.native
  def setUTCFullYear(year: Double, month: js.UndefOr[scala.Nothing], date: Double): Unit = js.native
  def setUTCFullYear(year: Double, month: Double): Unit = js.native
  def setUTCFullYear(year: Double, month: Double, date: Double): Unit = js.native
  
  /**
    * Sets the hours value in the Date object using Universal Coordinated Time (UTC).
    * @param hours A numeric value equal to the hours value.
    * @param min A numeric value equal to the minutes value.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  def setUTCHours(hours: Double): Unit = js.native
  def setUTCHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: js.UndefOr[scala.Nothing], ms: Double): Unit = js.native
  def setUTCHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double): Unit = js.native
  def setUTCHours(hours: Double, min: js.UndefOr[scala.Nothing], sec: Double, ms: Double): Unit = js.native
  def setUTCHours(hours: Double, min: Double): Unit = js.native
  def setUTCHours(hours: Double, min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): Unit = js.native
  def setUTCHours(hours: Double, min: Double, sec: Double): Unit = js.native
  def setUTCHours(hours: Double, min: Double, sec: Double, ms: Double): Unit = js.native
  
  /**
    * Sets the milliseconds value in the Date object using Universal Coordinated Time (UTC).
    * @param ms A numeric value equal to the millisecond value.
    */
  def setUTCMilliseconds(ms: Double): Unit = js.native
  
  /**
    * Sets the minutes value in the Date object using Universal Coordinated Time (UTC).
    * @param min A numeric value equal to the minutes value.
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  def setUTCMinutes(min: Double): Unit = js.native
  def setUTCMinutes(min: Double, sec: js.UndefOr[scala.Nothing], ms: Double): Unit = js.native
  def setUTCMinutes(min: Double, sec: Double): Unit = js.native
  def setUTCMinutes(min: Double, sec: Double, ms: Double): Unit = js.native
  
  /**
    * Sets the month value in the Date object using Universal Coordinated Time (UTC).
    * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively.
    * @param date A numeric value representing the day of the month. If it is not supplied, the value from a call to the getUTCDate method is used.
    */
  def setUTCMonth(month: Double): Unit = js.native
  def setUTCMonth(month: Double, date: Double): Unit = js.native
  
  /**
    * Sets the seconds value in the Date object using Universal Coordinated Time (UTC).
    * @param sec A numeric value equal to the seconds value.
    * @param ms A numeric value equal to the milliseconds value.
    */
  def setUTCSeconds(sec: Double): Unit = js.native
  def setUTCSeconds(sec: Double, ms: Double): Unit = js.native
  
  /** Returns a date as a string value. */
  def toDateString(): String = js.native
  
  /** Returns a date as a string value in ISO format. */
  def toISOString(): String = js.native
  
  /** Used by the JSON.stringify method to enable the transformation of an object's data for JavaScript Object Notation (JSON) serialization. */
  def toJSON(): String = js.native
  def toJSON(key: js.Any): String = js.native
  
  /** Returns a date as a string value appropriate to the host environment's current locale. */
  def toLocaleDateString(): String = js.native
  
  /** Returns a time as a string value appropriate to the host environment's current locale. */
  def toLocaleTimeString(): String = js.native
  
  /** Returns a time as a string value. */
  def toTimeString(): String = js.native
  
  /** Returns a date converted to a string using Universal Coordinated Time (UTC). */
  def toUTCString(): String = js.native
}

package typingsSlinky.dojo.dojox.date

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/posix.html
  *
  *
  */
trait posix extends js.Object {
  /**
    * Get the ISO8601 week number of the given date.
    * The week containing January 4th is the first week of the year.
    * See http://en.wikipedia.org/wiki/ISO_week_date
    *
    * @param dateObject
    */
  def getIsoWeekOfYear(dateObject: js.Date): Unit
  /**
    * Determine the number of ISO8601 weeks in the year of the given
    * date. Most years have 52 but some have 53.
    * See http://www.phys.uu.nl/~vgent/calendar/isocalendar_text3.htm
    *
    * @param dateObject
    */
  def getIsoWeeksInYear(dateObject: js.Date): Unit
  /**
    * Return a date object representing the first day of the given
    * date's week.
    *
    * @param dateObject
    * @param firstDay
    */
  def getStartOfWeek(dateObject: js.Date, firstDay: Double): Unit
  /**
    * Set the ISO8601 week number of the given date.
    * The week containing January 4th is the first week of the year.
    *
    * @param dateObject
    * @param week can be positive or negative: -1 is the year's last week.
    */
  def setIsoWeekOfYear(dateObject: js.Date, week: Double): Unit
  /**
    *
    * @param dateObject
    * @param format
    * @param locale               Optional
    */
  def strftime(dateObject: js.Date, format: String, locale: String): Unit
}

object posix {
  @scala.inline
  def apply(
    getIsoWeekOfYear: js.Date => Unit,
    getIsoWeeksInYear: js.Date => Unit,
    getStartOfWeek: (js.Date, Double) => Unit,
    setIsoWeekOfYear: (js.Date, Double) => Unit,
    strftime: (js.Date, String, String) => Unit
  ): posix = {
    val __obj = js.Dynamic.literal(getIsoWeekOfYear = js.Any.fromFunction1(getIsoWeekOfYear), getIsoWeeksInYear = js.Any.fromFunction1(getIsoWeeksInYear), getStartOfWeek = js.Any.fromFunction2(getStartOfWeek), setIsoWeekOfYear = js.Any.fromFunction2(setIsoWeekOfYear), strftime = js.Any.fromFunction3(strftime))
  
    __obj.asInstanceOf[posix]
  }
}


package typingsSlinky.dojo.dojox.date

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/posix.html
  *
  *
  */
@js.native
trait posix extends js.Object {
  /**
    * Get the ISO8601 week number of the given date.
    * The week containing January 4th is the first week of the year.
    * See http://en.wikipedia.org/wiki/ISO_week_date
    *
    * @param dateObject
    */
  def getIsoWeekOfYear(dateObject: js.Date): Unit = js.native
  /**
    * Determine the number of ISO8601 weeks in the year of the given
    * date. Most years have 52 but some have 53.
    * See http://www.phys.uu.nl/~vgent/calendar/isocalendar_text3.htm
    *
    * @param dateObject
    */
  def getIsoWeeksInYear(dateObject: js.Date): Unit = js.native
  /**
    * Return a date object representing the first day of the given
    * date's week.
    *
    * @param dateObject
    * @param firstDay
    */
  def getStartOfWeek(dateObject: js.Date, firstDay: Double): Unit = js.native
  /**
    * Set the ISO8601 week number of the given date.
    * The week containing January 4th is the first week of the year.
    *
    * @param dateObject
    * @param week can be positive or negative: -1 is the year's last week.
    */
  def setIsoWeekOfYear(dateObject: js.Date, week: Double): Unit = js.native
  /**
    *
    * @param dateObject
    * @param format
    * @param locale               Optional
    */
  def strftime(dateObject: js.Date, format: String, locale: String): Unit = js.native
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
  @scala.inline
  implicit class posixOps[Self <: posix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetIsoWeekOfYear(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsoWeekOfYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIsoWeeksInYear(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsoWeeksInYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStartOfWeek(value: (js.Date, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartOfWeek")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetIsoWeekOfYear(value: (js.Date, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsoWeekOfYear")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStrftime(value: (js.Date, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strftime")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}


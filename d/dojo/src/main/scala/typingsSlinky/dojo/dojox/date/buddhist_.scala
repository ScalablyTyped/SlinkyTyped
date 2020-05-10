package typingsSlinky.dojo.dojox.date

import typingsSlinky.dojo.dojox.date.buddhist.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/buddhist.html
  *
  *
  */
@js.native
trait buddhist_ extends js.Object {
  /**
    *
    */
  var locale: js.Object = js.native
  /**
    * Add to a Date in intervals of different size, from milliseconds to years
    *
    * @param date Date object to start with
    * @param interval A string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond", "week", "weekday"
    * @param amount How much to add to the date.
    */
  def add(date: Date, interval: String, amount: Double): Unit = js.native
  /**
    * Compare two buddhist date objects by date, time, or both.
    *
    * @param date1
    * @param date2
    * @param portion               Optional
    */
  def compare(date1: Date, date2: Date, portion: String): Unit = js.native
  /**
    * date2 - date1
    *
    * @param date1
    * @param date2               OptionalIf not specified, the current hebrew.Date is used.
    * @param interval               OptionalA string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond",  "week", "weekday"Defaults to "day".
    */
  def difference(
    date1: typingsSlinky.dojo.dojox.date.hebrew.Date,
    date2: typingsSlinky.dojo.dojox.date.hebrew.Date,
    interval: String
  ): Unit = js.native
  /**
    *
    * @param dateObject
    */
  def getDaysInMonth(dateObject: Date): Unit = js.native
  /**
    *
    * @param dateObject
    */
  def isLeapYear(dateObject: Date): Unit = js.native
}

object buddhist_ {
  @scala.inline
  def apply(
    add: (Date, String, Double) => Unit,
    compare: (Date, Date, String) => Unit,
    difference: (typingsSlinky.dojo.dojox.date.hebrew.Date, typingsSlinky.dojo.dojox.date.hebrew.Date, String) => Unit,
    getDaysInMonth: Date => Unit,
    isLeapYear: Date => Unit,
    locale: js.Object
  ): buddhist_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), compare = js.Any.fromFunction3(compare), difference = js.Any.fromFunction3(difference), getDaysInMonth = js.Any.fromFunction1(getDaysInMonth), isLeapYear = js.Any.fromFunction1(isLeapYear), locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[buddhist_]
  }
  @scala.inline
  implicit class buddhist_Ops[Self <: buddhist_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Date, String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCompare(value: (Date, Date, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDifference(
      value: (typingsSlinky.dojo.dojox.date.hebrew.Date, typingsSlinky.dojo.dojox.date.hebrew.Date, String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("difference")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetDaysInMonth(value: Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDaysInMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsLeapYear(value: Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeapYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocale(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


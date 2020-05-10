package typingsSlinky.dojo.dojox.main

import typingsSlinky.dojo.dojox.date.islamic.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/main.islamic.html
  *
  *
  */
@js.native
trait islamic extends js.Object {
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
    * Compare two islamic date objects by date, time, or both.
    * Returns 0 if equal, positive if a > b, else negative.
    *
    * @param date1
    * @param date2 If not specified, the current islamic.Date is used.
    * @param portion               OptionalA string indicating the "date" or "time" portion of a Date object.Compares both "date" and "time" by default.  One of the following:"date", "time", "datetime"
    */
  def compare(date1: Date, date2: Date, portion: String): Unit = js.native
  /**
    * date2 - date1
    *
    * @param date1
    * @param date2               OptionalIf not specified, the current dojox.date.islamic.Date is used.
    * @param interval               OptionalA string representing the interval.  One of the following:"year", "month", "day", "hour", "minute", "second","millisecond",  "week", "weekday"Defaults to "day".
    */
  def difference(date1: Date, date2: Date, interval: String): Unit = js.native
  /**
    *
    * @param month
    */
  def getDaysInMonth(month: Date): Unit = js.native
}

object islamic {
  @scala.inline
  def apply(
    add: (Date, String, Double) => Unit,
    compare: (Date, Date, String) => Unit,
    difference: (Date, Date, String) => Unit,
    getDaysInMonth: Date => Unit,
    locale: js.Object
  ): islamic = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), compare = js.Any.fromFunction3(compare), difference = js.Any.fromFunction3(difference), getDaysInMonth = js.Any.fromFunction1(getDaysInMonth), locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[islamic]
  }
  @scala.inline
  implicit class islamicOps[Self <: islamic] (val x: Self) extends AnyVal {
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
    def withDifference(value: (Date, Date, String) => Unit): Self = {
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
    def withLocale(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


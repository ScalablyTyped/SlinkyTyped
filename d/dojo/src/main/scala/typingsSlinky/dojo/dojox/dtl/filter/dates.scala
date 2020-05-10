package typingsSlinky.dojo.dojox.dtl.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/dates.html
  *
  *
  */
@js.native
trait dates extends js.Object {
  /**
    * Formats a date according to the given format
    *
    * @param value
    * @param arg
    */
  def date(value: js.Any, arg: js.Any): String = js.native
  /**
    * Formats a time according to the given format
    *
    * @param value
    * @param arg
    */
  def time(value: js.Any, arg: js.Any): String = js.native
  /**
    * Formats a date as the time since that date (i.e. "4 days, 6 hours")
    *
    * @param value
    * @param arg
    */
  def timesince(value: js.Any, arg: js.Any): String = js.native
  /**
    * Formats a date as the time until that date (i.e. "4 days, 6 hours")
    *
    * @param value
    * @param arg
    */
  def timeuntil(value: js.Any, arg: js.Any): String = js.native
}

object dates {
  @scala.inline
  def apply(
    date: (js.Any, js.Any) => String,
    time: (js.Any, js.Any) => String,
    timesince: (js.Any, js.Any) => String,
    timeuntil: (js.Any, js.Any) => String
  ): dates = {
    val __obj = js.Dynamic.literal(date = js.Any.fromFunction2(date), time = js.Any.fromFunction2(time), timesince = js.Any.fromFunction2(timesince), timeuntil = js.Any.fromFunction2(timeuntil))
    __obj.asInstanceOf[dates]
  }
  @scala.inline
  implicit class datesOps[Self <: dates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: (js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTime(value: (js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTimesince(value: (js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timesince")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTimeuntil(value: (js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeuntil")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


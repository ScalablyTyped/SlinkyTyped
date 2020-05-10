package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) A custom `Date` class for advanced date
    * handling. For example, JDate can be hooked in to handle Jalali dates.
    */
  var Date: js.UndefOr[js.Any] = js.native
  /**
    * (Highcharts, Highstock, Gantt) A callback to return the time zone offset
    * for a given datetime. It takes the timestamp in terms of milliseconds
    * since January 1 1970, and returns the timezone offset in minutes. This
    * provides a hook for drawing time based charts in specific time zones
    * using their local DST crossover dates, with the help of external
    * libraries.
    */
  var getTimezoneOffset: js.UndefOr[js.Any] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Requires moment.js. If the timezone option
    * is specified, it creates a default getTimezoneOffset function that looks
    * up the specified timezone in moment.js. If moment.js is not included,
    * this throws a Highcharts error in the console, but does not crash the
    * chart.
    */
  var timezone: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The timezone offset in minutes. Positive
    * values are west, negative values are east of UTC, as in the ECMAScript
    * getTimezoneOffset method. Use this to display UTC based data in a
    * predefined time zone.
    */
  var timezoneOffset: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to use UTC time for axis
    * scaling, tickmark placement and time display in `Highcharts.dateFormat`.
    * Advantages of using UTC is that the time displays equally regardless of
    * the user agent's time zone settings. Local time can be used when the data
    * is loaded in real time or when correct Daylight Saving Time transitions
    * are required.
    */
  var useUTC: js.UndefOr[Boolean] = js.native
}

object TimeOptions {
  @scala.inline
  def apply(): TimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOptions]
  }
  @scala.inline
  implicit class TimeOptionsOps[Self <: TimeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTimezoneOffset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimezoneOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetTimezoneOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimezoneOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezoneOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezoneOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withUseUTC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseUTC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUTC")(js.undefined)
        ret
    }
  }
  
}


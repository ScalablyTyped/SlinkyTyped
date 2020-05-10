package typingsSlinky.jqueryCountdown.jQueryCountdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffsetEvent extends js.Object {
  /**
    * Days left until next week
    */
  var days: Double = js.native
  /**
    * Days left until next month
    */
  var daysToMonth: Double = js.native
  /**
    * Days left until next week
    */
  var daysToWeek: Double = js.native
  /**
    * Hours left until next day
    */
  var hours: Double = js.native
  /**
    * Minutes left for the next hour
    */
  var minutes: Double = js.native
  /**
    * Months left until final date
    */
  var months: Double = js.native
  /**
    * Seconds left for the next minute
    */
  var seconds: Double = js.native
  /**
    * Total amount of days left until final date
    */
  var totalDays: Double = js.native
  /**
    * Total amount of hours left until final date
    */
  var totalHours: Double = js.native
  /**
    * Total amount of minutes left until final date
    */
  var totalMinutes: Double = js.native
  /**
    * Total amount of seconds left until final date
    */
  var totalSeconds: Double = js.native
  /**
    * Weeks left until the final date
    */
  var weeks: Double = js.native
  /**
    * Weeks left until the next month
    */
  var weeksToMonth: Double = js.native
  /**
    * Years left until final date
    */
  var years: Double = js.native
}

object OffsetEvent {
  @scala.inline
  def apply(
    days: Double,
    daysToMonth: Double,
    daysToWeek: Double,
    hours: Double,
    minutes: Double,
    months: Double,
    seconds: Double,
    totalDays: Double,
    totalHours: Double,
    totalMinutes: Double,
    totalSeconds: Double,
    weeks: Double,
    weeksToMonth: Double,
    years: Double
  ): OffsetEvent = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], daysToMonth = daysToMonth.asInstanceOf[js.Any], daysToWeek = daysToWeek.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], totalDays = totalDays.asInstanceOf[js.Any], totalHours = totalHours.asInstanceOf[js.Any], totalMinutes = totalMinutes.asInstanceOf[js.Any], totalSeconds = totalSeconds.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any], weeksToMonth = weeksToMonth.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetEvent]
  }
  @scala.inline
  implicit class OffsetEventOps[Self <: OffsetEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaysToMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysToMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaysToWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysToWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeeks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeeksToMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeksToMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYears(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("years")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


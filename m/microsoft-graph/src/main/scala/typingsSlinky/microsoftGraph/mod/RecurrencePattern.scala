package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurrencePattern extends js.Object {
  // The day of the month on which the event occurs. Required if type is absoluteMonthly or absoluteYearly.
  var dayOfMonth: js.UndefOr[Double] = js.native
  /**
    * A collection of the days of the week on which the event occurs. The possible values are: sunday, monday, tuesday,
    * wednesday, thursday, friday, saturday. If type is relativeMonthly or relativeYearly, and daysOfWeek specifies more than
    * one day, the event falls on the first day that satisfies the pattern. Required if type is weekly, relativeMonthly, or
    * relativeYearly.
    */
  var daysOfWeek: js.UndefOr[js.Array[DayOfWeek]] = js.native
  /**
    * The first day of the week. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday.
    * Default is sunday. Required if type is weekly.
    */
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.native
  /**
    * Specifies on which instance of the allowed days specified in daysOfsWeek the event occurs, counted from the first
    * instance in the month. The possible values are: first, second, third, fourth, last. Default is first. Optional and used
    * if type is relativeMonthly or relativeYearly.
    */
  var index: js.UndefOr[WeekIndex] = js.native
  /**
    * The number of units between occurrences, where units can be in days, weeks, months, or years, depending on the type.
    * Required.
    */
  var interval: js.UndefOr[Double] = js.native
  // The month in which the event occurs. This is a number from 1 to 12.
  var month: js.UndefOr[Double] = js.native
  // The recurrence pattern type: daily, weekly, absoluteMonthly, relativeMonthly, absoluteYearly, relativeYearly. Required.
  var `type`: js.UndefOr[RecurrencePatternType] = js.native
}

object RecurrencePattern {
  @scala.inline
  def apply(): RecurrencePattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurrencePattern]
  }
  @scala.inline
  implicit class RecurrencePatternOps[Self <: RecurrencePattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayOfMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysOfWeek(value: js.Array[DayOfWeek]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: DayOfWeek): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: WeekIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: RecurrencePatternType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}


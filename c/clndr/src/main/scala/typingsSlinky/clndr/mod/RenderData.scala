package typingsSlinky.clndr.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderData extends js.Object {
  var days: js.Array[CalendarDay] = js.native
  var daysOfTheWeek: js.Array[String] = js.native
  var eventsLastMonth: js.Array[_] = js.native
  var eventsNextMonth: js.Array[_] = js.native
  var eventsThisInterval: js.UndefOr[js.Array[_]] = js.native
  var eventsThisMonth: js.Array[_] = js.native
  var extras: js.UndefOr[js.Any] = js.native
  var intervalEnd: js.UndefOr[Moment] = js.native
  var intervalStart: js.UndefOr[Moment] = js.native
  var month: String = js.native
  var months: js.Array[Month] = js.native
  var numberOfRows: Double = js.native
  var year: Double = js.native
}

object RenderData {
  @scala.inline
  def apply(
    days: js.Array[CalendarDay],
    daysOfTheWeek: js.Array[String],
    eventsLastMonth: js.Array[_],
    eventsNextMonth: js.Array[_],
    eventsThisMonth: js.Array[_],
    month: String,
    months: js.Array[Month],
    numberOfRows: Double,
    year: Double
  ): RenderData = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], daysOfTheWeek = daysOfTheWeek.asInstanceOf[js.Any], eventsLastMonth = eventsLastMonth.asInstanceOf[js.Any], eventsNextMonth = eventsNextMonth.asInstanceOf[js.Any], eventsThisMonth = eventsThisMonth.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], numberOfRows = numberOfRows.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderData]
  }
  @scala.inline
  implicit class RenderDataOps[Self <: RenderData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: js.Array[CalendarDay]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaysOfTheWeek(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfTheWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsLastMonth(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsLastMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsNextMonth(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsNextMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsThisMonth(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsThisMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonths(value: js.Array[Month]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsThisInterval(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsThisInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventsThisInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsThisInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withExtras(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtras: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extras")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalEnd(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalStart(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalStart")(js.undefined)
        ret
    }
  }
  
}


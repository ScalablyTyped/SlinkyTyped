package typingsSlinky.moment.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarSpec
  extends // any additional properties might be used with moment.calendarFormat
/* x */ StringDictionary[CalendarSpecVal | Unit] {
  var lastDay: js.UndefOr[CalendarSpecVal] = js.native
  var lastWeek: js.UndefOr[CalendarSpecVal] = js.native
  var nextDay: js.UndefOr[CalendarSpecVal] = js.native
  var nextWeek: js.UndefOr[CalendarSpecVal] = js.native
  var sameDay: js.UndefOr[CalendarSpecVal] = js.native
  var sameElse: js.UndefOr[CalendarSpecVal] = js.native
}

object CalendarSpec {
  @scala.inline
  def apply(): CalendarSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarSpec]
  }
  @scala.inline
  implicit class CalendarSpecOps[Self <: CalendarSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastDayFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLastDay(value: CalendarSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDay")(js.undefined)
        ret
    }
    @scala.inline
    def withLastWeekFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastWeek")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLastWeek(value: CalendarSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withNextDayFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextDay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNextDay(value: CalendarSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextDay")(js.undefined)
        ret
    }
    @scala.inline
    def withNextWeekFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextWeek")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNextWeek(value: CalendarSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withSameDayFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameDay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSameDay(value: CalendarSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSameDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameDay")(js.undefined)
        ret
    }
    @scala.inline
    def withSameElseFunction2(value: (/* m */ js.UndefOr[MomentInput], /* now */ js.UndefOr[Moment]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameElse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSameElse(value: CalendarSpecVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameElse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSameElse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameElse")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.momentMini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentSetObject extends MomentInputObject {
  var DDD: js.UndefOr[Double] = js.native
  var E: js.UndefOr[Double] = js.native
  var GG: js.UndefOr[Double] = js.native
  var Q: js.UndefOr[Double] = js.native
  var W: js.UndefOr[Double] = js.native
  var dayOfYear: js.UndefOr[Double] = js.native
  var dayOfYears: js.UndefOr[Double] = js.native
  var e: js.UndefOr[Double] = js.native
  var gg: js.UndefOr[Double] = js.native
  var isoWeek: js.UndefOr[Double] = js.native
  var isoWeekYear: js.UndefOr[Double] = js.native
  var isoWeekYears: js.UndefOr[Double] = js.native
  var isoWeekday: js.UndefOr[Double] = js.native
  var isoWeekdays: js.UndefOr[Double] = js.native
  var isoWeeks: js.UndefOr[Double] = js.native
  var quarter: js.UndefOr[Double] = js.native
  var quarters: js.UndefOr[Double] = js.native
  var w: js.UndefOr[Double] = js.native
  var week: js.UndefOr[Double] = js.native
  var weekYear: js.UndefOr[Double] = js.native
  var weekYears: js.UndefOr[Double] = js.native
  var weekday: js.UndefOr[Double] = js.native
  var weekdays: js.UndefOr[Double] = js.native
  var weeks: js.UndefOr[Double] = js.native
}

object MomentSetObject {
  @scala.inline
  def apply(): MomentSetObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MomentSetObject]
  }
  @scala.inline
  implicit class MomentSetObjectOps[Self <: MomentSetObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDDD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DDD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDDD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DDD")(js.undefined)
        ret
    }
    @scala.inline
    def withE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E")(js.undefined)
        ret
    }
    @scala.inline
    def withGG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGG: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GG")(js.undefined)
        ret
    }
    @scala.inline
    def withQ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Q")(js.undefined)
        ret
    }
    @scala.inline
    def withW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("W")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("W")(js.undefined)
        ret
    }
    @scala.inline
    def withDayOfYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfYear")(js.undefined)
        ret
    }
    @scala.inline
    def withDayOfYears(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfYears")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfYears: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfYears")(js.undefined)
        ret
    }
    @scala.inline
    def withIsoWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsoWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withIsoWeekYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoWeekYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsoWeekYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoWeekYear")(js.undefined)
        ret
    }
    @scala.inline
    def withIsoWeekYears(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoWeekYears")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsoWeekYears: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoWeekYears")(js.undefined)
        ret
    }
    @scala.inline
    def withIsoWeekday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoWeekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsoWeekday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoWeekday")(js.undefined)
        ret
    }
    @scala.inline
    def withIsoWeekdays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoWeekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsoWeekdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoWeekdays")(js.undefined)
        ret
    }
    @scala.inline
    def withIsoWeeks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoWeeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsoWeeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoWeeks")(js.undefined)
        ret
    }
    @scala.inline
    def withQuarter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuarter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter")(js.undefined)
        ret
    }
    @scala.inline
    def withQuarters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuarters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarters")(js.undefined)
        ret
    }
    @scala.inline
    def withWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekYear")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekYears(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekYears")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekYears: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekYears")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekday")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(js.undefined)
        ret
    }
    @scala.inline
    def withWeeks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeks")(js.undefined)
        ret
    }
  }
  
}


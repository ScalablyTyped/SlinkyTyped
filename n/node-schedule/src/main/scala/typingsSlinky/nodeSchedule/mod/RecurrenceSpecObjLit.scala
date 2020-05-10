package typingsSlinky.nodeSchedule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurrenceSpecObjLit extends js.Object {
  /**
    * Day of the month.
    */
  var date: js.UndefOr[RecurrenceSegment] = js.native
  var dayOfWeek: js.UndefOr[RecurrenceSegment] = js.native
  var hour: js.UndefOr[RecurrenceSegment] = js.native
  var minute: js.UndefOr[RecurrenceSegment] = js.native
  var month: js.UndefOr[RecurrenceSegment] = js.native
  var second: js.UndefOr[RecurrenceSegment] = js.native
  /**
    * Timezone
    */
  var tz: js.UndefOr[Timezone] = js.native
  var year: js.UndefOr[RecurrenceSegment] = js.native
}

object RecurrenceSpecObjLit {
  @scala.inline
  def apply(): RecurrenceSpecObjLit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurrenceSpecObjLit]
  }
  @scala.inline
  implicit class RecurrenceSpecObjLitOps[Self <: RecurrenceSpecObjLit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: RecurrenceSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDayOfWeek(value: RecurrenceSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withHour(value: RecurrenceSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(js.undefined)
        ret
    }
    @scala.inline
    def withMinute(value: RecurrenceSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: RecurrenceSegment): Self = {
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
    def withSecond(value: RecurrenceSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.undefined)
        ret
    }
    @scala.inline
    def withTz(value: Timezone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tz")(js.undefined)
        ret
    }
    @scala.inline
    def withYear(value: RecurrenceSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.undefined)
        ret
    }
  }
  
}


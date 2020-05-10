package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionScheduleInput extends js.Object {
  var dayOfWeek: js.UndefOr[DayOfWeekString] = js.native
  var endHour: js.UndefOr[Double] = js.native
  var endMinute: js.UndefOr[Double] = js.native
  var startHour: js.UndefOr[Double] = js.native
  var startMinute: js.UndefOr[Double] = js.native
}

object ExtensionScheduleInput {
  @scala.inline
  def apply(): ExtensionScheduleInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionScheduleInput]
  }
  @scala.inline
  implicit class ExtensionScheduleInputOps[Self <: ExtensionScheduleInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayOfWeek(value: DayOfWeekString): Self = {
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
    def withEndHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endHour")(js.undefined)
        ret
    }
    @scala.inline
    def withEndMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endMinute")(js.undefined)
        ret
    }
    @scala.inline
    def withStartHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHour")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMinute")(js.undefined)
        ret
    }
  }
  
}


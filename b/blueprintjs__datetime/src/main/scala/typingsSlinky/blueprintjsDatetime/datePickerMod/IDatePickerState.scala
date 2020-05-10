package typingsSlinky.blueprintjsDatetime.datePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePickerState extends js.Object {
  var displayMonth: Double = js.native
  var displayYear: Double = js.native
  var selectedDay: Double | Null = js.native
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  var value: js.Date | Null = js.native
}

object IDatePickerState {
  @scala.inline
  def apply(displayMonth: Double, displayYear: Double): IDatePickerState = {
    val __obj = js.Dynamic.literal(displayMonth = displayMonth.asInstanceOf[js.Any], displayYear = displayYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerState]
  }
  @scala.inline
  implicit class IDatePickerStateOps[Self <: IDatePickerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedDayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDay")(null)
        ret
    }
    @scala.inline
    def withSelectedShortcutIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortcutIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedShortcutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortcutIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}


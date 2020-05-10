package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.dateSetAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerAndroidDateSetAction extends DatePickerAndroidOpenReturn {
  var action: dateSetAction = js.native
  var day: Double = js.native
  var month: Double = js.native
  var year: Double = js.native
}

object DatePickerAndroidDateSetAction {
  @scala.inline
  def apply(action: dateSetAction, day: Double, month: Double, year: Double): DatePickerAndroidDateSetAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerAndroidDateSetAction]
  }
  @scala.inline
  implicit class DatePickerAndroidDateSetActionOps[Self <: DatePickerAndroidDateSetAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: dateSetAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


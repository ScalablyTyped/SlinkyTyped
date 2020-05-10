package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.timeSetAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerAndroidTimeSetAction extends TimePickerAndroidOpenReturn {
  var action: timeSetAction = js.native
  var hour: Double = js.native
  var minute: Double = js.native
}

object TimePickerAndroidTimeSetAction {
  @scala.inline
  def apply(action: timeSetAction, hour: Double, minute: Double): TimePickerAndroidTimeSetAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerAndroidTimeSetAction]
  }
  @scala.inline
  implicit class TimePickerAndroidTimeSetActionOps[Self <: TimePickerAndroidTimeSetAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: timeSetAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


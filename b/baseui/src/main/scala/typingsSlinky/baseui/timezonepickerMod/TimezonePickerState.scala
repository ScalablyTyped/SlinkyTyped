package typingsSlinky.baseui.timezonepickerMod

import typingsSlinky.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimezonePickerState extends js.Object {
  var timezones: js.Array[Option] = js.native
  var value: js.UndefOr[String] = js.native
}

object TimezonePickerState {
  @scala.inline
  def apply(timezones: js.Array[Option]): TimezonePickerState = {
    val __obj = js.Dynamic.literal(timezones = timezones.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimezonePickerState]
  }
  @scala.inline
  implicit class TimezonePickerStateOps[Self <: TimezonePickerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimezones(value: js.Array[Option]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.clock
import typingsSlinky.reactNative.reactNativeStrings.default
import typingsSlinky.reactNative.reactNativeStrings.spinner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerAndroidOpenOptions extends js.Object {
  var hour: js.UndefOr[Double] = js.native
  var is24Hour: js.UndefOr[Boolean] = js.native
  var minute: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[clock | spinner | default] = js.native
}

object TimePickerAndroidOpenOptions {
  @scala.inline
  def apply(): TimePickerAndroidOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerAndroidOpenOptions]
  }
  @scala.inline
  implicit class TimePickerAndroidOpenOptionsOps[Self <: TimePickerAndroidOpenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHour(value: Double): Self = {
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
    def withIs24Hour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is24Hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs24Hour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is24Hour")(js.undefined)
        ret
    }
    @scala.inline
    def withMinute(value: Double): Self = {
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
    def withMode(value: clock | spinner | default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}


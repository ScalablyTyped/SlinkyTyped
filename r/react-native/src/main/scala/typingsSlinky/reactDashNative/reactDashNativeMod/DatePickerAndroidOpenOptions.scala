package typingsSlinky.reactDashNative.reactDashNativeMod

import typingsSlinky.reactDashNative.reactDashNativeStrings.calendar
import typingsSlinky.reactDashNative.reactDashNativeStrings.default
import typingsSlinky.reactDashNative.reactDashNativeStrings.spinner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerAndroidOpenOptions extends js.Object {
  var date: js.UndefOr[js.Date | Double] = js.undefined
  var maxDate: js.UndefOr[js.Date | Double] = js.undefined
  var minDate: js.UndefOr[js.Date | Double] = js.undefined
  var mode: js.UndefOr[calendar | spinner | default] = js.undefined
}

object DatePickerAndroidOpenOptions {
  @scala.inline
  def apply(
    date: js.Date | Double = null,
    maxDate: js.Date | Double = null,
    minDate: js.Date | Double = null,
    mode: calendar | spinner | default = null
  ): DatePickerAndroidOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerAndroidOpenOptions]
  }
}


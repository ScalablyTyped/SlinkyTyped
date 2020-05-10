package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.dismissedAction
import typingsSlinky.reactNative.reactNativeStrings.timeSetAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerAndroidStatic extends js.Object {
  /**
    * The dialog has been dismissed.
    */
  var dismissedAction: typingsSlinky.reactNative.reactNativeStrings.dismissedAction = js.native
  /**
    * A time has been selected.
    */
  var timeSetAction: typingsSlinky.reactNative.reactNativeStrings.timeSetAction = js.native
  /**
    * Opens the standard Android time picker dialog.
    *
    * The available keys for the `options` object are:
    *   * `hour` (0-23) - the hour to show, defaults to the current time
    *   * `minute` (0-59) - the minute to show, defaults to the current time
    *   * `is24Hour` (boolean) - If `true`, the picker uses the 24-hour format. If `false`,
    *     the picker shows an AM/PM chooser. If undefined, the default for the current locale
    *     is used.
    *   * `mode` (enum('clock', 'spinner', 'default')) - set the time picker mode
    *     * 'clock': Show a time picker in clock mode.
    *     * 'spinner': Show a time picker in spinner mode.
    *     * 'default': Show a default time picker based on Android versions.
    *
    * Returns a Promise which will be invoked an object containing `action`, `hour` (0-23),
    * `minute` (0-59) if the user picked a time. If the user dismissed the dialog, the Promise will
    * still be resolved with action being `TimePickerAndroid.dismissedAction` and all the other keys
    * being undefined. **Always** check whether the `action` before reading the values.
    */
  def open(options: TimePickerAndroidOpenOptions): js.Promise[TimePickerAndroidOpenReturn] = js.native
}

object TimePickerAndroidStatic {
  @scala.inline
  def apply(
    dismissedAction: dismissedAction,
    open: TimePickerAndroidOpenOptions => js.Promise[TimePickerAndroidOpenReturn],
    timeSetAction: timeSetAction
  ): TimePickerAndroidStatic = {
    val __obj = js.Dynamic.literal(dismissedAction = dismissedAction.asInstanceOf[js.Any], open = js.Any.fromFunction1(open), timeSetAction = timeSetAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerAndroidStatic]
  }
  @scala.inline
  implicit class TimePickerAndroidStaticOps[Self <: TimePickerAndroidStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismissedAction(value: dismissedAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissedAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: TimePickerAndroidOpenOptions => js.Promise[TimePickerAndroidOpenReturn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeSetAction(value: timeSetAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSetAction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


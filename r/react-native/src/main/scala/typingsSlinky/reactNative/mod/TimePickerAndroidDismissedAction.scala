package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.dismissedAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerAndroidDismissedAction extends TimePickerAndroidOpenReturn {
  var action: dismissedAction
}

object TimePickerAndroidDismissedAction {
  @scala.inline
  def apply(action: dismissedAction): TimePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimePickerAndroidDismissedAction]
  }
}


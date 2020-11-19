package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.dismissedAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerAndroidDismissedAction extends TimePickerAndroidOpenReturn {
  
  var action: dismissedAction = js.native
}
object TimePickerAndroidDismissedAction {
  
  @scala.inline
  def apply(action: dismissedAction): TimePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerAndroidDismissedAction]
  }
  
  @scala.inline
  implicit class TimePickerAndroidDismissedActionOps[Self <: TimePickerAndroidDismissedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: dismissedAction): Self = this.set("action", value.asInstanceOf[js.Any])
  }
}

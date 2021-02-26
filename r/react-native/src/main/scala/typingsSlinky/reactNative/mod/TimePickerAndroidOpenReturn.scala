package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.dismissedAction
import typingsSlinky.reactNative.reactNativeStrings.timeSetAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.mod.TimePickerAndroidTimeSetAction
  - typingsSlinky.reactNative.mod.TimePickerAndroidDismissedAction
*/
trait TimePickerAndroidOpenReturn extends StObject
object TimePickerAndroidOpenReturn {
  
  @scala.inline
  def TimePickerAndroidDismissedAction(action: dismissedAction): typingsSlinky.reactNative.mod.TimePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNative.mod.TimePickerAndroidDismissedAction]
  }
  
  @scala.inline
  def TimePickerAndroidTimeSetAction(action: timeSetAction, hour: Double, minute: Double): typingsSlinky.reactNative.mod.TimePickerAndroidTimeSetAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNative.mod.TimePickerAndroidTimeSetAction]
  }
}

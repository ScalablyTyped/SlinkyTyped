package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.dismissedAction
import typingsSlinky.reactNative.reactNativeStrings.sharedAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.mod.ShareSharedAction
  - typingsSlinky.reactNative.mod.ShareDismissedAction
*/
trait ShareAction extends js.Object
object ShareAction {
  
  @scala.inline
  def ShareSharedAction(action: sharedAction): ShareAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareAction]
  }
  
  @scala.inline
  def ShareDismissedAction(action: dismissedAction): ShareAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareAction]
  }
}

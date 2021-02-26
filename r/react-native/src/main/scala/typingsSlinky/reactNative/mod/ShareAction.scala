package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.dismissedAction
import typingsSlinky.reactNative.reactNativeStrings.sharedAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.mod.ShareSharedAction
  - typingsSlinky.reactNative.mod.ShareDismissedAction
*/
trait ShareAction extends StObject
object ShareAction {
  
  @scala.inline
  def ShareDismissedAction(action: dismissedAction): typingsSlinky.reactNative.mod.ShareDismissedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNative.mod.ShareDismissedAction]
  }
  
  @scala.inline
  def ShareSharedAction(action: sharedAction): typingsSlinky.reactNative.mod.ShareSharedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNative.mod.ShareSharedAction]
  }
}

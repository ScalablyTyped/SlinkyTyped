package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.mod.ShareSharedAction
  - typingsSlinky.reactNative.mod.ShareDismissedAction
*/
trait ShareAction extends js.Object

object ShareAction {
  @scala.inline
  implicit def apply(value: ShareDismissedAction): ShareAction = value.asInstanceOf[ShareAction]
  @scala.inline
  implicit def apply(value: ShareSharedAction): ShareAction = value.asInstanceOf[ShareAction]
}


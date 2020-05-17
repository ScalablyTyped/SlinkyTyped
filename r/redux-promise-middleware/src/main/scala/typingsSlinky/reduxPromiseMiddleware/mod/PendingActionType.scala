package typingsSlinky.reduxPromiseMiddleware.mod

import typingsSlinky.reduxPromiseMiddleware.mod.ActionType.Pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Action type types
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxPromiseMiddleware.mod.ActionType.Pending
  - java.lang.String
*/
trait PendingActionType extends js.Object

object PendingActionType {
  @scala.inline
  implicit def apply(value: Pending): PendingActionType = value.asInstanceOf[PendingActionType]
  @scala.inline
  implicit def apply(value: String): PendingActionType = value.asInstanceOf[PendingActionType]
}


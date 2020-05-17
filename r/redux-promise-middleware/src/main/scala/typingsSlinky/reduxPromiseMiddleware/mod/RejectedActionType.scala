package typingsSlinky.reduxPromiseMiddleware.mod

import typingsSlinky.reduxPromiseMiddleware.mod.ActionType.Rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxPromiseMiddleware.mod.ActionType.Rejected
  - java.lang.String
*/
trait RejectedActionType extends js.Object

object RejectedActionType {
  @scala.inline
  implicit def apply(value: Rejected): RejectedActionType = value.asInstanceOf[RejectedActionType]
  @scala.inline
  implicit def apply(value: String): RejectedActionType = value.asInstanceOf[RejectedActionType]
}


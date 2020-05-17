package typingsSlinky.reduxPromiseMiddleware.mod

import typingsSlinky.reduxPromiseMiddleware.mod.ActionType.Fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxPromiseMiddleware.mod.ActionType.Fulfilled
  - java.lang.String
*/
trait FulfilledActionType extends js.Object

object FulfilledActionType {
  @scala.inline
  implicit def apply(value: Fulfilled): FulfilledActionType = value.asInstanceOf[FulfilledActionType]
  @scala.inline
  implicit def apply(value: String): FulfilledActionType = value.asInstanceOf[FulfilledActionType]
}


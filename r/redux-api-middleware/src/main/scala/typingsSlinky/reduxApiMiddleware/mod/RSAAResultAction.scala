package typingsSlinky.reduxApiMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxApiMiddleware.mod.ValidAction[Payload, Meta]
  - typingsSlinky.reduxApiMiddleware.mod.InvalidAction[
typingsSlinky.reduxApiMiddleware.mod.InternalError | typingsSlinky.reduxApiMiddleware.mod.RequestError | typingsSlinky.reduxApiMiddleware.mod.ApiError[Payload]]
*/
trait RSAAResultAction[Payload, Meta] extends RSAAActions

object RSAAResultAction {
  @scala.inline
  implicit def apply[Payload, Meta](value: InvalidAction[InternalError | RequestError | ApiError[Payload]]): RSAAResultAction[Payload, Meta] = value.asInstanceOf[RSAAResultAction[Payload, Meta]]
  @scala.inline
  implicit def apply[Payload, Meta](value: ValidAction[Payload, Meta]): RSAAResultAction[Payload, Meta] = value.asInstanceOf[RSAAResultAction[Payload, Meta]]
}


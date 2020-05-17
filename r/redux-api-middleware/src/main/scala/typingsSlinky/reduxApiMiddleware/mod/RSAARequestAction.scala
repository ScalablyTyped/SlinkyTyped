package typingsSlinky.reduxApiMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reduxApiMiddleware.mod.ValidAction[Payload, Meta]
  - typingsSlinky.reduxApiMiddleware.mod.InvalidAction[typingsSlinky.reduxApiMiddleware.mod.InvalidRSAA]
*/
trait RSAARequestAction[Payload, Meta] extends RSAAActions

object RSAARequestAction {
  @scala.inline
  implicit def apply[Payload, Meta](value: InvalidAction[InvalidRSAA]): RSAARequestAction[Payload, Meta] = value.asInstanceOf[RSAARequestAction[Payload, Meta]]
  @scala.inline
  implicit def apply[Payload, Meta](value: ValidAction[Payload, Meta]): RSAARequestAction[Payload, Meta] = value.asInstanceOf[RSAARequestAction[Payload, Meta]]
}


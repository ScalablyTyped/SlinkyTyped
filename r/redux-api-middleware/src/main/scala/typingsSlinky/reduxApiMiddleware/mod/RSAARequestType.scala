package typingsSlinky.reduxApiMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Symbol
  - typingsSlinky.reduxApiMiddleware.mod.RSAARequestTypeDescriptor[State, Payload, Meta]
*/
trait RSAARequestType[State, Payload, Meta] extends js.Object

object RSAARequestType {
  @scala.inline
  implicit def apply[State, Payload, Meta](value: RSAARequestTypeDescriptor[State, Payload, Meta]): RSAARequestType[State, Payload, Meta] = value.asInstanceOf[RSAARequestType[State, Payload, Meta]]
  @scala.inline
  implicit def apply[State, Payload, Meta](value: String): RSAARequestType[State, Payload, Meta] = value.asInstanceOf[RSAARequestType[State, Payload, Meta]]
  @scala.inline
  implicit def apply[State, Payload, Meta](value: js.Symbol): RSAARequestType[State, Payload, Meta] = value.asInstanceOf[RSAARequestType[State, Payload, Meta]]
}


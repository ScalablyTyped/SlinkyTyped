package typingsSlinky.reduxPromiseMiddleware.mod

import typingsSlinky.reduxPromiseMiddleware.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Promise[js.Any]
  - typingsSlinky.reduxPromiseMiddleware.mod.AsyncFunction
  - typingsSlinky.reduxPromiseMiddleware.anon.Data
*/
trait AsyncPayload extends js.Object

object AsyncPayload {
  @scala.inline
  implicit def apply(value: AsyncFunction): AsyncPayload = value.asInstanceOf[AsyncPayload]
  @scala.inline
  implicit def apply(value: Data): AsyncPayload = value.asInstanceOf[AsyncPayload]
  @scala.inline
  implicit def apply(value: js.Promise[js.Any]): AsyncPayload = value.asInstanceOf[AsyncPayload]
}


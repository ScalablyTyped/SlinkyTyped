package typingsSlinky.i18next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Error
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait CallbackError extends js.Object

object CallbackError {
  @scala.inline
  implicit def apply(value: js.Error): CallbackError = value.asInstanceOf[CallbackError]
  @scala.inline
  implicit def apply(value: Null): CallbackError = value.asInstanceOf[CallbackError]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => CallbackError): CallbackError = value.asInstanceOf[CallbackError]
}


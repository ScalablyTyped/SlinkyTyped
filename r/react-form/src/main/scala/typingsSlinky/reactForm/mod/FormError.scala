package typingsSlinky.reactForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.UndefOr[scala.Nothing]
*/
trait FormError extends js.Object

object FormError {
  @scala.inline
  implicit def apply(value: String): FormError = value.asInstanceOf[FormError]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => FormError): FormError = value.asInstanceOf[FormError]
}


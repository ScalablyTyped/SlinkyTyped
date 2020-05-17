package typingsSlinky.formstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.formstate.formstateBooleans.`false`
*/
trait ValidationResponse extends ValidatorResponse

object ValidationResponse {
  @scala.inline
  def `false`: typingsSlinky.formstate.formstateBooleans.`false` = false.asInstanceOf[typingsSlinky.formstate.formstateBooleans.`false`]
  @scala.inline
  implicit def apply(value: Null): ValidationResponse = value.asInstanceOf[ValidationResponse]
  @scala.inline
  implicit def apply(value: String): ValidationResponse = value.asInstanceOf[ValidationResponse]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ValidationResponse): ValidationResponse = value.asInstanceOf[ValidationResponse]
}


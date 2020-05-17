package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.calidation.mod.ValueValidatorConfig[T]
  - js.Function1[
/ * context * / typingsSlinky.calidation.mod.ValidatorContext, 
typingsSlinky.calidation.mod.ValueValidatorConfig[T]]
*/
trait ValueValidator[T] extends Validator

object ValueValidator {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* context */ ValidatorContext, ValueValidatorConfig[T]]): ValueValidator[T] = value.asInstanceOf[ValueValidator[T]]
  @scala.inline
  implicit def apply[T](value: ValueValidatorConfig[T]): ValueValidator[T] = value.asInstanceOf[ValueValidator[T]]
}


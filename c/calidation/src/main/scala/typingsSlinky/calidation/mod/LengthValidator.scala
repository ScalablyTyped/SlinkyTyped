package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.calidation.mod.LengthValidatorConfig
  - js.Function1[
/ * context * / typingsSlinky.calidation.mod.ValidatorContext, 
typingsSlinky.calidation.mod.LengthValidatorConfig]
*/
trait LengthValidator extends Validator

object LengthValidator {
  @scala.inline
  implicit def apply(value: js.Function1[/* context */ ValidatorContext, LengthValidatorConfig]): LengthValidator = value.asInstanceOf[LengthValidator]
  @scala.inline
  implicit def apply(value: LengthValidatorConfig): LengthValidator = value.asInstanceOf[LengthValidator]
}


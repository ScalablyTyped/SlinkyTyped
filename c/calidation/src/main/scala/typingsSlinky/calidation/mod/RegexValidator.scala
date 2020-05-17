package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.calidation.mod.RegexValidatorConfig
  - js.Function1[
/ * context * / typingsSlinky.calidation.mod.ValidatorContext, 
typingsSlinky.calidation.mod.RegexValidatorConfig]
*/
trait RegexValidator extends Validator

object RegexValidator {
  @scala.inline
  implicit def apply(value: js.Function1[/* context */ ValidatorContext, RegexValidatorConfig]): RegexValidator = value.asInstanceOf[RegexValidator]
  @scala.inline
  implicit def apply(value: RegexValidatorConfig): RegexValidator = value.asInstanceOf[RegexValidator]
}


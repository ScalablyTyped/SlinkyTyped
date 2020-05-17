package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.calidation.mod.WhitelistValidatorConfig
  - js.Function1[
/ * context * / typingsSlinky.calidation.mod.ValidatorContext, 
typingsSlinky.calidation.mod.RegexValidatorConfig]
*/
trait WhitelistValidator extends Validator

object WhitelistValidator {
  @scala.inline
  implicit def apply(value: js.Function1[/* context */ ValidatorContext, RegexValidatorConfig]): WhitelistValidator = value.asInstanceOf[WhitelistValidator]
  @scala.inline
  implicit def apply(value: WhitelistValidatorConfig): WhitelistValidator = value.asInstanceOf[WhitelistValidator]
}


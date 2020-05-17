package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.calidation.mod.BlacklistValidatorConfig
  - js.Function1[
/ * context * / typingsSlinky.calidation.mod.ValidatorContext, 
typingsSlinky.calidation.mod.BlacklistValidatorConfig]
*/
trait BlacklistValidator extends Validator

object BlacklistValidator {
  @scala.inline
  implicit def apply(value: BlacklistValidatorConfig): BlacklistValidator = value.asInstanceOf[BlacklistValidator]
  @scala.inline
  implicit def apply(value: js.Function1[/* context */ ValidatorContext, BlacklistValidatorConfig]): BlacklistValidator = value.asInstanceOf[BlacklistValidator]
}


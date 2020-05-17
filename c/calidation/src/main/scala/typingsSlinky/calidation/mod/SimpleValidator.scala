package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.calidation.mod.SimpleValidatorConfig
  - js.Function1[
/ * context * / typingsSlinky.calidation.mod.ValidatorContext, 
typingsSlinky.calidation.mod.SimpleValidatorConfig]
*/
trait SimpleValidator extends Validator

object SimpleValidator {
  @scala.inline
  implicit def apply(value: js.Function1[/* context */ ValidatorContext, SimpleValidatorConfig]): SimpleValidator = value.asInstanceOf[SimpleValidator]
  @scala.inline
  implicit def apply(value: SimpleValidatorConfig): SimpleValidator = value.asInstanceOf[SimpleValidator]
  @scala.inline
  implicit def apply(value: String): SimpleValidator = value.asInstanceOf[SimpleValidator]
}


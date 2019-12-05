package typingsSlinky.calidation.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexValidatorConfig extends SimpleValidatorConfig {
  var regex: js.RegExp
}

object RegexValidatorConfig {
  @scala.inline
  def apply(
    message: String,
    regex: js.RegExp,
    validateIf: (js.Function1[/* context */ ValidatorContext, Boolean]) | Boolean = null
  ): RegexValidatorConfig = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexValidatorConfig]
  }
}


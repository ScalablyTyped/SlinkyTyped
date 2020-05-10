package typingsSlinky.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutValidationRuleDefinition extends KnockoutValidationRuleBase {
  def validator(value: js.Any, params: js.Any): Boolean = js.native
}

object KnockoutValidationRuleDefinition {
  @scala.inline
  def apply(message: String | KnockoutValidationMessageFunction, validator: (js.Any, js.Any) => Boolean): KnockoutValidationRuleDefinition = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], validator = js.Any.fromFunction2(validator))
    __obj.asInstanceOf[KnockoutValidationRuleDefinition]
  }
  @scala.inline
  implicit class KnockoutValidationRuleDefinitionOps[Self <: KnockoutValidationRuleDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidator(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


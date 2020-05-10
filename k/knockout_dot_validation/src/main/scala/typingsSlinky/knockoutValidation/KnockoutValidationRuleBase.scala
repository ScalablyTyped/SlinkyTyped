package typingsSlinky.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutValidationRuleBase extends js.Object {
  var message: String | KnockoutValidationMessageFunction = js.native
}

object KnockoutValidationRuleBase {
  @scala.inline
  def apply(message: String | KnockoutValidationMessageFunction): KnockoutValidationRuleBase = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationRuleBase]
  }
  @scala.inline
  implicit class KnockoutValidationRuleBaseOps[Self <: KnockoutValidationRuleBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageFunction2(value: (/* params */ js.Any, /* observable */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMessage(value: String | KnockoutValidationMessageFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


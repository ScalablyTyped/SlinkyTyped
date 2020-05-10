package typingsSlinky.angularFormly.AngularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * see http://docs.angular-formly.com/docs/field-configuration-object#validators-object
	 */
@js.native
trait IValidator extends js.Object {
  var expression: String | IExpressionFunction = js.native
  var message: js.UndefOr[String | IExpressionFunction] = js.native
}

object IValidator {
  @scala.inline
  def apply(expression: String | IExpressionFunction): IValidator = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidator]
  }
  @scala.inline
  implicit class IValidatorOps[Self <: IValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpressionFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withExpression(value: String | IExpressionFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMessage(value: String | IExpressionFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}


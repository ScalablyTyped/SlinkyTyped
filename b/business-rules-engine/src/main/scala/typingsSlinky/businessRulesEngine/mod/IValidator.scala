package typingsSlinky.businessRulesEngine.mod

import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValidator extends js.Object {
  var Error: IError = js.native
  def Validate(context: js.Any): IValidationFailure = js.native
  def ValidateAsync(context: js.Any): Promise[IValidationFailure] = js.native
}

object IValidator {
  @scala.inline
  def apply(
    Error: IError,
    Validate: js.Any => IValidationFailure,
    ValidateAsync: js.Any => Promise[IValidationFailure]
  ): IValidator = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Validate = js.Any.fromFunction1(Validate), ValidateAsync = js.Any.fromFunction1(ValidateAsync))
    __obj.asInstanceOf[IValidator]
  }
  @scala.inline
  implicit class IValidatorOps[Self <: IValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: IError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: js.Any => IValidationFailure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateAsync(value: js.Any => Promise[IValidationFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidateAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.businessRulesEngine.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValidationRule[T] extends js.Object {
  var Validators: StringDictionary[js.Any] = js.native
  def Validate(context: IValidationContext[T]): js.Array[IValidationFailure] = js.native
  def ValidateAsync(context: IValidationContext[T]): Promise[js.Array[IValidationFailure]] = js.native
}

object IPropertyValidationRule {
  @scala.inline
  def apply[T](
    Validate: IValidationContext[T] => js.Array[IValidationFailure],
    ValidateAsync: IValidationContext[T] => Promise[js.Array[IValidationFailure]],
    Validators: StringDictionary[js.Any]
  ): IPropertyValidationRule[T] = {
    val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate), ValidateAsync = js.Any.fromFunction1(ValidateAsync), Validators = Validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValidationRule[T]]
  }
  @scala.inline
  implicit class IPropertyValidationRuleOps[Self[t] <: IPropertyValidationRule[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withValidate(value: IValidationContext[T] => js.Array[IValidationFailure]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateAsync(value: IValidationContext[T] => Promise[js.Array[IValidationFailure]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidateAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidators(value: StringDictionary[js.Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validators")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractValidator[T] extends js.Object {
  var ForList: Boolean = js.native
  def CreateAbstractListRule(name: String): IAbstractValidationRule[_] = js.native
  def CreateAbstractRule(name: String): IAbstractValidationRule[_] = js.native
  def CreateRule(name: String): IAbstractValidationRule[_] = js.native
  def RuleFor(prop: String, validator: IPropertyValidator): js.Any = js.native
  def Validation(validatorFce: IValidatorFce): js.Any = js.native
  def ValidationFor(prop: String, validatorFce: IValidatorFce): js.Any = js.native
  def ValidatorFor[K](prop: String, validator: IAbstractValidator[K]): js.Any = js.native
}

object IAbstractValidator {
  @scala.inline
  def apply[T](
    CreateAbstractListRule: String => IAbstractValidationRule[_],
    CreateAbstractRule: String => IAbstractValidationRule[_],
    CreateRule: String => IAbstractValidationRule[_],
    ForList: Boolean,
    RuleFor: (String, IPropertyValidator) => js.Any,
    Validation: IValidatorFce => js.Any,
    ValidationFor: (String, IValidatorFce) => js.Any,
    ValidatorFor: (String, IAbstractValidator[js.Any]) => js.Any
  ): IAbstractValidator[T] = {
    val __obj = js.Dynamic.literal(CreateAbstractListRule = js.Any.fromFunction1(CreateAbstractListRule), CreateAbstractRule = js.Any.fromFunction1(CreateAbstractRule), CreateRule = js.Any.fromFunction1(CreateRule), ForList = ForList.asInstanceOf[js.Any], RuleFor = js.Any.fromFunction2(RuleFor), Validation = js.Any.fromFunction1(Validation), ValidationFor = js.Any.fromFunction2(ValidationFor), ValidatorFor = js.Any.fromFunction2(ValidatorFor))
    __obj.asInstanceOf[IAbstractValidator[T]]
  }
  @scala.inline
  implicit class IAbstractValidatorOps[Self[t] <: IAbstractValidator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCreateAbstractListRule(value: String => IAbstractValidationRule[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateAbstractListRule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateAbstractRule(value: String => IAbstractValidationRule[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateAbstractRule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateRule(value: String => IAbstractValidationRule[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateRule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForList(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleFor(value: (String, IPropertyValidator) => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleFor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValidation(value: IValidatorFce => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidationFor(value: (String, IValidatorFce) => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationFor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValidatorFor(value: (String, IAbstractValidator[js.Any]) => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidatorFor")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


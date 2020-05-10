package typingsSlinky.businessRulesEngine.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractValidationRule[T] extends js.Object {
  var Children: StringDictionary[IAbstractValidationRule[_]] = js.native
  var Rules: StringDictionary[IPropertyValidationRule[T]] = js.native
  var ValidationResult: IValidationResult = js.native
  var Validators: StringDictionary[IValidator] = js.native
  def Validate(context: T): IValidationResult = js.native
  def ValidateAll(context: T): Promise[IValidationResult] = js.native
  def ValidateAsync(context: T): Promise[IValidationResult] = js.native
  def ValidateProperty(context: T, propName: String): Unit = js.native
}

object IAbstractValidationRule {
  @scala.inline
  def apply[T](
    Children: StringDictionary[IAbstractValidationRule[_]],
    Rules: StringDictionary[IPropertyValidationRule[T]],
    Validate: T => IValidationResult,
    ValidateAll: T => Promise[IValidationResult],
    ValidateAsync: T => Promise[IValidationResult],
    ValidateProperty: (T, String) => Unit,
    ValidationResult: IValidationResult,
    Validators: StringDictionary[IValidator]
  ): IAbstractValidationRule[T] = {
    val __obj = js.Dynamic.literal(Children = Children.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any], Validate = js.Any.fromFunction1(Validate), ValidateAll = js.Any.fromFunction1(ValidateAll), ValidateAsync = js.Any.fromFunction1(ValidateAsync), ValidateProperty = js.Any.fromFunction2(ValidateProperty), ValidationResult = ValidationResult.asInstanceOf[js.Any], Validators = Validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractValidationRule[T]]
  }
  @scala.inline
  implicit class IAbstractValidationRuleOps[Self[t] <: IAbstractValidationRule[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChildren(value: StringDictionary[IAbstractValidationRule[_]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: StringDictionary[IPropertyValidationRule[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: T => IValidationResult): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateAll(value: T => Promise[IValidationResult]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidateAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateAsync(value: T => Promise[IValidationResult]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidateAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateProperty(value: (T, String) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidateProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValidationResult(value: IValidationResult): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidators(value: StringDictionary[IValidator]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Validators")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


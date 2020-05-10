package typingsSlinky.classValidator.registerDecoratorMod

import typingsSlinky.classValidator.validatorConstraintInterfaceMod.ValidatorConstraintInterface
import typingsSlinky.classValidator.validatorOptionsMod.ValidatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationDecoratorOptions extends js.Object {
  /**
    * Indicates if this decorator will perform async validation.
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * Array of validation constraints.
    */
  var constraints: js.UndefOr[js.Array[_]] = js.native
  /**
    * Name of the validation that is being registered.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Validator options.
    */
  var options: js.UndefOr[ValidatorOptions] = js.native
  /**
    * Target object's property name to be validated.
    */
  var propertyName: String = js.native
  /**
    * Target object to be validated.
    */
  var target: js.Function = js.native
  /**
    * Validator that performs validation.
    */
  var validator: ValidatorConstraintInterface | js.Function = js.native
}

object ValidationDecoratorOptions {
  @scala.inline
  def apply(propertyName: String, target: js.Function, validator: ValidatorConstraintInterface | js.Function): ValidationDecoratorOptions = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationDecoratorOptions]
  }
  @scala.inline
  implicit class ValidationDecoratorOptionsOps[Self <: ValidationDecoratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidator(value: ValidatorConstraintInterface | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraints(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: ValidatorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}


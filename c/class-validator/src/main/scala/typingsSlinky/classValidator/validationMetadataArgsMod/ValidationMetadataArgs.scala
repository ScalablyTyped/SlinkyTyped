package typingsSlinky.classValidator.validationMetadataArgsMod

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationMetadataArgs extends js.Object {
  /**
    * Constraint class that performs validation. Used only for custom validations.
    */
  var constraintCls: js.UndefOr[js.Function] = js.native
  /**
    * Array of constraints of this validation.
    */
  var constraints: js.UndefOr[js.Array[_]] = js.native
  /**
    * Property of the object to be validated.
    */
  var propertyName: String = js.native
  /**
    * Object that is used to be validated.
    */
  var target: js.Function | String = js.native
  /**
    * Validation type.
    */
  var `type`: String = js.native
  /**
    * Validation options.
    */
  var validationOptions: js.UndefOr[ValidationOptions] = js.native
  /**
    * Extra options specific to validation type.
    */
  var validationTypeOptions: js.UndefOr[js.Any] = js.native
}

object ValidationMetadataArgs {
  @scala.inline
  def apply(propertyName: String, target: js.Function | String, `type`: String): ValidationMetadataArgs = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMetadataArgs]
  }
  @scala.inline
  implicit class ValidationMetadataArgsOps[Self <: ValidationMetadataArgs] (val x: Self) extends AnyVal {
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
    def withTarget(value: js.Function | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraintCls(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraintCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintCls")(js.undefined)
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
    def withValidationOptions(value: ValidationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationTypeOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationTypeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationTypeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationTypeOptions")(js.undefined)
        ret
    }
  }
  
}


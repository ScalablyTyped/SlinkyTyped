package typingsSlinky.classValidator.validationArgumentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationArguments extends js.Object {
  /**
    * Constraints set by this validation type.
    */
  var constraints: js.Array[_] = js.native
  /**
    * Object that is being validated.
    */
  var `object`: js.Object = js.native
  /**
    * Name of the object's property being validated.
    */
  var property: String = js.native
  /**
    * Name of the target that is being validated.
    */
  var targetName: String = js.native
  /**
    * Validating value.
    */
  var value: js.Any = js.native
}

object ValidationArguments {
  @scala.inline
  def apply(constraints: js.Array[_], `object`: js.Object, property: String, targetName: String, value: js.Any): ValidationArguments = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationArguments]
  }
  @scala.inline
  implicit class ValidationArgumentsOps[Self <: ValidationArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


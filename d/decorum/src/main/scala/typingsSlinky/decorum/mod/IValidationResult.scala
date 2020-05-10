package typingsSlinky.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValidationResult extends js.Object {
  /**
    * A map of field name to validation errors.
    */
  var errors: js.Array[IFieldValidationError] = js.native
  /**
    * Whether or not the model is valid.
    */
  var isValid: Boolean = js.native
}

object IValidationResult {
  @scala.inline
  def apply(errors: js.Array[IFieldValidationError], isValid: Boolean): IValidationResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationResult]
  }
  @scala.inline
  implicit class IValidationResultOps[Self <: IValidationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[IFieldValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


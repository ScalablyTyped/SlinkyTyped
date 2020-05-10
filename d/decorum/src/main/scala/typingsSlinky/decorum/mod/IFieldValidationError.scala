package typingsSlinky.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldValidationError extends js.Object {
  /**
    * One or more field validation errors. Empty if no errors.
    */
  var errors: js.Array[String] = js.native
  /**
    * The property name of the field on the model.
    */
  var field: String = js.native
  /**
    * The "friendly" name of the field. If not set on the model via @FieldName(...), it will default to "Field".
    */
  var fieldName: String = js.native
}

object IFieldValidationError {
  @scala.inline
  def apply(errors: js.Array[String], field: String, fieldName: String): IFieldValidationError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldValidationError]
  }
  @scala.inline
  implicit class IFieldValidationErrorOps[Self <: IFieldValidationError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


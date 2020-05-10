package typingsSlinky.reactJsonschemaForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldValidation extends js.Object {
  var __errors: js.Array[FieldError] = js.native
  def addError(message: String): Unit = js.native
}

object FieldValidation {
  @scala.inline
  def apply(__errors: js.Array[FieldError], addError: String => Unit): FieldValidation = {
    val __obj = js.Dynamic.literal(__errors = __errors.asInstanceOf[js.Any], addError = js.Any.fromFunction1(addError))
    __obj.asInstanceOf[FieldValidation]
  }
  @scala.inline
  implicit class FieldValidationOps[Self <: FieldValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__errors(value: js.Array[FieldError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddError(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addError")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


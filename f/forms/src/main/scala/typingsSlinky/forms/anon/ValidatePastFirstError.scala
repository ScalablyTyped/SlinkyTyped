package typingsSlinky.forms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatePastFirstError extends js.Object {
  /** If false, the first validation error will halt form validation, otherwise all fields will be validated. */
  var validatePastFirstError: js.UndefOr[Boolean] = js.native
}

object ValidatePastFirstError {
  @scala.inline
  def apply(): ValidatePastFirstError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatePastFirstError]
  }
  @scala.inline
  implicit class ValidatePastFirstErrorOps[Self <: ValidatePastFirstError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidatePastFirstError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatePastFirstError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidatePastFirstError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatePastFirstError")(js.undefined)
        ret
    }
  }
  
}


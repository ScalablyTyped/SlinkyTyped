package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ValidationResult. */
@js.native
trait IValidationResult extends js.Object {
  /** ValidationResult validationErrors */
  var validationErrors: js.UndefOr[js.Array[IValidationError] | Null] = js.native
}

object IValidationResult {
  @scala.inline
  def apply(): IValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValidationResult]
  }
  @scala.inline
  implicit class IValidationResultOps[Self <: IValidationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidationErrors(value: js.Array[IValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationErrorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationErrors")(null)
        ret
    }
  }
  
}


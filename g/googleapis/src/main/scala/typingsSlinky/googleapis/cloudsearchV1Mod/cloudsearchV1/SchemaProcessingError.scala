package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProcessingError extends js.Object {
  /**
    * Error code indicating the nature of the error.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Description of the error.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * In case the item fields are invalid, this field contains the details
    * about the validation errors.
    */
  var fieldViolations: js.UndefOr[js.Array[SchemaFieldViolation]] = js.native
}

object SchemaProcessingError {
  @scala.inline
  def apply(): SchemaProcessingError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProcessingError]
  }
  @scala.inline
  implicit class SchemaProcessingErrorOps[Self <: SchemaProcessingError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldViolations(value: js.Array[SchemaFieldViolation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldViolations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldViolations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldViolations")(js.undefined)
        ret
    }
  }
  
}


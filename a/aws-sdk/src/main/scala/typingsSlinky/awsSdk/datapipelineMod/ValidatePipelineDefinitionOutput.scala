package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatePipelineDefinitionOutput extends js.Object {
  /**
    * Indicates whether there were validation errors.
    */
  var errored: Boolean = js.native
  /**
    * Any validation errors that were found.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.native
  /**
    * Any validation warnings that were found.
    */
  var validationWarnings: js.UndefOr[ValidationWarnings] = js.native
}

object ValidatePipelineDefinitionOutput {
  @scala.inline
  def apply(errored: Boolean): ValidatePipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal(errored = errored.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatePipelineDefinitionOutput]
  }
  @scala.inline
  implicit class ValidatePipelineDefinitionOutputOps[Self <: ValidatePipelineDefinitionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrored(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationErrors(value: ValidationErrors): Self = {
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
    def withValidationWarnings(value: ValidationWarnings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationWarnings")(js.undefined)
        ret
    }
  }
  
}


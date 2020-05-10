package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPipelineDefinitionOutput extends js.Object {
  /**
    * Indicates whether there were validation errors, and the pipeline definition is stored but cannot be activated until you correct the pipeline and call PutPipelineDefinition to commit the corrected pipeline.
    */
  var errored: Boolean = js.native
  /**
    * The validation errors that are associated with the objects defined in pipelineObjects.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.native
  /**
    * The validation warnings that are associated with the objects defined in pipelineObjects.
    */
  var validationWarnings: js.UndefOr[ValidationWarnings] = js.native
}

object PutPipelineDefinitionOutput {
  @scala.inline
  def apply(errored: Boolean): PutPipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal(errored = errored.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPipelineDefinitionOutput]
  }
  @scala.inline
  implicit class PutPipelineDefinitionOutputOps[Self <: PutPipelineDefinitionOutput] (val x: Self) extends AnyVal {
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


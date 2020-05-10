package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivatePipelineInput extends js.Object {
  /**
    * A list of parameter values to pass to the pipeline at activation.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.native
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
  /**
    * The date and time to resume the pipeline. By default, the pipeline resumes from the last completed execution.
    */
  var startTimestamp: js.UndefOr[js.Date] = js.native
}

object ActivatePipelineInput {
  @scala.inline
  def apply(pipelineId: id): ActivatePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivatePipelineInput]
  }
  @scala.inline
  implicit class ActivatePipelineInputOps[Self <: ActivatePipelineInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipelineId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterValues(value: ParameterValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterValues")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimestamp")(js.undefined)
        ret
    }
  }
  
}


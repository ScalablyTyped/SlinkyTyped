package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopPipelineExecutionInput extends js.Object {
  /**
    * Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress actions.  This option can lead to failed or out-of-sequence tasks. 
    */
  var abandon: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the pipeline execution to be stopped in the current stage. Use the GetPipelineState action to retrieve the current pipelineExecutionId.
    */
  var pipelineExecutionId: PipelineExecutionId = js.native
  /**
    * The name of the pipeline to stop.
    */
  var pipelineName: PipelineName = js.native
  /**
    * Use this option to enter comments, such as the reason the pipeline was stopped.
    */
  var reason: js.UndefOr[StopPipelineExecutionReason] = js.native
}

object StopPipelineExecutionInput {
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId, pipelineName: PipelineName): StopPipelineExecutionInput = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPipelineExecutionInput]
  }
  @scala.inline
  implicit class StopPipelineExecutionInputOps[Self <: StopPipelineExecutionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPipelineExecutionId(value: PipelineExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipelineName(value: PipelineName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbandon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abandon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbandon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abandon")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: StopPipelineExecutionReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
  }
  
}


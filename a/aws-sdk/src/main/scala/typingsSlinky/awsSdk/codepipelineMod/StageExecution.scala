package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageExecution extends js.Object {
  /**
    * The ID of the pipeline execution associated with the stage.
    */
  var pipelineExecutionId: PipelineExecutionId = js.native
  /**
    * The status of the stage, or for a completed stage, the last status of the stage.
    */
  var status: StageExecutionStatus = js.native
}

object StageExecution {
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId, status: StageExecutionStatus): StageExecution = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageExecution]
  }
  @scala.inline
  implicit class StageExecutionOps[Self <: StageExecution] (val x: Self) extends AnyVal {
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
    def withStatus(value: StageExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


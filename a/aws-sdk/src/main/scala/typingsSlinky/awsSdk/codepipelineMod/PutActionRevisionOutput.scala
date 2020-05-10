package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutActionRevisionOutput extends js.Object {
  /**
    * Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
    */
  var newRevision: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the current workflow state of the pipeline.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
}

object PutActionRevisionOutput {
  @scala.inline
  def apply(): PutActionRevisionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutActionRevisionOutput]
  }
  @scala.inline
  implicit class PutActionRevisionOutputOps[Self <: PutActionRevisionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewRevision(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRevision")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineExecutionId(value: PipelineExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineExecutionId")(js.undefined)
        ret
    }
  }
  
}


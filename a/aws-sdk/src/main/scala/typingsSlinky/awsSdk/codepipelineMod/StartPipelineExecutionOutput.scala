package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPipelineExecutionOutput extends js.Object {
  /**
    * The unique system-generated ID of the pipeline execution that was started.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
}

object StartPipelineExecutionOutput {
  @scala.inline
  def apply(): StartPipelineExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPipelineExecutionOutput]
  }
  @scala.inline
  implicit class StartPipelineExecutionOutputOps[Self <: StartPipelineExecutionOutput] (val x: Self) extends AnyVal {
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
    def withoutPipelineExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineExecutionId")(js.undefined)
        ret
    }
  }
  
}


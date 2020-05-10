package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionExecutionFilter extends js.Object {
  /**
    * The pipeline execution ID used to filter action execution history.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
}

object ActionExecutionFilter {
  @scala.inline
  def apply(): ActionExecutionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionFilter]
  }
  @scala.inline
  implicit class ActionExecutionFilterOps[Self <: ActionExecutionFilter] (val x: Self) extends AnyVal {
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


package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionExecutionDetail extends js.Object {
  /**
    * The action execution ID.
    */
  var actionExecutionId: js.UndefOr[ActionExecutionId] = js.native
  /**
    * The name of the action.
    */
  var actionName: js.UndefOr[ActionName] = js.native
  /**
    * Input details for the action execution, such as role ARN, Region, and input artifacts.
    */
  var input: js.UndefOr[ActionExecutionInput] = js.native
  /**
    * The last update time of the action execution.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.native
  /**
    * Output details for the action execution, such as the action execution result.
    */
  var output: js.UndefOr[ActionExecutionOutput] = js.native
  /**
    * The pipeline execution ID for the action execution.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
  /**
    * The version of the pipeline where the action was run.
    */
  var pipelineVersion: js.UndefOr[PipelineVersion] = js.native
  /**
    * The name of the stage that contains the action.
    */
  var stageName: js.UndefOr[StageName] = js.native
  /**
    * The start time of the action execution.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    *  The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
    */
  var status: js.UndefOr[ActionExecutionStatus] = js.native
}

object ActionExecutionDetail {
  @scala.inline
  def apply(): ActionExecutionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionDetail]
  }
  @scala.inline
  implicit class ActionExecutionDetailOps[Self <: ActionExecutionDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionExecutionId(value: ActionExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withActionName(value: ActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: ActionExecutionInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: ActionExecutionOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
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
    @scala.inline
    def withPipelineVersion(value: PipelineVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withStageName(value: StageName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ActionExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}


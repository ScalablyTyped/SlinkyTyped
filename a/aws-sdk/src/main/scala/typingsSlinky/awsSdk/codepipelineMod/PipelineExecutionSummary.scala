package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineExecutionSummary extends js.Object {
  /**
    * The date and time of the last change to the pipeline execution, in timestamp format.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the pipeline execution.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
  /**
    * A list of the source artifact revisions that initiated a pipeline execution.
    */
  var sourceRevisions: js.UndefOr[SourceRevisionList] = js.native
  /**
    * The date and time when the pipeline execution began, in timestamp format.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the pipeline execution.   InProgress: The pipeline execution is currently running.   Stopped: The pipeline execution was manually stopped. For more information, see Stopped Executions.   Stopping: The pipeline execution received a request to be manually stopped. Depending on the selected stop mode, the execution is either completing or abandoning in-progress actions. For more information, see Stopped Executions.   Succeeded: The pipeline execution was completed successfully.    Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline execution advanced and continued through the pipeline instead. For more information, see Superseded Executions.   Failed: The pipeline execution was not completed successfully.  
    */
  var status: js.UndefOr[PipelineExecutionStatus] = js.native
  /**
    * The interaction that stopped a pipeline execution.
    */
  var stopTrigger: js.UndefOr[StopExecutionTrigger] = js.native
  /**
    * The interaction or event that started a pipeline execution, such as automated change detection or a StartPipelineExecution API call.
    */
  var trigger: js.UndefOr[ExecutionTrigger] = js.native
}

object PipelineExecutionSummary {
  @scala.inline
  def apply(): PipelineExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineExecutionSummary]
  }
  @scala.inline
  implicit class PipelineExecutionSummaryOps[Self <: PipelineExecutionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSourceRevisions(value: SourceRevisionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRevisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRevisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRevisions")(js.undefined)
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
    def withStatus(value: PipelineExecutionStatus): Self = {
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
    @scala.inline
    def withStopTrigger(value: StopExecutionTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: ExecutionTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
  }
  
}


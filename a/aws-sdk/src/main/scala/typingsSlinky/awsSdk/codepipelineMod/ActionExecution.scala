package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionExecution extends js.Object {
  /**
    * The details of an error returned by a URL external to AWS.
    */
  var errorDetails: js.UndefOr[ErrorDetails] = js.native
  /**
    * The external ID of the run of the action.
    */
  var externalExecutionId: js.UndefOr[ExecutionId] = js.native
  /**
    * The URL of a resource external to AWS that is used when running the action (for example, an external repository URL).
    */
  var externalExecutionUrl: js.UndefOr[Url] = js.native
  /**
    * The last status change of the action.
    */
  var lastStatusChange: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the user who last changed the pipeline.
    */
  var lastUpdatedBy: js.UndefOr[LastUpdatedBy] = js.native
  /**
    * A percentage of completeness of the action as it runs.
    */
  var percentComplete: js.UndefOr[Percentage] = js.native
  /**
    * The status of the action, or for a completed action, the last status of the action.
    */
  var status: js.UndefOr[ActionExecutionStatus] = js.native
  /**
    * A summary of the run of the action.
    */
  var summary: js.UndefOr[ExecutionSummary] = js.native
  /**
    * The system-generated token used to identify a unique approval request. The token for each open approval request can be obtained using the GetPipelineState command. It is used to validate that the approval request corresponding to this token is still valid.
    */
  var token: js.UndefOr[ActionExecutionToken] = js.native
}

object ActionExecution {
  @scala.inline
  def apply(): ActionExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecution]
  }
  @scala.inline
  implicit class ActionExecutionOps[Self <: ActionExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorDetails(value: ErrorDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalExecutionId(value: ExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalExecutionUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalExecutionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalExecutionUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalExecutionUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStatusChange(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatusChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStatusChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatusChange")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedBy(value: LastUpdatedBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentComplete(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentComplete")(js.undefined)
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
    @scala.inline
    def withSummary(value: ExecutionSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: ActionExecutionToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}


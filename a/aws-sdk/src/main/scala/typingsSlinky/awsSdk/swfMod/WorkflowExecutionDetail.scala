package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionDetail extends js.Object {
  /**
    * The configuration settings for this workflow execution including timeout values, tasklist etc.
    */
  var executionConfiguration: WorkflowExecutionConfiguration = js.native
  /**
    * Information about the workflow execution.
    */
  var executionInfo: WorkflowExecutionInfo = js.native
  /**
    * The time when the last activity task was scheduled for this workflow execution. You can use this information to determine if the workflow has not made progress for an unusually long period of time and might require a corrective action.
    */
  var latestActivityTaskTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The latest executionContext provided by the decider for this workflow execution. A decider can provide an executionContext (a free-form string) when closing a decision task using RespondDecisionTaskCompleted.
    */
  var latestExecutionContext: js.UndefOr[Data] = js.native
  /**
    * The number of tasks for this workflow execution. This includes open and closed tasks of all types.
    */
  var openCounts: WorkflowExecutionOpenCounts = js.native
}

object WorkflowExecutionDetail {
  @scala.inline
  def apply(
    executionConfiguration: WorkflowExecutionConfiguration,
    executionInfo: WorkflowExecutionInfo,
    openCounts: WorkflowExecutionOpenCounts
  ): WorkflowExecutionDetail = {
    val __obj = js.Dynamic.literal(executionConfiguration = executionConfiguration.asInstanceOf[js.Any], executionInfo = executionInfo.asInstanceOf[js.Any], openCounts = openCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionDetail]
  }
  @scala.inline
  implicit class WorkflowExecutionDetailOps[Self <: WorkflowExecutionDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionConfiguration(value: WorkflowExecutionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionInfo(value: WorkflowExecutionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenCounts(value: WorkflowExecutionOpenCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestActivityTaskTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestActivityTaskTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestActivityTaskTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestActivityTaskTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestExecutionContext(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestExecutionContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestExecutionContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestExecutionContext")(js.undefined)
        ret
    }
  }
  
}


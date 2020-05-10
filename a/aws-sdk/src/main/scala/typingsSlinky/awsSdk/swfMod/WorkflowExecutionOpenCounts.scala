package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionOpenCounts extends js.Object {
  /**
    * The count of activity tasks whose status is OPEN.
    */
  var openActivityTasks: Count = js.native
  /**
    * The count of child workflow executions whose status is OPEN.
    */
  var openChildWorkflowExecutions: Count = js.native
  /**
    * The count of decision tasks whose status is OPEN. A workflow execution can have at most one open decision task.
    */
  var openDecisionTasks: OpenDecisionTasksCount = js.native
  /**
    * The count of Lambda tasks whose status is OPEN.
    */
  var openLambdaFunctions: js.UndefOr[Count] = js.native
  /**
    * The count of timers started by this workflow execution that have not fired yet.
    */
  var openTimers: Count = js.native
}

object WorkflowExecutionOpenCounts {
  @scala.inline
  def apply(
    openActivityTasks: Count,
    openChildWorkflowExecutions: Count,
    openDecisionTasks: OpenDecisionTasksCount,
    openTimers: Count
  ): WorkflowExecutionOpenCounts = {
    val __obj = js.Dynamic.literal(openActivityTasks = openActivityTasks.asInstanceOf[js.Any], openChildWorkflowExecutions = openChildWorkflowExecutions.asInstanceOf[js.Any], openDecisionTasks = openDecisionTasks.asInstanceOf[js.Any], openTimers = openTimers.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionOpenCounts]
  }
  @scala.inline
  implicit class WorkflowExecutionOpenCountsOps[Self <: WorkflowExecutionOpenCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenActivityTasks(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openActivityTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenChildWorkflowExecutions(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openChildWorkflowExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenDecisionTasks(value: OpenDecisionTasksCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDecisionTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenTimers(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTimers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenLambdaFunctions(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openLambdaFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenLambdaFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openLambdaFunctions")(js.undefined)
        ret
    }
  }
  
}


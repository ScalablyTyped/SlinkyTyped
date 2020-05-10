package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionInfo extends js.Object {
  /**
    * Set to true if a cancellation is requested for this workflow execution.
    */
  var cancelRequested: js.UndefOr[Canceled] = js.native
  /**
    * If the execution status is closed then this specifies how the execution was closed:    COMPLETED – the execution was successfully completed.    CANCELED – the execution was canceled.Cancellation allows the implementation to gracefully clean up before the execution is closed.    TERMINATED – the execution was force terminated.    FAILED – the execution failed to complete.    TIMED_OUT – the execution did not complete in the alloted time and was automatically timed out.    CONTINUED_AS_NEW – the execution is logically continued. This means the current execution was completed and a new execution was started to carry on the workflow.  
    */
  var closeStatus: js.UndefOr[CloseStatus] = js.native
  /**
    * The time when the workflow execution was closed. Set only if the execution status is CLOSED.
    */
  var closeTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The workflow execution this information is about.
    */
  var execution: WorkflowExecution = js.native
  /**
    * The current status of the execution.
    */
  var executionStatus: ExecutionStatus = js.native
  /**
    * If this workflow execution is a child of another execution then contains the workflow execution that started this execution.
    */
  var parent: js.UndefOr[WorkflowExecution] = js.native
  /**
    * The time when the execution was started.
    */
  var startTimestamp: js.Date = js.native
  /**
    * The list of tags associated with the workflow execution. Tags can be used to identify and list workflow executions of interest through the visibility APIs. A workflow execution can have a maximum of 5 tags.
    */
  var tagList: js.UndefOr[TagList] = js.native
  /**
    * The type of the workflow execution.
    */
  var workflowType: WorkflowType = js.native
}

object WorkflowExecutionInfo {
  @scala.inline
  def apply(
    execution: WorkflowExecution,
    executionStatus: ExecutionStatus,
    startTimestamp: js.Date,
    workflowType: WorkflowType
  ): WorkflowExecutionInfo = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any], executionStatus = executionStatus.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionInfo]
  }
  @scala.inline
  implicit class WorkflowExecutionInfoOps[Self <: WorkflowExecutionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecution(value: WorkflowExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionStatus(value: ExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowType(value: WorkflowType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelRequested(value: Canceled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelRequested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelRequested")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseStatus(value: CloseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: WorkflowExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withTagList(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagList")(js.undefined)
        ret
    }
  }
  
}


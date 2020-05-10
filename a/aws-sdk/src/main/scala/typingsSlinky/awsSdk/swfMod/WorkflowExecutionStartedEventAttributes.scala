package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionStartedEventAttributes extends js.Object {
  /**
    * The policy to use for the child workflow executions if this workflow execution is terminated, by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy = js.native
  /**
    * If this workflow execution was started due to a ContinueAsNewWorkflowExecution decision, then it contains the runId of the previous workflow execution that was closed and continued as this execution.
    */
  var continuedExecutionRunId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    * The maximum duration for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The input provided to the workflow execution.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The IAM role attached to the workflow execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.native
  /**
    * The ID of the StartChildWorkflowExecutionInitiated event corresponding to the StartChildWorkflowExecution Decision to start this workflow execution. The source event with this ID can be found in the history of the source workflow execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var parentInitiatedEventId: js.UndefOr[EventId] = js.native
  /**
    * The source workflow execution that started this workflow execution. The member isn't set if the workflow execution was not started by a workflow.
    */
  var parentWorkflowExecution: js.UndefOr[WorkflowExecution] = js.native
  /**
    * The list of tags associated with this workflow execution. An execution can have up to 5 tags.
    */
  var tagList: js.UndefOr[TagList] = js.native
  /**
    * The name of the task list for scheduling the decision tasks for this workflow execution.
    */
  var taskList: TaskList = js.native
  /**
    * The priority of the decision tasks in the workflow execution.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
  /**
    * The maximum duration of decision tasks for this workflow type. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The workflow type of this execution.
    */
  var workflowType: WorkflowType = js.native
}

object WorkflowExecutionStartedEventAttributes {
  @scala.inline
  def apply(childPolicy: ChildPolicy, taskList: TaskList, workflowType: WorkflowType): WorkflowExecutionStartedEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionStartedEventAttributes]
  }
  @scala.inline
  implicit class WorkflowExecutionStartedEventAttributesOps[Self <: WorkflowExecutionStartedEventAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildPolicy(value: ChildPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskList(value: TaskList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowType(value: WorkflowType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinuedExecutionRunId(value: WorkflowRunIdOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuedExecutionRunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuedExecutionRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuedExecutionRunId")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionStartToCloseTimeout(value: DurationInSecondsOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStartToCloseTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionStartToCloseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStartToCloseTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: Data): Self = {
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
    def withLambdaRole(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaRole")(js.undefined)
        ret
    }
    @scala.inline
    def withParentInitiatedEventId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentInitiatedEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentInitiatedEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentInitiatedEventId")(js.undefined)
        ret
    }
    @scala.inline
    def withParentWorkflowExecution(value: WorkflowExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentWorkflowExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentWorkflowExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentWorkflowExecution")(js.undefined)
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
    @scala.inline
    def withTaskPriority(value: TaskPriority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskPriority")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskStartToCloseTimeout(value: DurationInSecondsOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStartToCloseTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskStartToCloseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStartToCloseTimeout")(js.undefined)
        ret
    }
  }
  
}


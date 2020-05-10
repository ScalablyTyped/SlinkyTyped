package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartChildWorkflowExecutionInitiatedEventAttributes extends js.Object {
  /**
    * The policy to use for the child workflow executions if this execution gets terminated by explicitly calling the TerminateWorkflowExecution action or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy = js.native
  /**
    * Data attached to the event that can be used by the decider in subsequent decision tasks. This data isn't sent to the activity.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the StartChildWorkflowExecution Decision to request this child workflow execution. This information can be useful for diagnosing problems by tracing back the cause of events.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  /**
    * The maximum duration for the child workflow execution. If the workflow execution isn't closed within this duration, it is timed out and force-terminated. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The inputs provided to the child workflow execution.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The IAM role to attach to the child workflow execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.native
  /**
    * The list of tags to associated with the child workflow execution.
    */
  var tagList: js.UndefOr[TagList] = js.native
  /**
    * The name of the task list used for the decision tasks of the child workflow execution.
    */
  var taskList: TaskList = js.native
  /**
    *  The priority assigned for the decision tasks for this workflow execution. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
  /**
    * The maximum duration allowed for the decision tasks for this workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  /**
    * The workflowId of the child workflow execution.
    */
  var workflowId: WorkflowId = js.native
  /**
    * The type of the child workflow execution.
    */
  var workflowType: WorkflowType = js.native
}

object StartChildWorkflowExecutionInitiatedEventAttributes {
  @scala.inline
  def apply(
    childPolicy: ChildPolicy,
    decisionTaskCompletedEventId: EventId,
    taskList: TaskList,
    workflowId: WorkflowId,
    workflowType: WorkflowType
  ): StartChildWorkflowExecutionInitiatedEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChildWorkflowExecutionInitiatedEventAttributes]
  }
  @scala.inline
  implicit class StartChildWorkflowExecutionInitiatedEventAttributesOps[Self <: StartChildWorkflowExecutionInitiatedEventAttributes] (val x: Self) extends AnyVal {
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
    def withDecisionTaskCompletedEventId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionTaskCompletedEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskList(value: TaskList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowId(value: WorkflowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowType(value: WorkflowType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControl(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
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


package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowExecutionContinuedAsNewEventAttributes extends StObject {
  
  /**
    * The policy to use for the child workflow executions of the new execution if it is terminated by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var childPolicy: ChildPolicy = js.native
  
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the ContinueAsNewWorkflowExecution decision that started this execution. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  
  /**
    * The total duration allowed for the new workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var executionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  
  /**
    * The input provided to the new workflow execution.
    */
  var input: js.UndefOr[Data] = js.native
  
  /**
    * The IAM role to attach to the new (continued) workflow execution.
    */
  var lambdaRole: js.UndefOr[Arn] = js.native
  
  /**
    * The runId of the new workflow execution.
    */
  var newExecutionRunId: WorkflowRunId = js.native
  
  /**
    * The list of tags associated with the new workflow execution.
    */
  var tagList: js.UndefOr[TagList] = js.native
  
  /**
    * The task list to use for the decisions of the new (continued) workflow execution.
    */
  var taskList: TaskList = js.native
  
  /**
    * The priority of the task to use for the decisions of the new (continued) workflow execution.
    */
  var taskPriority: js.UndefOr[TaskPriority] = js.native
  
  /**
    * The maximum duration of decision tasks for the new workflow execution. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var taskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  
  /**
    * The workflow type of this execution.
    */
  var workflowType: WorkflowType = js.native
}
object WorkflowExecutionContinuedAsNewEventAttributes {
  
  @scala.inline
  def apply(
    childPolicy: ChildPolicy,
    decisionTaskCompletedEventId: EventId,
    newExecutionRunId: WorkflowRunId,
    taskList: TaskList,
    workflowType: WorkflowType
  ): WorkflowExecutionContinuedAsNewEventAttributes = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any], decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], newExecutionRunId = newExecutionRunId.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionContinuedAsNewEventAttributes]
  }
  
  @scala.inline
  implicit class WorkflowExecutionContinuedAsNewEventAttributesMutableBuilder[Self <: WorkflowExecutionContinuedAsNewEventAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildPolicy(value: ChildPolicy): Self = StObject.set(x, "childPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecisionTaskCompletedEventId(value: EventId): Self = StObject.set(x, "decisionTaskCompletedEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStartToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "executionStartToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStartToCloseTimeoutUndefined: Self = StObject.set(x, "executionStartToCloseTimeout", js.undefined)
    
    @scala.inline
    def setInput(value: Data): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setLambdaRole(value: Arn): Self = StObject.set(x, "lambdaRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaRoleUndefined: Self = StObject.set(x, "lambdaRole", js.undefined)
    
    @scala.inline
    def setNewExecutionRunId(value: WorkflowRunId): Self = StObject.set(x, "newExecutionRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "tagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListUndefined: Self = StObject.set(x, "tagList", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "tagList", js.Array(value :_*))
    
    @scala.inline
    def setTaskList(value: TaskList): Self = StObject.set(x, "taskList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskPriority(value: TaskPriority): Self = StObject.set(x, "taskPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskPriorityUndefined: Self = StObject.set(x, "taskPriority", js.undefined)
    
    @scala.inline
    def setTaskStartToCloseTimeout(value: DurationInSecondsOptional): Self = StObject.set(x, "taskStartToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStartToCloseTimeoutUndefined: Self = StObject.set(x, "taskStartToCloseTimeout", js.undefined)
    
    @scala.inline
    def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
  }
}

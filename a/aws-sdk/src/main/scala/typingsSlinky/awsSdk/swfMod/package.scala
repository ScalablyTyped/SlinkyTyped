package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object swfMod {
  
  type ActivityId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.START_TO_CLOSE
    - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULE_TO_START
    - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULE_TO_CLOSE
    - typingsSlinky.awsSdk.awsSdkStrings.HEARTBEAT
    - java.lang.String
  */
  type ActivityTaskTimeoutType = typingsSlinky.awsSdk.swfMod._ActivityTaskTimeoutType | java.lang.String
  
  type ActivityTypeInfoList = js.Array[typingsSlinky.awsSdk.swfMod.ActivityTypeInfo]
  
  type Arn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TIMER_ID_UNKNOWN
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CancelTimerFailedCause = typingsSlinky.awsSdk.swfMod._CancelTimerFailedCause | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNHANDLED_DECISION
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CancelWorkflowExecutionFailedCause = typingsSlinky.awsSdk.swfMod._CancelWorkflowExecutionFailedCause | java.lang.String
  
  type Canceled = scala.Boolean
  
  type CauseMessage = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE
    - typingsSlinky.awsSdk.awsSdkStrings.REQUEST_CANCEL
    - typingsSlinky.awsSdk.awsSdkStrings.ABANDON
    - java.lang.String
  */
  type ChildPolicy = typingsSlinky.awsSdk.swfMod._ChildPolicy | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.swfMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
    - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
    - typingsSlinky.awsSdk.awsSdkStrings.CONTINUED_AS_NEW
    - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
    - java.lang.String
  */
  type CloseStatus = typingsSlinky.awsSdk.swfMod._CloseStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNHANDLED_DECISION
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type CompleteWorkflowExecutionFailedCause = typingsSlinky.awsSdk.swfMod._CompleteWorkflowExecutionFailedCause | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNHANDLED_DECISION
    - typingsSlinky.awsSdk.awsSdkStrings.WORKFLOW_TYPE_DEPRECATED
    - typingsSlinky.awsSdk.awsSdkStrings.WORKFLOW_TYPE_DOES_NOT_EXIST
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_TASK_LIST_UNDEFINED
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_CHILD_POLICY_UNDEFINED
    - typingsSlinky.awsSdk.awsSdkStrings.CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type ContinueAsNewWorkflowExecutionFailedCause = typingsSlinky.awsSdk.swfMod._ContinueAsNewWorkflowExecutionFailedCause | java.lang.String
  
  type Count = scala.Double
  
  type Data = java.lang.String
  
  type DecisionList = js.Array[typingsSlinky.awsSdk.swfMod.Decision]
  
  type DecisionTaskTimeoutType = typingsSlinky.awsSdk.awsSdkStrings.START_TO_CLOSE | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ScheduleActivityTask
    - typingsSlinky.awsSdk.awsSdkStrings.RequestCancelActivityTask
    - typingsSlinky.awsSdk.awsSdkStrings.CompleteWorkflowExecution
    - typingsSlinky.awsSdk.awsSdkStrings.FailWorkflowExecution
    - typingsSlinky.awsSdk.awsSdkStrings.CancelWorkflowExecution
    - typingsSlinky.awsSdk.awsSdkStrings.ContinueAsNewWorkflowExecution
    - typingsSlinky.awsSdk.awsSdkStrings.RecordMarker
    - typingsSlinky.awsSdk.awsSdkStrings.StartTimer
    - typingsSlinky.awsSdk.awsSdkStrings.CancelTimer
    - typingsSlinky.awsSdk.awsSdkStrings.SignalExternalWorkflowExecution
    - typingsSlinky.awsSdk.awsSdkStrings.RequestCancelExternalWorkflowExecution
    - typingsSlinky.awsSdk.awsSdkStrings.StartChildWorkflowExecution
    - typingsSlinky.awsSdk.awsSdkStrings.ScheduleLambdaFunction
    - java.lang.String
  */
  type DecisionType = typingsSlinky.awsSdk.swfMod._DecisionType | java.lang.String
  
  type Description = java.lang.String
  
  type DomainInfoList = js.Array[typingsSlinky.awsSdk.swfMod.DomainInfo]
  
  type DomainName = java.lang.String
  
  type DurationInDays = java.lang.String
  
  type DurationInSeconds = java.lang.String
  
  type DurationInSecondsOptional = java.lang.String
  
  type EventId = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WorkflowExecutionStarted
    - typingsSlinky.awsSdk.awsSdkStrings.WorkflowExecutionCancelRequested
    - typingsSlinky.awsSdk.awsSdkStrings.WorkflowExecutionCompleted
    - typingsSlinky.awsSdk.awsSdkStrings.CompleteWorkflowExecutionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.WorkflowExecutionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.FailWorkflowExecutionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.WorkflowExecutionTimedOut
    - typingsSlinky.awsSdk.awsSdkStrings.WorkflowExecutionCanceled
    - typingsSlinky.awsSdk.awsSdkStrings.CancelWorkflowExecutionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.WorkflowExecutionContinuedAsNew
    - typingsSlinky.awsSdk.awsSdkStrings.ContinueAsNewWorkflowExecutionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.WorkflowExecutionTerminated
    - typingsSlinky.awsSdk.awsSdkStrings.DecisionTaskScheduled
    - typingsSlinky.awsSdk.awsSdkStrings.DecisionTaskStarted
    - typingsSlinky.awsSdk.awsSdkStrings.DecisionTaskCompleted
    - typingsSlinky.awsSdk.awsSdkStrings.DecisionTaskTimedOut
    - typingsSlinky.awsSdk.awsSdkStrings.ActivityTaskScheduled
    - typingsSlinky.awsSdk.awsSdkStrings.ScheduleActivityTaskFailed
    - typingsSlinky.awsSdk.awsSdkStrings.ActivityTaskStarted
    - typingsSlinky.awsSdk.awsSdkStrings.ActivityTaskCompleted
    - typingsSlinky.awsSdk.awsSdkStrings.ActivityTaskFailed
    - typingsSlinky.awsSdk.awsSdkStrings.ActivityTaskTimedOut
    - typingsSlinky.awsSdk.awsSdkStrings.ActivityTaskCanceled
    - typingsSlinky.awsSdk.awsSdkStrings.ActivityTaskCancelRequested
    - typingsSlinky.awsSdk.awsSdkStrings.RequestCancelActivityTaskFailed
    - typingsSlinky.awsSdk.awsSdkStrings.WorkflowExecutionSignaled
    - typingsSlinky.awsSdk.awsSdkStrings.MarkerRecorded
    - typingsSlinky.awsSdk.awsSdkStrings.RecordMarkerFailed
    - typingsSlinky.awsSdk.awsSdkStrings.TimerStarted
    - typingsSlinky.awsSdk.awsSdkStrings.StartTimerFailed
    - typingsSlinky.awsSdk.awsSdkStrings.TimerFired
    - typingsSlinky.awsSdk.awsSdkStrings.TimerCanceled
    - typingsSlinky.awsSdk.awsSdkStrings.CancelTimerFailed
    - typingsSlinky.awsSdk.awsSdkStrings.StartChildWorkflowExecutionInitiated
    - typingsSlinky.awsSdk.awsSdkStrings.StartChildWorkflowExecutionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.ChildWorkflowExecutionStarted
    - typingsSlinky.awsSdk.awsSdkStrings.ChildWorkflowExecutionCompleted
    - typingsSlinky.awsSdk.awsSdkStrings.ChildWorkflowExecutionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.ChildWorkflowExecutionTimedOut
    - typingsSlinky.awsSdk.awsSdkStrings.ChildWorkflowExecutionCanceled
    - typingsSlinky.awsSdk.awsSdkStrings.ChildWorkflowExecutionTerminated
    - typingsSlinky.awsSdk.awsSdkStrings.SignalExternalWorkflowExecutionInitiated
    - typingsSlinky.awsSdk.awsSdkStrings.SignalExternalWorkflowExecutionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.ExternalWorkflowExecutionSignaled
    - typingsSlinky.awsSdk.awsSdkStrings.RequestCancelExternalWorkflowExecutionInitiated
    - typingsSlinky.awsSdk.awsSdkStrings.RequestCancelExternalWorkflowExecutionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.ExternalWorkflowExecutionCancelRequested
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaFunctionScheduled
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaFunctionStarted
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaFunctionCompleted
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaFunctionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaFunctionTimedOut
    - typingsSlinky.awsSdk.awsSdkStrings.ScheduleLambdaFunctionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.StartLambdaFunctionFailed
    - java.lang.String
  */
  type EventType = typingsSlinky.awsSdk.swfMod._EventType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OPEN
    - typingsSlinky.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type ExecutionStatus = typingsSlinky.awsSdk.swfMod._ExecutionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNHANDLED_DECISION
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type FailWorkflowExecutionFailedCause = typingsSlinky.awsSdk.swfMod._FailWorkflowExecutionFailedCause | java.lang.String
  
  type FailureReason = java.lang.String
  
  type FunctionId = java.lang.String
  
  type FunctionInput = java.lang.String
  
  type FunctionName = java.lang.String
  
  type HistoryEventList = js.Array[typingsSlinky.awsSdk.swfMod.HistoryEvent]
  
  type Identity = java.lang.String
  
  type LambdaFunctionTimeoutType = typingsSlinky.awsSdk.awsSdkStrings.START_TO_CLOSE | java.lang.String
  
  type LimitedData = java.lang.String
  
  type MarkerName = java.lang.String
  
  type Name = java.lang.String
  
  type OpenDecisionTasksCount = scala.Double
  
  type PageSize = scala.Double
  
  type PageToken = java.lang.String
  
  type RecordMarkerFailedCause = typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REGISTERED
    - typingsSlinky.awsSdk.awsSdkStrings.DEPRECATED
    - java.lang.String
  */
  type RegistrationStatus = typingsSlinky.awsSdk.swfMod._RegistrationStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVITY_ID_UNKNOWN
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type RequestCancelActivityTaskFailedCause = typingsSlinky.awsSdk.swfMod._RequestCancelActivityTaskFailedCause | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
    - typingsSlinky.awsSdk.awsSdkStrings.REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type RequestCancelExternalWorkflowExecutionFailedCause = typingsSlinky.awsSdk.swfMod._RequestCancelExternalWorkflowExecutionFailedCause | java.lang.String
  
  type ResourceTagKey = java.lang.String
  
  type ResourceTagKeyList = js.Array[typingsSlinky.awsSdk.swfMod.ResourceTagKey]
  
  type ResourceTagList = js.Array[typingsSlinky.awsSdk.swfMod.ResourceTag]
  
  type ResourceTagValue = java.lang.String
  
  type ReverseOrder = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVITY_TYPE_DEPRECATED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVITY_TYPE_DOES_NOT_EXIST
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVITY_ID_ALREADY_IN_USE
    - typingsSlinky.awsSdk.awsSdkStrings.OPEN_ACTIVITIES_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVITY_CREATION_RATE_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_TASK_LIST_UNDEFINED
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type ScheduleActivityTaskFailedCause = typingsSlinky.awsSdk.swfMod._ScheduleActivityTaskFailedCause | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ID_ALREADY_IN_USE
    - typingsSlinky.awsSdk.awsSdkStrings.OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION
    - java.lang.String
  */
  type ScheduleLambdaFunctionFailedCause = typingsSlinky.awsSdk.swfMod._ScheduleLambdaFunctionFailedCause | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION
    - typingsSlinky.awsSdk.awsSdkStrings.SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type SignalExternalWorkflowExecutionFailedCause = typingsSlinky.awsSdk.swfMod._SignalExternalWorkflowExecutionFailedCause | java.lang.String
  
  type SignalName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WORKFLOW_TYPE_DOES_NOT_EXIST
    - typingsSlinky.awsSdk.awsSdkStrings.WORKFLOW_TYPE_DEPRECATED
    - typingsSlinky.awsSdk.awsSdkStrings.OPEN_CHILDREN_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.OPEN_WORKFLOWS_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.CHILD_CREATION_RATE_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.WORKFLOW_ALREADY_RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_TASK_LIST_UNDEFINED
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT_CHILD_POLICY_UNDEFINED
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type StartChildWorkflowExecutionFailedCause = typingsSlinky.awsSdk.swfMod._StartChildWorkflowExecutionFailedCause | java.lang.String
  
  type StartLambdaFunctionFailedCause = typingsSlinky.awsSdk.awsSdkStrings.ASSUME_ROLE_FAILED | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TIMER_ID_ALREADY_IN_USE
    - typingsSlinky.awsSdk.awsSdkStrings.OPEN_TIMERS_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMER_CREATION_RATE_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATION_NOT_PERMITTED
    - java.lang.String
  */
  type StartTimerFailedCause = typingsSlinky.awsSdk.swfMod._StartTimerFailedCause | java.lang.String
  
  type Tag = java.lang.String
  
  type TagList = js.Array[typingsSlinky.awsSdk.swfMod.Tag]
  
  type TaskPriority = java.lang.String
  
  type TaskToken = java.lang.String
  
  type TerminateReason = java.lang.String
  
  type TimerId = java.lang.String
  
  type Timestamp = js.Date
  
  type Truncated = scala.Boolean
  
  type Version = java.lang.String
  
  type VersionOptional = java.lang.String
  
  type WorkflowExecutionCancelRequestedCause = typingsSlinky.awsSdk.awsSdkStrings.CHILD_POLICY_APPLIED | java.lang.String
  
  type WorkflowExecutionInfoList = js.Array[typingsSlinky.awsSdk.swfMod.WorkflowExecutionInfo]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CHILD_POLICY_APPLIED
    - typingsSlinky.awsSdk.awsSdkStrings.EVENT_LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.OPERATOR_INITIATED
    - java.lang.String
  */
  type WorkflowExecutionTerminatedCause = typingsSlinky.awsSdk.swfMod._WorkflowExecutionTerminatedCause | java.lang.String
  
  type WorkflowExecutionTimeoutType = typingsSlinky.awsSdk.awsSdkStrings.START_TO_CLOSE | java.lang.String
  
  type WorkflowId = java.lang.String
  
  type WorkflowRunId = java.lang.String
  
  type WorkflowRunIdOptional = java.lang.String
  
  type WorkflowTypeInfoList = js.Array[typingsSlinky.awsSdk.swfMod.WorkflowTypeInfo]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2012-01-25`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.swfMod._apiVersion | java.lang.String
}

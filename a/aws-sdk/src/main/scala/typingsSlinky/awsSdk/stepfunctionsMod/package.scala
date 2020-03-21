package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stepfunctionsMod {
  type ActivityList = js.Array[typingsSlinky.awsSdk.stepfunctionsMod.ActivityListItem]
  type Arn = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.stepfunctionsMod.ClientApiVersions
  type ConnectorParameters = java.lang.String
  type Definition = java.lang.String
  type EventId = scala.Double
  type ExecutionList = js.Array[typingsSlinky.awsSdk.stepfunctionsMod.ExecutionListItem]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.ABORTED
    - java.lang.String
  */
  type ExecutionStatus = typingsSlinky.awsSdk.stepfunctionsMod._ExecutionStatus | java.lang.String
  type HistoryEventList = js.Array[typingsSlinky.awsSdk.stepfunctionsMod.HistoryEvent]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ActivityFailed
    - typingsSlinky.awsSdk.awsSdkStrings.ActivityScheduled
    - typingsSlinky.awsSdk.awsSdkStrings.ActivityScheduleFailed
    - typingsSlinky.awsSdk.awsSdkStrings.ActivityStarted
    - typingsSlinky.awsSdk.awsSdkStrings.ActivitySucceeded
    - typingsSlinky.awsSdk.awsSdkStrings.ActivityTimedOut
    - typingsSlinky.awsSdk.awsSdkStrings.ChoiceStateEntered
    - typingsSlinky.awsSdk.awsSdkStrings.ChoiceStateExited
    - typingsSlinky.awsSdk.awsSdkStrings.ExecutionAborted
    - typingsSlinky.awsSdk.awsSdkStrings.ExecutionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.ExecutionStarted
    - typingsSlinky.awsSdk.awsSdkStrings.ExecutionSucceeded
    - typingsSlinky.awsSdk.awsSdkStrings.ExecutionTimedOut
    - typingsSlinky.awsSdk.awsSdkStrings.FailStateEntered
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaFunctionFailed
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaFunctionScheduled
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaFunctionScheduleFailed
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaFunctionStarted
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaFunctionStartFailed
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaFunctionSucceeded
    - typingsSlinky.awsSdk.awsSdkStrings.LambdaFunctionTimedOut
    - typingsSlinky.awsSdk.awsSdkStrings.MapIterationAborted
    - typingsSlinky.awsSdk.awsSdkStrings.MapIterationFailed
    - typingsSlinky.awsSdk.awsSdkStrings.MapIterationStarted
    - typingsSlinky.awsSdk.awsSdkStrings.MapIterationSucceeded
    - typingsSlinky.awsSdk.awsSdkStrings.MapStateAborted
    - typingsSlinky.awsSdk.awsSdkStrings.MapStateEntered
    - typingsSlinky.awsSdk.awsSdkStrings.MapStateExited
    - typingsSlinky.awsSdk.awsSdkStrings.MapStateFailed
    - typingsSlinky.awsSdk.awsSdkStrings.MapStateStarted
    - typingsSlinky.awsSdk.awsSdkStrings.MapStateSucceeded
    - typingsSlinky.awsSdk.awsSdkStrings.ParallelStateAborted
    - typingsSlinky.awsSdk.awsSdkStrings.ParallelStateEntered
    - typingsSlinky.awsSdk.awsSdkStrings.ParallelStateExited
    - typingsSlinky.awsSdk.awsSdkStrings.ParallelStateFailed
    - typingsSlinky.awsSdk.awsSdkStrings.ParallelStateStarted
    - typingsSlinky.awsSdk.awsSdkStrings.ParallelStateSucceeded
    - typingsSlinky.awsSdk.awsSdkStrings.PassStateEntered
    - typingsSlinky.awsSdk.awsSdkStrings.PassStateExited
    - typingsSlinky.awsSdk.awsSdkStrings.SucceedStateEntered
    - typingsSlinky.awsSdk.awsSdkStrings.SucceedStateExited
    - typingsSlinky.awsSdk.awsSdkStrings.TaskFailed
    - typingsSlinky.awsSdk.awsSdkStrings.TaskScheduled
    - typingsSlinky.awsSdk.awsSdkStrings.TaskStarted
    - typingsSlinky.awsSdk.awsSdkStrings.TaskStartFailed
    - typingsSlinky.awsSdk.awsSdkStrings.TaskStateAborted
    - typingsSlinky.awsSdk.awsSdkStrings.TaskStateEntered
    - typingsSlinky.awsSdk.awsSdkStrings.TaskStateExited
    - typingsSlinky.awsSdk.awsSdkStrings.TaskSubmitFailed
    - typingsSlinky.awsSdk.awsSdkStrings.TaskSubmitted
    - typingsSlinky.awsSdk.awsSdkStrings.TaskSucceeded
    - typingsSlinky.awsSdk.awsSdkStrings.TaskTimedOut
    - typingsSlinky.awsSdk.awsSdkStrings.WaitStateAborted
    - typingsSlinky.awsSdk.awsSdkStrings.WaitStateEntered
    - typingsSlinky.awsSdk.awsSdkStrings.WaitStateExited
    - java.lang.String
  */
  type HistoryEventType = typingsSlinky.awsSdk.stepfunctionsMod._HistoryEventType | java.lang.String
  type Identity = java.lang.String
  type IncludeExecutionData = scala.Boolean
  type ListExecutionsPageToken = java.lang.String
  type LogDestinationList = js.Array[typingsSlinky.awsSdk.stepfunctionsMod.LogDestination]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.FATAL
    - typingsSlinky.awsSdk.awsSdkStrings.OFF
    - java.lang.String
  */
  type LogLevel = typingsSlinky.awsSdk.stepfunctionsMod._LogLevel | java.lang.String
  type Name = java.lang.String
  type PageSize = scala.Double
  type PageToken = java.lang.String
  type ReverseOrder = scala.Boolean
  type SensitiveCause = java.lang.String
  type SensitiveData = java.lang.String
  type SensitiveDataJobInput = java.lang.String
  type SensitiveError = java.lang.String
  type StateMachineList = js.Array[typingsSlinky.awsSdk.stepfunctionsMod.StateMachineListItem]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type StateMachineStatus = typingsSlinky.awsSdk.stepfunctionsMod._StateMachineStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.EXPRESS
    - java.lang.String
  */
  type StateMachineType = typingsSlinky.awsSdk.stepfunctionsMod._StateMachineType | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.stepfunctionsMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.stepfunctionsMod.Tag]
  type TagValue = java.lang.String
  type TaskToken = java.lang.String
  type TimeoutInSeconds = scala.Double
  type Timestamp = js.Date
  type UnsignedInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-11-23`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.stepfunctionsMod._apiVersion | java.lang.String
}

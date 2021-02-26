package typingsSlinky.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryEvent extends StObject {
  
  /**
    * If the event is of type ActivityTaskcancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskCancelRequestedEventAttributes: js.UndefOr[ActivityTaskCancelRequestedEventAttributes] = js.native
  
  /**
    * If the event is of type ActivityTaskCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskCanceledEventAttributes: js.UndefOr[ActivityTaskCanceledEventAttributes] = js.native
  
  /**
    * If the event is of type ActivityTaskCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskCompletedEventAttributes: js.UndefOr[ActivityTaskCompletedEventAttributes] = js.native
  
  /**
    * If the event is of type ActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskFailedEventAttributes: js.UndefOr[ActivityTaskFailedEventAttributes] = js.native
  
  /**
    * If the event is of type ActivityTaskScheduled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskScheduledEventAttributes: js.UndefOr[ActivityTaskScheduledEventAttributes] = js.native
  
  /**
    * If the event is of type ActivityTaskStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskStartedEventAttributes: js.UndefOr[ActivityTaskStartedEventAttributes] = js.native
  
  /**
    * If the event is of type ActivityTaskTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var activityTaskTimedOutEventAttributes: js.UndefOr[ActivityTaskTimedOutEventAttributes] = js.native
  
  /**
    * If the event is of type CancelTimerFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var cancelTimerFailedEventAttributes: js.UndefOr[CancelTimerFailedEventAttributes] = js.native
  
  /**
    * If the event is of type CancelWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var cancelWorkflowExecutionFailedEventAttributes: js.UndefOr[CancelWorkflowExecutionFailedEventAttributes] = js.native
  
  /**
    * If the event is of type ChildWorkflowExecutionCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionCanceledEventAttributes: js.UndefOr[ChildWorkflowExecutionCanceledEventAttributes] = js.native
  
  /**
    * If the event is of type ChildWorkflowExecutionCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionCompletedEventAttributes: js.UndefOr[ChildWorkflowExecutionCompletedEventAttributes] = js.native
  
  /**
    * If the event is of type ChildWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionFailedEventAttributes: js.UndefOr[ChildWorkflowExecutionFailedEventAttributes] = js.native
  
  /**
    * If the event is of type ChildWorkflowExecutionStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionStartedEventAttributes: js.UndefOr[ChildWorkflowExecutionStartedEventAttributes] = js.native
  
  /**
    * If the event is of type ChildWorkflowExecutionTerminated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionTerminatedEventAttributes: js.UndefOr[ChildWorkflowExecutionTerminatedEventAttributes] = js.native
  
  /**
    * If the event is of type ChildWorkflowExecutionTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var childWorkflowExecutionTimedOutEventAttributes: js.UndefOr[ChildWorkflowExecutionTimedOutEventAttributes] = js.native
  
  /**
    * If the event is of type CompleteWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var completeWorkflowExecutionFailedEventAttributes: js.UndefOr[CompleteWorkflowExecutionFailedEventAttributes] = js.native
  
  /**
    * If the event is of type ContinueAsNewWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var continueAsNewWorkflowExecutionFailedEventAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionFailedEventAttributes] = js.native
  
  /**
    * If the event is of type DecisionTaskCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskCompletedEventAttributes: js.UndefOr[DecisionTaskCompletedEventAttributes] = js.native
  
  /**
    * If the event is of type DecisionTaskScheduled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskScheduledEventAttributes: js.UndefOr[DecisionTaskScheduledEventAttributes] = js.native
  
  /**
    * If the event is of type DecisionTaskStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskStartedEventAttributes: js.UndefOr[DecisionTaskStartedEventAttributes] = js.native
  
  /**
    * If the event is of type DecisionTaskTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var decisionTaskTimedOutEventAttributes: js.UndefOr[DecisionTaskTimedOutEventAttributes] = js.native
  
  /**
    * The system generated ID of the event. This ID uniquely identifies the event with in the workflow execution history.
    */
  var eventId: EventId = js.native
  
  /**
    * The date and time when the event occurred.
    */
  var eventTimestamp: js.Date = js.native
  
  /**
    * The type of the history event.
    */
  var eventType: EventType = js.native
  
  /**
    * If the event is of type ExternalWorkflowExecutionCancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types. 
    */
  var externalWorkflowExecutionCancelRequestedEventAttributes: js.UndefOr[ExternalWorkflowExecutionCancelRequestedEventAttributes] = js.native
  
  /**
    * If the event is of type ExternalWorkflowExecutionSignaled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var externalWorkflowExecutionSignaledEventAttributes: js.UndefOr[ExternalWorkflowExecutionSignaledEventAttributes] = js.native
  
  /**
    * If the event is of type FailWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var failWorkflowExecutionFailedEventAttributes: js.UndefOr[FailWorkflowExecutionFailedEventAttributes] = js.native
  
  /**
    * Provides the details of the LambdaFunctionCompleted event. It isn't set for other event types.
    */
  var lambdaFunctionCompletedEventAttributes: js.UndefOr[LambdaFunctionCompletedEventAttributes] = js.native
  
  /**
    * Provides the details of the LambdaFunctionFailed event. It isn't set for other event types.
    */
  var lambdaFunctionFailedEventAttributes: js.UndefOr[LambdaFunctionFailedEventAttributes] = js.native
  
  /**
    * Provides the details of the LambdaFunctionScheduled event. It isn't set for other event types.
    */
  var lambdaFunctionScheduledEventAttributes: js.UndefOr[LambdaFunctionScheduledEventAttributes] = js.native
  
  /**
    * Provides the details of the LambdaFunctionStarted event. It isn't set for other event types.
    */
  var lambdaFunctionStartedEventAttributes: js.UndefOr[LambdaFunctionStartedEventAttributes] = js.native
  
  /**
    * Provides the details of the LambdaFunctionTimedOut event. It isn't set for other event types.
    */
  var lambdaFunctionTimedOutEventAttributes: js.UndefOr[LambdaFunctionTimedOutEventAttributes] = js.native
  
  /**
    * If the event is of type MarkerRecorded then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var markerRecordedEventAttributes: js.UndefOr[MarkerRecordedEventAttributes] = js.native
  
  /**
    * If the event is of type DecisionTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var recordMarkerFailedEventAttributes: js.UndefOr[RecordMarkerFailedEventAttributes] = js.native
  
  /**
    * If the event is of type RequestCancelActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var requestCancelActivityTaskFailedEventAttributes: js.UndefOr[RequestCancelActivityTaskFailedEventAttributes] = js.native
  
  /**
    * If the event is of type RequestCancelExternalWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var requestCancelExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionFailedEventAttributes] = js.native
  
  /**
    * If the event is of type RequestCancelExternalWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var requestCancelExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionInitiatedEventAttributes] = js.native
  
  /**
    * If the event is of type ScheduleActivityTaskFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var scheduleActivityTaskFailedEventAttributes: js.UndefOr[ScheduleActivityTaskFailedEventAttributes] = js.native
  
  /**
    * Provides the details of the ScheduleLambdaFunctionFailed event. It isn't set for other event types.
    */
  var scheduleLambdaFunctionFailedEventAttributes: js.UndefOr[ScheduleLambdaFunctionFailedEventAttributes] = js.native
  
  /**
    * If the event is of type SignalExternalWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var signalExternalWorkflowExecutionFailedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionFailedEventAttributes] = js.native
  
  /**
    * If the event is of type SignalExternalWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var signalExternalWorkflowExecutionInitiatedEventAttributes: js.UndefOr[SignalExternalWorkflowExecutionInitiatedEventAttributes] = js.native
  
  /**
    * If the event is of type StartChildWorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var startChildWorkflowExecutionFailedEventAttributes: js.UndefOr[StartChildWorkflowExecutionFailedEventAttributes] = js.native
  
  /**
    * If the event is of type StartChildWorkflowExecutionInitiated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var startChildWorkflowExecutionInitiatedEventAttributes: js.UndefOr[StartChildWorkflowExecutionInitiatedEventAttributes] = js.native
  
  /**
    * Provides the details of the StartLambdaFunctionFailed event. It isn't set for other event types.
    */
  var startLambdaFunctionFailedEventAttributes: js.UndefOr[StartLambdaFunctionFailedEventAttributes] = js.native
  
  /**
    * If the event is of type StartTimerFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var startTimerFailedEventAttributes: js.UndefOr[StartTimerFailedEventAttributes] = js.native
  
  /**
    * If the event is of type TimerCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var timerCanceledEventAttributes: js.UndefOr[TimerCanceledEventAttributes] = js.native
  
  /**
    * If the event is of type TimerFired then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var timerFiredEventAttributes: js.UndefOr[TimerFiredEventAttributes] = js.native
  
  /**
    * If the event is of type TimerStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var timerStartedEventAttributes: js.UndefOr[TimerStartedEventAttributes] = js.native
  
  /**
    * If the event is of type WorkflowExecutionCancelRequested then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionCancelRequestedEventAttributes: js.UndefOr[WorkflowExecutionCancelRequestedEventAttributes] = js.native
  
  /**
    * If the event is of type WorkflowExecutionCanceled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionCanceledEventAttributes: js.UndefOr[WorkflowExecutionCanceledEventAttributes] = js.native
  
  /**
    * If the event is of type WorkflowExecutionCompleted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionCompletedEventAttributes: js.UndefOr[WorkflowExecutionCompletedEventAttributes] = js.native
  
  /**
    * If the event is of type WorkflowExecutionContinuedAsNew then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionContinuedAsNewEventAttributes: js.UndefOr[WorkflowExecutionContinuedAsNewEventAttributes] = js.native
  
  /**
    * If the event is of type WorkflowExecutionFailed then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionFailedEventAttributes: js.UndefOr[WorkflowExecutionFailedEventAttributes] = js.native
  
  /**
    * If the event is of type WorkflowExecutionSignaled then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionSignaledEventAttributes: js.UndefOr[WorkflowExecutionSignaledEventAttributes] = js.native
  
  /**
    * If the event is of type WorkflowExecutionStarted then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionStartedEventAttributes: js.UndefOr[WorkflowExecutionStartedEventAttributes] = js.native
  
  /**
    * If the event is of type WorkflowExecutionTerminated then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionTerminatedEventAttributes: js.UndefOr[WorkflowExecutionTerminatedEventAttributes] = js.native
  
  /**
    * If the event is of type WorkflowExecutionTimedOut then this member is set and provides detailed information about the event. It isn't set for other event types.
    */
  var workflowExecutionTimedOutEventAttributes: js.UndefOr[WorkflowExecutionTimedOutEventAttributes] = js.native
}
object HistoryEvent {
  
  @scala.inline
  def apply(eventId: EventId, eventTimestamp: js.Date, eventType: EventType): HistoryEvent = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], eventTimestamp = eventTimestamp.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryEvent]
  }
  
  @scala.inline
  implicit class HistoryEventMutableBuilder[Self <: HistoryEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityTaskCancelRequestedEventAttributes(value: ActivityTaskCancelRequestedEventAttributes): Self = StObject.set(x, "activityTaskCancelRequestedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTaskCancelRequestedEventAttributesUndefined: Self = StObject.set(x, "activityTaskCancelRequestedEventAttributes", js.undefined)
    
    @scala.inline
    def setActivityTaskCanceledEventAttributes(value: ActivityTaskCanceledEventAttributes): Self = StObject.set(x, "activityTaskCanceledEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTaskCanceledEventAttributesUndefined: Self = StObject.set(x, "activityTaskCanceledEventAttributes", js.undefined)
    
    @scala.inline
    def setActivityTaskCompletedEventAttributes(value: ActivityTaskCompletedEventAttributes): Self = StObject.set(x, "activityTaskCompletedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTaskCompletedEventAttributesUndefined: Self = StObject.set(x, "activityTaskCompletedEventAttributes", js.undefined)
    
    @scala.inline
    def setActivityTaskFailedEventAttributes(value: ActivityTaskFailedEventAttributes): Self = StObject.set(x, "activityTaskFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTaskFailedEventAttributesUndefined: Self = StObject.set(x, "activityTaskFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setActivityTaskScheduledEventAttributes(value: ActivityTaskScheduledEventAttributes): Self = StObject.set(x, "activityTaskScheduledEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTaskScheduledEventAttributesUndefined: Self = StObject.set(x, "activityTaskScheduledEventAttributes", js.undefined)
    
    @scala.inline
    def setActivityTaskStartedEventAttributes(value: ActivityTaskStartedEventAttributes): Self = StObject.set(x, "activityTaskStartedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTaskStartedEventAttributesUndefined: Self = StObject.set(x, "activityTaskStartedEventAttributes", js.undefined)
    
    @scala.inline
    def setActivityTaskTimedOutEventAttributes(value: ActivityTaskTimedOutEventAttributes): Self = StObject.set(x, "activityTaskTimedOutEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTaskTimedOutEventAttributesUndefined: Self = StObject.set(x, "activityTaskTimedOutEventAttributes", js.undefined)
    
    @scala.inline
    def setCancelTimerFailedEventAttributes(value: CancelTimerFailedEventAttributes): Self = StObject.set(x, "cancelTimerFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTimerFailedEventAttributesUndefined: Self = StObject.set(x, "cancelTimerFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setCancelWorkflowExecutionFailedEventAttributes(value: CancelWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "cancelWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "cancelWorkflowExecutionFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setChildWorkflowExecutionCanceledEventAttributes(value: ChildWorkflowExecutionCanceledEventAttributes): Self = StObject.set(x, "childWorkflowExecutionCanceledEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildWorkflowExecutionCanceledEventAttributesUndefined: Self = StObject.set(x, "childWorkflowExecutionCanceledEventAttributes", js.undefined)
    
    @scala.inline
    def setChildWorkflowExecutionCompletedEventAttributes(value: ChildWorkflowExecutionCompletedEventAttributes): Self = StObject.set(x, "childWorkflowExecutionCompletedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildWorkflowExecutionCompletedEventAttributesUndefined: Self = StObject.set(x, "childWorkflowExecutionCompletedEventAttributes", js.undefined)
    
    @scala.inline
    def setChildWorkflowExecutionFailedEventAttributes(value: ChildWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "childWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "childWorkflowExecutionFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setChildWorkflowExecutionStartedEventAttributes(value: ChildWorkflowExecutionStartedEventAttributes): Self = StObject.set(x, "childWorkflowExecutionStartedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildWorkflowExecutionStartedEventAttributesUndefined: Self = StObject.set(x, "childWorkflowExecutionStartedEventAttributes", js.undefined)
    
    @scala.inline
    def setChildWorkflowExecutionTerminatedEventAttributes(value: ChildWorkflowExecutionTerminatedEventAttributes): Self = StObject.set(x, "childWorkflowExecutionTerminatedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildWorkflowExecutionTerminatedEventAttributesUndefined: Self = StObject.set(x, "childWorkflowExecutionTerminatedEventAttributes", js.undefined)
    
    @scala.inline
    def setChildWorkflowExecutionTimedOutEventAttributes(value: ChildWorkflowExecutionTimedOutEventAttributes): Self = StObject.set(x, "childWorkflowExecutionTimedOutEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildWorkflowExecutionTimedOutEventAttributesUndefined: Self = StObject.set(x, "childWorkflowExecutionTimedOutEventAttributes", js.undefined)
    
    @scala.inline
    def setCompleteWorkflowExecutionFailedEventAttributes(value: CompleteWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "completeWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "completeWorkflowExecutionFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setContinueAsNewWorkflowExecutionFailedEventAttributes(value: ContinueAsNewWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "continueAsNewWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueAsNewWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "continueAsNewWorkflowExecutionFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setDecisionTaskCompletedEventAttributes(value: DecisionTaskCompletedEventAttributes): Self = StObject.set(x, "decisionTaskCompletedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecisionTaskCompletedEventAttributesUndefined: Self = StObject.set(x, "decisionTaskCompletedEventAttributes", js.undefined)
    
    @scala.inline
    def setDecisionTaskScheduledEventAttributes(value: DecisionTaskScheduledEventAttributes): Self = StObject.set(x, "decisionTaskScheduledEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecisionTaskScheduledEventAttributesUndefined: Self = StObject.set(x, "decisionTaskScheduledEventAttributes", js.undefined)
    
    @scala.inline
    def setDecisionTaskStartedEventAttributes(value: DecisionTaskStartedEventAttributes): Self = StObject.set(x, "decisionTaskStartedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecisionTaskStartedEventAttributesUndefined: Self = StObject.set(x, "decisionTaskStartedEventAttributes", js.undefined)
    
    @scala.inline
    def setDecisionTaskTimedOutEventAttributes(value: DecisionTaskTimedOutEventAttributes): Self = StObject.set(x, "decisionTaskTimedOutEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecisionTaskTimedOutEventAttributesUndefined: Self = StObject.set(x, "decisionTaskTimedOutEventAttributes", js.undefined)
    
    @scala.inline
    def setEventId(value: EventId): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimestamp(value: js.Date): Self = StObject.set(x, "eventTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventType(value: EventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalWorkflowExecutionCancelRequestedEventAttributes(value: ExternalWorkflowExecutionCancelRequestedEventAttributes): Self = StObject.set(x, "externalWorkflowExecutionCancelRequestedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalWorkflowExecutionCancelRequestedEventAttributesUndefined: Self = StObject.set(x, "externalWorkflowExecutionCancelRequestedEventAttributes", js.undefined)
    
    @scala.inline
    def setExternalWorkflowExecutionSignaledEventAttributes(value: ExternalWorkflowExecutionSignaledEventAttributes): Self = StObject.set(x, "externalWorkflowExecutionSignaledEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalWorkflowExecutionSignaledEventAttributesUndefined: Self = StObject.set(x, "externalWorkflowExecutionSignaledEventAttributes", js.undefined)
    
    @scala.inline
    def setFailWorkflowExecutionFailedEventAttributes(value: FailWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "failWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "failWorkflowExecutionFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setLambdaFunctionCompletedEventAttributes(value: LambdaFunctionCompletedEventAttributes): Self = StObject.set(x, "lambdaFunctionCompletedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionCompletedEventAttributesUndefined: Self = StObject.set(x, "lambdaFunctionCompletedEventAttributes", js.undefined)
    
    @scala.inline
    def setLambdaFunctionFailedEventAttributes(value: LambdaFunctionFailedEventAttributes): Self = StObject.set(x, "lambdaFunctionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionFailedEventAttributesUndefined: Self = StObject.set(x, "lambdaFunctionFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setLambdaFunctionScheduledEventAttributes(value: LambdaFunctionScheduledEventAttributes): Self = StObject.set(x, "lambdaFunctionScheduledEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionScheduledEventAttributesUndefined: Self = StObject.set(x, "lambdaFunctionScheduledEventAttributes", js.undefined)
    
    @scala.inline
    def setLambdaFunctionStartedEventAttributes(value: LambdaFunctionStartedEventAttributes): Self = StObject.set(x, "lambdaFunctionStartedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionStartedEventAttributesUndefined: Self = StObject.set(x, "lambdaFunctionStartedEventAttributes", js.undefined)
    
    @scala.inline
    def setLambdaFunctionTimedOutEventAttributes(value: LambdaFunctionTimedOutEventAttributes): Self = StObject.set(x, "lambdaFunctionTimedOutEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionTimedOutEventAttributesUndefined: Self = StObject.set(x, "lambdaFunctionTimedOutEventAttributes", js.undefined)
    
    @scala.inline
    def setMarkerRecordedEventAttributes(value: MarkerRecordedEventAttributes): Self = StObject.set(x, "markerRecordedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerRecordedEventAttributesUndefined: Self = StObject.set(x, "markerRecordedEventAttributes", js.undefined)
    
    @scala.inline
    def setRecordMarkerFailedEventAttributes(value: RecordMarkerFailedEventAttributes): Self = StObject.set(x, "recordMarkerFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordMarkerFailedEventAttributesUndefined: Self = StObject.set(x, "recordMarkerFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setRequestCancelActivityTaskFailedEventAttributes(value: RequestCancelActivityTaskFailedEventAttributes): Self = StObject.set(x, "requestCancelActivityTaskFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCancelActivityTaskFailedEventAttributesUndefined: Self = StObject.set(x, "requestCancelActivityTaskFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setRequestCancelExternalWorkflowExecutionFailedEventAttributes(value: RequestCancelExternalWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "requestCancelExternalWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCancelExternalWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "requestCancelExternalWorkflowExecutionFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setRequestCancelExternalWorkflowExecutionInitiatedEventAttributes(value: RequestCancelExternalWorkflowExecutionInitiatedEventAttributes): Self = StObject.set(x, "requestCancelExternalWorkflowExecutionInitiatedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCancelExternalWorkflowExecutionInitiatedEventAttributesUndefined: Self = StObject.set(x, "requestCancelExternalWorkflowExecutionInitiatedEventAttributes", js.undefined)
    
    @scala.inline
    def setScheduleActivityTaskFailedEventAttributes(value: ScheduleActivityTaskFailedEventAttributes): Self = StObject.set(x, "scheduleActivityTaskFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleActivityTaskFailedEventAttributesUndefined: Self = StObject.set(x, "scheduleActivityTaskFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setScheduleLambdaFunctionFailedEventAttributes(value: ScheduleLambdaFunctionFailedEventAttributes): Self = StObject.set(x, "scheduleLambdaFunctionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleLambdaFunctionFailedEventAttributesUndefined: Self = StObject.set(x, "scheduleLambdaFunctionFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setSignalExternalWorkflowExecutionFailedEventAttributes(value: SignalExternalWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "signalExternalWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalExternalWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "signalExternalWorkflowExecutionFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setSignalExternalWorkflowExecutionInitiatedEventAttributes(value: SignalExternalWorkflowExecutionInitiatedEventAttributes): Self = StObject.set(x, "signalExternalWorkflowExecutionInitiatedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalExternalWorkflowExecutionInitiatedEventAttributesUndefined: Self = StObject.set(x, "signalExternalWorkflowExecutionInitiatedEventAttributes", js.undefined)
    
    @scala.inline
    def setStartChildWorkflowExecutionFailedEventAttributes(value: StartChildWorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "startChildWorkflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartChildWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "startChildWorkflowExecutionFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setStartChildWorkflowExecutionInitiatedEventAttributes(value: StartChildWorkflowExecutionInitiatedEventAttributes): Self = StObject.set(x, "startChildWorkflowExecutionInitiatedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartChildWorkflowExecutionInitiatedEventAttributesUndefined: Self = StObject.set(x, "startChildWorkflowExecutionInitiatedEventAttributes", js.undefined)
    
    @scala.inline
    def setStartLambdaFunctionFailedEventAttributes(value: StartLambdaFunctionFailedEventAttributes): Self = StObject.set(x, "startLambdaFunctionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLambdaFunctionFailedEventAttributesUndefined: Self = StObject.set(x, "startLambdaFunctionFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setStartTimerFailedEventAttributes(value: StartTimerFailedEventAttributes): Self = StObject.set(x, "startTimerFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimerFailedEventAttributesUndefined: Self = StObject.set(x, "startTimerFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setTimerCanceledEventAttributes(value: TimerCanceledEventAttributes): Self = StObject.set(x, "timerCanceledEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimerCanceledEventAttributesUndefined: Self = StObject.set(x, "timerCanceledEventAttributes", js.undefined)
    
    @scala.inline
    def setTimerFiredEventAttributes(value: TimerFiredEventAttributes): Self = StObject.set(x, "timerFiredEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimerFiredEventAttributesUndefined: Self = StObject.set(x, "timerFiredEventAttributes", js.undefined)
    
    @scala.inline
    def setTimerStartedEventAttributes(value: TimerStartedEventAttributes): Self = StObject.set(x, "timerStartedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimerStartedEventAttributesUndefined: Self = StObject.set(x, "timerStartedEventAttributes", js.undefined)
    
    @scala.inline
    def setWorkflowExecutionCancelRequestedEventAttributes(value: WorkflowExecutionCancelRequestedEventAttributes): Self = StObject.set(x, "workflowExecutionCancelRequestedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecutionCancelRequestedEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionCancelRequestedEventAttributes", js.undefined)
    
    @scala.inline
    def setWorkflowExecutionCanceledEventAttributes(value: WorkflowExecutionCanceledEventAttributes): Self = StObject.set(x, "workflowExecutionCanceledEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecutionCanceledEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionCanceledEventAttributes", js.undefined)
    
    @scala.inline
    def setWorkflowExecutionCompletedEventAttributes(value: WorkflowExecutionCompletedEventAttributes): Self = StObject.set(x, "workflowExecutionCompletedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecutionCompletedEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionCompletedEventAttributes", js.undefined)
    
    @scala.inline
    def setWorkflowExecutionContinuedAsNewEventAttributes(value: WorkflowExecutionContinuedAsNewEventAttributes): Self = StObject.set(x, "workflowExecutionContinuedAsNewEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecutionContinuedAsNewEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionContinuedAsNewEventAttributes", js.undefined)
    
    @scala.inline
    def setWorkflowExecutionFailedEventAttributes(value: WorkflowExecutionFailedEventAttributes): Self = StObject.set(x, "workflowExecutionFailedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecutionFailedEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionFailedEventAttributes", js.undefined)
    
    @scala.inline
    def setWorkflowExecutionSignaledEventAttributes(value: WorkflowExecutionSignaledEventAttributes): Self = StObject.set(x, "workflowExecutionSignaledEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecutionSignaledEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionSignaledEventAttributes", js.undefined)
    
    @scala.inline
    def setWorkflowExecutionStartedEventAttributes(value: WorkflowExecutionStartedEventAttributes): Self = StObject.set(x, "workflowExecutionStartedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecutionStartedEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionStartedEventAttributes", js.undefined)
    
    @scala.inline
    def setWorkflowExecutionTerminatedEventAttributes(value: WorkflowExecutionTerminatedEventAttributes): Self = StObject.set(x, "workflowExecutionTerminatedEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecutionTerminatedEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionTerminatedEventAttributes", js.undefined)
    
    @scala.inline
    def setWorkflowExecutionTimedOutEventAttributes(value: WorkflowExecutionTimedOutEventAttributes): Self = StObject.set(x, "workflowExecutionTimedOutEventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowExecutionTimedOutEventAttributesUndefined: Self = StObject.set(x, "workflowExecutionTimedOutEventAttributes", js.undefined)
  }
}

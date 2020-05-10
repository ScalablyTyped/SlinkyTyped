package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryEvent extends js.Object {
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
  implicit class HistoryEventOps[Self <: HistoryEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventType(value: EventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivityTaskCancelRequestedEventAttributes(value: ActivityTaskCancelRequestedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskCancelRequestedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTaskCancelRequestedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskCancelRequestedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityTaskCanceledEventAttributes(value: ActivityTaskCanceledEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskCanceledEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTaskCanceledEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskCanceledEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityTaskCompletedEventAttributes(value: ActivityTaskCompletedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskCompletedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTaskCompletedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskCompletedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityTaskFailedEventAttributes(value: ActivityTaskFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTaskFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityTaskScheduledEventAttributes(value: ActivityTaskScheduledEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskScheduledEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTaskScheduledEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskScheduledEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityTaskStartedEventAttributes(value: ActivityTaskStartedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskStartedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTaskStartedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskStartedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityTaskTimedOutEventAttributes(value: ActivityTaskTimedOutEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskTimedOutEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTaskTimedOutEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTaskTimedOutEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelTimerFailedEventAttributes(value: CancelTimerFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelTimerFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelTimerFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelTimerFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelWorkflowExecutionFailedEventAttributes(value: CancelWorkflowExecutionFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelWorkflowExecutionFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelWorkflowExecutionFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelWorkflowExecutionFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withChildWorkflowExecutionCanceledEventAttributes(value: ChildWorkflowExecutionCanceledEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childWorkflowExecutionCanceledEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildWorkflowExecutionCanceledEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childWorkflowExecutionCanceledEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withChildWorkflowExecutionCompletedEventAttributes(value: ChildWorkflowExecutionCompletedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childWorkflowExecutionCompletedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildWorkflowExecutionCompletedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childWorkflowExecutionCompletedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withChildWorkflowExecutionFailedEventAttributes(value: ChildWorkflowExecutionFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childWorkflowExecutionFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildWorkflowExecutionFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childWorkflowExecutionFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withChildWorkflowExecutionStartedEventAttributes(value: ChildWorkflowExecutionStartedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childWorkflowExecutionStartedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildWorkflowExecutionStartedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childWorkflowExecutionStartedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withChildWorkflowExecutionTerminatedEventAttributes(value: ChildWorkflowExecutionTerminatedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childWorkflowExecutionTerminatedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildWorkflowExecutionTerminatedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childWorkflowExecutionTerminatedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withChildWorkflowExecutionTimedOutEventAttributes(value: ChildWorkflowExecutionTimedOutEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childWorkflowExecutionTimedOutEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildWorkflowExecutionTimedOutEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childWorkflowExecutionTimedOutEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleteWorkflowExecutionFailedEventAttributes(value: CompleteWorkflowExecutionFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeWorkflowExecutionFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteWorkflowExecutionFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeWorkflowExecutionFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withContinueAsNewWorkflowExecutionFailedEventAttributes(value: ContinueAsNewWorkflowExecutionFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueAsNewWorkflowExecutionFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueAsNewWorkflowExecutionFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueAsNewWorkflowExecutionFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDecisionTaskCompletedEventAttributes(value: DecisionTaskCompletedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionTaskCompletedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecisionTaskCompletedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionTaskCompletedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDecisionTaskScheduledEventAttributes(value: DecisionTaskScheduledEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionTaskScheduledEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecisionTaskScheduledEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionTaskScheduledEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDecisionTaskStartedEventAttributes(value: DecisionTaskStartedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionTaskStartedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecisionTaskStartedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionTaskStartedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDecisionTaskTimedOutEventAttributes(value: DecisionTaskTimedOutEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionTaskTimedOutEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecisionTaskTimedOutEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionTaskTimedOutEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalWorkflowExecutionCancelRequestedEventAttributes(value: ExternalWorkflowExecutionCancelRequestedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalWorkflowExecutionCancelRequestedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalWorkflowExecutionCancelRequestedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalWorkflowExecutionCancelRequestedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalWorkflowExecutionSignaledEventAttributes(value: ExternalWorkflowExecutionSignaledEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalWorkflowExecutionSignaledEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalWorkflowExecutionSignaledEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalWorkflowExecutionSignaledEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withFailWorkflowExecutionFailedEventAttributes(value: FailWorkflowExecutionFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failWorkflowExecutionFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailWorkflowExecutionFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failWorkflowExecutionFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionCompletedEventAttributes(value: LambdaFunctionCompletedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionCompletedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionCompletedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionCompletedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionFailedEventAttributes(value: LambdaFunctionFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionScheduledEventAttributes(value: LambdaFunctionScheduledEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionScheduledEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionScheduledEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionScheduledEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionStartedEventAttributes(value: LambdaFunctionStartedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionStartedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionStartedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionStartedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionTimedOutEventAttributes(value: LambdaFunctionTimedOutEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionTimedOutEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionTimedOutEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionTimedOutEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerRecordedEventAttributes(value: MarkerRecordedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerRecordedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerRecordedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerRecordedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordMarkerFailedEventAttributes(value: RecordMarkerFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordMarkerFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordMarkerFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordMarkerFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCancelActivityTaskFailedEventAttributes(value: RequestCancelActivityTaskFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCancelActivityTaskFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCancelActivityTaskFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCancelActivityTaskFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCancelExternalWorkflowExecutionFailedEventAttributes(value: RequestCancelExternalWorkflowExecutionFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCancelExternalWorkflowExecutionFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCancelExternalWorkflowExecutionFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCancelExternalWorkflowExecutionFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCancelExternalWorkflowExecutionInitiatedEventAttributes(value: RequestCancelExternalWorkflowExecutionInitiatedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCancelExternalWorkflowExecutionInitiatedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCancelExternalWorkflowExecutionInitiatedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCancelExternalWorkflowExecutionInitiatedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleActivityTaskFailedEventAttributes(value: ScheduleActivityTaskFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleActivityTaskFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleActivityTaskFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleActivityTaskFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleLambdaFunctionFailedEventAttributes(value: ScheduleLambdaFunctionFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleLambdaFunctionFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleLambdaFunctionFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleLambdaFunctionFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withSignalExternalWorkflowExecutionFailedEventAttributes(value: SignalExternalWorkflowExecutionFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalExternalWorkflowExecutionFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalExternalWorkflowExecutionFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalExternalWorkflowExecutionFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withSignalExternalWorkflowExecutionInitiatedEventAttributes(value: SignalExternalWorkflowExecutionInitiatedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalExternalWorkflowExecutionInitiatedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalExternalWorkflowExecutionInitiatedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalExternalWorkflowExecutionInitiatedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withStartChildWorkflowExecutionFailedEventAttributes(value: StartChildWorkflowExecutionFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startChildWorkflowExecutionFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartChildWorkflowExecutionFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startChildWorkflowExecutionFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withStartChildWorkflowExecutionInitiatedEventAttributes(value: StartChildWorkflowExecutionInitiatedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startChildWorkflowExecutionInitiatedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartChildWorkflowExecutionInitiatedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startChildWorkflowExecutionInitiatedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withStartLambdaFunctionFailedEventAttributes(value: StartLambdaFunctionFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLambdaFunctionFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartLambdaFunctionFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLambdaFunctionFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimerFailedEventAttributes(value: StartTimerFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimerFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimerFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimerFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withTimerCanceledEventAttributes(value: TimerCanceledEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerCanceledEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimerCanceledEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerCanceledEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withTimerFiredEventAttributes(value: TimerFiredEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerFiredEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimerFiredEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerFiredEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withTimerStartedEventAttributes(value: TimerStartedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerStartedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimerStartedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerStartedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowExecutionCancelRequestedEventAttributes(value: WorkflowExecutionCancelRequestedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionCancelRequestedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowExecutionCancelRequestedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionCancelRequestedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowExecutionCanceledEventAttributes(value: WorkflowExecutionCanceledEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionCanceledEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowExecutionCanceledEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionCanceledEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowExecutionCompletedEventAttributes(value: WorkflowExecutionCompletedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionCompletedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowExecutionCompletedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionCompletedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowExecutionContinuedAsNewEventAttributes(value: WorkflowExecutionContinuedAsNewEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionContinuedAsNewEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowExecutionContinuedAsNewEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionContinuedAsNewEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowExecutionFailedEventAttributes(value: WorkflowExecutionFailedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionFailedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowExecutionFailedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionFailedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowExecutionSignaledEventAttributes(value: WorkflowExecutionSignaledEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionSignaledEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowExecutionSignaledEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionSignaledEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowExecutionStartedEventAttributes(value: WorkflowExecutionStartedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionStartedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowExecutionStartedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionStartedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowExecutionTerminatedEventAttributes(value: WorkflowExecutionTerminatedEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionTerminatedEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowExecutionTerminatedEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionTerminatedEventAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowExecutionTimedOutEventAttributes(value: WorkflowExecutionTimedOutEventAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionTimedOutEventAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowExecutionTimedOutEventAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowExecutionTimedOutEventAttributes")(js.undefined)
        ret
    }
  }
  
}


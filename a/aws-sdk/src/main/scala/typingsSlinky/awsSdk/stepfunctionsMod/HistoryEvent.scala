package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryEvent extends js.Object {
  var activityFailedEventDetails: js.UndefOr[ActivityFailedEventDetails] = js.native
  /**
    * Contains details about an activity schedule event that failed during an execution.
    */
  var activityScheduleFailedEventDetails: js.UndefOr[ActivityScheduleFailedEventDetails] = js.native
  var activityScheduledEventDetails: js.UndefOr[ActivityScheduledEventDetails] = js.native
  var activityStartedEventDetails: js.UndefOr[ActivityStartedEventDetails] = js.native
  var activitySucceededEventDetails: js.UndefOr[ActivitySucceededEventDetails] = js.native
  var activityTimedOutEventDetails: js.UndefOr[ActivityTimedOutEventDetails] = js.native
  var executionAbortedEventDetails: js.UndefOr[ExecutionAbortedEventDetails] = js.native
  var executionFailedEventDetails: js.UndefOr[ExecutionFailedEventDetails] = js.native
  var executionStartedEventDetails: js.UndefOr[ExecutionStartedEventDetails] = js.native
  var executionSucceededEventDetails: js.UndefOr[ExecutionSucceededEventDetails] = js.native
  var executionTimedOutEventDetails: js.UndefOr[ExecutionTimedOutEventDetails] = js.native
  /**
    * The id of the event. Events are numbered sequentially, starting at one.
    */
  var id: EventId = js.native
  var lambdaFunctionFailedEventDetails: js.UndefOr[LambdaFunctionFailedEventDetails] = js.native
  var lambdaFunctionScheduleFailedEventDetails: js.UndefOr[LambdaFunctionScheduleFailedEventDetails] = js.native
  var lambdaFunctionScheduledEventDetails: js.UndefOr[LambdaFunctionScheduledEventDetails] = js.native
  /**
    * Contains details about a lambda function that failed to start during an execution.
    */
  var lambdaFunctionStartFailedEventDetails: js.UndefOr[LambdaFunctionStartFailedEventDetails] = js.native
  /**
    * Contains details about a lambda function that terminated successfully during an execution.
    */
  var lambdaFunctionSucceededEventDetails: js.UndefOr[LambdaFunctionSucceededEventDetails] = js.native
  var lambdaFunctionTimedOutEventDetails: js.UndefOr[LambdaFunctionTimedOutEventDetails] = js.native
  /**
    * Contains details about an iteration of a Map state that was aborted.
    */
  var mapIterationAbortedEventDetails: js.UndefOr[MapIterationEventDetails] = js.native
  /**
    * Contains details about an iteration of a Map state that failed.
    */
  var mapIterationFailedEventDetails: js.UndefOr[MapIterationEventDetails] = js.native
  /**
    * Contains details about an iteration of a Map state that was started.
    */
  var mapIterationStartedEventDetails: js.UndefOr[MapIterationEventDetails] = js.native
  /**
    * Contains details about an iteration of a Map state that succeeded.
    */
  var mapIterationSucceededEventDetails: js.UndefOr[MapIterationEventDetails] = js.native
  /**
    * Contains details about Map state that was started.
    */
  var mapStateStartedEventDetails: js.UndefOr[MapStateStartedEventDetails] = js.native
  /**
    * The id of the previous event.
    */
  var previousEventId: js.UndefOr[EventId] = js.native
  var stateEnteredEventDetails: js.UndefOr[StateEnteredEventDetails] = js.native
  var stateExitedEventDetails: js.UndefOr[StateExitedEventDetails] = js.native
  /**
    * Contains details about the failure of a task.
    */
  var taskFailedEventDetails: js.UndefOr[TaskFailedEventDetails] = js.native
  /**
    * Contains details about a task that was scheduled.
    */
  var taskScheduledEventDetails: js.UndefOr[TaskScheduledEventDetails] = js.native
  /**
    * Contains details about a task that failed to start.
    */
  var taskStartFailedEventDetails: js.UndefOr[TaskStartFailedEventDetails] = js.native
  /**
    * Contains details about a task that was started.
    */
  var taskStartedEventDetails: js.UndefOr[TaskStartedEventDetails] = js.native
  /**
    * Contains details about a task that where the submit failed.
    */
  var taskSubmitFailedEventDetails: js.UndefOr[TaskSubmitFailedEventDetails] = js.native
  /**
    * Contains details about a submitted task.
    */
  var taskSubmittedEventDetails: js.UndefOr[TaskSubmittedEventDetails] = js.native
  /**
    * Contains details about a task that succeeded.
    */
  var taskSucceededEventDetails: js.UndefOr[TaskSucceededEventDetails] = js.native
  /**
    * Contains details about a task that timed out.
    */
  var taskTimedOutEventDetails: js.UndefOr[TaskTimedOutEventDetails] = js.native
  /**
    * The date and time the event occurred.
    */
  var timestamp: js.Date = js.native
  /**
    * The type of the event.
    */
  var `type`: HistoryEventType = js.native
}

object HistoryEvent {
  @scala.inline
  def apply(id: EventId, timestamp: js.Date, `type`: HistoryEventType): HistoryEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryEvent]
  }
  @scala.inline
  implicit class HistoryEventOps[Self <: HistoryEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: HistoryEventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivityFailedEventDetails(value: ActivityFailedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityFailedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityFailedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityFailedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityScheduleFailedEventDetails(value: ActivityScheduleFailedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityScheduleFailedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityScheduleFailedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityScheduleFailedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityScheduledEventDetails(value: ActivityScheduledEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityScheduledEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityScheduledEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityScheduledEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityStartedEventDetails(value: ActivityStartedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityStartedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityStartedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityStartedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withActivitySucceededEventDetails(value: ActivitySucceededEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activitySucceededEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivitySucceededEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activitySucceededEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityTimedOutEventDetails(value: ActivityTimedOutEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTimedOutEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTimedOutEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTimedOutEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionAbortedEventDetails(value: ExecutionAbortedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionAbortedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionAbortedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionAbortedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionFailedEventDetails(value: ExecutionFailedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionFailedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionFailedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionFailedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionStartedEventDetails(value: ExecutionStartedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStartedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionStartedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStartedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionSucceededEventDetails(value: ExecutionSucceededEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionSucceededEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionSucceededEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionSucceededEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionTimedOutEventDetails(value: ExecutionTimedOutEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionTimedOutEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionTimedOutEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionTimedOutEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionFailedEventDetails(value: LambdaFunctionFailedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionFailedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionFailedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionFailedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionScheduleFailedEventDetails(value: LambdaFunctionScheduleFailedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionScheduleFailedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionScheduleFailedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionScheduleFailedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionScheduledEventDetails(value: LambdaFunctionScheduledEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionScheduledEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionScheduledEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionScheduledEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionStartFailedEventDetails(value: LambdaFunctionStartFailedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionStartFailedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionStartFailedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionStartFailedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionSucceededEventDetails(value: LambdaFunctionSucceededEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionSucceededEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionSucceededEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionSucceededEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionTimedOutEventDetails(value: LambdaFunctionTimedOutEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionTimedOutEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionTimedOutEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionTimedOutEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withMapIterationAbortedEventDetails(value: MapIterationEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapIterationAbortedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapIterationAbortedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapIterationAbortedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withMapIterationFailedEventDetails(value: MapIterationEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapIterationFailedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapIterationFailedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapIterationFailedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withMapIterationStartedEventDetails(value: MapIterationEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapIterationStartedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapIterationStartedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapIterationStartedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withMapIterationSucceededEventDetails(value: MapIterationEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapIterationSucceededEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapIterationSucceededEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapIterationSucceededEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withMapStateStartedEventDetails(value: MapStateStartedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapStateStartedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapStateStartedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapStateStartedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousEventId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousEventId")(js.undefined)
        ret
    }
    @scala.inline
    def withStateEnteredEventDetails(value: StateEnteredEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateEnteredEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateEnteredEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateEnteredEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withStateExitedEventDetails(value: StateExitedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateExitedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateExitedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateExitedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskFailedEventDetails(value: TaskFailedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskFailedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskFailedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskFailedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskScheduledEventDetails(value: TaskScheduledEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskScheduledEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskScheduledEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskScheduledEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskStartFailedEventDetails(value: TaskStartFailedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStartFailedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskStartFailedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStartFailedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskStartedEventDetails(value: TaskStartedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStartedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskStartedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskStartedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskSubmitFailedEventDetails(value: TaskSubmitFailedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSubmitFailedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskSubmitFailedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSubmitFailedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskSubmittedEventDetails(value: TaskSubmittedEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSubmittedEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskSubmittedEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSubmittedEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskSucceededEventDetails(value: TaskSucceededEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSucceededEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskSucceededEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskSucceededEventDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTaskTimedOutEventDetails(value: TaskTimedOutEventDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskTimedOutEventDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaskTimedOutEventDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskTimedOutEventDetails")(js.undefined)
        ret
    }
  }
  
}


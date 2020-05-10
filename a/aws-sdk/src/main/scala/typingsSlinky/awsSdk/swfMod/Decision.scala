package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decision extends js.Object {
  /**
    * Provides the details of the CancelTimer decision. It isn't set for other decision types.
    */
  var cancelTimerDecisionAttributes: js.UndefOr[CancelTimerDecisionAttributes] = js.native
  /**
    * Provides the details of the CancelWorkflowExecution decision. It isn't set for other decision types.
    */
  var cancelWorkflowExecutionDecisionAttributes: js.UndefOr[CancelWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the CompleteWorkflowExecution decision. It isn't set for other decision types.
    */
  var completeWorkflowExecutionDecisionAttributes: js.UndefOr[CompleteWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the ContinueAsNewWorkflowExecution decision. It isn't set for other decision types.
    */
  var continueAsNewWorkflowExecutionDecisionAttributes: js.UndefOr[ContinueAsNewWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Specifies the type of the decision.
    */
  var decisionType: DecisionType = js.native
  /**
    * Provides the details of the FailWorkflowExecution decision. It isn't set for other decision types.
    */
  var failWorkflowExecutionDecisionAttributes: js.UndefOr[FailWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the RecordMarker decision. It isn't set for other decision types.
    */
  var recordMarkerDecisionAttributes: js.UndefOr[RecordMarkerDecisionAttributes] = js.native
  /**
    * Provides the details of the RequestCancelActivityTask decision. It isn't set for other decision types.
    */
  var requestCancelActivityTaskDecisionAttributes: js.UndefOr[RequestCancelActivityTaskDecisionAttributes] = js.native
  /**
    * Provides the details of the RequestCancelExternalWorkflowExecution decision. It isn't set for other decision types.
    */
  var requestCancelExternalWorkflowExecutionDecisionAttributes: js.UndefOr[RequestCancelExternalWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the ScheduleActivityTask decision. It isn't set for other decision types.
    */
  var scheduleActivityTaskDecisionAttributes: js.UndefOr[ScheduleActivityTaskDecisionAttributes] = js.native
  /**
    * Provides the details of the ScheduleLambdaFunction decision. It isn't set for other decision types.
    */
  var scheduleLambdaFunctionDecisionAttributes: js.UndefOr[ScheduleLambdaFunctionDecisionAttributes] = js.native
  /**
    * Provides the details of the SignalExternalWorkflowExecution decision. It isn't set for other decision types.
    */
  var signalExternalWorkflowExecutionDecisionAttributes: js.UndefOr[SignalExternalWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the StartChildWorkflowExecution decision. It isn't set for other decision types.
    */
  var startChildWorkflowExecutionDecisionAttributes: js.UndefOr[StartChildWorkflowExecutionDecisionAttributes] = js.native
  /**
    * Provides the details of the StartTimer decision. It isn't set for other decision types.
    */
  var startTimerDecisionAttributes: js.UndefOr[StartTimerDecisionAttributes] = js.native
}

object Decision {
  @scala.inline
  def apply(decisionType: DecisionType): Decision = {
    val __obj = js.Dynamic.literal(decisionType = decisionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decision]
  }
  @scala.inline
  implicit class DecisionOps[Self <: Decision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecisionType(value: DecisionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelTimerDecisionAttributes(value: CancelTimerDecisionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelTimerDecisionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelTimerDecisionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelTimerDecisionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelWorkflowExecutionDecisionAttributes(value: CancelWorkflowExecutionDecisionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelWorkflowExecutionDecisionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelWorkflowExecutionDecisionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelWorkflowExecutionDecisionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleteWorkflowExecutionDecisionAttributes(value: CompleteWorkflowExecutionDecisionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeWorkflowExecutionDecisionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteWorkflowExecutionDecisionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeWorkflowExecutionDecisionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withContinueAsNewWorkflowExecutionDecisionAttributes(value: ContinueAsNewWorkflowExecutionDecisionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueAsNewWorkflowExecutionDecisionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueAsNewWorkflowExecutionDecisionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueAsNewWorkflowExecutionDecisionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withFailWorkflowExecutionDecisionAttributes(value: FailWorkflowExecutionDecisionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failWorkflowExecutionDecisionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailWorkflowExecutionDecisionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failWorkflowExecutionDecisionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordMarkerDecisionAttributes(value: RecordMarkerDecisionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordMarkerDecisionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordMarkerDecisionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordMarkerDecisionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCancelActivityTaskDecisionAttributes(value: RequestCancelActivityTaskDecisionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCancelActivityTaskDecisionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCancelActivityTaskDecisionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCancelActivityTaskDecisionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCancelExternalWorkflowExecutionDecisionAttributes(value: RequestCancelExternalWorkflowExecutionDecisionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCancelExternalWorkflowExecutionDecisionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCancelExternalWorkflowExecutionDecisionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCancelExternalWorkflowExecutionDecisionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleActivityTaskDecisionAttributes(value: ScheduleActivityTaskDecisionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleActivityTaskDecisionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleActivityTaskDecisionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleActivityTaskDecisionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleLambdaFunctionDecisionAttributes(value: ScheduleLambdaFunctionDecisionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleLambdaFunctionDecisionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleLambdaFunctionDecisionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleLambdaFunctionDecisionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withSignalExternalWorkflowExecutionDecisionAttributes(value: SignalExternalWorkflowExecutionDecisionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalExternalWorkflowExecutionDecisionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalExternalWorkflowExecutionDecisionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalExternalWorkflowExecutionDecisionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withStartChildWorkflowExecutionDecisionAttributes(value: StartChildWorkflowExecutionDecisionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startChildWorkflowExecutionDecisionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartChildWorkflowExecutionDecisionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startChildWorkflowExecutionDecisionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimerDecisionAttributes(value: StartTimerDecisionAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimerDecisionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimerDecisionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimerDecisionAttributes")(js.undefined)
        ret
    }
  }
  
}


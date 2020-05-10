package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalExternalWorkflowExecutionInitiatedEventAttributes extends js.Object {
  /**
    * Data attached to the event that can be used by the decider in subsequent decision tasks.
    */
  var control: js.UndefOr[Data] = js.native
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the SignalExternalWorkflowExecution decision for this signal. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId = js.native
  /**
    * The input provided to the signal.
    */
  var input: js.UndefOr[Data] = js.native
  /**
    * The runId of the external workflow execution to send the signal to.
    */
  var runId: js.UndefOr[WorkflowRunIdOptional] = js.native
  /**
    * The name of the signal.
    */
  var signalName: SignalName = js.native
  /**
    * The workflowId of the external workflow execution.
    */
  var workflowId: WorkflowId = js.native
}

object SignalExternalWorkflowExecutionInitiatedEventAttributes {
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, signalName: SignalName, workflowId: WorkflowId): SignalExternalWorkflowExecutionInitiatedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId.asInstanceOf[js.Any], signalName = signalName.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalExternalWorkflowExecutionInitiatedEventAttributes]
  }
  @scala.inline
  implicit class SignalExternalWorkflowExecutionInitiatedEventAttributesOps[Self <: SignalExternalWorkflowExecutionInitiatedEventAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecisionTaskCompletedEventId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionTaskCompletedEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignalName(value: SignalName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkflowId(value: WorkflowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workflowId")(value.asInstanceOf[js.Any])
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
    def withRunId(value: WorkflowRunIdOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runId")(js.undefined)
        ret
    }
  }
  
}


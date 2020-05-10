package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAutomationSignalRequest extends js.Object {
  /**
    * The unique identifier for an existing Automation execution that you want to send the signal to.
    */
  var AutomationExecutionId: typingsSlinky.awsSdk.ssmMod.AutomationExecutionId = js.native
  /**
    * The data sent with the signal. The data schema depends on the type of signal used in the request. For Approve and Reject signal types, the payload is an optional comment that you can send with the signal type. For example:  Comment="Looks good"  For StartStep and Resume signal types, you must send the name of the Automation step to start or resume as the payload. For example:  StepName="step1"  For the StopStep signal type, you must send the step execution ID as the payload. For example:  StepExecutionId="97fff367-fc5a-4299-aed8-0123456789ab" 
    */
  var Payload: js.UndefOr[AutomationParameterMap] = js.native
  /**
    * The type of signal to send to an Automation execution. 
    */
  var SignalType: typingsSlinky.awsSdk.ssmMod.SignalType = js.native
}

object SendAutomationSignalRequest {
  @scala.inline
  def apply(AutomationExecutionId: AutomationExecutionId, SignalType: SignalType): SendAutomationSignalRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId.asInstanceOf[js.Any], SignalType = SignalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAutomationSignalRequest]
  }
  @scala.inline
  implicit class SendAutomationSignalRequestOps[Self <: SendAutomationSignalRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomationExecutionId(value: AutomationExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignalType(value: SignalType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: AutomationParameterMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payload")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendAutomationSignalRequest extends StObject {
  
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
  implicit class SendAutomationSignalRequestMutableBuilder[Self <: SendAutomationSignalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "AutomationExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: AutomationParameterMap): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    
    @scala.inline
    def setSignalType(value: SignalType): Self = StObject.set(x, "SignalType", value.asInstanceOf[js.Any])
  }
}

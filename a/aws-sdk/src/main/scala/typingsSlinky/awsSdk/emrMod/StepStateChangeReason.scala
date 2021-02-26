package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepStateChangeReason extends StObject {
  
  /**
    * The programmable code for the state change reason. Note: Currently, the service provides no code for the state change.
    */
  var Code: js.UndefOr[StepStateChangeReasonCode] = js.native
  
  /**
    * The descriptive message for the state change reason.
    */
  var Message: js.UndefOr[String] = js.native
}
object StepStateChangeReason {
  
  @scala.inline
  def apply(): StepStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepStateChangeReason]
  }
  
  @scala.inline
  implicit class StepStateChangeReasonMutableBuilder[Self <: StepStateChangeReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: StepStateChangeReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}

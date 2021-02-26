package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutVoiceConnectorTerminationResponse extends StObject {
  
  /**
    * The updated termination setting details.
    */
  var Termination: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Termination] = js.native
}
object PutVoiceConnectorTerminationResponse {
  
  @scala.inline
  def apply(): PutVoiceConnectorTerminationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorTerminationResponse]
  }
  
  @scala.inline
  implicit class PutVoiceConnectorTerminationResponseMutableBuilder[Self <: PutVoiceConnectorTerminationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTermination(value: Termination): Self = StObject.set(x, "Termination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationUndefined: Self = StObject.set(x, "Termination", js.undefined)
  }
}

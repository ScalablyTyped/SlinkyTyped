package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVoiceConnectorOriginationResponse extends StObject {
  
  /**
    * The origination setting details.
    */
  var Origination: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Origination] = js.native
}
object GetVoiceConnectorOriginationResponse {
  
  @scala.inline
  def apply(): GetVoiceConnectorOriginationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorOriginationResponse]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorOriginationResponseMutableBuilder[Self <: GetVoiceConnectorOriginationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigination(value: Origination): Self = StObject.set(x, "Origination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginationUndefined: Self = StObject.set(x, "Origination", js.undefined)
  }
}

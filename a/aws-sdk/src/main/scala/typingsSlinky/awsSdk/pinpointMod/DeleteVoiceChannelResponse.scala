package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVoiceChannelResponse extends StObject {
  
  var VoiceChannelResponse: typingsSlinky.awsSdk.pinpointMod.VoiceChannelResponse = js.native
}
object DeleteVoiceChannelResponse {
  
  @scala.inline
  def apply(VoiceChannelResponse: VoiceChannelResponse): DeleteVoiceChannelResponse = {
    val __obj = js.Dynamic.literal(VoiceChannelResponse = VoiceChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceChannelResponse]
  }
  
  @scala.inline
  implicit class DeleteVoiceChannelResponseMutableBuilder[Self <: DeleteVoiceChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceChannelResponse(value: VoiceChannelResponse): Self = StObject.set(x, "VoiceChannelResponse", value.asInstanceOf[js.Any])
  }
}

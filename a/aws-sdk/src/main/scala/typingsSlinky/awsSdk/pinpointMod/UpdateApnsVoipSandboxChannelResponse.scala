package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApnsVoipSandboxChannelResponse extends StObject {
  
  var APNSVoipSandboxChannelResponse: typingsSlinky.awsSdk.pinpointMod.APNSVoipSandboxChannelResponse = js.native
}
object UpdateApnsVoipSandboxChannelResponse {
  
  @scala.inline
  def apply(APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse): UpdateApnsVoipSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsVoipSandboxChannelResponse]
  }
  
  @scala.inline
  implicit class UpdateApnsVoipSandboxChannelResponseMutableBuilder[Self <: UpdateApnsVoipSandboxChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSVoipSandboxChannelResponse(value: APNSVoipSandboxChannelResponse): Self = StObject.set(x, "APNSVoipSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
}

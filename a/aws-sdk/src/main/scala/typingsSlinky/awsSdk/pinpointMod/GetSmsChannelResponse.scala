package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSmsChannelResponse extends StObject {
  
  var SMSChannelResponse: typingsSlinky.awsSdk.pinpointMod.SMSChannelResponse = js.native
}
object GetSmsChannelResponse {
  
  @scala.inline
  def apply(SMSChannelResponse: SMSChannelResponse): GetSmsChannelResponse = {
    val __obj = js.Dynamic.literal(SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSmsChannelResponse]
  }
  
  @scala.inline
  implicit class GetSmsChannelResponseMutableBuilder[Self <: GetSmsChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSMSChannelResponse(value: SMSChannelResponse): Self = StObject.set(x, "SMSChannelResponse", value.asInstanceOf[js.Any])
  }
}

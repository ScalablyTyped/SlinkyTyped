package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEmailChannelResponse extends StObject {
  
  var EmailChannelResponse: typingsSlinky.awsSdk.pinpointMod.EmailChannelResponse = js.native
}
object GetEmailChannelResponse {
  
  @scala.inline
  def apply(EmailChannelResponse: EmailChannelResponse): GetEmailChannelResponse = {
    val __obj = js.Dynamic.literal(EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailChannelResponse]
  }
  
  @scala.inline
  implicit class GetEmailChannelResponseMutableBuilder[Self <: GetEmailChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailChannelResponse(value: EmailChannelResponse): Self = StObject.set(x, "EmailChannelResponse", value.asInstanceOf[js.Any])
  }
}

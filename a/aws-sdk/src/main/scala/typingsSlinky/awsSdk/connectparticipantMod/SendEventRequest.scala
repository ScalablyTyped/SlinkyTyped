package typingsSlinky.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendEventRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.connectparticipantMod.ClientToken] = js.native
  
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken = js.native
  
  /**
    * The content of the event to be sent (for example, message text). This is not yet supported.
    */
  var Content: js.UndefOr[ChatContent] = js.native
  
  /**
    * The content type of the request. Supported types are:   application/vnd.amazonaws.connect.event.typing   application/vnd.amazonaws.connect.event.connection.acknowledged  
    */
  var ContentType: ChatContentType = js.native
}
object SendEventRequest {
  
  @scala.inline
  def apply(ConnectionToken: ParticipantToken, ContentType: ChatContentType): SendEventRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEventRequest]
  }
  
  @scala.inline
  implicit class SendEventRequestMutableBuilder[Self <: SendEventRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setConnectionToken(value: ParticipantToken): Self = StObject.set(x, "ConnectionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: ChatContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: ChatContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
  }
}

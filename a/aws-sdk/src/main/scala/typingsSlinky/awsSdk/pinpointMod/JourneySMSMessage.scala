package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JourneySMSMessage extends StObject {
  
  /**
    * The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive, such as a one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such as marketing messages).
    */
  var MessageType: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.MessageType] = js.native
  
  /**
    * The sender ID to display as the sender of the message on a recipient's device. Support for sender IDs varies by country or region. For more information, see Supported Countries and Regions in the Amazon Pinpoint User Guide.
    */
  var SenderId: js.UndefOr[string] = js.native
}
object JourneySMSMessage {
  
  @scala.inline
  def apply(): JourneySMSMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneySMSMessage]
  }
  
  @scala.inline
  implicit class JourneySMSMessageMutableBuilder[Self <: JourneySMSMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
    
    @scala.inline
    def setSenderId(value: string): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
  }
}

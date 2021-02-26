package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteChannelMessageRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn = js.native
  
  /**
    * The ID of the message being deleted.
    */
  var MessageId: typingsSlinky.awsSdk.chimeMod.MessageId = js.native
}
object DeleteChannelMessageRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, MessageId: MessageId): DeleteChannelMessageRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelMessageRequest]
  }
  
  @scala.inline
  implicit class DeleteChannelMessageRequestMutableBuilder[Self <: DeleteChannelMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendChannelMessageRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn = js.native
  
  /**
    * The Idempotency token for each client request.
    */
  var ClientRequestToken: typingsSlinky.awsSdk.chimeMod.ClientRequestToken = js.native
  
  /**
    * The content of the message.
    */
  var Content: NonEmptyContent = js.native
  
  /**
    * The optional metadata for each message. 
    */
  var Metadata: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Metadata] = js.native
  
  /**
    * Boolean that controls whether the message is persisted on the back end. Required.
    */
  var Persistence: ChannelMessagePersistenceType = js.native
  
  /**
    * The type of message, STANDARD or CONTROL.
    */
  var Type: ChannelMessageType = js.native
}
object SendChannelMessageRequest {
  
  @scala.inline
  def apply(
    ChannelArn: ChimeArn,
    ClientRequestToken: ClientRequestToken,
    Content: NonEmptyContent,
    Persistence: ChannelMessagePersistenceType,
    Type: ChannelMessageType
  ): SendChannelMessageRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Persistence = Persistence.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendChannelMessageRequest]
  }
  
  @scala.inline
  implicit class SendChannelMessageRequestMutableBuilder[Self <: SendChannelMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: NonEmptyContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setPersistence(value: ChannelMessagePersistenceType): Self = StObject.set(x, "Persistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ChannelMessageType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}

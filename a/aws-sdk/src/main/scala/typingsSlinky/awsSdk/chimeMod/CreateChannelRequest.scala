package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChannelRequest extends StObject {
  
  /**
    * The ARN of the channel request.
    */
  var AppInstanceArn: ChimeArn = js.native
  
  /**
    * The client token for the request. An Idempotency token.
    */
  var ClientRequestToken: typingsSlinky.awsSdk.chimeMod.ClientRequestToken = js.native
  
  /**
    * The metadata of the creation request. Limited to 1KB and UTF-8.
    */
  var Metadata: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Metadata] = js.native
  
  /**
    * The channel mode: UNRESTRICTED or RESTRICTED. Administrators, moderators, and channel members can add themselves and other members to unrestricted channels. Only administrators and moderators can add members to restricted channels.
    */
  var Mode: js.UndefOr[ChannelMode] = js.native
  
  /**
    * The name of the channel.
    */
  var Name: NonEmptyResourceName = js.native
  
  /**
    * The channel's privacy level: PUBLIC or PRIVATE. Private channels aren't discoverable by users outside the channel. Public channels are discoverable by anyone in the app instance.
    */
  var Privacy: js.UndefOr[ChannelPrivacy] = js.native
  
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateChannelRequest {
  
  @scala.inline
  def apply(AppInstanceArn: ChimeArn, ClientRequestToken: ClientRequestToken, Name: NonEmptyResourceName): CreateChannelRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelRequest]
  }
  
  @scala.inline
  implicit class CreateChannelRequestMutableBuilder[Self <: CreateChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setMode(value: ChannelMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacy(value: ChannelPrivacy): Self = StObject.set(x, "Privacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyUndefined: Self = StObject.set(x, "Privacy", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}

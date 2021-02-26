package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartChatContactRequest extends StObject {
  
  /**
    * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be accessed in contact flows just like any other contact attributes.  There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only alphanumeric, dash, and underscore characters.
    */
  var Attributes: js.UndefOr[typingsSlinky.awsSdk.connectMod.Attributes] = js.native
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.ClientToken] = js.native
  
  /**
    * The identifier of the contact flow for initiating the chat. To see the ContactFlowId in the Amazon Connect console user interface, on the navigation menu go to Routing, Contact Flows. Choose the contact flow. On the contact flow page, under the name of the contact flow, choose Show additional flow information. The ContactFlowId is the last part of the ARN, shown here in bold:  arn:aws:connect:us-west-2:xxxxxxxxxxxx:instance/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/contact-flow/846ec553-a005-41c0-8341-xxxxxxxxxxxx 
    */
  var ContactFlowId: typingsSlinky.awsSdk.connectMod.ContactFlowId = js.native
  
  /**
    * The initial message to be sent to the newly created chat.
    */
  var InitialMessage: js.UndefOr[ChatMessage] = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * Information identifying the participant.
    */
  var ParticipantDetails: typingsSlinky.awsSdk.connectMod.ParticipantDetails = js.native
}
object StartChatContactRequest {
  
  @scala.inline
  def apply(ContactFlowId: ContactFlowId, InstanceId: InstanceId, ParticipantDetails: ParticipantDetails): StartChatContactRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], ParticipantDetails = ParticipantDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChatContactRequest]
  }
  
  @scala.inline
  implicit class StartChatContactRequestMutableBuilder[Self <: StartChatContactRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialMessage(value: ChatMessage): Self = StObject.set(x, "InitialMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialMessageUndefined: Self = StObject.set(x, "InitialMessage", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantDetails(value: ParticipantDetails): Self = StObject.set(x, "ParticipantDetails", value.asInstanceOf[js.Any])
  }
}

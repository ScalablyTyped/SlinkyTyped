package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartChatContactRequest extends js.Object {
  /**
    * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be accessed in contact flows just like any other contact attributes.  There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only alphanumeric, dash, and underscore characters.
    */
  var Attributes: js.UndefOr[typingsSlinky.awsSdk.connectMod.Attributes] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.ClientToken] = js.native
  /**
    * The identifier of the contact flow for the chat.
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
  implicit class StartChatContactRequestOps[Self <: StartChatContactRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactFlowId(value: ContactFlowId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactFlowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticipantDetails(value: ParticipantDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParticipantDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialMessage(value: ChatMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialMessage")(js.undefined)
        ret
    }
  }
  
}


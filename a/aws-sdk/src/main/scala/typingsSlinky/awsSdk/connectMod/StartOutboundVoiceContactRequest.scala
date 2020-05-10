package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOutboundVoiceContactRequest extends js.Object {
  /**
    * A custom key-value pair using an attribute map. The attributes are standard Amazon Connect attributes, and can be accessed in contact flows just like any other contact attributes. There can be up to 32,768 UTF-8 bytes across all key-value pairs per contact. Attribute keys can include only alphanumeric, dash, and underscore characters.
    */
  var Attributes: js.UndefOr[typingsSlinky.awsSdk.connectMod.Attributes] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. The token is valid for 7 days after creation. If a contact is already started, the contact ID is returned. If the contact is disconnected, a new contact is started.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.ClientToken] = js.native
  /**
    * The identifier of the contact flow for the outbound call.
    */
  var ContactFlowId: typingsSlinky.awsSdk.connectMod.ContactFlowId = js.native
  /**
    * The phone number of the customer, in E.164 format.
    */
  var DestinationPhoneNumber: PhoneNumber = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  /**
    * The queue for the call. If you specify a queue, the phone displayed for caller ID is the phone number specified in the queue. If you do not specify a queue, the queue defined in the contact flow is used. If you do not specify a queue, you must specify a source phone number.
    */
  var QueueId: js.UndefOr[typingsSlinky.awsSdk.connectMod.QueueId] = js.native
  /**
    * The phone number associated with the Amazon Connect instance, in E.164 format. If you do not specify a source phone number, you must specify a queue.
    */
  var SourcePhoneNumber: js.UndefOr[PhoneNumber] = js.native
}

object StartOutboundVoiceContactRequest {
  @scala.inline
  def apply(ContactFlowId: ContactFlowId, DestinationPhoneNumber: PhoneNumber, InstanceId: InstanceId): StartOutboundVoiceContactRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], DestinationPhoneNumber = DestinationPhoneNumber.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOutboundVoiceContactRequest]
  }
  @scala.inline
  implicit class StartOutboundVoiceContactRequestOps[Self <: StartOutboundVoiceContactRequest] (val x: Self) extends AnyVal {
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
    def withDestinationPhoneNumber(value: PhoneNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
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
    def withQueueId(value: QueueId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePhoneNumber(value: PhoneNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePhoneNumber")(js.undefined)
        ret
    }
  }
  
}


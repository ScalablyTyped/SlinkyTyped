package typingsSlinky.postmark.outboundMessageEventsMod

import typingsSlinky.postmark.AnonDeliveryMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryEvent extends MessageEvent {
  @JSName("Details")
  var Details_DeliveryEvent: AnonDeliveryMessage = js.native
}

object DeliveryEvent {
  @scala.inline
  def apply(Details: AnonDeliveryMessage, ReceivedAt: String, Recipient: String, Type: String): DeliveryEvent = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryEvent]
  }
  @scala.inline
  implicit class DeliveryEventOps[Self <: DeliveryEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: AnonDeliveryMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.postmark.outboundMessageEventsMod

import typingsSlinky.postmark.anon.BounceID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BounceEvent extends MessageEvent {
  @JSName("Details")
  var Details_BounceEvent: BounceID = js.native
}

object BounceEvent {
  @scala.inline
  def apply(Details: BounceID, ReceivedAt: String, Recipient: String, Type: String): BounceEvent = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceEvent]
  }
  @scala.inline
  implicit class BounceEventOps[Self <: BounceEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: BounceID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


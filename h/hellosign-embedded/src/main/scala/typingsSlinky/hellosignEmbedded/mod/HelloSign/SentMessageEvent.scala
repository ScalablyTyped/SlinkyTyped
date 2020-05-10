package typingsSlinky.hellosignEmbedded.mod.HelloSign

import typingsSlinky.hellosignEmbedded.AnonCcemailaddresses
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.signature_request_sent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentMessageEvent extends MessageEvent {
  var event: signature_request_sent = js.native
  var signature_request_id: String = js.native
  var signature_request_info: AnonCcemailaddresses = js.native
}

object SentMessageEvent {
  @scala.inline
  def apply(
    event: signature_request_sent,
    signature_request_id: String,
    signature_request_info: AnonCcemailaddresses
  ): SentMessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], signature_request_id = signature_request_id.asInstanceOf[js.Any], signature_request_info = signature_request_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentMessageEvent]
  }
  @scala.inline
  implicit class SentMessageEventOps[Self <: SentMessageEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: signature_request_sent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature_request_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature_request_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature_request_info(value: AnonCcemailaddresses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature_request_info")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


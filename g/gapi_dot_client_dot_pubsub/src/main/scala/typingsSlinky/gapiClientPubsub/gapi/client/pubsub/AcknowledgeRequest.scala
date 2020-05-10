package typingsSlinky.gapiClientPubsub.gapi.client.pubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcknowledgeRequest extends js.Object {
  /**
    * The acknowledgment ID for the messages being acknowledged that was returned
    * by the Pub/Sub system in the `Pull` response. Must not be empty.
    */
  var ackIds: js.UndefOr[js.Array[String]] = js.native
}

object AcknowledgeRequest {
  @scala.inline
  def apply(): AcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcknowledgeRequest]
  }
  @scala.inline
  implicit class AcknowledgeRequestOps[Self <: AcknowledgeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAckIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAckIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackIds")(js.undefined)
        ret
    }
  }
  
}


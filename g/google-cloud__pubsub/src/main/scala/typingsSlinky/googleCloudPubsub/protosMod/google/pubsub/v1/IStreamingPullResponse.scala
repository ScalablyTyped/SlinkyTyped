package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a StreamingPullResponse. */
@js.native
trait IStreamingPullResponse extends js.Object {
  /** StreamingPullResponse receivedMessages */
  var receivedMessages: js.UndefOr[js.Array[IReceivedMessage] | Null] = js.native
}

object IStreamingPullResponse {
  @scala.inline
  def apply(): IStreamingPullResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingPullResponse]
  }
  @scala.inline
  implicit class IStreamingPullResponseOps[Self <: IStreamingPullResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReceivedMessages(value: js.Array[IReceivedMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceivedMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withReceivedMessagesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedMessages")(null)
        ret
    }
  }
  
}


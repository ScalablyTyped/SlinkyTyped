package typingsSlinky.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkEvent extends js.Object {
  /** The number of compressed bytes sent or received. */
  var compressedMessageSize: js.UndefOr[String] = js.native
  /** An identifier for the message, which must be unique in this span. */
  var messageId: js.UndefOr[String] = js.native
  /**
    * For sent messages, this is the time at which the first bit was sent.
    * For received messages, this is the time at which the last bit was
    * received.
    */
  var time: js.UndefOr[String] = js.native
  /**
    * Type of NetworkEvent. Indicates whether the RPC message was sent or
    * received.
    */
  var `type`: js.UndefOr[String] = js.native
  /** The number of uncompressed bytes sent or received. */
  var uncompressedMessageSize: js.UndefOr[String] = js.native
}

object NetworkEvent {
  @scala.inline
  def apply(): NetworkEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEvent]
  }
  @scala.inline
  implicit class NetworkEventOps[Self <: NetworkEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompressedMessageSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressedMessageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressedMessageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressedMessageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUncompressedMessageSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncompressedMessageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncompressedMessageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncompressedMessageSize")(js.undefined)
        ret
    }
  }
  
}


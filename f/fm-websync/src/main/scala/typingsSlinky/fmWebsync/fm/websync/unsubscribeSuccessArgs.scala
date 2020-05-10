package typingsSlinky.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait unsubscribeSuccessArgs extends baseResponseArgs {
  /**
    * The channel from which the client was unsubscribed. Must start with a forward slash (/).
    */
  var channel: String = js.native
  /**
    * The channels from which the client was unsubscribed. Each must start with a forward slash (/).
    */
  var channels: js.Array[String] = js.native
}

object unsubscribeSuccessArgs {
  @scala.inline
  def apply(
    channel: String,
    channels: js.Array[String],
    client: client,
    clientId: String,
    meta: js.Any,
    timestamp: js.Date
  ): unsubscribeSuccessArgs = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[unsubscribeSuccessArgs]
  }
  @scala.inline
  implicit class unsubscribeSuccessArgsOps[Self <: unsubscribeSuccessArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


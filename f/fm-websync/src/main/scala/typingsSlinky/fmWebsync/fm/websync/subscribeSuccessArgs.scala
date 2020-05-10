package typingsSlinky.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait subscribeSuccessArgs extends baseResponseArgs {
  /**
    * The channel to which the client was subscribed. Must start with a forward slash (/).
    */
  var channel: String = js.native
  /**
    * The channels to which the client was subscribed. Each must start with a forward slash (/).
    */
  var channels: js.Array[String] = js.native
  /**
    * Whether the call to client.subscribe was triggered by a reconnection after network failure.
    */
  var isResubscribe: Boolean = js.native
  /**
    * Subscribers extension. The active subscribed clients on the just-subscribed channel(s).
    */
  var subscribedClients: js.Array[subscribedClient] = js.native
}

object subscribeSuccessArgs {
  @scala.inline
  def apply(
    channel: String,
    channels: js.Array[String],
    client: client,
    clientId: String,
    isResubscribe: Boolean,
    meta: js.Any,
    subscribedClients: js.Array[subscribedClient],
    timestamp: js.Date
  ): subscribeSuccessArgs = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], isResubscribe = isResubscribe.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], subscribedClients = subscribedClients.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribeSuccessArgs]
  }
  @scala.inline
  implicit class subscribeSuccessArgsOps[Self <: subscribeSuccessArgs] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withIsResubscribe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribedClients(value: js.Array[subscribedClient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribedClients")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BridgeBlindTransfer extends Event {
  var bridge: Bridge = js.native
  /* Properties */
  var channel: Channel = js.native
  var context: String = js.native
  var exten: String = js.native
  var is_external: Boolean = js.native
  var replace_channel: js.UndefOr[Channel] = js.native
  var result: String = js.native
  var transferee: js.UndefOr[Channel] = js.native
}

object BridgeBlindTransfer {
  @scala.inline
  def apply(
    application: String,
    bridge: Bridge,
    channel: Channel,
    context: String,
    exten: String,
    is_external: Boolean,
    result: String,
    timestamp: js.Date,
    `type`: String
  ): BridgeBlindTransfer = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], exten = exten.asInstanceOf[js.Any], is_external = is_external.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeBlindTransfer]
  }
  @scala.inline
  implicit class BridgeBlindTransferOps[Self <: BridgeBlindTransfer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBridge(value: Bridge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExten(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_external(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_external")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplace_channel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace_channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace_channel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace_channel")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferee(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferee")(js.undefined)
        ret
    }
  }
  
}


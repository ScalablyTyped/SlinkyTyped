package typingsSlinky.sccBrokerClient.clusterBrokerClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageData extends js.Object {
  var channelName: String = js.native
  var packet: js.Any = js.native
}

object MessageData {
  @scala.inline
  def apply(channelName: String, packet: js.Any): MessageData = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], packet = packet.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageData]
  }
  @scala.inline
  implicit class MessageDataOps[Self <: MessageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPacket(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.mqttPacket.mod

import typingsSlinky.mqttPacket.anon.ServerReference
import typingsSlinky.mqttPacket.mqttPacketStrings.disconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDisconnectPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IDisconnectPacket: disconnect = js.native
  var properties: js.UndefOr[ServerReference] = js.native
}

object IDisconnectPacket {
  @scala.inline
  def apply(cmd: disconnect): IDisconnectPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisconnectPacket]
  }
  @scala.inline
  implicit class IDisconnectPacketOps[Self <: IDisconnectPacket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmd(value: disconnect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: ServerReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}


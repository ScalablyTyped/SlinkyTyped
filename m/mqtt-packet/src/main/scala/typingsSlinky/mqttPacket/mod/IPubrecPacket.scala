package typingsSlinky.mqttPacket.mod

import typingsSlinky.mqttPacket.anon.ReasonString
import typingsSlinky.mqttPacket.mqttPacketStrings.pubrec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPubrecPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPubrecPacket: pubrec = js.native
  var properties: js.UndefOr[ReasonString] = js.native
}

object IPubrecPacket {
  @scala.inline
  def apply(cmd: pubrec): IPubrecPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPubrecPacket]
  }
  @scala.inline
  implicit class IPubrecPacketOps[Self <: IPubrecPacket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmd(value: pubrec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: ReasonString): Self = {
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


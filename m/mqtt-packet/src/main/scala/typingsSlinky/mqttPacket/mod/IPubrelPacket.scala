package typingsSlinky.mqttPacket.mod

import typingsSlinky.mqttPacket.AnonReasonString
import typingsSlinky.mqttPacket.mqttPacketStrings.pubrel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPubrelPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPubrelPacket: pubrel = js.native
  var properties: js.UndefOr[AnonReasonString] = js.native
}

object IPubrelPacket {
  @scala.inline
  def apply(cmd: pubrel): IPubrelPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPubrelPacket]
  }
  @scala.inline
  implicit class IPubrelPacketOps[Self <: IPubrelPacket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmd(value: pubrel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: AnonReasonString): Self = {
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


package typingsSlinky.mqttPacket.mod

import typingsSlinky.mqttPacket.AnonReasonString
import typingsSlinky.mqttPacket.mqttPacketStrings.suback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubackPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_ISubackPacket: suback = js.native
  var granted: js.Array[Double | js.Object] = js.native
  var properties: js.UndefOr[AnonReasonString] = js.native
}

object ISubackPacket {
  @scala.inline
  def apply(cmd: suback, granted: js.Array[Double | js.Object]): ISubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubackPacket]
  }
  @scala.inline
  implicit class ISubackPacketOps[Self <: ISubackPacket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmd(value: suback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGranted(value: js.Array[Double | js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granted")(value.asInstanceOf[js.Any])
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


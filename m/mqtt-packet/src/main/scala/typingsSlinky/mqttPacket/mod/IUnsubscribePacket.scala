package typingsSlinky.mqttPacket.mod

import typingsSlinky.mqttPacket.AnonReasonString
import typingsSlinky.mqttPacket.mqttPacketStrings.unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUnsubscribePacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IUnsubscribePacket: unsubscribe = js.native
  var properties: js.UndefOr[AnonReasonString] = js.native
  var unsubscriptions: js.Array[String] = js.native
}

object IUnsubscribePacket {
  @scala.inline
  def apply(cmd: unsubscribe, unsubscriptions: js.Array[String]): IUnsubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnsubscribePacket]
  }
  @scala.inline
  implicit class IUnsubscribePacketOps[Self <: IUnsubscribePacket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmd(value: unsubscribe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsubscriptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscriptions")(value.asInstanceOf[js.Any])
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


package typingsSlinky.mqttPacket.mod

import typingsSlinky.mqttPacket.AnonAuthenticationData
import typingsSlinky.mqttPacket.AnonPayload
import typingsSlinky.mqttPacket.mqttPacketNumbers.`3`
import typingsSlinky.mqttPacket.mqttPacketNumbers.`4`
import typingsSlinky.mqttPacket.mqttPacketNumbers.`5`
import typingsSlinky.mqttPacket.mqttPacketStrings.MQIsdp
import typingsSlinky.mqttPacket.mqttPacketStrings.MQTT
import typingsSlinky.mqttPacket.mqttPacketStrings.connect
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectPacket
  extends IPacket
     with Packet {
  var clean: js.UndefOr[Boolean] = js.native
  var clientId: String = js.native
  @JSName("cmd")
  var cmd_IConnectPacket: connect = js.native
  var keepalive: js.UndefOr[Double] = js.native
  var password: js.UndefOr[Buffer] = js.native
  var properties: js.UndefOr[AnonAuthenticationData] = js.native
  var protocolId: js.UndefOr[MQTT | MQIsdp] = js.native
  var protocolVersion: js.UndefOr[`4` | `5` | `3`] = js.native
  var username: js.UndefOr[String] = js.native
  var will: js.UndefOr[AnonPayload] = js.native
}

object IConnectPacket {
  @scala.inline
  def apply(clientId: String, cmd: connect): IConnectPacket = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectPacket]
  }
  @scala.inline
  implicit class IConnectPacketOps[Self <: IConnectPacket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmd(value: connect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepalive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepalive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepalive")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: AnonAuthenticationData): Self = {
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
    @scala.inline
    def withProtocolId(value: MQTT | MQIsdp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolId")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocolVersion(value: `4` | `5` | `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
    @scala.inline
    def withWill(value: AnonPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("will")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("will")(js.undefined)
        ret
    }
  }
  
}


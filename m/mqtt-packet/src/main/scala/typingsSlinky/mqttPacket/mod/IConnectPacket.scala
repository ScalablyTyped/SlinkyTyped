package typingsSlinky.mqttPacket.mod

import typingsSlinky.mqttPacket.anon.AuthenticationData
import typingsSlinky.mqttPacket.anon.Payload
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

trait IConnectPacket
  extends IPacket
     with Packet {
  var clean: js.UndefOr[Boolean] = js.undefined
  var clientId: String
  @JSName("cmd")
  var cmd_IConnectPacket: connect
  var keepalive: js.UndefOr[Double] = js.undefined
  var password: js.UndefOr[Buffer] = js.undefined
  var properties: js.UndefOr[AuthenticationData] = js.undefined
  var protocolId: js.UndefOr[MQTT | MQIsdp] = js.undefined
  var protocolVersion: js.UndefOr[`4` | `5` | `3`] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var will: js.UndefOr[Payload] = js.undefined
}

object IConnectPacket {
  @scala.inline
  def apply(
    clientId: String,
    cmd: connect,
    clean: js.UndefOr[Boolean] = js.undefined,
    keepalive: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    messageId: js.UndefOr[Double] = js.undefined,
    password: Buffer = null,
    properties: AuthenticationData = null,
    protocolId: MQTT | MQIsdp = null,
    protocolVersion: `4` | `5` | `3` = null,
    username: String = null,
    will: Payload = null
  ): IConnectPacket = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any])
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (protocolId != null) __obj.updateDynamic("protocolId")(protocolId.asInstanceOf[js.Any])
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (will != null) __obj.updateDynamic("will")(will.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectPacket]
  }
}


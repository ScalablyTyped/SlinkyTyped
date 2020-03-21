package typingsSlinky.mqttPacket.mod

import typingsSlinky.mqttPacket.AnonAssignedClientIdentifier
import typingsSlinky.mqttPacket.AnonAuthenticationData
import typingsSlinky.mqttPacket.AnonCorrelationData
import typingsSlinky.mqttPacket.AnonPayload
import typingsSlinky.mqttPacket.AnonReasonString
import typingsSlinky.mqttPacket.AnonServerReference
import typingsSlinky.mqttPacket.mqttPacketNumbers.`3`
import typingsSlinky.mqttPacket.mqttPacketNumbers.`4`
import typingsSlinky.mqttPacket.mqttPacketNumbers.`5`
import typingsSlinky.mqttPacket.mqttPacketStrings.MQIsdp
import typingsSlinky.mqttPacket.mqttPacketStrings.MQTT
import typingsSlinky.mqttPacket.mqttPacketStrings.connack
import typingsSlinky.mqttPacket.mqttPacketStrings.connect
import typingsSlinky.mqttPacket.mqttPacketStrings.disconnect
import typingsSlinky.mqttPacket.mqttPacketStrings.pingreq
import typingsSlinky.mqttPacket.mqttPacketStrings.pingresp
import typingsSlinky.mqttPacket.mqttPacketStrings.puback
import typingsSlinky.mqttPacket.mqttPacketStrings.pubcomp
import typingsSlinky.mqttPacket.mqttPacketStrings.publish
import typingsSlinky.mqttPacket.mqttPacketStrings.pubrec
import typingsSlinky.mqttPacket.mqttPacketStrings.pubrel
import typingsSlinky.mqttPacket.mqttPacketStrings.suback
import typingsSlinky.mqttPacket.mqttPacketStrings.subscribe
import typingsSlinky.mqttPacket.mqttPacketStrings.unsuback
import typingsSlinky.mqttPacket.mqttPacketStrings.unsubscribe
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mqttPacket.mod.IConnectPacket
  - typingsSlinky.mqttPacket.mod.IPublishPacket
  - typingsSlinky.mqttPacket.mod.IConnackPacket
  - typingsSlinky.mqttPacket.mod.ISubscribePacket
  - typingsSlinky.mqttPacket.mod.ISubackPacket
  - typingsSlinky.mqttPacket.mod.IUnsubscribePacket
  - typingsSlinky.mqttPacket.mod.IUnsubackPacket
  - typingsSlinky.mqttPacket.mod.IPubackPacket
  - typingsSlinky.mqttPacket.mod.IPubcompPacket
  - typingsSlinky.mqttPacket.mod.IPubrelPacket
  - typingsSlinky.mqttPacket.mod.IPingreqPacket
  - typingsSlinky.mqttPacket.mod.IPingrespPacket
  - typingsSlinky.mqttPacket.mod.IDisconnectPacket
  - typingsSlinky.mqttPacket.mod.IPubrecPacket
*/
trait Packet extends js.Object

object Packet {
  @scala.inline
  def IConnackPacket(
    cmd: connack,
    returnCode: Double,
    sessionPresent: Boolean,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonAssignedClientIdentifier = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], returnCode = returnCode.asInstanceOf[js.Any], sessionPresent = sessionPresent.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IPubackPacket(
    cmd: puback,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IUnsubackPacket(
    cmd: unsuback,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IPubcompPacket(
    cmd: pubcomp,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IConnectPacket(
    clientId: String,
    cmd: connect,
    clean: js.UndefOr[Boolean] = js.undefined,
    keepalive: Int | Double = null,
    length: Int | Double = null,
    messageId: Int | Double = null,
    password: Buffer = null,
    properties: AnonAuthenticationData = null,
    protocolId: MQTT | MQIsdp = null,
    protocolVersion: `4` | `5` | `3` = null,
    username: String = null,
    will: AnonPayload = null
  ): Packet = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any])
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (keepalive != null) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (protocolId != null) __obj.updateDynamic("protocolId")(protocolId.asInstanceOf[js.Any])
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (will != null) __obj.updateDynamic("will")(will.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IPublishPacket(
    cmd: publish,
    dup: Boolean,
    payload: String | Buffer,
    qos: QoS,
    retain: Boolean,
    topic: String,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonCorrelationData = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def ISubscribePacket(
    cmd: subscribe,
    subscriptions: js.Array[ISubscription],
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IPubrecPacket(
    cmd: pubrec,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def ISubackPacket(
    cmd: suback,
    granted: js.Array[Double | js.Object],
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IPubrelPacket(
    cmd: pubrel,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IUnsubscribePacket(
    cmd: unsubscribe,
    unsubscriptions: js.Array[String],
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IPingrespPacket(cmd: pingresp, length: Int | Double = null, messageId: Int | Double = null): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IPingreqPacket(cmd: pingreq, length: Int | Double = null, messageId: Int | Double = null): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IDisconnectPacket(
    cmd: disconnect,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: AnonServerReference = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
}


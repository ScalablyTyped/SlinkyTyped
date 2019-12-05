package typingsSlinky.mqttDashPacket.mqttDashPacketMod

import typingsSlinky.mqttDashPacket.Anon_AssignedClientIdentifier
import typingsSlinky.mqttDashPacket.Anon_AuthenticationData
import typingsSlinky.mqttDashPacket.Anon_ContentTypeCorrelationData
import typingsSlinky.mqttDashPacket.Anon_Payload
import typingsSlinky.mqttDashPacket.Anon_ReasonString
import typingsSlinky.mqttDashPacket.Anon_ReasonStringServerReference
import typingsSlinky.mqttDashPacket.mqttDashPacketNumbers.`3`
import typingsSlinky.mqttDashPacket.mqttDashPacketNumbers.`4`
import typingsSlinky.mqttDashPacket.mqttDashPacketNumbers.`5`
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.MQIsdp
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.MQTT
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.connack
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.connect
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.disconnect
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.pingreq
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.pingresp
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.puback
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.pubcomp
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.publish
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.pubrec
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.pubrel
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.suback
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.subscribe
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.unsuback
import typingsSlinky.mqttDashPacket.mqttDashPacketStrings.unsubscribe
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mqttDashPacket.mqttDashPacketMod.IConnectPacket
  - typings.mqttDashPacket.mqttDashPacketMod.IPublishPacket
  - typings.mqttDashPacket.mqttDashPacketMod.IConnackPacket
  - typings.mqttDashPacket.mqttDashPacketMod.ISubscribePacket
  - typings.mqttDashPacket.mqttDashPacketMod.ISubackPacket
  - typings.mqttDashPacket.mqttDashPacketMod.IUnsubscribePacket
  - typings.mqttDashPacket.mqttDashPacketMod.IUnsubackPacket
  - typings.mqttDashPacket.mqttDashPacketMod.IPubackPacket
  - typings.mqttDashPacket.mqttDashPacketMod.IPubcompPacket
  - typings.mqttDashPacket.mqttDashPacketMod.IPubrelPacket
  - typings.mqttDashPacket.mqttDashPacketMod.IPingreqPacket
  - typings.mqttDashPacket.mqttDashPacketMod.IPingrespPacket
  - typings.mqttDashPacket.mqttDashPacketMod.IDisconnectPacket
  - typings.mqttDashPacket.mqttDashPacketMod.IPubrecPacket
*/
trait Packet extends js.Object

object Packet {
  @scala.inline
  def IConnectPacket(
    clientId: String,
    cmd: connect,
    clean: js.UndefOr[Boolean] = js.undefined,
    keepalive: Int | Double = null,
    length: Int | Double = null,
    messageId: Int | Double = null,
    password: Buffer = null,
    properties: Anon_AuthenticationData = null,
    protocolId: MQTT | MQIsdp = null,
    protocolVersion: `4` | `5` | `3` = null,
    username: String = null,
    will: Anon_Payload = null
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
    properties: Anon_ContentTypeCorrelationData = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
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
    properties: Anon_ReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
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
    properties: Anon_ReasonString = null
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
    properties: Anon_ReasonString = null
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
  def IDisconnectPacket(
    cmd: disconnect,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: Anon_ReasonStringServerReference = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
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
    properties: Anon_ReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  @scala.inline
  def IConnackPacket(
    cmd: connack,
    returnCode: Double,
    sessionPresent: Boolean,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: Anon_AssignedClientIdentifier = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], returnCode = returnCode.asInstanceOf[js.Any], sessionPresent = sessionPresent.asInstanceOf[js.Any])
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
    properties: Anon_ReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
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
  def IUnsubackPacket(
    cmd: unsuback,
    length: Int | Double = null,
    messageId: Int | Double = null,
    properties: Anon_ReasonString = null
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
    properties: Anon_ReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
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
    properties: Anon_ReasonString = null
  ): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
}


package typingsSlinky.mqttPacket.mod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def IConnackPacket(cmd: connack, returnCode: Double, sessionPresent: Boolean): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], returnCode = returnCode.asInstanceOf[js.Any], sessionPresent = sessionPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IPubackPacket(cmd: puback): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IUnsubackPacket(cmd: unsuback): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IPubcompPacket(cmd: pubcomp): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IConnectPacket(clientId: String, cmd: connect): Packet = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IPublishPacket(cmd: publish, dup: Boolean, payload: String | Buffer, qos: QoS, retain: Boolean, topic: String): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def ISubscribePacket(cmd: subscribe, subscriptions: js.Array[ISubscription]): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IPubrecPacket(cmd: pubrec): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def ISubackPacket(cmd: suback, granted: js.Array[Double | js.Object]): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IPubrelPacket(cmd: pubrel): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IUnsubscribePacket(cmd: unsubscribe, unsubscriptions: js.Array[String]): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IPingrespPacket(cmd: pingresp): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IPingreqPacket(cmd: pingreq): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IDisconnectPacket(cmd: disconnect): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
}

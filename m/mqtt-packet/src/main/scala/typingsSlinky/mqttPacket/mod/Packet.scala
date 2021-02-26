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
import org.scalablytyped.runtime.StObject
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
trait Packet extends StObject
object Packet {
  
  @scala.inline
  def IConnackPacket(cmd: connack, returnCode: Double, sessionPresent: Boolean): typingsSlinky.mqttPacket.mod.IConnackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], returnCode = returnCode.asInstanceOf[js.Any], sessionPresent = sessionPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.IConnackPacket]
  }
  
  @scala.inline
  def IConnectPacket(clientId: String, cmd: connect): typingsSlinky.mqttPacket.mod.IConnectPacket = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.IConnectPacket]
  }
  
  @scala.inline
  def IDisconnectPacket(cmd: disconnect): typingsSlinky.mqttPacket.mod.IDisconnectPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.IDisconnectPacket]
  }
  
  @scala.inline
  def IPingreqPacket(cmd: pingreq): typingsSlinky.mqttPacket.mod.IPingreqPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.IPingreqPacket]
  }
  
  @scala.inline
  def IPingrespPacket(cmd: pingresp): typingsSlinky.mqttPacket.mod.IPingrespPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.IPingrespPacket]
  }
  
  @scala.inline
  def IPubackPacket(cmd: puback): typingsSlinky.mqttPacket.mod.IPubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.IPubackPacket]
  }
  
  @scala.inline
  def IPubcompPacket(cmd: pubcomp): typingsSlinky.mqttPacket.mod.IPubcompPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.IPubcompPacket]
  }
  
  @scala.inline
  def IPublishPacket(cmd: publish, dup: Boolean, payload: String | Buffer, qos: QoS, retain: Boolean, topic: String): typingsSlinky.mqttPacket.mod.IPublishPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.IPublishPacket]
  }
  
  @scala.inline
  def IPubrecPacket(cmd: pubrec): typingsSlinky.mqttPacket.mod.IPubrecPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.IPubrecPacket]
  }
  
  @scala.inline
  def IPubrelPacket(cmd: pubrel): typingsSlinky.mqttPacket.mod.IPubrelPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.IPubrelPacket]
  }
  
  @scala.inline
  def ISubackPacket(cmd: suback, granted: js.Array[Double | js.Object]): typingsSlinky.mqttPacket.mod.ISubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.ISubackPacket]
  }
  
  @scala.inline
  def ISubscribePacket(cmd: subscribe, subscriptions: js.Array[ISubscription]): typingsSlinky.mqttPacket.mod.ISubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.ISubscribePacket]
  }
  
  @scala.inline
  def IUnsubackPacket(cmd: unsuback): typingsSlinky.mqttPacket.mod.IUnsubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.IUnsubackPacket]
  }
  
  @scala.inline
  def IUnsubscribePacket(cmd: unsubscribe, unsubscriptions: js.Array[String]): typingsSlinky.mqttPacket.mod.IUnsubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mqttPacket.mod.IUnsubscribePacket]
  }
}

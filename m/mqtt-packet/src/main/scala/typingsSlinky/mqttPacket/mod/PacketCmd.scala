package typingsSlinky.mqttPacket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mqttPacket.mqttPacketStrings.connack
  - typingsSlinky.mqttPacket.mqttPacketStrings.connect
  - typingsSlinky.mqttPacket.mqttPacketStrings.disconnect
  - typingsSlinky.mqttPacket.mqttPacketStrings.pingreq
  - typingsSlinky.mqttPacket.mqttPacketStrings.pingresp
  - typingsSlinky.mqttPacket.mqttPacketStrings.puback
  - typingsSlinky.mqttPacket.mqttPacketStrings.pubcomp
  - typingsSlinky.mqttPacket.mqttPacketStrings.publish
  - typingsSlinky.mqttPacket.mqttPacketStrings.pubrel
  - typingsSlinky.mqttPacket.mqttPacketStrings.pubrec
  - typingsSlinky.mqttPacket.mqttPacketStrings.suback
  - typingsSlinky.mqttPacket.mqttPacketStrings.subscribe
  - typingsSlinky.mqttPacket.mqttPacketStrings.unsuback
  - typingsSlinky.mqttPacket.mqttPacketStrings.unsubscribe
*/
trait PacketCmd extends js.Object

object PacketCmd {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connack: typingsSlinky.mqttPacket.mqttPacketStrings.connack = this.cast("connack")
  @scala.inline
  def connect: typingsSlinky.mqttPacket.mqttPacketStrings.connect = this.cast("connect")
  @scala.inline
  def disconnect: typingsSlinky.mqttPacket.mqttPacketStrings.disconnect = this.cast("disconnect")
  @scala.inline
  def pingreq: typingsSlinky.mqttPacket.mqttPacketStrings.pingreq = this.cast("pingreq")
  @scala.inline
  def pingresp: typingsSlinky.mqttPacket.mqttPacketStrings.pingresp = this.cast("pingresp")
  @scala.inline
  def puback: typingsSlinky.mqttPacket.mqttPacketStrings.puback = this.cast("puback")
  @scala.inline
  def pubcomp: typingsSlinky.mqttPacket.mqttPacketStrings.pubcomp = this.cast("pubcomp")
  @scala.inline
  def publish: typingsSlinky.mqttPacket.mqttPacketStrings.publish = this.cast("publish")
  @scala.inline
  def pubrec: typingsSlinky.mqttPacket.mqttPacketStrings.pubrec = this.cast("pubrec")
  @scala.inline
  def pubrel: typingsSlinky.mqttPacket.mqttPacketStrings.pubrel = this.cast("pubrel")
  @scala.inline
  def suback: typingsSlinky.mqttPacket.mqttPacketStrings.suback = this.cast("suback")
  @scala.inline
  def subscribe: typingsSlinky.mqttPacket.mqttPacketStrings.subscribe = this.cast("subscribe")
  @scala.inline
  def unsuback: typingsSlinky.mqttPacket.mqttPacketStrings.unsuback = this.cast("unsuback")
  @scala.inline
  def unsubscribe: typingsSlinky.mqttPacket.mqttPacketStrings.unsubscribe = this.cast("unsubscribe")
}


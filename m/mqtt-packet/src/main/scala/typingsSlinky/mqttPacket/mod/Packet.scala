package typingsSlinky.mqttPacket.mod

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
  implicit def apply(value: IConnackPacket): Packet = value.asInstanceOf[Packet]
  @scala.inline
  implicit def apply(value: IConnectPacket): Packet = value.asInstanceOf[Packet]
  @scala.inline
  implicit def apply(value: IDisconnectPacket): Packet = value.asInstanceOf[Packet]
  @scala.inline
  implicit def apply(value: IPingreqPacket): Packet = value.asInstanceOf[Packet]
  @scala.inline
  implicit def apply(value: IPingrespPacket): Packet = value.asInstanceOf[Packet]
  @scala.inline
  implicit def apply(value: IPubackPacket): Packet = value.asInstanceOf[Packet]
  @scala.inline
  implicit def apply(value: IPubcompPacket): Packet = value.asInstanceOf[Packet]
  @scala.inline
  implicit def apply(value: IPublishPacket): Packet = value.asInstanceOf[Packet]
  @scala.inline
  implicit def apply(value: IPubrecPacket): Packet = value.asInstanceOf[Packet]
  @scala.inline
  implicit def apply(value: IPubrelPacket): Packet = value.asInstanceOf[Packet]
  @scala.inline
  implicit def apply(value: ISubackPacket): Packet = value.asInstanceOf[Packet]
  @scala.inline
  implicit def apply(value: ISubscribePacket): Packet = value.asInstanceOf[Packet]
  @scala.inline
  implicit def apply(value: IUnsubackPacket): Packet = value.asInstanceOf[Packet]
  @scala.inline
  implicit def apply(value: IUnsubscribePacket): Packet = value.asInstanceOf[Packet]
}


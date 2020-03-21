package typingsSlinky.mqttPacket.mod

import typingsSlinky.mqttPacket.mqttPacketStrings.error
import typingsSlinky.mqttPacket.mqttPacketStrings.packet
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser_ extends EventEmitter {
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_packet(event: packet, callback: js.Function1[/* packet */ Packet, Unit]): this.type = js.native
  def parse(buffer: Buffer): Double = js.native
  def parse(buffer: Buffer, opts: js.Object): Double = js.native
}


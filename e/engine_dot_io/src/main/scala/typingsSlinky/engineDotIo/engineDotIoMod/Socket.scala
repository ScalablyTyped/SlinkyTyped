package typingsSlinky.engineDotIo.engineDotIoMod

import typingsSlinky.engineDotIo.engineDotIoStrings.close
import typingsSlinky.engineDotIo.engineDotIoStrings.closed
import typingsSlinky.engineDotIo.engineDotIoStrings.closing
import typingsSlinky.engineDotIo.engineDotIoStrings.drain
import typingsSlinky.engineDotIo.engineDotIoStrings.error
import typingsSlinky.engineDotIo.engineDotIoStrings.flush
import typingsSlinky.engineDotIo.engineDotIoStrings.message
import typingsSlinky.engineDotIo.engineDotIoStrings.open
import typingsSlinky.engineDotIo.engineDotIoStrings.opening
import typingsSlinky.engineDotIo.engineDotIoStrings.packet
import typingsSlinky.engineDotIo.engineDotIoStrings.packetCreate
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A representation of a client. Inherits from EventEmitter.
	 */
@JSImport("engine.io", "Socket")
@js.native
class Socket () extends EventEmitter {
  /**
  		 * unique identifier
  		 */
  var id: String = js.native
  /**
  		 * readyState
  		 */
  var readyState: opening | open | closing | closed = js.native
  /**
  		 * request that originated the Socket
  		 */
  var request: IncomingMessage = js.native
  /**
  		 * engine parent reference
  		 */
  var server: Server = js.native
  /**
  		 * whether the transport has been upgraded
  		 */
  var upgraded: Boolean = js.native
  /**
  		 * Disconnects the client
  		 */
  def close(): this.type = js.native
  /**
  		 * Fired when the client is disconnected.
  		 */
  @JSName("on")
  def on_close(ev: close, fn: js.Function2[/* reason */ String, /* description */ js.UndefOr[js.Error], Unit]): this.type = js.native
  /**
  		 * Called when the write buffer is drained
  		 */
  @JSName("on")
  def on_drain(ev: drain, fn: js.Function0[Unit]): this.type = js.native
  /**
  		 * Fired when an error occurs.
  		 */
  @JSName("on")
  def on_error(ev: error, fn: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  /**
  		 * Called when the write buffer is being flushed.
  		 */
  @JSName("on")
  def on_flush(ev: flush, fn: js.Function1[/* buffer */ js.Array[Packet], Unit]): this.type = js.native
  /**
  		 * Fired when the client sends a message.
  		 */
  @JSName("on")
  def on_message(ev: message, fn: js.Function1[/* data */ String | Buffer, Unit]): this.type = js.native
  /**
  		 * packet: Called when a socket received a packet (message, ping)
  		 * packetCreate: Called before a socket sends a packet (message, pong)
  		 */
  @JSName("on")
  def on_packet(ev: packet, fn: js.Function1[/* packet */ Packet, Unit]): this.type = js.native
  @JSName("on")
  def on_packetCreate(ev: packetCreate, fn: js.Function1[/* packet */ Packet, Unit]): this.type = js.native
  /**
  		 * Sends a message, performing message = toString(arguments[0]) unless sending binary data, which is sent as is.
  		 */
  def send(message: Message): Unit = js.native
  def send(message: Message, opts: MessageOptions): Unit = js.native
  def send(message: Message, opts: MessageOptions, fn: js.Function1[/* transport */ js.Any, Unit]): Unit = js.native
}


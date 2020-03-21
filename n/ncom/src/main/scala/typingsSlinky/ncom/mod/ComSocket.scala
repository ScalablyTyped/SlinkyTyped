package typingsSlinky.ncom.mod

import typingsSlinky.ncom.ncomStrings.error
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.netMod.SocketConstructorOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ncom", "ComSocket")
@js.native
class ComSocket protected () extends EventEmitter {
  def this(options: SocketConstructorOpts, id: String) = this()
  def this(options: Socket, id: String) = this()
  var batchDuration: Double = js.native
  var connected: Boolean = js.native
  var id: String = js.native
  var socket: Socket = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  def destroy(): Unit = js.native
  @JSName("emit")
  def emit_error(event: error, err: js.Error): Boolean = js.native
  def end(): Unit = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  def write(data: js.Any): Unit = js.native
  def write(data: js.Any, writeOptions: WriteOptions): Unit = js.native
}


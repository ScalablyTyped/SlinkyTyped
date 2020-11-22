package typingsSlinky.node.childProcessMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.nodeStrings.close
import typingsSlinky.node.nodeStrings.disconnect
import typingsSlinky.node.nodeStrings.error
import typingsSlinky.node.nodeStrings.exit
import typingsSlinky.node.nodeStrings.message
import typingsSlinky.node.processMod.global.NodeJS.Signals
import typingsSlinky.node.streamMod.Pipe
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildProcess extends EventEmitter {
  
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function2[/* code */ Double, /* signal */ Signals, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_exit(event: exit, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: message,
    listener: js.Function2[/* message */ Serializable, /* sendHandle */ SendHandle, Unit]
  ): this.type = js.native
  
  val channel: js.UndefOr[Pipe | Null] = js.native
  
  val connected: Boolean = js.native
  
  def disconnect(): Unit = js.native
  
  @JSName("emit")
  def emit_close(event: close, code: Double, signal: Signals): Boolean = js.native
  @JSName("emit")
  def emit_disconnect(event: disconnect): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, code: Double): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, code: Double, signal: Signals): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, code: Null, signal: Signals): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, message: Serializable, sendHandle: SendHandle): Boolean = js.native
  
  val exitCode: Double | Null = js.native
  
  def kill(): Boolean = js.native
  def kill(signal: Double): Boolean = js.native
  def kill(signal: Signals): Boolean = js.native
  
  val killed: Boolean = js.native
  
  @JSName("on")
  def on_close(event: close, listener: js.Function2[/* code */ Double, /* signal */ Signals, Unit]): this.type = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_exit(event: exit, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("on")
  def on_message(
    event: message,
    listener: js.Function2[/* message */ Serializable, /* sendHandle */ SendHandle, Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_close(event: close, listener: js.Function2[/* code */ Double, /* signal */ Signals, Unit]): this.type = js.native
  @JSName("once")
  def once_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_exit(event: exit, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("once")
  def once_message(
    event: message,
    listener: js.Function2[/* message */ Serializable, /* sendHandle */ SendHandle, Unit]
  ): this.type = js.native
  
  val pid: Double = js.native
  
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function2[/* code */ Double, /* signal */ Signals, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(event: exit, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: message,
    listener: js.Function2[/* message */ Serializable, /* sendHandle */ SendHandle, Unit]
  ): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function2[/* code */ Double, /* signal */ Signals, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: disconnect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(event: exit, listener: js.Function2[/* code */ Double | Null, /* signal */ Signals | Null, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: message,
    listener: js.Function2[/* message */ Serializable, /* sendHandle */ SendHandle, Unit]
  ): this.type = js.native
  
  def ref(): Unit = js.native
  
  def send(message: Serializable): Boolean = js.native
  def send(message: Serializable, callback: js.Function1[/* error */ js.Error | Null, Unit]): Boolean = js.native
  def send(
    message: Serializable,
    sendHandle: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Boolean = js.native
  def send(
    message: Serializable,
    sendHandle: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Boolean = js.native
  def send(message: Serializable, sendHandle: js.UndefOr[scala.Nothing], options: MessageOptions): Boolean = js.native
  def send(
    message: Serializable,
    sendHandle: js.UndefOr[scala.Nothing],
    options: MessageOptions,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Boolean = js.native
  def send(message: Serializable, sendHandle: SendHandle): Boolean = js.native
  def send(
    message: Serializable,
    sendHandle: SendHandle,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Boolean = js.native
  def send(
    message: Serializable,
    sendHandle: SendHandle,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Boolean = js.native
  def send(message: Serializable, sendHandle: SendHandle, options: MessageOptions): Boolean = js.native
  def send(
    message: Serializable,
    sendHandle: SendHandle,
    options: MessageOptions,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Boolean = js.native
  
  val signalCode: Signals | Null = js.native
  
  val spawnargs: js.Array[String] = js.native
  
  val spawnfile: String = js.native
  
  var stderr: Readable | Null = js.native
  
  var stdin: Writable | Null = js.native
  
  val stdio: js.Tuple5[
    Writable | Null, 
    Readable | Null, 
    Readable | Null, 
    js.UndefOr[Readable | Writable | Null], 
    js.UndefOr[Readable | Writable | Null]
  ] = js.native
  
  var stdout: Readable | Null = js.native
  
  def unref(): Unit = js.native
}

package typingsSlinky.node.http2Mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.nodeStrings.close
import typingsSlinky.node.nodeStrings.error
import typingsSlinky.node.nodeStrings.frameError
import typingsSlinky.node.nodeStrings.goaway
import typingsSlinky.node.nodeStrings.ping
import typingsSlinky.node.nodeStrings.timeout
import typingsSlinky.node.tlsMod.TLSSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Http2Session extends EventEmitter {
  
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_frameError(
    event: frameError,
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_goaway(
    event: goaway,
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_localSettings(
    event: typingsSlinky.node.nodeStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_ping(event: ping, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_remoteSettings(
    event: typingsSlinky.node.nodeStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  
  val alpnProtocol: js.UndefOr[String] = js.native
  
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  
  val closed: Boolean = js.native
  
  val connecting: Boolean = js.native
  
  def destroy(): Unit = js.native
  def destroy(error: js.UndefOr[scala.Nothing], code: Double): Unit = js.native
  def destroy(error: js.Error): Unit = js.native
  def destroy(error: js.Error, code: Double): Unit = js.native
  
  val destroyed: Boolean = js.native
  
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_frameError(event: frameError, frameType: Double, errorCode: Double, streamID: Double): Boolean = js.native
  @JSName("emit")
  def emit_goaway(event: goaway, errorCode: Double, lastStreamID: Double, opaqueData: Buffer): Boolean = js.native
  @JSName("emit")
  def emit_localSettings(event: typingsSlinky.node.nodeStrings.localSettings, settings: Settings): Boolean = js.native
  @JSName("emit")
  def emit_ping(event: ping): Boolean = js.native
  @JSName("emit")
  def emit_remoteSettings(event: typingsSlinky.node.nodeStrings.remoteSettings, settings: Settings): Boolean = js.native
  @JSName("emit")
  def emit_timeout(event: timeout): Boolean = js.native
  
  val encrypted: js.UndefOr[Boolean] = js.native
  
  def goaway(): Unit = js.native
  def goaway(
    code: js.UndefOr[scala.Nothing],
    lastStreamID: js.UndefOr[scala.Nothing],
    opaqueData: ArrayBufferView
  ): Unit = js.native
  def goaway(code: js.UndefOr[scala.Nothing], lastStreamID: Double): Unit = js.native
  def goaway(code: js.UndefOr[scala.Nothing], lastStreamID: Double, opaqueData: ArrayBufferView): Unit = js.native
  def goaway(code: Double): Unit = js.native
  def goaway(code: Double, lastStreamID: js.UndefOr[scala.Nothing], opaqueData: ArrayBufferView): Unit = js.native
  def goaway(code: Double, lastStreamID: Double): Unit = js.native
  def goaway(code: Double, lastStreamID: Double, opaqueData: ArrayBufferView): Unit = js.native
  
  val localSettings: Settings = js.native
  
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_frameError(
    event: frameError,
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_goaway(
    event: goaway,
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_localSettings(
    event: typingsSlinky.node.nodeStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ping(event: ping, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_remoteSettings(
    event: typingsSlinky.node.nodeStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_frameError(
    event: frameError,
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_goaway(
    event: goaway,
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_localSettings(
    event: typingsSlinky.node.nodeStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_ping(event: ping, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_remoteSettings(
    event: typingsSlinky.node.nodeStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  
  val originSet: js.UndefOr[js.Array[String]] = js.native
  
  val pendingSettingsAck: Boolean = js.native
  
  def ping(
    callback: js.Function3[/* err */ js.Error | Null, /* duration */ Double, /* payload */ Buffer, Unit]
  ): Boolean = js.native
  def ping(
    payload: ArrayBufferView,
    callback: js.Function3[/* err */ js.Error | Null, /* duration */ Double, /* payload */ Buffer, Unit]
  ): Boolean = js.native
  
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_frameError(
    event: frameError,
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_goaway(
    event: goaway,
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_localSettings(
    event: typingsSlinky.node.nodeStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_ping(event: ping, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_remoteSettings(
    event: typingsSlinky.node.nodeStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_frameError(
    event: frameError,
    listener: js.Function3[/* frameType */ Double, /* errorCode */ Double, /* streamID */ Double, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_goaway(
    event: goaway,
    listener: js.Function3[/* errorCode */ Double, /* lastStreamID */ Double, /* opaqueData */ Buffer, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_localSettings(
    event: typingsSlinky.node.nodeStrings.localSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_ping(event: ping, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_remoteSettings(
    event: typingsSlinky.node.nodeStrings.remoteSettings,
    listener: js.Function1[/* settings */ Settings, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeout(event: timeout, listener: js.Function0[Unit]): this.type = js.native
  
  def ref(): Unit = js.native
  
  val remoteSettings: Settings = js.native
  
  def setTimeout(msecs: Double): Unit = js.native
  def setTimeout(msecs: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def settings(settings: Settings): Unit = js.native
  
  val socket: Socket | TLSSocket = js.native
  
  val state: SessionState = js.native
  
  val `type`: Double = js.native
  
  def unref(): Unit = js.native
}

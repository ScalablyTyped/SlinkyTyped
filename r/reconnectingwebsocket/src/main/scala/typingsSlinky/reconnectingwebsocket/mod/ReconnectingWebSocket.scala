package typingsSlinky.reconnectingwebsocket.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.EventListenerOptions
import typingsSlinky.reconnectingwebsocket.anon.FnCall
import typingsSlinky.reconnectingwebsocket.anon.FnCallData
import typingsSlinky.reconnectingwebsocket.reconnectingwebsocketStrings.close
import typingsSlinky.reconnectingwebsocket.reconnectingwebsocketStrings.connecting
import typingsSlinky.reconnectingwebsocket.reconnectingwebsocketStrings.error
import typingsSlinky.reconnectingwebsocket.reconnectingwebsocketStrings.message
import typingsSlinky.reconnectingwebsocket.reconnectingwebsocketStrings.open
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.ArrayBufferLike
import typingsSlinky.std.BinaryType
import typingsSlinky.std.EventTarget
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This behaves like a `WebSocket` in every way, except if it fails to connect,
  * or it gets disconnected, it will repeatedly poll until it successfully connects
  * again.
  *
  * It is API compatible, so when you have:
  * ```ts
  * ws = new WebSocket('ws://....');
  * ```
  * you can replace with:
  * ```ts
  * ws = new ReconnectingWebSocket('ws://....');
  * ```
  *
  * The event stream will typically look like:
  * - `onconnecting`
  * - `onopen`
  * - `onmessage`
  * - `onmessage`
  * - `onclose` // lost connection
  * - `onconnecting`
  * - `onopen`  // sometime later...
  * - `onmessage`
  * - `onmessage`
  * - etc...
  *
  * It is API compatible with the standard WebSocket API, apart from the following members:
  * - `bufferedAmount`
  * - `extensions`
  * - `binaryType`
  */
@js.native
trait ReconnectingWebSocket extends EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* event */ CloseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ CloseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ CloseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connecting(
    `type`: connecting,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ ConnectingEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connecting(
    `type`: connecting,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ ConnectingEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connecting(
    `type`: connecting,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ ConnectingEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(`type`: open, listener: js.ThisFunction1[/* this */ this.type, /* event */ OpenEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ OpenEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ OpenEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Whether or not the WebSocket should attempt to connect immediately upon instantiation.
    * The socket can be manually opened or closed at any time using `open()` and `close()`.
    */
  var automaticOpen: NonNullable[js.UndefOr[Boolean]] = js.native
  
  /**
    * The binary type, possible values `'blob'` or `'arraybuffer'`.
    */
  val binaryType: BinaryType = js.native
  
  /**
    * Closes the WebSocket connection or connection attempt, if any.
    * If the connection is already `CLOSED`, this method does nothing.
    */
  def close(): Unit = js.native
  /**
    * Closes the WebSocket connection or connection attempt, if any.
    * If the connection is already `CLOSED`, this method does nothing.
    */
  def close(code: js.UndefOr[scala.Nothing], reason: String): Unit = js.native
  /**
    * Closes the WebSocket connection or connection attempt, if any.
    * If the connection is already `CLOSED`, this method does nothing.
    */
  def close(code: Double): Unit = js.native
  /**
    * Closes the WebSocket connection or connection attempt, if any.
    * If the connection is already `CLOSED`, this method does nothing.
    */
  def close(code: Double, reason: String): Unit = js.native
  /**
    * Closes the WebSocket connection or connection attempt, if any.
    * If the connection is already `CLOSED`, this method does nothing.
    */
  @JSName("close")
  var close_Original: FnCall = js.native
  
  /**
    * Whether this instance should log debug messages.
    */
  var debug: NonNullable[js.UndefOr[Boolean]] = js.native
  
  /** The maximum number of reconnection attempts to make. Unlimited if `null`. */
  var maxReconnectAttempts: (NonNullable[js.UndefOr[Double | Null]]) | Null = js.native
  
  /**
    * The maximum number of milliseconds to delay a reconnection attempt.
    * Accepts integer.
    */
  var maxReconnectInterval: NonNullable[js.UndefOr[Double]] = js.native
  
  /** An event listener to be called when the WebSocket connection's `readyState` changes to `CLOSED`. */
  def onclose(event: CloseEvent): Unit = js.native
  
  /** An event listener to be called when a connection begins being attempted. */
  def onconnecting(event: ConnectingEvent): Unit = js.native
  
  /** An event listener to be called when an error occurs. */
  def onerror(event: ErrorEvent): Unit = js.native
  
  /** An event listener to be called when a message is received from the server. */
  def onmessage(event: MessageEvent): Unit = js.native
  
  /**
    * An event listener to be called when the WebSocket connection's `readyState` changes to `OPEN`;
    * this indicates that the connection is ready to send and receive data.
    */
  def onopen(event: OpenEvent): Unit = js.native
  
  def open(): Unit = js.native
  def open(reconnectAttempt: Boolean): Unit = js.native
  
  /**
    * A string indicating the name of the sub-protocol the server selected; this will be one of
    * the strings specified in the protocols parameter when creating the `WebSocket` object.
    */
  val protocol: String | Null = js.native
  
  /**
    * The current state of the connection.
    * Can be one of: `WebSocket.CONNECTING`, `WebSocket.OPEN`, `WebSocket.CLOSING`, `WebSocket.CLOSED`.
    */
  val readyState: Double = js.native
  
  /** The number of attempted reconnects since starting, or the last successful connection. */
  val reconnectAttempts: Double = js.native
  
  /**
    * The rate of increase of the reconnect delay. Allows reconnect attempts to back off when problems persist.
    * Accepts integer or float.
    */
  var reconnectDecay: NonNullable[js.UndefOr[Double]] = js.native
  
  /**
    * The number of milliseconds to delay before attempting to reconnect.
    * Accepts integer.
    */
  var reconnectInterval: NonNullable[js.UndefOr[Double]] = js.native
  
  /**
    * Additional public API method to refresh the connection if still open (close, re-open).
    * For example, if the app suspects bad data / missed heart beats, it can try to refresh.
    */
  def refresh(): Unit = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* event */ CloseEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ CloseEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ CloseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connecting(
    `type`: connecting,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ ConnectingEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connecting(
    `type`: connecting,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ ConnectingEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connecting(
    `type`: connecting,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ ConnectingEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ MessageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(`type`: open, listener: js.ThisFunction1[/* this */ this.type, /* event */ OpenEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ OpenEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* event */ OpenEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** Transmits data to the server over the WebSocket connection. */
  def send(data: String): Unit = js.native
  /** Transmits data to the server over the WebSocket connection. */
  def send(data: ArrayBufferLike): Unit = js.native
  /** Transmits data to the server over the WebSocket connection. */
  def send(data: js.typedarray.ArrayBufferView): Unit = js.native
  /** Transmits data to the server over the WebSocket connection. */
  def send(data: Blob): Unit = js.native
  /** Transmits data to the server over the WebSocket connection. */
  @JSName("send")
  var send_Original: FnCallData = js.native
  
  /**
    * The maximum time in milliseconds to wait for a connection to succeed before closing and retrying.
    * Accepts integer.
    */
  var timeoutInterval: NonNullable[js.UndefOr[Double]] = js.native
  
  /**
    * The URL as resolved by the constructor. This is always an absolute URL.
    */
  val url: String = js.native
}

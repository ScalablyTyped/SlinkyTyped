package typingsSlinky.angularWebsocket.mod.angularAugmentingMod.websocket

import org.scalajs.dom.raw.CloseEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.WebSocket
import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebSocket extends js.Object {
  
  /**
    * Closes the underlying socket, as long as no data is still being sent from the client.
    *
    * @param force if `true`, force close even if data is still being sent
    * @returns this instance, for method chaining
    */
  def close(): IWebSocket = js.native
  def close(force: Boolean): IWebSocket = js.native
  
  /**
    * The initial timeout.
    */
  var initialTimeout: Double = js.native
  
  /**
    * Maximun timeout used to determine reconnection delay.
    */
  var maxTimeout: Double = js.native
  
  /**
    * Adds a callback to be executed each time a socket connection is closed for
    * this instance.
    *
    * @param event event object
    * @returns this instance, for method chaining
    */
  def onClose(callback: js.Function1[/* event */ CloseEvent, Unit]): IWebSocket = js.native
  
  /**
    * List of callbacks to be executed when the socket is closed.
    */
  var onCloseCallbacks: js.Array[js.Function1[/* evt */ CloseEvent, Unit]] = js.native
  
  /**
    * Adds a callback to be executed each time a socket connection is closed for
    * this instance.
    *
    * @param event event object
    * @returns this instance, for method chaining
    */
  def onError(callback: js.Function1[/* event */ Event, Unit]): IWebSocket = js.native
  
  /**
    * List of callbacks to be executed when an error is received from the socket.
    */
  var onErrorCallbacks: js.Array[js.Function1[/* evt */ Event, Unit]] = js.native
  
  /**
    * Adds a callback to be executed each time a socket connection has an error for
    * this instance.
    *
    * @param event event object
    * @returns this instance, for method chaining
    */
  def onMessage(callback: js.Function1[/* event */ MessageEvent, Unit]): IWebSocket = js.native
  def onMessage(callback: js.Function1[/* event */ MessageEvent, Unit], options: IWebSocketMessageOptions): IWebSocket = js.native
  
  /**
    * List of callbacks to be executed when a message is received from the socket.
    */
  var onMessageCallbacks: js.Array[IWebSocketMessageHandler] = js.native
  
  /**
    * Adds a callback to be executed each time a socket connection is opened for
    * this instance.
    *
    * @param event event object
    * @returns this instance, for method chaining
    */
  def onOpen(callback: js.Function1[/* event */ Event, Unit]): IWebSocket = js.native
  
  /**
    * List of callbacks to be executed when the socket is opened.
    */
  var onOpenCallbacks: js.Array[js.Function1[/* evt */ Event, Unit]] = js.native
  
  /**
    * Returns either the readyState value from the underlying WebSocket instance
    * or a proprietary value representing the internal state
    */
  var readyState: Double = js.native
  
  /**
    * Adds data to a queue, and attempts to send if the socket is ready.
    *
    * @param data data to send, if this is an object, it will be stringified before sending
    */
  def send(data: String): IPromise[_] = js.native
  def send(data: js.Object): IPromise[_] = js.native
  
  /**
    * Queue of send calls to be made on socket when socket is able to receive data.
    */
  var sendQueue: js.Array[IWebSocketQueueItem] = js.native
  
  /**
    * WebSocket instance.
    */
  var socket: WebSocket = js.native
}

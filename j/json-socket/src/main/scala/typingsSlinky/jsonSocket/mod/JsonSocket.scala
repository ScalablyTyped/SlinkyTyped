package typingsSlinky.jsonSocket.mod

import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonSocket extends Socket {
  
  /**
    * Same as {@link JsonSocket.sendError}, except that the socket is closed right after the message has been sent
    * using <a href="https://nodejs.org/api/net.html#net_socket_end_data_encoding">net.end()</a>.
    * No more messages can be sent from either the server or client through this socket.
    * @param err
    * @param callback
    */
  def sendEndError(err: js.Error, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Same as {@link JsonSocket.sendMessage}, except that the socket is closed right after the message has been sent
    * using <a href="https://nodejs.org/api/net.html#net_socket_end_data_encoding">net.end()</a>.
    * No more messages can be sent from either the server or client through this socket.
    * @param message the message to send
    * @param callback will be called after the message has been sent
    */
  def sendEndMessage(message: js.Any, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Convenience method for sending an error as a message.
    * @param err an Error object that should be formatted as a message
    * @param callback will be called after the message has been sent
    */
  def sendError(err: js.Error, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Sends a JSON message over the socket.
    * @param message the message to send
    * @param callback will be called after the message has been sent
    */
  def sendMessage(message: js.Any, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

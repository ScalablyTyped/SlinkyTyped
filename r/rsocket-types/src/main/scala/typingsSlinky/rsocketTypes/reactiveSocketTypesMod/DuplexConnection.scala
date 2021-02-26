package typingsSlinky.rsocketTypes.reactiveSocketTypesMod

import typingsSlinky.rsocketFlowable.mod.Flowable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DuplexConnection extends StObject {
  
  /**
    * Close the underlying connection, emitting `onComplete` on the receive()
    * Publisher.
    */
  def close(): Unit = js.native
  
  /**
    * Open the underlying connection. Throws if the connection is already in
    * the CLOSED or ERROR state.
    */
  def connect(): Unit = js.native
  
  /**
    * Returns a Flowable that immediately publishes the current connection
    * status and thereafter updates as it changes. Once a connection is in
    * the CLOSED or ERROR state, it may not be connected again.
    * Implementations must publish values per the comments on ConnectionStatus.
    */
  def connectionStatus(): Flowable[ConnectionStatus] = js.native
  
  /**
    * Returns a stream of all `Frame`s received on this connection.
    *
    * Notes:
    * - Implementations must call `onComplete` if the underlying connection is
    *   closed by the peer or by calling `close()`.
    * - Implementations must call `onError` if there are any errors
    *   sending/receiving frames.
    * - Implemenations may optionally support multi-cast receivers. Those that do
    *   not should throw if `receive` is called more than once.
    */
  def receive(): Flowable[Frame] = js.native
  
  /**
    * Send all the `input` frames on this connection.
    *
    * Notes:
    * - Implementations must not cancel the subscription.
    * - Implementations must signal any errors by calling `onError` on the
    *   `receive()` Publisher.
    */
  def send(input: Flowable[Frame]): Unit = js.native
  
  /**
    * Send a single frame on the connection.
    */
  def sendOne(frame: Frame): Unit = js.native
}
object DuplexConnection {
  
  @scala.inline
  def apply(
    close: () => Unit,
    connect: () => Unit,
    connectionStatus: () => Flowable[ConnectionStatus],
    receive: () => Flowable[Frame],
    send: Flowable[Frame] => Unit,
    sendOne: Frame => Unit
  ): DuplexConnection = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect), connectionStatus = js.Any.fromFunction0(connectionStatus), receive = js.Any.fromFunction0(receive), send = js.Any.fromFunction1(send), sendOne = js.Any.fromFunction1(sendOne))
    __obj.asInstanceOf[DuplexConnection]
  }
  
  @scala.inline
  implicit class DuplexConnectionMutableBuilder[Self <: DuplexConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnect(value: () => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnectionStatus(value: () => Flowable[ConnectionStatus]): Self = StObject.set(x, "connectionStatus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReceive(value: () => Flowable[Frame]): Self = StObject.set(x, "receive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSend(value: Flowable[Frame] => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendOne(value: Frame => Unit): Self = StObject.set(x, "sendOne", js.Any.fromFunction1(value))
  }
}

package typingsSlinky.samchon.iserverconnectorMod

import typingsSlinky.samchon.icommunicatorMod.ICommunicator
import typingsSlinky.samchon.invokeMod.Invoke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServerConnector extends ICommunicator {
  
  /**
    * Connect to a server.
    *
    * Connects to a server with specified *host* address and *port* number. After the connection has
    * succeeded, callback function {@link onConnect} is called. Listening data from the connected server also begins.
    * Replied messages from the connected server will be converted to {@link Invoke} classes and will be shifted to
    * the {@link WebCommunicator.listener listener}'s {@link IProtocol.replyData replyData()} method.
    *
    * If the connection fails immediately, either an event is dispatched or an exception is thrown: an error
    * event is dispatched if a host was specified, and an exception is thrown if no host was specified. Otherwise,
    * the status of the connection is reported by an event. If the socket is already connected, the existing
    * connection is closed first.
    *
    * @param ip The name or IP address of the host to connect to.
    *			 If no host is specified, the host that is contacted is the host where the calling file resides.
    *			 If you do not specify a host, use an event listener to determine whether the connection was
    *			 successful.
    * @param port The port number to connect to.
    */
  def connect(ip: String, port: Double): Unit = js.native
  
  /**
    * Callback function for connection completed.
    *
    * When you call {@link connect connect()} and the connection has completed, then this call back function
    * {@link onConnect} will be called. Note that, if the listener of this {@link onConnect} is a member method of
    * some class, then you've use the ```bind```.
    */
  var onConnect: js.Function = js.native
}
object IServerConnector {
  
  @scala.inline
  def apply(
    close: () => Unit,
    connect: (String, Double) => Unit,
    isConnected: () => Boolean,
    onClose: js.Function,
    onConnect: js.Function,
    replyData: Invoke => Unit,
    sendData: Invoke => Unit
  ): IServerConnector = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction2(connect), isConnected = js.Any.fromFunction0(isConnected), onClose = onClose.asInstanceOf[js.Any], onConnect = onConnect.asInstanceOf[js.Any], replyData = js.Any.fromFunction1(replyData), sendData = js.Any.fromFunction1(sendData))
    __obj.asInstanceOf[IServerConnector]
  }
  
  @scala.inline
  implicit class IServerConnectorOps[Self <: IServerConnector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnect(value: (String, Double) => Unit): Self = this.set("connect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnConnect(value: js.Function): Self = this.set("onConnect", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.scBrokerCluster.mod

import typingsSlinky.async.mod.AsyncResultArrayCallback
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.scBrokerCluster.scBrokerClusterStrings.error
import typingsSlinky.scBrokerCluster.scBrokerClusterStrings.message
import typingsSlinky.scBrokerCluster.scBrokerClusterStrings.ready
import typingsSlinky.scBrokerCluster.scBrokerClusterStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sc-broker-cluster", "Client")
@js.native
class Client protected () extends EventEmitter {
  def this(options: SCBrokerClusterClientOptions) = this()
  
  def destroy(): Unit = js.native
  def destroy(callback: AsyncResultArrayCallback[SCExchange, js.Error]): Unit = js.native
  
  def exchange(): SCExchange = js.native
  
  def isSubscribed(channel: String): Boolean = js.native
  def isSubscribed(channel: String, includePending: Boolean): Boolean = js.native
  
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* packet */ MessagePacket, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, listener: js.Function1[/* warning */ js.UndefOr[js.Error], Unit]): this.type = js.native
  
  var options: SCBrokerClusterClientOptions = js.native
  
  def setSCServer(scServer: SCServer): Unit = js.native
  
  def subscribe(channel: String): Unit = js.native
  def subscribe(channel: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  def subscribeSocket(socket: ServerSocket, channel: String): Unit = js.native
  def subscribeSocket(
    socket: ServerSocket,
    channel: String,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  
  def unsubscribe(channel: String): Unit = js.native
  def unsubscribe(channel: String, callback: js.Function0[Unit]): Unit = js.native
  
  def unsubscribeAll(): Unit = js.native
  def unsubscribeAll(callback: AsyncResultArrayCallback[_, js.Error]): Unit = js.native
  
  def unsubscribeSocket(socket: ServerSocket, channel: String): Unit = js.native
  def unsubscribeSocket(socket: ServerSocket, channel: String, callback: js.Function0[Unit]): Unit = js.native
}

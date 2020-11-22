package typingsSlinky.amqpConnectionManager.mod

import typingsSlinky.amqpConnectionManager.amqpConnectionManagerStrings.disconnect
import typingsSlinky.amqpConnectionManager.anon.Connection
import typingsSlinky.amqpConnectionManager.anon.Err
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmqpConnectionManager extends EventEmitter {
  
  @JSName("addListener")
  def addListener_connect(
    event: typingsSlinky.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function1[/* arg */ Connection, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_disconnect(event: disconnect, listener: js.Function1[/* arg */ Err, Unit]): this.type = js.native
  
  /**
    * Close this AmqpConnectionManager and free all associated resources.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Create a new ChannelWrapper. This is a proxy for the actual channel (which may or may not exist at any moment, depending on whether or not we are currently connected.)
    * @param opts
    */
  def createChannel(): ChannelWrapper = js.native
  def createChannel(opts: CreateChannelOpts): ChannelWrapper = js.native
  
  /**
    * Returns true if the AmqpConnectionManager is connected to a broker, false otherwise.
    */
  def isConnected(): Boolean = js.native
  
  @JSName("on")
  def on_connect(
    event: typingsSlinky.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function1[/* arg */ Connection, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, listener: js.Function1[/* arg */ Err, Unit]): this.type = js.native
  
  @JSName("once")
  def once_connect(
    event: typingsSlinky.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function1[/* arg */ Connection, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_disconnect(event: disconnect, listener: js.Function1[/* arg */ Err, Unit]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_connect(
    event: typingsSlinky.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function1[/* arg */ Connection, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: disconnect, listener: js.Function1[/* arg */ Err, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_connect(
    event: typingsSlinky.amqpConnectionManager.amqpConnectionManagerStrings.connect,
    listener: js.Function1[/* arg */ Connection, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: disconnect, listener: js.Function1[/* arg */ Err, Unit]): this.type = js.native
}

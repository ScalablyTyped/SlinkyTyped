package typingsSlinky.amqpConnectionManager

import typingsSlinky.amqpConnectionManager.amqpConnectionManagerStrings.close
import typingsSlinky.amqpConnectionManager.amqpConnectionManagerStrings.connect
import typingsSlinky.amqpConnectionManager.amqpConnectionManagerStrings.disconnect
import typingsSlinky.amqpConnectionManager.amqpConnectionManagerStrings.error
import typingsSlinky.amqpConnectionManager.anon.Connection
import typingsSlinky.amqpConnectionManager.anon.ConnectionOptionsnoDelayb
import typingsSlinky.amqpConnectionManager.anon.Err
import typingsSlinky.amqpConnectionManager.anon.Name
import typingsSlinky.amqplib.mod.ConfirmChannel
import typingsSlinky.amqplib.propertiesMod.Message
import typingsSlinky.amqplib.propertiesMod.Options.Publish
import typingsSlinky.amqplib.propertiesMod.Replies.Empty
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amqp-connection-manager", "connect")
  @js.native
  def connect(urls: js.Array[String]): AmqpConnectionManager = js.native
  @JSImport("amqp-connection-manager", "connect")
  @js.native
  def connect(urls: js.Array[String], options: AmqpConnectionManagerOptions): AmqpConnectionManager = js.native
  
  @js.native
  trait AmqpConnectionManager extends EventEmitter {
    
    @JSName("addListener")
    def addListener_connect(event: connect, listener: js.Function1[/* arg */ Connection, Unit]): this.type = js.native
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
    def on_connect(event: connect, listener: js.Function1[/* arg */ Connection, Unit]): this.type = js.native
    @JSName("on")
    def on_disconnect(event: disconnect, listener: js.Function1[/* arg */ Err, Unit]): this.type = js.native
    
    @JSName("once")
    def once_connect(event: connect, listener: js.Function1[/* arg */ Connection, Unit]): this.type = js.native
    @JSName("once")
    def once_disconnect(event: disconnect, listener: js.Function1[/* arg */ Err, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_connect(event: connect, listener: js.Function1[/* arg */ Connection, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_disconnect(event: disconnect, listener: js.Function1[/* arg */ Err, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_connect(event: connect, listener: js.Function1[/* arg */ Connection, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_disconnect(event: disconnect, listener: js.Function1[/* arg */ Err, Unit]): this.type = js.native
  }
  
  @js.native
  trait AmqpConnectionManagerOptions extends StObject {
    
    /**
      * TLS options
      *
      * These are passed through directly to amqplib (http://www.squaremobius.net/amqp.node/channel_api.html#connect),
      * which in turn passes them through to tls.connect (https://nodejs.org/api/tls.html#tls_tls_connect_options_callback)
      */
    var connectionOptions: js.UndefOr[ConnectionOptionsnoDelayb] = js.native
    
    /**
      * is a function which returns one or more servers to connect to. This should return either a single URL or an array of URLs.
      * This is handy when you're using a service discovery mechanism such as Consul or etcd. Instead of taking a callback, this can also
      * return a Promise. Note that if this is supplied, then urls is ignored.
      */
    var findServers: js.UndefOr[
        (js.Function1[/* callback */ js.Function1[/* urls */ String | js.Array[String], Unit], Unit]) | (js.Function0[js.Promise[String | js.Array[String]]])
      ] = js.native
    
    /**
      * Interval to send heartbeats to broker. Defaults to 5 seconds.
      */
    var heartbeatIntervalInSeconds: js.UndefOr[Double] = js.native
    
    /**
      * The time to wait before trying to reconnect. If not specified, defaults to heartbeatIntervalInSeconds
      */
    var reconnectTimeInSeconds: js.UndefOr[Double] = js.native
  }
  object AmqpConnectionManagerOptions {
    
    @scala.inline
    def apply(): AmqpConnectionManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmqpConnectionManagerOptions]
    }
    
    @scala.inline
    implicit class AmqpConnectionManagerOptionsMutableBuilder[Self <: AmqpConnectionManagerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionOptions(value: ConnectionOptionsnoDelayb): Self = StObject.set(x, "connectionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionOptionsUndefined: Self = StObject.set(x, "connectionOptions", js.undefined)
      
      @scala.inline
      def setFindServers(
        value: (js.Function1[/* callback */ js.Function1[/* urls */ String | js.Array[String], Unit], Unit]) | (js.Function0[js.Promise[String | js.Array[String]]])
      ): Self = StObject.set(x, "findServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindServersFunction0(value: () => js.Promise[String | js.Array[String]]): Self = StObject.set(x, "findServers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFindServersFunction1(value: /* callback */ js.Function1[/* urls */ String | js.Array[String], Unit] => Unit): Self = StObject.set(x, "findServers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFindServersUndefined: Self = StObject.set(x, "findServers", js.undefined)
      
      @scala.inline
      def setHeartbeatIntervalInSeconds(value: Double): Self = StObject.set(x, "heartbeatIntervalInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeatIntervalInSecondsUndefined: Self = StObject.set(x, "heartbeatIntervalInSeconds", js.undefined)
      
      @scala.inline
      def setReconnectTimeInSeconds(value: Double): Self = StObject.set(x, "reconnectTimeInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectTimeInSecondsUndefined: Self = StObject.set(x, "reconnectTimeInSeconds", js.undefined)
    }
  }
  
  @js.native
  trait ChannelWrapper extends EventEmitter {
    
    /**
      * @see amqplib
      * @param message
      * @param allUpTo
      */
    def ack(message: Message): Unit = js.native
    def ack(message: Message, allUpTo: Boolean): Unit = js.native
    
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function2[/* err */ js.Error, /* info */ Name, Unit]): this.type = js.native
    
    /**
      * Adds a new 'setup handler'. setup(channel, [cb]) is a function to call when a new underlying channel is created -
      * handy for asserting exchanges and queues exists, and whatnot. The channel object here is a ConfirmChannel from amqplib.
      * The setup function should return a Promise (or optionally take a callback) - no messages will be sent until this Promise resolves.
      * If there is a connection, setup() will be run immediately, and the addSetup Promise/callback won't resolve until setup is complete.
      * Note that in this case, if the setup throws an error, no 'error' event will be emitted, since you can just handle the error here
      * (although the setup will still be added for future reconnects, even if it throws an error.)
      * Setup functions should, ideally, not throw errors, but if they do then the ChannelWrapper will emit an 'error' event.
      * @param func
      */
    def addSetup(func: SetupFunc): js.Promise[Unit] = js.native
    
    /**
      * Close a channel, clean up resources associated with it.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * @see amqplib
      * @param message
      * @param allUpTo
      * @param requeue
      */
    def nack(message: Message): Unit = js.native
    def nack(message: Message, allUpTo: js.UndefOr[scala.Nothing], requeue: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Boolean): Unit = js.native
    def nack(message: Message, allUpTo: Boolean, requeue: Boolean): Unit = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function2[/* err */ js.Error, /* info */ Name, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function2[/* err */ js.Error, /* info */ Name, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function2[/* err */ js.Error, /* info */ Name, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function2[/* err */ js.Error, /* info */ Name, Unit]): this.type = js.native
    
    def publish(exchange: String, routingKey: String, content: js.Object): js.Promise[Unit] = js.native
    def publish(
      exchange: String,
      routingKey: String,
      content: js.Object,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): js.Promise[Unit] = js.native
    def publish(exchange: String, routingKey: String, content: js.Object, options: Publish): js.Promise[Unit] = js.native
    def publish(
      exchange: String,
      routingKey: String,
      content: js.Object,
      options: Publish,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): js.Promise[Unit] = js.native
    /**
      * @see amqplib
      * @param exchange
      * @param routingKey
      * @param content
      * @param options
      * @param callback
      */
    def publish(exchange: String, routingKey: String, content: Buffer): js.Promise[Unit] = js.native
    def publish(
      exchange: String,
      routingKey: String,
      content: Buffer,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): js.Promise[Unit] = js.native
    def publish(exchange: String, routingKey: String, content: Buffer, options: Publish): js.Promise[Unit] = js.native
    def publish(
      exchange: String,
      routingKey: String,
      content: Buffer,
      options: Publish,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): js.Promise[Unit] = js.native
    
    /**
      * Returns a count of messages currently waiting to be sent to the underlying channel.
      */
    def queueLength(): Double = js.native
    
    /**
      * Remove a setup function added with `addSetup`.  If there is currently a
      * connection, `teardown(channel, [cb])` will be run immediately, and the
      * returned Promise will not resolve until it completes.
      * @param func
      * @param [tearDown]
      */
    def removeSetup(func: SetupFunc): js.Promise[Unit] = js.native
    def removeSetup(func: SetupFunc, tearDown: SetupFunc): js.Promise[Unit] = js.native
    
    def sendToQueue(queue: String, content: js.Object): js.Promise[Unit] = js.native
    def sendToQueue(
      queue: String,
      content: js.Object,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): js.Promise[Unit] = js.native
    def sendToQueue(queue: String, content: js.Object, options: Publish): js.Promise[Unit] = js.native
    def sendToQueue(
      queue: String,
      content: js.Object,
      options: Publish,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): js.Promise[Unit] = js.native
    /**
      * @see amqplib
      * @param queue
      * @param content
      * @param options
      * @param callback
      */
    def sendToQueue(queue: String, content: Buffer): js.Promise[Unit] = js.native
    def sendToQueue(
      queue: String,
      content: Buffer,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): js.Promise[Unit] = js.native
    def sendToQueue(queue: String, content: Buffer, options: Publish): js.Promise[Unit] = js.native
    def sendToQueue(
      queue: String,
      content: Buffer,
      options: Publish,
      callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
    ): js.Promise[Unit] = js.native
    
    /**
      * Returns a Promise which resolves when this channel next connects.
      */
    def waitForConnect(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait CreateChannelOpts extends StObject {
    
    /**
      * if true, then ChannelWrapper assumes all messages passed to publish() and sendToQueue() are plain JSON objects.
      * These will be encoded automatically before being sent.
      */
    var json: js.UndefOr[Boolean] = js.native
    
    /**
      * Name for this channel. Used for debugging.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * A function to call whenever we reconnect to the broker (and therefore create a new underlying channel.)
      * This function should either accept a callback, or return a Promise. See addSetup below
      */
    var setup: js.UndefOr[SetupFunc] = js.native
  }
  object CreateChannelOpts {
    
    @scala.inline
    def apply(): CreateChannelOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateChannelOpts]
    }
    
    @scala.inline
    implicit class CreateChannelOptsMutableBuilder[Self <: CreateChannelOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSetup(value: SetupFunc): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupFunction1(value: /* channel */ ConfirmChannel => js.Promise[Unit]): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetupFunction2(
        value: (/* channel */ ConfirmChannel, /* callback */ js.Function1[/* error */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "setup", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    }
  }
  
  type SetupFunc = (js.Function2[
    /* channel */ ConfirmChannel, 
    /* callback */ js.Function1[/* error */ js.UndefOr[js.Error], Unit], 
    Unit
  ]) | (js.Function1[/* channel */ ConfirmChannel, js.Promise[Unit]])
}

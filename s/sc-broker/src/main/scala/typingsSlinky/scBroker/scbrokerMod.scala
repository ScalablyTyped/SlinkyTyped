package typingsSlinky.scBroker

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expirymanager.mod.ExpiryManager
import typingsSlinky.fleximap.mod.FlexiMap
import typingsSlinky.fleximap.mod.KeyChain
import typingsSlinky.ncom.mod.ComSocket
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.scBroker.anon.Run
import typingsSlinky.scBroker.scBrokerStrings.broker
import typingsSlinky.scBroker.scBrokerStrings.masterMessage
import typingsSlinky.scBroker.scBrokerStrings.message
import typingsSlinky.scBroker.scBrokerStrings.publish
import typingsSlinky.scBroker.scBrokerStrings.publishIn
import typingsSlinky.scBroker.scBrokerStrings.subscribe
import typingsSlinky.scBroker.scBrokerStrings.unsubscribe
import typingsSlinky.scBroker.scBrokerStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scbrokerMod {
  
  @JSImport("sc-broker/scbroker", JSImport.Namespace)
  @js.native
  class ^ () extends SCBroker {
    def this(options: Run) = this()
  }
  
  /* static member */
  @JSImport("sc-broker/scbroker", "create")
  @js.native
  def create(): SCBroker = js.native
  @JSImport("sc-broker/scbroker", "create")
  @js.native
  def create(options: Run): SCBroker = js.native
  
  type PublishMiddleware = js.Function1[/* req */ PublishMiddlewareData, Unit]
  
  @js.native
  trait PublishMiddlewareData extends StObject {
    
    var channel: String = js.native
    
    var command: js.Object = js.native
    
    var socket: ComSocket = js.native
  }
  object PublishMiddlewareData {
    
    @scala.inline
    def apply(channel: String, command: js.Object, socket: ComSocket): PublishMiddlewareData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishMiddlewareData]
    }
    
    @scala.inline
    implicit class PublishMiddlewareDataMutableBuilder[Self <: PublishMiddlewareData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: js.Object): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocket(value: ComSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryFunction = js.Function3[
    /* dataMap */ FlexiMap, 
    /* dataExpirer */ ExpiryManager, 
    /* subscriptions */ Subscriptions, 
    js.Any
  ]
  
  @js.native
  trait SCBroker extends EventEmitter {
    
    val MIDDLEWARE_PUBLISH_IN: publishIn = js.native
    
    val MIDDLEWARE_SUBSCRIBE: subscribe = js.native
    
    @JSName("addMiddleware")
    def addMiddleware_publish(`type`: publish, middleware: PublishMiddleware): Unit = js.native
    @JSName("addMiddleware")
    def addMiddleware_subscribe(`type`: subscribe, middleware: SubscribeMiddleware): Unit = js.native
    
    var dataExpirer: ExpiryManager = js.native
    
    var dataMap: FlexiMap = js.native
    
    var debugPort: Double = js.native
    
    def exec(query: QueryFunction): js.Any = js.native
    def exec(query: QueryFunction, baseKey: KeyChain): js.Any = js.native
    
    var id: Double = js.native
    
    var instanceId: Double = js.native
    
    @JSName("on")
    def on_masterMessage(
      event: masterMessage,
      listener: js.Function2[
          /* data */ js.Any, 
          /* respond */ js.Function2[/* err */ js.Error | Null, /* responseData */ js.Any, Unit], 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_message(
      event: message,
      listener: js.Function2[
          /* message */ js.Any, 
          /* respond */ js.Function2[/* err */ js.Error | Null, /* responseData */ js.Any, Unit], 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_publish(event: publish, listener: js.Function2[/* channel */ String, /* data */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_subscribe(event: subscribe, listener: js.Function1[/* channel */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_unsubscribe(event: unsubscribe, listener: js.Function1[/* channel */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_warning(event: warning, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    var options: SCBrokerOptions = js.native
    
    def publish(channel: String, message: js.Any): Unit = js.native
    
    @JSName("removeMiddleware")
    def removeMiddleware_publish(`type`: publish, middleware: PublishMiddleware): Unit = js.native
    @JSName("removeMiddleware")
    def removeMiddleware_subscribe(`type`: subscribe, middleware: SubscribeMiddleware): Unit = js.native
    
    def run(): Unit = js.native
    
    def sendToMaster(data: js.Any): Unit = js.native
    def sendToMaster(data: js.Any, callback: js.Function2[/* err */ js.Error | Null, /* responseData */ js.Any, Unit]): Unit = js.native
    
    var subscriptions: Subscriptions = js.native
    
    val `type`: broker = js.native
  }
  
  @js.native
  trait SCBrokerOptions
    extends /* additionalOptions */ StringDictionary[js.Any] {
    
    // An ID to associate with this specific instance of SC
    // this may be useful if you are running an SC app on multiple
    // hosts - You can access the instanceId from the Broker object
    // (inside brokerController) - If you don't provide an instanceId,
    // SC will generate a random one (UUID v4)
    var instanceId: js.UndefOr[String] = js.native
    
    // In milliseconds, the timeout for calling res(err, data) when
    // your sendToWorker, sendToBroker or sendToMaster (IPC) call
    // expects an ACK response from the other process
    // (when callback is provided)
    var ipcAckTimeout: js.UndefOr[Double] = js.native
    
    // A key which various SC processes will use to interact with
    // scBroker broker processes securely, defaults to a 256 bits
    // cryptographically random hex string
    var secretKey: js.UndefOr[String] = js.native
  }
  object SCBrokerOptions {
    
    @scala.inline
    def apply(): SCBrokerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SCBrokerOptions]
    }
    
    @scala.inline
    implicit class SCBrokerOptionsMutableBuilder[Self <: SCBrokerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setIpcAckTimeout(value: Double): Self = StObject.set(x, "ipcAckTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpcAckTimeoutUndefined: Self = StObject.set(x, "ipcAckTimeout", js.undefined)
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
    }
  }
  
  type SubscribeMiddleware = js.Function1[/* req */ SubscribeMiddlewareData, Unit]
  
  @js.native
  trait SubscribeMiddlewareData extends StObject {
    
    var channel: String = js.native
    
    var socket: ComSocket = js.native
  }
  object SubscribeMiddlewareData {
    
    @scala.inline
    def apply(channel: String, socket: ComSocket): SubscribeMiddlewareData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeMiddlewareData]
    }
    
    @scala.inline
    implicit class SubscribeMiddlewareDataMutableBuilder[Self <: SubscribeMiddlewareData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocket(value: ComSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  type Subscriptions = NumberDictionary[StringDictionary[ComSocket]]
}

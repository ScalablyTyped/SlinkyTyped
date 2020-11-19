package typingsSlinky.scBroker.scbrokerMod

import typingsSlinky.expirymanager.mod.ExpiryManager
import typingsSlinky.fleximap.mod.FlexiMap
import typingsSlinky.fleximap.mod.KeyChain
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.scBroker.scBrokerStrings.broker
import typingsSlinky.scBroker.scBrokerStrings.masterMessage
import typingsSlinky.scBroker.scBrokerStrings.message
import typingsSlinky.scBroker.scBrokerStrings.publish
import typingsSlinky.scBroker.scBrokerStrings.publishIn
import typingsSlinky.scBroker.scBrokerStrings.subscribe
import typingsSlinky.scBroker.scBrokerStrings.unsubscribe
import typingsSlinky.scBroker.scBrokerStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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

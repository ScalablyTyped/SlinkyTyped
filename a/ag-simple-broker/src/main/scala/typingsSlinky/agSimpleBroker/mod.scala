package typingsSlinky.agSimpleBroker

import typingsSlinky.agChannel.mod.Client
import typingsSlinky.agSimpleBroker.agSimpleBrokerStrings.error
import typingsSlinky.agSimpleBroker.agSimpleBrokerStrings.publish
import typingsSlinky.agSimpleBroker.agSimpleBrokerStrings.ready
import typingsSlinky.agSimpleBroker.agSimpleBrokerStrings.subscribe
import typingsSlinky.agSimpleBroker.agSimpleBrokerStrings.unsubscribe
import typingsSlinky.agSimpleBroker.anon.Error
import typingsSlinky.agSimpleBroker.anon.Id
import typingsSlinky.writableConsumableStream.consumerMod.ConsumerStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ag-simple-broker", JSImport.Namespace)
  @js.native
  class ^ () extends AGSimpleBroker
  
  @JSImport("ag-simple-broker", "SimpleExchange")
  @js.native
  class SimpleExchange protected ()
    extends typingsSlinky.asyncStreamEmitter.mod.^[js.Any]
       with Client {
    def this(broker: AGSimpleBroker) = this()
    
    def channel(channelName: String): typingsSlinky.agChannel.mod.^[_] = js.native
    
    def closeAllChannelListeners(): Unit = js.native
    
    def closeAllChannelOutputs(): Unit = js.native
    
    def closeAllChannels(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    @JSName("emit")
    def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
    @JSName("emit")
    def emit_unsubscribe(eventName: unsubscribe, data: UnsubscribeData): Unit = js.native
    
    def getAllChannelListenersBackpressure(): Double = js.native
    
    def getAllChannelListenersConsumerStatsList(): js.Array[ConsumerStats] = js.native
    
    def getAllChannelOutputsBackpressure(): Double = js.native
    
    def getAllChannelOutputsConsumerStatsList(): js.Array[ConsumerStats] = js.native
    
    def getAllChannelsBackpressure(): Double = js.native
    
    def getBackpressure(): Double = js.native
    
    def hasAnyChannelListenerConsumer(consumerId: Double): Boolean = js.native
    
    def hasAnyChannelOutputConsumer(consumerId: Double): Boolean = js.native
    
    var id: String = js.native
    
    def killAllChannelListeners(): Unit = js.native
    
    def killAllChannelOutputs(): Unit = js.native
    
    def killAllChannels(): Unit = js.native
    
    @JSName("listener")
    def listener_subscribe(eventName: subscribe): typingsSlinky.consumableStream.mod.^[SubscribeData] = js.native
    @JSName("listener")
    def listener_unsubscribe(eventName: unsubscribe): typingsSlinky.consumableStream.mod.^[UnsubscribeData] = js.native
    
    def subscriptions(): js.Array[String] = js.native
    def subscriptions(includePending: Boolean): js.Array[String] = js.native
    
    /* AGChannel.Client end */
    def transmit(event: String, packet: js.Any): Unit = js.native
  }
  
  @js.native
  trait AGSimpleBroker
    extends typingsSlinky.asyncStreamEmitter.mod.^[js.Any] {
    
    @JSName("emit")
    def emit_error(eventName: error, data: Error): Unit = js.native
    @JSName("emit")
    def emit_publish(eventName: publish, data: PublishData): Unit = js.native
    @JSName("emit")
    def emit_ready(eventName: ready, data: js.Object): Unit = js.native
    @JSName("emit")
    def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
    @JSName("emit")
    def emit_unsubscribe(eventName: unsubscribe, data: UnsubscribeData): Unit = js.native
    
    def exchange(): SimpleExchange = js.native
    
    def invokePublish(channelName: String, data: js.Any): js.Promise[Unit] = js.native
    def invokePublish(channelName: String, data: js.Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
    
    var isReady: Boolean = js.native
    
    def isSubscribed(channelName: String): Boolean = js.native
    
    @JSName("listener")
    def listener_error(eventName: error): typingsSlinky.consumableStream.mod.^[Error] = js.native
    @JSName("listener")
    def listener_publish(eventName: publish): typingsSlinky.consumableStream.mod.^[PublishData] = js.native
    @JSName("listener")
    def listener_ready(eventName: ready): typingsSlinky.consumableStream.mod.^[js.Object] = js.native
    @JSName("listener")
    def listener_subscribe(eventName: subscribe): typingsSlinky.consumableStream.mod.^[SubscribeData] = js.native
    @JSName("listener")
    def listener_unsubscribe(eventName: unsubscribe): typingsSlinky.consumableStream.mod.^[UnsubscribeData] = js.native
    
    def setCodecEngine(
      codec: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGServer.CodecEngine */ js.Any
    ): Unit = js.native
    
    def subscribeClient(client: Id, channelName: String): js.Promise[Unit] = js.native
    
    def subscribeSocket(client: Id, channelName: String): js.Promise[Unit] = js.native
    
    def subscriptions(): js.Array[String] = js.native
    
    def transmitPublish(channelName: String, data: js.Any): js.Promise[Unit] = js.native
    def transmitPublish(channelName: String, data: js.Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
    
    def unsubscribeClient(client: Id, channelName: String): js.Promise[Unit] = js.native
    
    def unsubscribeSocket(client: Id, channelName: String): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait PublishData extends StObject {
    
    var channel: String = js.native
    
    var date: js.Any = js.native
  }
  object PublishData {
    
    @scala.inline
    def apply(channel: String, date: js.Any): PublishData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishData]
    }
    
    @scala.inline
    implicit class PublishDataMutableBuilder[Self <: PublishData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: js.Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubscribeData extends StObject {
    
    var channel: String = js.native
  }
  object SubscribeData {
    
    @scala.inline
    def apply(channel: String): SubscribeData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeData]
    }
    
    @scala.inline
    implicit class SubscribeDataMutableBuilder[Self <: SubscribeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnsubscribeData extends StObject {
    
    var channel: String = js.native
  }
  object UnsubscribeData {
    
    @scala.inline
    def apply(channel: String): UnsubscribeData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsubscribeData]
    }
    
    @scala.inline
    implicit class UnsubscribeDataMutableBuilder[Self <: UnsubscribeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
}

package typingsSlinky.sccBrokerClient

import typingsSlinky.jsonwebtoken.mod.Secret
import typingsSlinky.sccBrokerClient.anon.Error
import typingsSlinky.sccBrokerClient.anon.NoMatchingPublishTargetError
import typingsSlinky.sccBrokerClient.clientPoolMod.PublishData
import typingsSlinky.sccBrokerClient.clientPoolMod.PublishFailData
import typingsSlinky.sccBrokerClient.clientPoolMod.SubscribeData
import typingsSlinky.sccBrokerClient.clientPoolMod.SubscribeFailData
import typingsSlinky.sccBrokerClient.mod.Broker
import typingsSlinky.sccBrokerClient.mod.MappingEngine
import typingsSlinky.sccBrokerClient.mod.SCCBrokerClientOptions
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.error
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.message
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.publish
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.publishFail
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.simple
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.skeletonRendezvous
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.subscribe
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.subscribeFail
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.updateBrokers
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.updateWorkers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterBrokerClientMod {
  
  @JSImport("scc-broker-client/cluster-broker-client", JSImport.Namespace)
  @js.native
  class ^ protected () extends ClusterBrokerClient {
    def this(broker: typingsSlinky.scBroker.scbrokerMod.^) = this()
    def this(broker: typingsSlinky.scBroker.scbrokerMod.^, options: SCCBrokerClientOptions) = this()
  }
  
  @js.native
  trait ClusterBrokerClient
    extends typingsSlinky.asyncStreamEmitter.mod.^[js.Any] {
    
    var authKey: js.UndefOr[Secret] = js.native
    
    var broker: Broker = js.native
    
    var clientPoolSize: Double = js.native
    
    @JSName("emit")
    def emit_error(eventName: error, data: Error): Unit = js.native
    @JSName("emit")
    def emit_message(eventName: message, data: MessageData): Unit = js.native
    @JSName("emit")
    def emit_publish(eventName: publish, data: PublishData): Unit = js.native
    @JSName("emit")
    def emit_publishFail(eventName: publishFail, data: PublishFailData): Unit = js.native
    @JSName("emit")
    def emit_subscribe(event: subscribe, data: SubscribeData): Unit = js.native
    @JSName("emit")
    def emit_subscribeFail(event: subscribeFail, data: SubscribeFailData): Unit = js.native
    @JSName("emit")
    def emit_updateBrokers(eventName: updateBrokers, data: UpdateBrokersData): Unit = js.native
    @JSName("emit")
    def emit_updateWorkers(eventName: updateWorkers, data: UpdateWorkersData): Unit = js.native
    
    var errors: NoMatchingPublishTargetError = js.native
    
    def getAllSubscriptions(): js.Array[String] = js.native
    
    def invokePublish(channelName: String, data: js.Any): Unit = js.native
    
    var isReady: Boolean = js.native
    
    @JSName("listener")
    def listener_error(eventName: error): typingsSlinky.consumableStream.mod.^[Error] = js.native
    @JSName("listener")
    def listener_message(eventName: message): typingsSlinky.consumableStream.mod.^[MessageData] = js.native
    @JSName("listener")
    def listener_publish(eventName: publish): typingsSlinky.consumableStream.mod.^[PublishData] = js.native
    @JSName("listener")
    def listener_publishFail(eventName: publishFail): typingsSlinky.consumableStream.mod.^[PublishFailData] = js.native
    @JSName("listener")
    def listener_subscribe(event: subscribe): typingsSlinky.consumableStream.mod.^[SubscribeData] = js.native
    @JSName("listener")
    def listener_subscribeFail(event: subscribeFail): typingsSlinky.consumableStream.mod.^[SubscribeFailData] = js.native
    @JSName("listener")
    def listener_updateBrokers(eventName: updateBrokers): typingsSlinky.consumableStream.mod.^[UpdateBrokersData] = js.native
    @JSName("listener")
    def listener_updateWorkers(eventName: updateWorkers): typingsSlinky.consumableStream.mod.^[UpdateWorkersData] = js.native
    
    def mapChannelNameToBrokerURI(channelName: String): String = js.native
    
    var mapper: MappingEngine = js.native
    
    var mappingEngine: skeletonRendezvous | simple | MappingEngine = js.native
    
    var sccBrokerClientPools: js.Array[typingsSlinky.sccBrokerClient.clientPoolMod.^] = js.native
    
    var sccBrokerURIList: js.Array[String] = js.native
    
    def setBrokers(sccBrokerURIList: js.Array[String]): Unit = js.native
    
    def subscribe(channelName: String): Unit = js.native
    
    def unsubscribe(channelName: String): Unit = js.native
  }
  
  @js.native
  trait MessageData extends StObject {
    
    var channelName: String = js.native
    
    var packet: js.Any = js.native
  }
  object MessageData {
    
    @scala.inline
    def apply(channelName: String, packet: js.Any): MessageData = {
      val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], packet = packet.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageData]
    }
    
    @scala.inline
    implicit class MessageDataMutableBuilder[Self <: MessageData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacket(value: js.Any): Self = StObject.set(x, "packet", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateBrokersData extends StObject {
    
    var brokerURIs: js.Array[String] = js.native
  }
  object UpdateBrokersData {
    
    @scala.inline
    def apply(brokerURIs: js.Array[String]): UpdateBrokersData = {
      val __obj = js.Dynamic.literal(brokerURIs = brokerURIs.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateBrokersData]
    }
    
    @scala.inline
    implicit class UpdateBrokersDataMutableBuilder[Self <: UpdateBrokersData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrokerURIs(value: js.Array[String]): Self = StObject.set(x, "brokerURIs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrokerURIsVarargs(value: String*): Self = StObject.set(x, "brokerURIs", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UpdateWorkersData extends StObject {
    
    var sourceWorkerURI: String = js.native
    
    var workerURIs: String = js.native
  }
  object UpdateWorkersData {
    
    @scala.inline
    def apply(sourceWorkerURI: String, workerURIs: String): UpdateWorkersData = {
      val __obj = js.Dynamic.literal(sourceWorkerURI = sourceWorkerURI.asInstanceOf[js.Any], workerURIs = workerURIs.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateWorkersData]
    }
    
    @scala.inline
    implicit class UpdateWorkersDataMutableBuilder[Self <: UpdateWorkersData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceWorkerURI(value: String): Self = StObject.set(x, "sourceWorkerURI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerURIs(value: String): Self = StObject.set(x, "workerURIs", value.asInstanceOf[js.Any])
    }
  }
}

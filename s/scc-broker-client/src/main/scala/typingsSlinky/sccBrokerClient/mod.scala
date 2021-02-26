package typingsSlinky.sccBrokerClient

import typingsSlinky.agSimpleBroker.mod.PublishData
import typingsSlinky.agSimpleBroker.mod.SubscribeData
import typingsSlinky.agSimpleBroker.mod.UnsubscribeData
import typingsSlinky.jsonwebtoken.mod.Secret
import typingsSlinky.sccBrokerClient.clusterBrokerClientMod.^
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.publish
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.simple
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.skeletonRendezvous
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.subscribe
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scc-broker-client", "attach")
  @js.native
  def attach(broker: Broker, options: SCCBrokerClientOptions): ^ = js.native
  
  @js.native
  trait Broker extends StObject {
    
    def invokePublish(channelName: String, data: js.Any, suppressEvent: Boolean): js.Promise[Unit] = js.native
    
    @JSName("listener")
    def listener_publish(eventName: publish): typingsSlinky.consumableStream.mod.^[PublishData] = js.native
    @JSName("listener")
    def listener_subscribe(eventName: subscribe): typingsSlinky.consumableStream.mod.^[SubscribeData] = js.native
    @JSName("listener")
    def listener_unsubscribe(eventName: unsubscribe): typingsSlinky.consumableStream.mod.^[UnsubscribeData] = js.native
    
    def subscriptions(): js.Array[String] = js.native
  }
  
  @js.native
  trait MappingEngine extends StObject {
    
    def findSite(key: String): String = js.native
    
    def getSites(): js.Array[String] = js.native
    
    def setSites(sites: js.Array[String]): Unit = js.native
  }
  object MappingEngine {
    
    @scala.inline
    def apply(findSite: String => String, getSites: () => js.Array[String], setSites: js.Array[String] => Unit): MappingEngine = {
      val __obj = js.Dynamic.literal(findSite = js.Any.fromFunction1(findSite), getSites = js.Any.fromFunction0(getSites), setSites = js.Any.fromFunction1(setSites))
      __obj.asInstanceOf[MappingEngine]
    }
    
    @scala.inline
    implicit class MappingEngineMutableBuilder[Self <: MappingEngine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindSite(value: String => String): Self = StObject.set(x, "findSite", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSites(value: () => js.Array[String]): Self = StObject.set(x, "getSites", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetSites(value: js.Array[String] => Unit): Self = StObject.set(x, "setSites", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SCCBrokerClientOptions extends StObject {
    
    var authKey: js.UndefOr[Secret] = js.native
    
    var brokerRetryDelay: js.UndefOr[Double] = js.native
    
    var clientPoolSize: js.UndefOr[Double] = js.native
    
    var instanceId: js.UndefOr[String] = js.native
    
    var instanceIp: js.UndefOr[String] = js.native
    
    var instanceIpFamily: js.UndefOr[String] = js.native
    
    var instancePort: js.UndefOr[Double] = js.native
    
    var mappingEngine: js.UndefOr[skeletonRendezvous | simple | MappingEngine] = js.native
    
    var noErrorLogging: js.UndefOr[Boolean] = js.native
    
    var pubSubBatchDuration: js.UndefOr[Double] = js.native
    
    var stateServerAckTimeout: js.UndefOr[Double] = js.native
    
    var stateServerConnectTimeout: js.UndefOr[Double] = js.native
    
    var stateServerHost: String = js.native
    
    var stateServerPort: js.UndefOr[Double] = js.native
    
    var stateServerReconnectRandomness: js.UndefOr[Double] = js.native
  }
  object SCCBrokerClientOptions {
    
    @scala.inline
    def apply(stateServerHost: String): SCCBrokerClientOptions = {
      val __obj = js.Dynamic.literal(stateServerHost = stateServerHost.asInstanceOf[js.Any])
      __obj.asInstanceOf[SCCBrokerClientOptions]
    }
    
    @scala.inline
    implicit class SCCBrokerClientOptionsMutableBuilder[Self <: SCCBrokerClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthKey(value: Secret): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
      
      @scala.inline
      def setBrokerRetryDelay(value: Double): Self = StObject.set(x, "brokerRetryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrokerRetryDelayUndefined: Self = StObject.set(x, "brokerRetryDelay", js.undefined)
      
      @scala.inline
      def setClientPoolSize(value: Double): Self = StObject.set(x, "clientPoolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientPoolSizeUndefined: Self = StObject.set(x, "clientPoolSize", js.undefined)
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setInstanceIp(value: String): Self = StObject.set(x, "instanceIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIpFamily(value: String): Self = StObject.set(x, "instanceIpFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIpFamilyUndefined: Self = StObject.set(x, "instanceIpFamily", js.undefined)
      
      @scala.inline
      def setInstanceIpUndefined: Self = StObject.set(x, "instanceIp", js.undefined)
      
      @scala.inline
      def setInstancePort(value: Double): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancePortUndefined: Self = StObject.set(x, "instancePort", js.undefined)
      
      @scala.inline
      def setMappingEngine(value: skeletonRendezvous | simple | MappingEngine): Self = StObject.set(x, "mappingEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappingEngineUndefined: Self = StObject.set(x, "mappingEngine", js.undefined)
      
      @scala.inline
      def setNoErrorLogging(value: Boolean): Self = StObject.set(x, "noErrorLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoErrorLoggingUndefined: Self = StObject.set(x, "noErrorLogging", js.undefined)
      
      @scala.inline
      def setPubSubBatchDuration(value: Double): Self = StObject.set(x, "pubSubBatchDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubSubBatchDurationUndefined: Self = StObject.set(x, "pubSubBatchDuration", js.undefined)
      
      @scala.inline
      def setStateServerAckTimeout(value: Double): Self = StObject.set(x, "stateServerAckTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateServerAckTimeoutUndefined: Self = StObject.set(x, "stateServerAckTimeout", js.undefined)
      
      @scala.inline
      def setStateServerConnectTimeout(value: Double): Self = StObject.set(x, "stateServerConnectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateServerConnectTimeoutUndefined: Self = StObject.set(x, "stateServerConnectTimeout", js.undefined)
      
      @scala.inline
      def setStateServerHost(value: String): Self = StObject.set(x, "stateServerHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateServerPort(value: Double): Self = StObject.set(x, "stateServerPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateServerPortUndefined: Self = StObject.set(x, "stateServerPort", js.undefined)
      
      @scala.inline
      def setStateServerReconnectRandomness(value: Double): Self = StObject.set(x, "stateServerReconnectRandomness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateServerReconnectRandomnessUndefined: Self = StObject.set(x, "stateServerReconnectRandomness", js.undefined)
    }
  }
}

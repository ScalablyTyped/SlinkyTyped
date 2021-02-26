package typingsSlinky.mqtt

import typingsSlinky.mqtt.mqttStrings.mqtts
import typingsSlinky.mqtt.mqttStrings.ssl
import typingsSlinky.mqtt.mqttStrings.tcp
import typingsSlinky.mqtt.mqttStrings.ws
import typingsSlinky.mqtt.mqttStrings.wss
import typingsSlinky.mqtt.mqttStrings.wx
import typingsSlinky.mqtt.mqttStrings.wxs
import typingsSlinky.mqttPacket.mod.QoS
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AuthenticationData extends StObject {
    
    var authenticationData: js.UndefOr[Buffer] = js.native
    
    var authenticationMethod: js.UndefOr[String] = js.native
    
    var maximumPacketSize: js.UndefOr[Double] = js.native
    
    var receiveMaximum: js.UndefOr[Double] = js.native
    
    var requestProblemInformation: js.UndefOr[Boolean] = js.native
    
    var requestResponseInformation: js.UndefOr[Boolean] = js.native
    
    var sessionExpiryInterval: js.UndefOr[Double] = js.native
    
    var topicAliasMaximum: js.UndefOr[Double] = js.native
    
    var userProperties: js.UndefOr[js.Object] = js.native
  }
  object AuthenticationData {
    
    @scala.inline
    def apply(): AuthenticationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticationData]
    }
    
    @scala.inline
    implicit class AuthenticationDataMutableBuilder[Self <: AuthenticationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticationData(value: Buffer): Self = StObject.set(x, "authenticationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationDataUndefined: Self = StObject.set(x, "authenticationData", js.undefined)
      
      @scala.inline
      def setAuthenticationMethod(value: String): Self = StObject.set(x, "authenticationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationMethodUndefined: Self = StObject.set(x, "authenticationMethod", js.undefined)
      
      @scala.inline
      def setMaximumPacketSize(value: Double): Self = StObject.set(x, "maximumPacketSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumPacketSizeUndefined: Self = StObject.set(x, "maximumPacketSize", js.undefined)
      
      @scala.inline
      def setReceiveMaximum(value: Double): Self = StObject.set(x, "receiveMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiveMaximumUndefined: Self = StObject.set(x, "receiveMaximum", js.undefined)
      
      @scala.inline
      def setRequestProblemInformation(value: Boolean): Self = StObject.set(x, "requestProblemInformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestProblemInformationUndefined: Self = StObject.set(x, "requestProblemInformation", js.undefined)
      
      @scala.inline
      def setRequestResponseInformation(value: Boolean): Self = StObject.set(x, "requestResponseInformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestResponseInformationUndefined: Self = StObject.set(x, "requestResponseInformation", js.undefined)
      
      @scala.inline
      def setSessionExpiryInterval(value: Double): Self = StObject.set(x, "sessionExpiryInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionExpiryIntervalUndefined: Self = StObject.set(x, "sessionExpiryInterval", js.undefined)
      
      @scala.inline
      def setTopicAliasMaximum(value: Double): Self = StObject.set(x, "topicAliasMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicAliasMaximumUndefined: Self = StObject.set(x, "topicAliasMaximum", js.undefined)
      
      @scala.inline
      def setUserProperties(value: js.Object): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
  
  @js.native
  trait ContentType extends StObject {
    
    var contentType: js.UndefOr[String] = js.native
    
    var correlationData: js.UndefOr[Buffer] = js.native
    
    var messageExpiryInterval: js.UndefOr[Double] = js.native
    
    var payloadFormatIndicator: js.UndefOr[Boolean] = js.native
    
    var responseTopic: js.UndefOr[String] = js.native
    
    var userProperties: js.UndefOr[js.Object] = js.native
    
    var willDelayInterval: js.UndefOr[Double] = js.native
  }
  object ContentType {
    
    @scala.inline
    def apply(): ContentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentType]
    }
    
    @scala.inline
    implicit class ContentTypeMutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setCorrelationData(value: Buffer): Self = StObject.set(x, "correlationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationDataUndefined: Self = StObject.set(x, "correlationData", js.undefined)
      
      @scala.inline
      def setMessageExpiryInterval(value: Double): Self = StObject.set(x, "messageExpiryInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageExpiryIntervalUndefined: Self = StObject.set(x, "messageExpiryInterval", js.undefined)
      
      @scala.inline
      def setPayloadFormatIndicator(value: Boolean): Self = StObject.set(x, "payloadFormatIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadFormatIndicatorUndefined: Self = StObject.set(x, "payloadFormatIndicator", js.undefined)
      
      @scala.inline
      def setResponseTopic(value: String): Self = StObject.set(x, "responseTopic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTopicUndefined: Self = StObject.set(x, "responseTopic", js.undefined)
      
      @scala.inline
      def setUserProperties(value: js.Object): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
      
      @scala.inline
      def setWillDelayInterval(value: Double): Self = StObject.set(x, "willDelayInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWillDelayIntervalUndefined: Self = StObject.set(x, "willDelayInterval", js.undefined)
    }
  }
  
  @js.native
  trait CorrelationData extends StObject {
    
    var contentType: js.UndefOr[String] = js.native
    
    var correlationData: js.UndefOr[Buffer] = js.native
    
    var messageExpiryInterval: js.UndefOr[Double] = js.native
    
    var payloadFormatIndicator: js.UndefOr[Double] = js.native
    
    var responseTopic: js.UndefOr[String] = js.native
    
    var subscriptionIdentifier: js.UndefOr[Double] = js.native
    
    var topicAlias: js.UndefOr[String] = js.native
    
    var userProperties: js.UndefOr[js.Object] = js.native
  }
  object CorrelationData {
    
    @scala.inline
    def apply(): CorrelationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CorrelationData]
    }
    
    @scala.inline
    implicit class CorrelationDataMutableBuilder[Self <: CorrelationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setCorrelationData(value: Buffer): Self = StObject.set(x, "correlationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationDataUndefined: Self = StObject.set(x, "correlationData", js.undefined)
      
      @scala.inline
      def setMessageExpiryInterval(value: Double): Self = StObject.set(x, "messageExpiryInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageExpiryIntervalUndefined: Self = StObject.set(x, "messageExpiryInterval", js.undefined)
      
      @scala.inline
      def setPayloadFormatIndicator(value: Double): Self = StObject.set(x, "payloadFormatIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadFormatIndicatorUndefined: Self = StObject.set(x, "payloadFormatIndicator", js.undefined)
      
      @scala.inline
      def setResponseTopic(value: String): Self = StObject.set(x, "responseTopic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTopicUndefined: Self = StObject.set(x, "responseTopic", js.undefined)
      
      @scala.inline
      def setSubscriptionIdentifier(value: Double): Self = StObject.set(x, "subscriptionIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionIdentifierUndefined: Self = StObject.set(x, "subscriptionIdentifier", js.undefined)
      
      @scala.inline
      def setTopicAlias(value: String): Self = StObject.set(x, "topicAlias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicAliasUndefined: Self = StObject.set(x, "topicAlias", js.undefined)
      
      @scala.inline
      def setUserProperties(value: js.Object): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
  
  @js.native
  trait Host extends StObject {
    
    var host: String = js.native
    
    var port: Double = js.native
    
    var protocol: js.UndefOr[wss | ws | typingsSlinky.mqtt.mqttStrings.mqtt | mqtts | tcp | ssl | wx | wxs] = js.native
  }
  object Host {
    
    @scala.inline
    def apply(host: String, port: Double): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: wss | ws | typingsSlinky.mqtt.mqttStrings.mqtt | mqtts | tcp | ssl | wx | wxs): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  @js.native
  trait Nl extends StObject {
    
    var nl: js.UndefOr[Boolean] = js.native
    
    var qos: QoS = js.native
    
    var rap: js.UndefOr[Boolean] = js.native
    
    var rh: js.UndefOr[Double] = js.native
  }
  object Nl {
    
    @scala.inline
    def apply(qos: QoS): Nl = {
      val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nl]
    }
    
    @scala.inline
    implicit class NlMutableBuilder[Self <: Nl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNl(value: Boolean): Self = StObject.set(x, "nl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNlUndefined: Self = StObject.set(x, "nl", js.undefined)
      
      @scala.inline
      def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRap(value: Boolean): Self = StObject.set(x, "rap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRapUndefined: Self = StObject.set(x, "rap", js.undefined)
      
      @scala.inline
      def setRh(value: Double): Self = StObject.set(x, "rh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRhUndefined: Self = StObject.set(x, "rh", js.undefined)
    }
  }
  
  @js.native
  trait Payload extends StObject {
    
    /**
      * the message to publish
      */
    var payload: Buffer | String = js.native
    
    /*
      *  properies object of will
      * */
    var properties: js.UndefOr[ContentType] = js.native
    
    /**
      * the QoS
      */
    var qos: QoS = js.native
    
    /**
      * the retain flag
      */
    var retain: Boolean = js.native
    
    /**
      * the topic to publish
      */
    var topic: String = js.native
  }
  object Payload {
    
    @scala.inline
    def apply(payload: Buffer | String, qos: QoS, retain: Boolean, topic: String): Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Buffer | String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: ContentType): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
}

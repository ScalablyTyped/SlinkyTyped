package typingsSlinky.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClusterRequest extends StObject {
  
  /**
    * 
    Information about the broker nodes in the cluster.
    
    */
  var BrokerNodeGroupInfo: typingsSlinky.awsSdk.kafkaMod.BrokerNodeGroupInfo = js.native
  
  /**
    * 
    Includes all client authentication related information.
    
    */
  var ClientAuthentication: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.ClientAuthentication] = js.native
  
  /**
    * 
    The name of the cluster.
    
    */
  var ClusterName: stringMin1Max64 = js.native
  
  /**
    * 
    Represents the configuration that you want MSK to use for the brokers in a cluster.
    
    */
  var ConfigurationInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.ConfigurationInfo] = js.native
  
  /**
    * 
    Includes all encryption-related information.
    
    */
  var EncryptionInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.EncryptionInfo] = js.native
  
  /**
    * 
    Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION.
    
    */
  var EnhancedMonitoring: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.EnhancedMonitoring] = js.native
  
  /**
    * 
    The version of Apache Kafka.
    
    */
  var KafkaVersion: stringMin1Max128 = js.native
  
  var LoggingInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.LoggingInfo] = js.native
  
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: integerMin1Max15 = js.native
  
  /**
    * 
    The settings for open monitoring.
    
    */
  var OpenMonitoring: js.UndefOr[OpenMonitoringInfo] = js.native
  
  /**
    * 
    Create tags when creating the cluster.
    
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}
object CreateClusterRequest {
  
  @scala.inline
  def apply(
    BrokerNodeGroupInfo: BrokerNodeGroupInfo,
    ClusterName: stringMin1Max64,
    KafkaVersion: stringMin1Max128,
    NumberOfBrokerNodes: integerMin1Max15
  ): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(BrokerNodeGroupInfo = BrokerNodeGroupInfo.asInstanceOf[js.Any], ClusterName = ClusterName.asInstanceOf[js.Any], KafkaVersion = KafkaVersion.asInstanceOf[js.Any], NumberOfBrokerNodes = NumberOfBrokerNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  
  @scala.inline
  implicit class CreateClusterRequestMutableBuilder[Self <: CreateClusterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokerNodeGroupInfo(value: BrokerNodeGroupInfo): Self = StObject.set(x, "BrokerNodeGroupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAuthentication(value: ClientAuthentication): Self = StObject.set(x, "ClientAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAuthenticationUndefined: Self = StObject.set(x, "ClientAuthentication", js.undefined)
    
    @scala.inline
    def setClusterName(value: stringMin1Max64): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationInfo(value: ConfigurationInfo): Self = StObject.set(x, "ConfigurationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationInfoUndefined: Self = StObject.set(x, "ConfigurationInfo", js.undefined)
    
    @scala.inline
    def setEncryptionInfo(value: EncryptionInfo): Self = StObject.set(x, "EncryptionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionInfoUndefined: Self = StObject.set(x, "EncryptionInfo", js.undefined)
    
    @scala.inline
    def setEnhancedMonitoring(value: EnhancedMonitoring): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedMonitoringUndefined: Self = StObject.set(x, "EnhancedMonitoring", js.undefined)
    
    @scala.inline
    def setKafkaVersion(value: stringMin1Max128): Self = StObject.set(x, "KafkaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingInfo(value: LoggingInfo): Self = StObject.set(x, "LoggingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingInfoUndefined: Self = StObject.set(x, "LoggingInfo", js.undefined)
    
    @scala.inline
    def setNumberOfBrokerNodes(value: integerMin1Max15): Self = StObject.set(x, "NumberOfBrokerNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenMonitoring(value: OpenMonitoringInfo): Self = StObject.set(x, "OpenMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenMonitoringUndefined: Self = StObject.set(x, "OpenMonitoring", js.undefined)
    
    @scala.inline
    def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}

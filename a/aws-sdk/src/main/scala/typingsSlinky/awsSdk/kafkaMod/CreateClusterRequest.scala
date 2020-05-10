package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterRequest extends js.Object {
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
    Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
    
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
  implicit class CreateClusterRequestOps[Self <: CreateClusterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokerNodeGroupInfo(value: BrokerNodeGroupInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerNodeGroupInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterName(value: stringMin1Max64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKafkaVersion(value: stringMin1Max128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KafkaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfBrokerNodes(value: integerMin1Max15): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfBrokerNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientAuthentication(value: ClientAuthentication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationInfo(value: ConfigurationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionInfo(value: EncryptionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEnhancedMonitoring(value: EnhancedMonitoring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhancedMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhancedMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhancedMonitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingInfo(value: LoggingInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenMonitoring(value: OpenMonitoringInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenMonitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: mapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutableClusterInfo extends js.Object {
  /**
    * 
    Specifies the size of the EBS volume and the ID of the associated broker.
    
    */
  var BrokerEBSVolumeInfo: js.UndefOr[listOfBrokerEBSVolumeInfo] = js.native
  /**
    * 
    Information about the changes in the configuration of the brokers.
    
    */
  var ConfigurationInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.ConfigurationInfo] = js.native
  /**
    * 
    Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
    
    */
  var EnhancedMonitoring: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.EnhancedMonitoring] = js.native
  var LoggingInfo: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.LoggingInfo] = js.native
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: js.UndefOr[integer] = js.native
  /**
    * 
    The settings for open monitoring.
    
    */
  var OpenMonitoring: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.OpenMonitoring] = js.native
}

object MutableClusterInfo {
  @scala.inline
  def apply(): MutableClusterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutableClusterInfo]
  }
  @scala.inline
  implicit class MutableClusterInfoOps[Self <: MutableClusterInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokerEBSVolumeInfo(value: listOfBrokerEBSVolumeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerEBSVolumeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerEBSVolumeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerEBSVolumeInfo")(js.undefined)
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
    def withNumberOfBrokerNodes(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfBrokerNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfBrokerNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfBrokerNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenMonitoring(value: OpenMonitoring): Self = {
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
  }
  
}


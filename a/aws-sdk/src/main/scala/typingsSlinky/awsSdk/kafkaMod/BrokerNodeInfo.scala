package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerNodeInfo extends js.Object {
  /**
    * 
    The attached elastic network interface of the broker.
    
    */
  var AttachedENIId: js.UndefOr[string] = js.native
  /**
    * 
    The ID of the broker.
    
    */
  var BrokerId: js.UndefOr[double] = js.native
  /**
    * 
    The client subnet to which this broker node belongs.
    
    */
  var ClientSubnet: js.UndefOr[string] = js.native
  /**
    * 
    The virtual private cloud (VPC) of the client.
    
    */
  var ClientVpcIpAddress: js.UndefOr[string] = js.native
  /**
    * 
    Information about the version of software currently deployed on the Kafka brokers in the cluster.
    
    */
  var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.native
  /**
    * 
    Endpoints for accessing the broker.
    
    */
  var Endpoints: js.UndefOr[listOfString] = js.native
}

object BrokerNodeInfo {
  @scala.inline
  def apply(): BrokerNodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerNodeInfo]
  }
  @scala.inline
  implicit class BrokerNodeInfoOps[Self <: BrokerNodeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachedENIId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachedENIId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachedENIId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachedENIId")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokerId(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrokerId")(js.undefined)
        ret
    }
    @scala.inline
    def withClientSubnet(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientSubnet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientSubnet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientSubnet")(js.undefined)
        ret
    }
    @scala.inline
    def withClientVpcIpAddress(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpcIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientVpcIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientVpcIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentBrokerSoftwareInfo(value: BrokerSoftwareInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentBrokerSoftwareInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentBrokerSoftwareInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentBrokerSoftwareInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoints(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(js.undefined)
        ret
    }
  }
  
}


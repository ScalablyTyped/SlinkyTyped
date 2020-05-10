package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointDetails extends js.Object {
  /**
    * A list of address allocation IDs that are required to attach an Elastic IP address to your SFTP server's endpoint. This is only valid in the UpdateServer API.  This property can only be use when EndpointType is set to VPC. 
    */
  var AddressAllocationIds: js.UndefOr[typingsSlinky.awsSdk.transferMod.AddressAllocationIds] = js.native
  /**
    * A list of subnet IDs that are required to host your SFTP server endpoint in your VPC.
    */
  var SubnetIds: js.UndefOr[typingsSlinky.awsSdk.transferMod.SubnetIds] = js.native
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[typingsSlinky.awsSdk.transferMod.VpcEndpointId] = js.native
  /**
    * The VPC ID of the virtual private cloud in which the SFTP server's endpoint will be hosted.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.transferMod.VpcId] = js.native
}

object EndpointDetails {
  @scala.inline
  def apply(): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDetails]
  }
  @scala.inline
  implicit class EndpointDetailsOps[Self <: EndpointDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressAllocationIds(value: AddressAllocationIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressAllocationIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressAllocationIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressAllocationIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: SubnetIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcEndpointId(value: VpcEndpointId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: VpcId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}


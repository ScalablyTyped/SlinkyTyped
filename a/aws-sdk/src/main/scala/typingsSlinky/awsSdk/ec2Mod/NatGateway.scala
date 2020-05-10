package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NatGateway extends js.Object {
  /**
    * The date and time the NAT gateway was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time the NAT gateway was deleted, if applicable.
    */
  var DeleteTime: js.UndefOr[js.Date] = js.native
  /**
    * If the NAT gateway could not be created, specifies the error code for the failure. (InsufficientFreeAddressesInSubnet | Gateway.NotAttached | InvalidAllocationID.NotFound | Resource.AlreadyAssociated | InternalError | InvalidSubnetID.NotFound)
    */
  var FailureCode: js.UndefOr[String] = js.native
  /**
    * If the NAT gateway could not be created, specifies the error message for the failure, that corresponds to the error code.   For InsufficientFreeAddressesInSubnet: "Subnet has insufficient free addresses to create this NAT gateway"   For Gateway.NotAttached: "Network vpc-xxxxxxxx has no Internet gateway attached"   For InvalidAllocationID.NotFound: "Elastic IP address eipalloc-xxxxxxxx could not be associated with this NAT gateway"   For Resource.AlreadyAssociated: "Elastic IP address eipalloc-xxxxxxxx is already associated"   For InternalError: "Network interface eni-xxxxxxxx, created and used internally by this NAT gateway is in an invalid state. Please try again."   For InvalidSubnetID.NotFound: "The specified subnet subnet-xxxxxxxx does not exist or could not be found."  
    */
  var FailureMessage: js.UndefOr[String] = js.native
  /**
    * Information about the IP addresses and network interface associated with the NAT gateway.
    */
  var NatGatewayAddresses: js.UndefOr[NatGatewayAddressList] = js.native
  /**
    * The ID of the NAT gateway.
    */
  var NatGatewayId: js.UndefOr[String] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var ProvisionedBandwidth: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ProvisionedBandwidth] = js.native
  /**
    * The state of the NAT gateway.    pending: The NAT gateway is being created and is not ready to process traffic.    failed: The NAT gateway could not be created. Check the failureCode and failureMessage fields for the reason.    available: The NAT gateway is able to process traffic. This status remains until you delete the NAT gateway, and does not indicate the health of the NAT gateway.    deleting: The NAT gateway is in the process of being terminated and may still be processing traffic.    deleted: The NAT gateway has been terminated and is no longer processing traffic.  
    */
  var State: js.UndefOr[NatGatewayState] = js.native
  /**
    * The ID of the subnet in which the NAT gateway is located.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The tags for the NAT gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC in which the NAT gateway is located.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object NatGateway {
  @scala.inline
  def apply(): NatGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NatGateway]
  }
  @scala.inline
  implicit class NatGatewayOps[Self <: NatGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withNatGatewayAddresses(value: NatGatewayAddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NatGatewayAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatGatewayAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NatGatewayAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withNatGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NatGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NatGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedBandwidth(value: ProvisionedBandwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedBandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedBandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: NatGatewayState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
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
    @scala.inline
    def withVpcId(value: String): Self = {
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


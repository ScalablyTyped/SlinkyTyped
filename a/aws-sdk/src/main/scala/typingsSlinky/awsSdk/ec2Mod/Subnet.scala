package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subnet extends js.Object {
  /**
    * Indicates whether a network interface created in this subnet (including a network interface created by RunInstances) receives an IPv6 address.
    */
  var AssignIpv6AddressOnCreation: js.UndefOr[Boolean] = js.native
  /**
    * The Availability Zone of the subnet.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The AZ ID of the subnet.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.native
  /**
    * The number of unused private IPv4 addresses in the subnet. The IPv4 addresses for any stopped instances are considered unavailable.
    */
  var AvailableIpAddressCount: js.UndefOr[Integer] = js.native
  /**
    * The IPv4 CIDR block assigned to the subnet.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  /**
    * Indicates whether this is the default subnet for the Availability Zone.
    */
  var DefaultForAz: js.UndefOr[Boolean] = js.native
  /**
    * Information about the IPv6 CIDR blocks associated with the subnet.
    */
  var Ipv6CidrBlockAssociationSet: js.UndefOr[SubnetIpv6CidrBlockAssociationSet] = js.native
  /**
    * Indicates whether instances launched in this subnet receive a public IPv4 address.
    */
  var MapPublicIpOnLaunch: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the subnet.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The current state of the subnet.
    */
  var State: js.UndefOr[SubnetState] = js.native
  /**
    * The Amazon Resource Name (ARN) of the subnet.
    */
  var SubnetArn: js.UndefOr[String] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the subnet.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC the subnet is in.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object Subnet {
  @scala.inline
  def apply(): Subnet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subnet]
  }
  @scala.inline
  implicit class SubnetOps[Self <: Subnet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignIpv6AddressOnCreation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignIpv6AddressOnCreation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignIpv6AddressOnCreation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignIpv6AddressOnCreation")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableIpAddressCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableIpAddressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableIpAddressCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableIpAddressCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultForAz(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultForAz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultForAz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultForAz")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6CidrBlockAssociationSet(value: SubnetIpv6CidrBlockAssociationSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6CidrBlockAssociationSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6CidrBlockAssociationSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6CidrBlockAssociationSet")(js.undefined)
        ret
    }
    @scala.inline
    def withMapPublicIpOnLaunch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapPublicIpOnLaunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapPublicIpOnLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapPublicIpOnLaunch")(js.undefined)
        ret
    }
    @scala.inline
    def withOutpostArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutpostArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: SubnetState): Self = {
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
    def withSubnetArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetArn")(js.undefined)
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


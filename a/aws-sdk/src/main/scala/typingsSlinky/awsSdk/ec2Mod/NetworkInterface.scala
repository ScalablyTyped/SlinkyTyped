package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterface extends js.Object {
  /**
    * The association information for an Elastic IP address (IPv4) associated with the network interface.
    */
  var Association: js.UndefOr[NetworkInterfaceAssociation] = js.native
  /**
    * The network interface attachment.
    */
  var Attachment: js.UndefOr[NetworkInterfaceAttachment] = js.native
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * A description.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Any security groups for the network interface.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * The type of network interface.
    */
  var InterfaceType: js.UndefOr[NetworkInterfaceType] = js.native
  /**
    * The IPv6 addresses associated with the network interface.
    */
  var Ipv6Addresses: js.UndefOr[NetworkInterfaceIpv6AddressesList] = js.native
  /**
    * The MAC address.
    */
  var MacAddress: js.UndefOr[String] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the owner of the network interface.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The private DNS name.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The IPv4 address of the network interface within the subnet.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * The private IPv4 addresses associated with the network interface.
    */
  var PrivateIpAddresses: js.UndefOr[NetworkInterfacePrivateIpAddressList] = js.native
  /**
    * The ID of the entity that launched the instance on your behalf (for example, AWS Management Console or Auto Scaling).
    */
  var RequesterId: js.UndefOr[String] = js.native
  /**
    * Indicates whether the network interface is being managed by AWS.
    */
  var RequesterManaged: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether traffic to or from the instance is validated.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.native
  /**
    * The status of the network interface.
    */
  var Status: js.UndefOr[NetworkInterfaceStatus] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the network interface.
    */
  var TagSet: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object NetworkInterface {
  @scala.inline
  def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  @scala.inline
  implicit class NetworkInterfaceOps[Self <: NetworkInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociation(value: NetworkInterfaceAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Association")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Association")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachment(value: NetworkInterfaceAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachment")(js.undefined)
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: GroupIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(js.undefined)
        ret
    }
    @scala.inline
    def withInterfaceType(value: NetworkInterfaceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterfaceType")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Addresses(value: NetworkInterfaceIpv6AddressesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withMacAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(js.undefined)
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
    def withPrivateDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIpAddresses(value: NetworkInterfacePrivateIpAddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIpAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIpAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIpAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterManaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterManaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterManaged")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceDestCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDestCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDestCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDestCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: NetworkInterfaceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
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
    def withTagSet(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSet")(js.undefined)
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


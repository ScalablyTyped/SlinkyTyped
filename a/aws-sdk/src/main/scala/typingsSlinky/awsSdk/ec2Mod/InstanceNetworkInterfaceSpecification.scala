package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNetworkInterfaceSpecification extends js.Object {
  /**
    * Indicates whether to assign a public IPv4 address to an instance you launch in a VPC. The public IP address can only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an existing one. You cannot specify more than one network interface in the request. If launching into a default subnet, the default value is true.
    */
  var AssociatePublicIpAddress: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the interface is deleted when the instance is terminated. You can specify true only if creating a new network interface when launching an instance.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * The description of the network interface. Applies only if creating a network interface when launching an instance.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The position of the network interface in the attachment order. A primary network interface has a device index of 0. If you specify a network interface when launching an instance, you must specify the device index.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.native
  /**
    * The IDs of the security groups for the network interface. Applies only if creating a network interface when launching an instance.
    */
  var Groups: js.UndefOr[SecurityGroupIdStringList] = js.native
  /**
    * The type of network interface. To create an Elastic Fabric Adapter (EFA), specify efa. For more information, see Elastic Fabric Adapter in the Amazon Elastic Compute Cloud User Guide. If you are not creating an EFA, specify interface or omit this parameter. Valid values: interface | efa 
    */
  var InterfaceType: js.UndefOr[String] = js.native
  /**
    * A number of IPv6 addresses to assign to the network interface. Amazon EC2 chooses the IPv6 addresses from the range of the subnet. You cannot specify this option and the option to assign specific IPv6 addresses in the same request. You can specify this option if you've specified a minimum number of instances to launch.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.native
  /**
    * One or more IPv6 addresses to assign to the network interface. You cannot specify this option and the option to assign a number of IPv6 addresses in the same request. You cannot specify this option if you've specified a minimum number of instances to launch.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.native
  /**
    * The ID of the network interface. If you are creating a Spot Fleet, omit this parameter because you can’t specify a network interface ID in a launch specification.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The private IPv4 address of the network interface. Applies only if creating a network interface when launching an instance. You cannot specify this option if you're launching more than one instance in a RunInstances request.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * One or more private IPv4 addresses to assign to the network interface. Only one private IPv4 address can be designated as primary. You cannot specify this option if you're launching more than one instance in a RunInstances request.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.native
  /**
    * The number of secondary private IPv4 addresses. You can't specify this option and specify more than one private IP address using the private IP addresses option. You cannot specify this option if you're launching more than one instance in a RunInstances request.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.native
  /**
    * The ID of the subnet associated with the network interface. Applies only if creating a network interface when launching an instance.
    */
  var SubnetId: js.UndefOr[String] = js.native
}

object InstanceNetworkInterfaceSpecification {
  @scala.inline
  def apply(): InstanceNetworkInterfaceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceNetworkInterfaceSpecification]
  }
  @scala.inline
  implicit class InstanceNetworkInterfaceSpecificationOps[Self <: InstanceNetworkInterfaceSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatePublicIpAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatePublicIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatePublicIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatePublicIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteOnTermination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteOnTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteOnTermination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteOnTermination")(js.undefined)
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
    def withDeviceIndex(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: SecurityGroupIdStringList): Self = {
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
    def withInterfaceType(value: String): Self = {
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
    def withIpv6AddressCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6AddressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6AddressCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6AddressCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Addresses(value: InstanceIpv6AddressList): Self = {
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
    def withPrivateIpAddresses(value: PrivateIpAddressSpecificationList): Self = {
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
    def withSecondaryPrivateIpAddressCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryPrivateIpAddressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryPrivateIpAddressCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryPrivateIpAddressCount")(js.undefined)
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
  }
  
}


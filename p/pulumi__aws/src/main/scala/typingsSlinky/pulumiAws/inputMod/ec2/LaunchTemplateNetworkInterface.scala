package typingsSlinky.pulumiAws.inputMod.ec2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateNetworkInterface extends js.Object {
  var associatePublicIpAddress: js.UndefOr[Input[String]] = js.native
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Description of the launch template.
    */
  var description: js.UndefOr[Input[String]] = js.native
  var deviceIndex: js.UndefOr[Input[Double]] = js.native
  var ipv4AddressCount: js.UndefOr[Input[Double]] = js.native
  var ipv4Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var ipv6AddressCount: js.UndefOr[Input[Double]] = js.native
  var ipv6Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var networkInterfaceId: js.UndefOr[Input[String]] = js.native
  var privateIpAddress: js.UndefOr[Input[String]] = js.native
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var subnetId: js.UndefOr[Input[String]] = js.native
}

object LaunchTemplateNetworkInterface {
  @scala.inline
  def apply(): LaunchTemplateNetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateNetworkInterface]
  }
  @scala.inline
  implicit class LaunchTemplateNetworkInterfaceOps[Self <: LaunchTemplateNetworkInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatePublicIpAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatePublicIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatePublicIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatePublicIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteOnTermination(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOnTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteOnTermination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOnTermination")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceIndex(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv4AddressCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4AddressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv4AddressCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4AddressCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv4Addresses(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv4Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4Addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6AddressCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6AddressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6AddressCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6AddressCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Addresses(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIpAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroups(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(js.undefined)
        ret
    }
  }
  
}


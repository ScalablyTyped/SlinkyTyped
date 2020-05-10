package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateNetworkInterface extends js.Object {
  var associatePublicIpAddress: Boolean = js.native
  var deleteOnTermination: Boolean = js.native
  /**
    * Description of the launch template.
    */
  var description: String = js.native
  var deviceIndex: Double = js.native
  var ipv4AddressCount: Double = js.native
  var ipv4Addresses: js.Array[String] = js.native
  var ipv6AddressCount: Double = js.native
  var ipv6Addresses: js.Array[String] = js.native
  var networkInterfaceId: String = js.native
  var privateIpAddress: String = js.native
  var securityGroups: js.Array[String] = js.native
  var subnetId: String = js.native
}

object GetLaunchTemplateNetworkInterface {
  @scala.inline
  def apply(
    associatePublicIpAddress: Boolean,
    deleteOnTermination: Boolean,
    description: String,
    deviceIndex: Double,
    ipv4AddressCount: Double,
    ipv4Addresses: js.Array[String],
    ipv6AddressCount: Double,
    ipv6Addresses: js.Array[String],
    networkInterfaceId: String,
    privateIpAddress: String,
    securityGroups: js.Array[String],
    subnetId: String
  ): GetLaunchTemplateNetworkInterface = {
    val __obj = js.Dynamic.literal(associatePublicIpAddress = associatePublicIpAddress.asInstanceOf[js.Any], deleteOnTermination = deleteOnTermination.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], deviceIndex = deviceIndex.asInstanceOf[js.Any], ipv4AddressCount = ipv4AddressCount.asInstanceOf[js.Any], ipv4Addresses = ipv4Addresses.asInstanceOf[js.Any], ipv6AddressCount = ipv6AddressCount.asInstanceOf[js.Any], ipv6Addresses = ipv6Addresses.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], privateIpAddress = privateIpAddress.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateNetworkInterface]
  }
  @scala.inline
  implicit class GetLaunchTemplateNetworkInterfaceOps[Self <: GetLaunchTemplateNetworkInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatePublicIpAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatePublicIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteOnTermination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOnTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpv4AddressCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4AddressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpv4Addresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpv6AddressCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6AddressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpv6Addresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


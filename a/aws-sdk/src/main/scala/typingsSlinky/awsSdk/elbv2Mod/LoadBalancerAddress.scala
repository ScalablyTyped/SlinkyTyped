package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerAddress extends js.Object {
  /**
    * [Network Load Balancers] The allocation ID of the Elastic IP address for an internal-facing load balancer.
    */
  var AllocationId: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.AllocationId] = js.native
  /**
    * The static IP address.
    */
  var IpAddress: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.IpAddress] = js.native
  /**
    * [Network Load Balancers] The private IPv4 address for an internal load balancer.
    */
  var PrivateIPv4Address: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.PrivateIPv4Address] = js.native
}

object LoadBalancerAddress {
  @scala.inline
  def apply(): LoadBalancerAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerAddress]
  }
  @scala.inline
  implicit class LoadBalancerAddressOps[Self <: LoadBalancerAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocationId(value: AllocationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocationId")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIPv4Address(value: PrivateIPv4Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIPv4Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIPv4Address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIPv4Address")(js.undefined)
        ret
    }
  }
  
}


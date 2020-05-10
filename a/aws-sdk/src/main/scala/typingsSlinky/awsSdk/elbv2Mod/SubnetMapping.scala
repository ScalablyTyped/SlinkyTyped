package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetMapping extends js.Object {
  /**
    * [Network Load Balancers] The allocation ID of the Elastic IP address for an internet-facing load balancer.
    */
  var AllocationId: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.AllocationId] = js.native
  /**
    * [Network Load Balancers] The private IPv4 address for an internal load balancer.
    */
  var PrivateIPv4Address: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.PrivateIPv4Address] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.SubnetId] = js.native
}

object SubnetMapping {
  @scala.inline
  def apply(): SubnetMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetMapping]
  }
  @scala.inline
  implicit class SubnetMappingOps[Self <: SubnetMapping] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withSubnetId(value: SubnetId): Self = {
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


package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZone extends js.Object {
  /**
    * [Network Load Balancers] If you need static IP addresses for your load balancer, you can specify one Elastic IP address per Availability Zone when you create an internal-facing load balancer. For internal load balancers, you can specify a private IP address from the IPv4 range of the subnet.
    */
  var LoadBalancerAddresses: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.LoadBalancerAddresses] = js.native
  /**
    * The ID of the subnet. You can specify one subnet per Availability Zone.
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.SubnetId] = js.native
  /**
    * The name of the Availability Zone.
    */
  var ZoneName: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.ZoneName] = js.native
}

object AvailabilityZone {
  @scala.inline
  def apply(): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZone]
  }
  @scala.inline
  implicit class AvailabilityZoneOps[Self <: AvailabilityZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancerAddresses(value: LoadBalancerAddresses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerAddresses")(js.undefined)
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
    @scala.inline
    def withZoneName(value: ZoneName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoneName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZoneName")(js.undefined)
        ret
    }
  }
  
}


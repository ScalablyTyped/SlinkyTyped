package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcEndpointServiceConfigurationRequest extends js.Object {
  /**
    * Indicates whether requests to create an endpoint to your service must be accepted.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
    */
  var AddNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The private DNS name to assign to the endpoint service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
    */
  var RemoveNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  /**
    * Removes the private DNS name of the endpoint service.
    */
  var RemovePrivateDnsName: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the service.
    */
  var ServiceId: VpcEndpointServiceId = js.native
}

object ModifyVpcEndpointServiceConfigurationRequest {
  @scala.inline
  def apply(ServiceId: VpcEndpointServiceId): ModifyVpcEndpointServiceConfigurationRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointServiceConfigurationRequest]
  }
  @scala.inline
  implicit class ModifyVpcEndpointServiceConfigurationRequestOps[Self <: ModifyVpcEndpointServiceConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceId(value: VpcEndpointServiceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceptanceRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptanceRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptanceRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptanceRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withAddNetworkLoadBalancerArns(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddNetworkLoadBalancerArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddNetworkLoadBalancerArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddNetworkLoadBalancerArns")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
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
    def withRemoveNetworkLoadBalancerArns(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveNetworkLoadBalancerArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveNetworkLoadBalancerArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveNetworkLoadBalancerArns")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovePrivateDnsName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemovePrivateDnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovePrivateDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemovePrivateDnsName")(js.undefined)
        ret
    }
  }
  
}


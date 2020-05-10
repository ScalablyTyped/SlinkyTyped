package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcEndpointServiceConfigurationRequest extends js.Object {
  /**
    * Indicates whether requests from service consumers to create an endpoint to your service must be accepted. To accept a request, use AcceptVpcEndpointConnections.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
    */
  var NetworkLoadBalancerArns: ValueStringList = js.native
  /**
    * The private DNS name to assign to the VPC endpoint service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The tags to associate with the service.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object CreateVpcEndpointServiceConfigurationRequest {
  @scala.inline
  def apply(NetworkLoadBalancerArns: ValueStringList): CreateVpcEndpointServiceConfigurationRequest = {
    val __obj = js.Dynamic.literal(NetworkLoadBalancerArns = NetworkLoadBalancerArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcEndpointServiceConfigurationRequest]
  }
  @scala.inline
  implicit class CreateVpcEndpointServiceConfigurationRequestOps[Self <: CreateVpcEndpointServiceConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkLoadBalancerArns(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkLoadBalancerArns")(value.asInstanceOf[js.Any])
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
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
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
    def withTagSpecifications(value: TagSpecificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagSpecifications")(js.undefined)
        ret
    }
  }
  
}


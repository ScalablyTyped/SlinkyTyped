package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceConfiguration extends js.Object {
  /**
    * Indicates whether requests from other AWS accounts to create an endpoint to the service must first be accepted.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.native
  /**
    * The Availability Zones in which the service is available.
    */
  var AvailabilityZones: js.UndefOr[ValueStringList] = js.native
  /**
    * The DNS names for the service.
    */
  var BaseEndpointDnsNames: js.UndefOr[ValueStringList] = js.native
  /**
    * Indicates whether the service manages its VPC endpoints. Management of the service VPC endpoints using the VPC endpoint API is restricted.
    */
  var ManagesVpcEndpoints: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the Network Load Balancers for the service.
    */
  var NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  /**
    * The private DNS name for the service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * Information about the endpoint service private DNS name configuration.
    */
  var PrivateDnsNameConfiguration: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.PrivateDnsNameConfiguration] = js.native
  /**
    * The ID of the service.
    */
  var ServiceId: js.UndefOr[String] = js.native
  /**
    * The name of the service.
    */
  var ServiceName: js.UndefOr[String] = js.native
  /**
    * The service state.
    */
  var ServiceState: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ServiceState] = js.native
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[ServiceTypeDetailSet] = js.native
  /**
    * Any tags assigned to the service.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ServiceConfiguration {
  @scala.inline
  def apply(): ServiceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceConfiguration]
  }
  @scala.inline
  implicit class ServiceConfigurationOps[Self <: ServiceConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAvailabilityZones(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseEndpointDnsNames(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseEndpointDnsNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseEndpointDnsNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseEndpointDnsNames")(js.undefined)
        ret
    }
    @scala.inline
    def withManagesVpcEndpoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagesVpcEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagesVpcEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagesVpcEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkLoadBalancerArns(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkLoadBalancerArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkLoadBalancerArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkLoadBalancerArns")(js.undefined)
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
    def withPrivateDnsNameConfiguration(value: PrivateDnsNameConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDnsNameConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateDnsNameConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDnsNameConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceId")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceState(value: ServiceState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceState")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceType(value: ServiceTypeDetailSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceType")(js.undefined)
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
  }
  
}


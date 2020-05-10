package typingsSlinky.pulumiAws.vpcEndpointServiceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointServiceState extends js.Object {
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARNs of one or more principals allowed to discover the endpoint service.
    */
  val allowedPrincipals: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The Availability Zones in which the service is available.
    */
  val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The DNS names for the service.
    */
  val baseEndpointDnsNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Whether or not the service manages its VPC endpoints - `true` or `false`.
    */
  val managesVpcEndpoints: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARNs of one or more Network Load Balancers for the endpoint service.
    */
  val networkLoadBalancerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The private DNS name for the service.
    */
  val privateDnsName: js.UndefOr[Input[String]] = js.native
  /**
    * The service name.
    */
  val serviceName: js.UndefOr[Input[String]] = js.native
  /**
    * The service type, `Gateway` or `Interface`.
    */
  val serviceType: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the VPC endpoint service.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object VpcEndpointServiceState {
  @scala.inline
  def apply(): VpcEndpointServiceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointServiceState]
  }
  @scala.inline
  implicit class VpcEndpointServiceStateOps[Self <: VpcEndpointServiceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptanceRequired(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptanceRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptanceRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptanceRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedPrincipals(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPrincipals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedPrincipals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPrincipals")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseEndpointDnsNames(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseEndpointDnsNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseEndpointDnsNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseEndpointDnsNames")(js.undefined)
        ret
    }
    @scala.inline
    def withManagesVpcEndpoints(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managesVpcEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagesVpcEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managesVpcEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkLoadBalancerArns(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkLoadBalancerArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkLoadBalancerArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkLoadBalancerArns")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateDnsName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateDnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateDnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}


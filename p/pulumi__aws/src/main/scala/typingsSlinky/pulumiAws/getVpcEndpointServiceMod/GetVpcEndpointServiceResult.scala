package typingsSlinky.pulumiAws.getVpcEndpointServiceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcEndpointServiceResult extends js.Object {
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: Boolean = js.native
  /**
    * The Availability Zones in which the service is available.
    */
  val availabilityZones: js.Array[String] = js.native
  /**
    * The DNS names for the service.
    */
  val baseEndpointDnsNames: js.Array[String] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Whether or not the service manages its VPC endpoints - `true` or `false`.
    */
  val managesVpcEndpoints: Boolean = js.native
  /**
    * The AWS account ID of the service owner or `amazon`.
    */
  val owner: String = js.native
  /**
    * The private DNS name for the service.
    */
  val privateDnsName: String = js.native
  val service: js.UndefOr[String] = js.native
  /**
    * The ID of the endpoint service.
    */
  val serviceId: String = js.native
  val serviceName: String = js.native
  /**
    * The service type, `Gateway` or `Interface`.
    */
  val serviceType: String = js.native
  /**
    * A mapping of tags assigned to the resource.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * Whether or not the service supports endpoint policies - `true` or `false`.
    */
  val vpcEndpointPolicySupported: Boolean = js.native
}

object GetVpcEndpointServiceResult {
  @scala.inline
  def apply(
    acceptanceRequired: Boolean,
    availabilityZones: js.Array[String],
    baseEndpointDnsNames: js.Array[String],
    id: String,
    managesVpcEndpoints: Boolean,
    owner: String,
    privateDnsName: String,
    serviceId: String,
    serviceName: String,
    serviceType: String,
    tags: StringDictionary[js.Any],
    vpcEndpointPolicySupported: Boolean
  ): GetVpcEndpointServiceResult = {
    val __obj = js.Dynamic.literal(acceptanceRequired = acceptanceRequired.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], baseEndpointDnsNames = baseEndpointDnsNames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], managesVpcEndpoints = managesVpcEndpoints.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], privateDnsName = privateDnsName.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcEndpointPolicySupported = vpcEndpointPolicySupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcEndpointServiceResult]
  }
  @scala.inline
  implicit class GetVpcEndpointServiceResultOps[Self <: GetVpcEndpointServiceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptanceRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptanceRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseEndpointDnsNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseEndpointDnsNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagesVpcEndpoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managesVpcEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateDnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcEndpointPolicySupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcEndpointPolicySupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}


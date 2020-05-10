package typingsSlinky.pulumiAws.getVpcEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.GetVpcEndpointDnsEntry
import typingsSlinky.pulumiAws.outputMod.ec2.GetVpcEndpointFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcEndpointResult extends js.Object {
  /**
    * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val cidrBlocks: js.Array[String] = js.native
  /**
    * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
    */
  val dnsEntries: js.Array[GetVpcEndpointDnsEntry] = js.native
  val filters: js.UndefOr[js.Array[GetVpcEndpointFilter]] = js.native
  val id: String = js.native
  /**
    * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
    */
  val networkInterfaceIds: js.Array[String] = js.native
  /**
    * The ID of the AWS account that owns the VPC endpoint.
    */
  val ownerId: String = js.native
  /**
    * The policy document associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
    */
  val policy: String = js.native
  /**
    * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val prefixListId: String = js.native
  /**
    * Whether or not the VPC is associated with a private hosted zone - `true` or `false`. Applicable for endpoints of type `Interface`.
    */
  val privateDnsEnabled: Boolean = js.native
  /**
    * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
    */
  val requesterManaged: Boolean = js.native
  /**
    * One or more route tables associated with the VPC Endpoint. Applicable for endpoints of type `Gateway`.
    */
  val routeTableIds: js.Array[String] = js.native
  /**
    * One or more security groups associated with the network interfaces. Applicable for endpoints of type `Interface`.
    */
  val securityGroupIds: js.Array[String] = js.native
  val serviceName: String = js.native
  val state: String = js.native
  /**
    * One or more subnets in which the VPC Endpoint is located. Applicable for endpoints of type `Interface`.
    */
  val subnetIds: js.Array[String] = js.native
  val tags: StringDictionary[js.Any] = js.native
  /**
    * The VPC Endpoint type, `Gateway` or `Interface`.
    */
  val vpcEndpointType: String = js.native
  val vpcId: String = js.native
}

object GetVpcEndpointResult {
  @scala.inline
  def apply(
    cidrBlocks: js.Array[String],
    dnsEntries: js.Array[GetVpcEndpointDnsEntry],
    id: String,
    networkInterfaceIds: js.Array[String],
    ownerId: String,
    policy: String,
    prefixListId: String,
    privateDnsEnabled: Boolean,
    requesterManaged: Boolean,
    routeTableIds: js.Array[String],
    securityGroupIds: js.Array[String],
    serviceName: String,
    state: String,
    subnetIds: js.Array[String],
    tags: StringDictionary[js.Any],
    vpcEndpointType: String,
    vpcId: String
  ): GetVpcEndpointResult = {
    val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks.asInstanceOf[js.Any], dnsEntries = dnsEntries.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], networkInterfaceIds = networkInterfaceIds.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], prefixListId = prefixListId.asInstanceOf[js.Any], privateDnsEnabled = privateDnsEnabled.asInstanceOf[js.Any], requesterManaged = requesterManaged.asInstanceOf[js.Any], routeTableIds = routeTableIds.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcEndpointType = vpcEndpointType.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcEndpointResult]
  }
  @scala.inline
  implicit class GetVpcEndpointResultOps[Self <: GetVpcEndpointResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidrBlocks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnsEntries(value: js.Array[GetVpcEndpointDnsEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkInterfaceIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixListId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateDnsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateDnsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequesterManaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesterManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouteTableIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTableIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcEndpointType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcEndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetVpcEndpointFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
  }
  
}


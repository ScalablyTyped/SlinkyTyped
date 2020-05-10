package typingsSlinky.pulumiAws.getVpcMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.GetVpcCidrBlockAssociation
import typingsSlinky.pulumiAws.outputMod.ec2.GetVpcFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of VPC
    */
  val arn: String = js.native
  /**
    * The CIDR block for the association.
    */
  val cidrBlock: String = js.native
  val cidrBlockAssociations: js.Array[GetVpcCidrBlockAssociation] = js.native
  val default: Boolean = js.native
  val dhcpOptionsId: String = js.native
  /**
    * Whether or not the VPC has DNS hostname support
    */
  val enableDnsHostnames: Boolean = js.native
  /**
    * Whether or not the VPC has DNS support
    */
  val enableDnsSupport: Boolean = js.native
  val filters: js.UndefOr[js.Array[GetVpcFilter]] = js.native
  val id: String = js.native
  /**
    * The allowed tenancy of instances launched into the
    * selected VPC. May be any of `"default"`, `"dedicated"`, or `"host"`.
    */
  val instanceTenancy: String = js.native
  /**
    * The association ID for the IPv6 CIDR block.
    */
  val ipv6AssociationId: String = js.native
  /**
    * The IPv6 CIDR block.
    */
  val ipv6CidrBlock: String = js.native
  /**
    * The ID of the main route table associated with this VPC.
    */
  val mainRouteTableId: String = js.native
  /**
    * The ID of the AWS account that owns the VPC.
    */
  val ownerId: String = js.native
  /**
    * The State of the association.
    */
  val state: String = js.native
  val tags: StringDictionary[js.Any] = js.native
}

object GetVpcResult {
  @scala.inline
  def apply(
    arn: String,
    cidrBlock: String,
    cidrBlockAssociations: js.Array[GetVpcCidrBlockAssociation],
    default: Boolean,
    dhcpOptionsId: String,
    enableDnsHostnames: Boolean,
    enableDnsSupport: Boolean,
    id: String,
    instanceTenancy: String,
    ipv6AssociationId: String,
    ipv6CidrBlock: String,
    mainRouteTableId: String,
    ownerId: String,
    state: String,
    tags: StringDictionary[js.Any]
  ): GetVpcResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], cidrBlock = cidrBlock.asInstanceOf[js.Any], cidrBlockAssociations = cidrBlockAssociations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], dhcpOptionsId = dhcpOptionsId.asInstanceOf[js.Any], enableDnsHostnames = enableDnsHostnames.asInstanceOf[js.Any], enableDnsSupport = enableDnsSupport.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceTenancy = instanceTenancy.asInstanceOf[js.Any], ipv6AssociationId = ipv6AssociationId.asInstanceOf[js.Any], ipv6CidrBlock = ipv6CidrBlock.asInstanceOf[js.Any], mainRouteTableId = mainRouteTableId.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcResult]
  }
  @scala.inline
  implicit class GetVpcResultOps[Self <: GetVpcResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCidrBlockAssociations(value: js.Array[GetVpcCidrBlockAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlockAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDhcpOptionsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhcpOptionsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableDnsHostnames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDnsHostnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableDnsSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDnsSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceTenancy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpv6AssociationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6AssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpv6CidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainRouteTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetVpcFilter]): Self = {
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


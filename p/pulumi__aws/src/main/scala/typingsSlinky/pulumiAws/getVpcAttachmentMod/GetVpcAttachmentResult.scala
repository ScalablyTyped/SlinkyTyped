package typingsSlinky.pulumiAws.getVpcAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2transitgateway.GetVpcAttachmentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcAttachmentResult extends js.Object {
  /**
    * Whether DNS support is enabled.
    */
  val dnsSupport: String = js.native
  val filters: js.UndefOr[js.Array[GetVpcAttachmentFilter]] = js.native
  /**
    * EC2 Transit Gateway VPC Attachment identifier
    */
  val id: js.UndefOr[String] = js.native
  /**
    * Whether IPv6 support is enabled.
    */
  val ipv6Support: String = js.native
  /**
    * Identifiers of EC2 Subnets.
    */
  val subnetIds: js.Array[String] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * EC2 Transit Gateway identifier
    */
  val transitGatewayId: String = js.native
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: String = js.native
  /**
    * Identifier of the AWS account that owns the EC2 VPC.
    */
  val vpcOwnerId: String = js.native
}

object GetVpcAttachmentResult {
  @scala.inline
  def apply(
    dnsSupport: String,
    ipv6Support: String,
    subnetIds: js.Array[String],
    tags: StringDictionary[js.Any],
    transitGatewayId: String,
    vpcId: String,
    vpcOwnerId: String
  ): GetVpcAttachmentResult = {
    val __obj = js.Dynamic.literal(dnsSupport = dnsSupport.asInstanceOf[js.Any], ipv6Support = ipv6Support.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], vpcOwnerId = vpcOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcAttachmentResult]
  }
  @scala.inline
  implicit class GetVpcAttachmentResultOps[Self <: GetVpcAttachmentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnsSupport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpv6Support(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Support")(value.asInstanceOf[js.Any])
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
    def withTransitGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetVpcAttachmentFilter]): Self = {
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
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}


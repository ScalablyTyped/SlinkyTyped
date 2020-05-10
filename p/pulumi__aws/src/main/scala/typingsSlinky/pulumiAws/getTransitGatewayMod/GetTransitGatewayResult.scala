package typingsSlinky.pulumiAws.getTransitGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2transitgateway.GetTransitGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTransitGatewayResult extends js.Object {
  /**
    * Private Autonomous System Number (ASN) for the Amazon side of a BGP session
    */
  val amazonSideAsn: Double = js.native
  /**
    * EC2 Transit Gateway Amazon Resource Name (ARN)
    */
  val arn: String = js.native
  /**
    * Identifier of the default association route table
    */
  val associationDefaultRouteTableId: String = js.native
  /**
    * Whether resource attachment requests are automatically accepted.
    */
  val autoAcceptSharedAttachments: String = js.native
  /**
    * Whether resource attachments are automatically associated with the default association route table.
    */
  val defaultRouteTableAssociation: String = js.native
  /**
    * Whether resource attachments automatically propagate routes to the default propagation route table.
    */
  val defaultRouteTablePropagation: String = js.native
  /**
    * Description of the EC2 Transit Gateway
    */
  val description: String = js.native
  /**
    * Whether DNS support is enabled.
    */
  val dnsSupport: String = js.native
  val filters: js.UndefOr[js.Array[GetTransitGatewayFilter]] = js.native
  /**
    * EC2 Transit Gateway identifier
    */
  val id: js.UndefOr[String] = js.native
  /**
    * Identifier of the AWS account that owns the EC2 Transit Gateway
    */
  val ownerId: String = js.native
  /**
    * Identifier of the default propagation route table.
    */
  val propagationDefaultRouteTableId: String = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * Whether VPN Equal Cost Multipath Protocol support is enabled.
    */
  val vpnEcmpSupport: String = js.native
}

object GetTransitGatewayResult {
  @scala.inline
  def apply(
    amazonSideAsn: Double,
    arn: String,
    associationDefaultRouteTableId: String,
    autoAcceptSharedAttachments: String,
    defaultRouteTableAssociation: String,
    defaultRouteTablePropagation: String,
    description: String,
    dnsSupport: String,
    ownerId: String,
    propagationDefaultRouteTableId: String,
    tags: StringDictionary[js.Any],
    vpnEcmpSupport: String
  ): GetTransitGatewayResult = {
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], associationDefaultRouteTableId = associationDefaultRouteTableId.asInstanceOf[js.Any], autoAcceptSharedAttachments = autoAcceptSharedAttachments.asInstanceOf[js.Any], defaultRouteTableAssociation = defaultRouteTableAssociation.asInstanceOf[js.Any], defaultRouteTablePropagation = defaultRouteTablePropagation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], dnsSupport = dnsSupport.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], propagationDefaultRouteTableId = propagationDefaultRouteTableId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpnEcmpSupport = vpnEcmpSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayResult]
  }
  @scala.inline
  implicit class GetTransitGatewayResultOps[Self <: GetTransitGatewayResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmazonSideAsn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonSideAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociationDefaultRouteTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationDefaultRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoAcceptSharedAttachments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAcceptSharedAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRouteTableAssociation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRouteTableAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRouteTablePropagation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRouteTablePropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnsSupport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropagationDefaultRouteTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagationDefaultRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpnEcmpSupport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnEcmpSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetTransitGatewayFilter]): Self = {
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


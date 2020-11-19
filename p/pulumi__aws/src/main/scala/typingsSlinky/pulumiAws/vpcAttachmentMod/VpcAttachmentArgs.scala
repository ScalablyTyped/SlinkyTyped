package typingsSlinky.pulumiAws.vpcAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcAttachmentArgs extends js.Object {
  
  /**
    * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val dnsSupport: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
    */
  val ipv6Support: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifiers of EC2 Subnets.
    */
  val subnetIds: Input[js.Array[Input[String]]] = js.native
  
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
    */
  val transitGatewayDefaultRouteTableAssociation: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
    */
  val transitGatewayDefaultRouteTablePropagation: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: Input[String] = js.native
  
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: Input[String] = js.native
}
object VpcAttachmentArgs {
  
  @scala.inline
  def apply(subnetIds: Input[js.Array[Input[String]]], transitGatewayId: Input[String], vpcId: Input[String]): VpcAttachmentArgs = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcAttachmentArgs]
  }
  
  @scala.inline
  implicit class VpcAttachmentArgsOps[Self <: VpcAttachmentArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayId(value: Input[String]): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSupport(value: Input[String]): Self = this.set("dnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsSupport: Self = this.set("dnsSupport", js.undefined)
    
    @scala.inline
    def setIpv6Support(value: Input[String]): Self = this.set("ipv6Support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Support: Self = this.set("ipv6Support", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTransitGatewayDefaultRouteTableAssociation(value: Input[Boolean]): Self = this.set("transitGatewayDefaultRouteTableAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayDefaultRouteTableAssociation: Self = this.set("transitGatewayDefaultRouteTableAssociation", js.undefined)
    
    @scala.inline
    def setTransitGatewayDefaultRouteTablePropagation(value: Input[Boolean]): Self = this.set("transitGatewayDefaultRouteTablePropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayDefaultRouteTablePropagation: Self = this.set("transitGatewayDefaultRouteTablePropagation", js.undefined)
  }
}

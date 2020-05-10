package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocalGatewayRouteTableVpcAssociationResult extends js.Object {
  /**
    * Information about the association.
    */
  var LocalGatewayRouteTableVpcAssociation: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociation] = js.native
}

object CreateLocalGatewayRouteTableVpcAssociationResult {
  @scala.inline
  def apply(): CreateLocalGatewayRouteTableVpcAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalGatewayRouteTableVpcAssociationResult]
  }
  @scala.inline
  implicit class CreateLocalGatewayRouteTableVpcAssociationResultOps[Self <: CreateLocalGatewayRouteTableVpcAssociationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalGatewayRouteTableVpcAssociation(value: LocalGatewayRouteTableVpcAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayRouteTableVpcAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalGatewayRouteTableVpcAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayRouteTableVpcAssociation")(js.undefined)
        ret
    }
  }
  
}


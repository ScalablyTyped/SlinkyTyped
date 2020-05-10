package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectConnectGatewayAssociationRequest extends js.Object {
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway This parameter is required when you create an association to a transit gateway. For information about how to set the prefixes, see Allowed Prefixes in the AWS Direct Connect User Guide.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId = js.native
  /**
    * The ID of the virtual private gateway or transit gateway.
    */
  var gatewayId: js.UndefOr[GatewayIdToAssociate] = js.native
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
}

object CreateDirectConnectGatewayAssociationRequest {
  @scala.inline
  def apply(directConnectGatewayId: DirectConnectGatewayId): CreateDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationRequest]
  }
  @scala.inline
  implicit class CreateDirectConnectGatewayAssociationRequestOps[Self <: CreateDirectConnectGatewayAssociationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectConnectGatewayId(value: DirectConnectGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAllowedPrefixesToDirectConnectGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddAllowedPrefixesToDirectConnectGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAllowedPrefixesToDirectConnectGateway")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayId(value: GatewayIdToAssociate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualGatewayId(value: VirtualGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualGatewayId")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDirectConnectGatewayAssociationRequest extends js.Object {
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var addAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.native
  /**
    * The Amazon VPC prefixes to no longer advertise to the Direct Connect gateway.
    */
  var removeAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
}

object UpdateDirectConnectGatewayAssociationRequest {
  @scala.inline
  def apply(): UpdateDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDirectConnectGatewayAssociationRequest]
  }
  @scala.inline
  implicit class UpdateDirectConnectGatewayAssociationRequestOps[Self <: UpdateDirectConnectGatewayAssociationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAssociationId(value: DirectConnectGatewayAssociationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationId")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllowedPrefixesToDirectConnectGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAllowedPrefixesToDirectConnectGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllowedPrefixesToDirectConnectGateway")(js.undefined)
        ret
    }
  }
  
}


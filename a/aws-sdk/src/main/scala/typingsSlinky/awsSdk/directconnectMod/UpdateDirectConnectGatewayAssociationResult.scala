package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDirectConnectGatewayAssociationResult extends js.Object {
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.native
}

object UpdateDirectConnectGatewayAssociationResult {
  @scala.inline
  def apply(): UpdateDirectConnectGatewayAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDirectConnectGatewayAssociationResult]
  }
  @scala.inline
  implicit class UpdateDirectConnectGatewayAssociationResultOps[Self <: UpdateDirectConnectGatewayAssociationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectConnectGatewayAssociation(value: DirectConnectGatewayAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectConnectGatewayAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayAssociation")(js.undefined)
        ret
    }
  }
  
}


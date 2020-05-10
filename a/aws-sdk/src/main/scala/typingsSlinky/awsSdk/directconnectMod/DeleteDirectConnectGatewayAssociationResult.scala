package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDirectConnectGatewayAssociationResult extends js.Object {
  /**
    * Information about the deleted association.
    */
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.native
}

object DeleteDirectConnectGatewayAssociationResult {
  @scala.inline
  def apply(): DeleteDirectConnectGatewayAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationResult]
  }
  @scala.inline
  implicit class DeleteDirectConnectGatewayAssociationResultOps[Self <: DeleteDirectConnectGatewayAssociationResult] (val x: Self) extends AnyVal {
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


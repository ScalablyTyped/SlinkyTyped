package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateCustomerGatewayResponse extends js.Object {
  /**
    * The customer gateway association.
    */
  var CustomerGatewayAssociation: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.CustomerGatewayAssociation] = js.native
}

object AssociateCustomerGatewayResponse {
  @scala.inline
  def apply(): AssociateCustomerGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateCustomerGatewayResponse]
  }
  @scala.inline
  implicit class AssociateCustomerGatewayResponseOps[Self <: AssociateCustomerGatewayResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerGatewayAssociation(value: CustomerGatewayAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGatewayAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerGatewayAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGatewayAssociation")(js.undefined)
        ret
    }
  }
  
}


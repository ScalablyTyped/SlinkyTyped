package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateCustomerGatewayResponse extends js.Object {
  /**
    * Information about the customer gateway association.
    */
  var CustomerGatewayAssociation: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.CustomerGatewayAssociation] = js.native
}

object DisassociateCustomerGatewayResponse {
  @scala.inline
  def apply(): DisassociateCustomerGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateCustomerGatewayResponse]
  }
  @scala.inline
  implicit class DisassociateCustomerGatewayResponseOps[Self <: DisassociateCustomerGatewayResponse] (val x: Self) extends AnyVal {
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


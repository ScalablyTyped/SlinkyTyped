package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectConnectGateway extends js.Object {
  /**
    * The autonomous system number (ASN) for the Amazon side of the connection.
    */
  var amazonSideAsn: js.UndefOr[LongAsn] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  /**
    * The name of the Direct Connect gateway.
    */
  var directConnectGatewayName: js.UndefOr[DirectConnectGatewayName] = js.native
  /**
    * The state of the Direct Connect gateway. The following are the possible values:    pending: The initial state after calling CreateDirectConnectGateway.    available: The Direct Connect gateway is ready for use.    deleting: The initial state after calling DeleteDirectConnectGateway.    deleted: The Direct Connect gateway is deleted and cannot pass traffic.  
    */
  var directConnectGatewayState: js.UndefOr[DirectConnectGatewayState] = js.native
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The error message if the state of an object failed to advance.
    */
  var stateChangeError: js.UndefOr[StateChangeError] = js.native
}

object DirectConnectGateway {
  @scala.inline
  def apply(): DirectConnectGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectConnectGateway]
  }
  @scala.inline
  implicit class DirectConnectGatewayOps[Self <: DirectConnectGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmazonSideAsn(value: LongAsn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonSideAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmazonSideAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonSideAsn")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectConnectGatewayId(value: DirectConnectGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectConnectGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectConnectGatewayName(value: DirectConnectGatewayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectConnectGatewayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectConnectGatewayState(value: DirectConnectGatewayState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectConnectGatewayState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayState")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerAccount(value: OwnerAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChangeError(value: StateChangeError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChangeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChangeError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChangeError")(js.undefined)
        ret
    }
  }
  
}


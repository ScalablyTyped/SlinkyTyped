package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectConnectGatewayRequest extends js.Object {
  /**
    * The autonomous system number (ASN) for Border Gateway Protocol (BGP) to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294. The default is 64512.
    */
  var amazonSideAsn: js.UndefOr[LongAsn] = js.native
  /**
    * The name of the Direct Connect gateway.
    */
  var directConnectGatewayName: DirectConnectGatewayName = js.native
}

object CreateDirectConnectGatewayRequest {
  @scala.inline
  def apply(directConnectGatewayName: DirectConnectGatewayName): CreateDirectConnectGatewayRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayName = directConnectGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectConnectGatewayRequest]
  }
  @scala.inline
  implicit class CreateDirectConnectGatewayRequestOps[Self <: CreateDirectConnectGatewayRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectConnectGatewayName(value: DirectConnectGatewayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayName")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}


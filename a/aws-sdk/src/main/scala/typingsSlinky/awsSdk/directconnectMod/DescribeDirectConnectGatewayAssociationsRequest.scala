package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDirectConnectGatewayAssociationsRequest extends js.Object {
  /**
    * The ID of the associated gateway.
    */
  var associatedGatewayId: js.UndefOr[AssociatedGatewayId] = js.native
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value. If MaxResults is given a value larger than 100, only 100 results are returned.
    */
  var maxResults: js.UndefOr[MaxResultSetSize] = js.native
  /**
    * The token provided in the previous call to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
}

object DescribeDirectConnectGatewayAssociationsRequest {
  @scala.inline
  def apply(): DescribeDirectConnectGatewayAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationsRequest]
  }
  @scala.inline
  implicit class DescribeDirectConnectGatewayAssociationsRequestOps[Self <: DescribeDirectConnectGatewayAssociationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedGatewayId(value: AssociatedGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedGatewayId")(js.undefined)
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
    def withMaxResults(value: MaxResultSetSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
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


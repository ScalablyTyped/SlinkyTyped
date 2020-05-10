package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchTransitGatewayRoutesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters. The possible values are:    attachment.transit-gateway-attachment-id- The id of the transit gateway attachment.    attachment.resource-id - The resource id of the transit gateway attachment.    attachment.resource-type - The attachment resource type (vpc | vpn).    route-search.exact-match - The exact match of the specified filter.    route-search.longest-prefix-match - The longest prefix that matches the route.    route-search.subnet-of-match - The routes with a subnet that match the specified CIDR filter.    route-search.supernet-of-match - The routes with a CIDR that encompass the CIDR filter. For example, if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify supernet-of-match as 10.0.1.0/30, then the result returns 10.0.1.0/29.    state - The state of the route (active | blackhole).    type - The type of route (propagated | static).  
    */
  var Filters: FilterList = js.native
  /**
    * The maximum number of routes to return.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.native
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: typingsSlinky.awsSdk.ec2Mod.TransitGatewayRouteTableId = js.native
}

object SearchTransitGatewayRoutesRequest {
  @scala.inline
  def apply(Filters: FilterList, TransitGatewayRouteTableId: TransitGatewayRouteTableId): SearchTransitGatewayRoutesRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], TransitGatewayRouteTableId = TransitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTransitGatewayRoutesRequest]
  }
  @scala.inline
  implicit class SearchTransitGatewayRoutesRequestOps[Self <: SearchTransitGatewayRoutesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitGatewayRouteTableId(value: TransitGatewayRouteTableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: TransitGatewayMaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTransitGatewayRoutesRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters. The possible values are:    attachment.transit-gateway-attachment-id - The id of the transit gateway attachment.    attachment.resource-id - The resource id of the transit gateway attachment.    route-search.exact-match - The exact match of the specified filter.    route-search.longest-prefix-match - The longest prefix that matches the route.    route-search.subnet-of-match - The routes with a subnet that match the specified CIDR filter.    route-search.supernet-of-match - The routes with a CIDR that encompass the CIDR filter. For example, if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify supernet-of-match as 10.0.1.0/30, then the result returns 10.0.1.0/29.    state - The state of the attachment (available | deleted | deleting | failed | modifying | pendingAcceptance | pending | rollingBack | rejected | rejecting).    transit-gateway-route-destination-cidr-block - The CIDR range.    type - The type of route (active | blackhole).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The name of the S3 bucket.
    */
  var S3Bucket: String = js.native
  
  /**
    * The ID of the route table.
    */
  var TransitGatewayRouteTableId: typingsSlinky.awsSdk.ec2Mod.TransitGatewayRouteTableId = js.native
}
object ExportTransitGatewayRoutesRequest {
  
  @scala.inline
  def apply(S3Bucket: String, TransitGatewayRouteTableId: TransitGatewayRouteTableId): ExportTransitGatewayRoutesRequest = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any], TransitGatewayRouteTableId = TransitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTransitGatewayRoutesRequest]
  }
  
  @scala.inline
  implicit class ExportTransitGatewayRoutesRequestOps[Self <: ExportTransitGatewayRoutesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setS3Bucket(value: String): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRouteTableId(value: TransitGatewayRouteTableId): Self = this.set("TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
  }
}

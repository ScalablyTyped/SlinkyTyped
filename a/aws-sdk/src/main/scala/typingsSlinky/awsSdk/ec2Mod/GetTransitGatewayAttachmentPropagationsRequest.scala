package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTransitGatewayAttachmentPropagationsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters. The possible values are:    transit-gateway-route-table-id - The ID of the transit gateway route table.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: typingsSlinky.awsSdk.ec2Mod.TransitGatewayAttachmentId = js.native
}
object GetTransitGatewayAttachmentPropagationsRequest {
  
  @scala.inline
  def apply(TransitGatewayAttachmentId: TransitGatewayAttachmentId): GetTransitGatewayAttachmentPropagationsRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayAttachmentId = TransitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayAttachmentPropagationsRequest]
  }
  
  @scala.inline
  implicit class GetTransitGatewayAttachmentPropagationsRequestMutableBuilder[Self <: GetTransitGatewayAttachmentPropagationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: TransitGatewayMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
  }
}

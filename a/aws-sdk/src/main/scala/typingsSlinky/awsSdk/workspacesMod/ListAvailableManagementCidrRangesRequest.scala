package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAvailableManagementCidrRangesRequest extends StObject {
  
  /**
    * The IP address range to search. Specify an IP address range that is compatible with your network and in CIDR notation (that is, specify the range as an IPv4 CIDR block).
    */
  var ManagementCidrRangeConstraint: typingsSlinky.awsSdk.workspacesMod.ManagementCidrRangeConstraint = js.native
  
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[ManagementCidrRangeMaxResults] = js.native
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListAvailableManagementCidrRangesRequest {
  
  @scala.inline
  def apply(ManagementCidrRangeConstraint: ManagementCidrRangeConstraint): ListAvailableManagementCidrRangesRequest = {
    val __obj = js.Dynamic.literal(ManagementCidrRangeConstraint = ManagementCidrRangeConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAvailableManagementCidrRangesRequest]
  }
  
  @scala.inline
  implicit class ListAvailableManagementCidrRangesRequestMutableBuilder[Self <: ListAvailableManagementCidrRangesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagementCidrRangeConstraint(value: ManagementCidrRangeConstraint): Self = StObject.set(x, "ManagementCidrRangeConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: ManagementCidrRangeMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

package typingsSlinky.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGraphsRequest extends StObject {
  
  /**
    * The maximum number of graphs to return at a time. The total must be less than the overall limit on the number of results to return, which is currently 200.
    */
  var MaxResults: js.UndefOr[MemberResultsLimit] = js.native
  
  /**
    * For requests to get the next page of results, the pagination token that was returned with the previous set of results. The initial request does not include a pagination token.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListGraphsRequest {
  
  @scala.inline
  def apply(): ListGraphsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGraphsRequest]
  }
  
  @scala.inline
  implicit class ListGraphsRequestMutableBuilder[Self <: ListGraphsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MemberResultsLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchDashboardsResponse extends StObject {
  
  /**
    * The list of dashboards owned by the user specified in Filters in your request.
    */
  var DashboardSummaryList: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.DashboardSummaryList] = js.native
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object SearchDashboardsResponse {
  
  @scala.inline
  def apply(): SearchDashboardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDashboardsResponse]
  }
  
  @scala.inline
  implicit class SearchDashboardsResponseMutableBuilder[Self <: SearchDashboardsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardSummaryList(value: DashboardSummaryList): Self = StObject.set(x, "DashboardSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardSummaryListUndefined: Self = StObject.set(x, "DashboardSummaryList", js.undefined)
    
    @scala.inline
    def setDashboardSummaryListVarargs(value: DashboardSummary*): Self = StObject.set(x, "DashboardSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

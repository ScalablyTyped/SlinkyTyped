package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDashboardsResponse extends js.Object {
  
  /**
    * A structure that contains all of the dashboards in your AWS account. This structure provides basic information about the dashboards.
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
object ListDashboardsResponse {
  
  @scala.inline
  def apply(): ListDashboardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDashboardsResponse]
  }
  
  @scala.inline
  implicit class ListDashboardsResponseOps[Self <: ListDashboardsResponse] (val x: Self) extends AnyVal {
    
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
    def setDashboardSummaryListVarargs(value: DashboardSummary*): Self = this.set("DashboardSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setDashboardSummaryList(value: DashboardSummaryList): Self = this.set("DashboardSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashboardSummaryList: Self = this.set("DashboardSummaryList", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}

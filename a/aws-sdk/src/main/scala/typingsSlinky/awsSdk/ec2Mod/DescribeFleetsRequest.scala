package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetsRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The filters.    activity-status - The progress of the EC2 Fleet ( error | pending-fulfillment | pending-termination | fulfilled).    excess-capacity-termination-policy - Indicates whether to terminate running instances if the target capacity is decreased below the current EC2 Fleet size (true | false).    fleet-state - The state of the EC2 Fleet (submitted | active | deleted | failed | deleted-running | deleted-terminating | modifying).    replace-unhealthy-instances - Indicates whether EC2 Fleet should replace unhealthy instances (true | false).    type - The type of request (instant | request | maintain).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The ID of the EC2 Fleets.
    */
  var FleetIds: js.UndefOr[FleetIdSet] = js.native
  
  /**
    * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value is 1000. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeFleetsRequest {
  
  @scala.inline
  def apply(): DescribeFleetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetsRequest]
  }
  
  @scala.inline
  implicit class DescribeFleetsRequestOps[Self <: DescribeFleetsRequest] (val x: Self) extends AnyVal {
    
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setFleetIdsVarargs(value: FleetId*): Self = this.set("FleetIds", js.Array(value :_*))
    
    @scala.inline
    def setFleetIds(value: FleetIdSet): Self = this.set("FleetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetIds: Self = this.set("FleetIds", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}

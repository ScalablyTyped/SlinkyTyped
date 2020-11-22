package typingsSlinky.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReportsResponse extends js.Object {
  
  /** The amount of resource quota tokens deducted to execute the query. Includes all responses. */
  var queryCost: js.UndefOr[Double] = js.native
  
  /** Responses corresponding to each of the request. */
  var reports: js.UndefOr[js.Array[Report]] = js.native
  
  /** The amount of resource quota remaining for the property. */
  var resourceQuotasRemaining: js.UndefOr[ResourceQuotasRemaining] = js.native
}
object GetReportsResponse {
  
  @scala.inline
  def apply(): GetReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReportsResponse]
  }
  
  @scala.inline
  implicit class GetReportsResponseOps[Self <: GetReportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQueryCost(value: Double): Self = this.set("queryCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryCost: Self = this.set("queryCost", js.undefined)
    
    @scala.inline
    def setReportsVarargs(value: Report*): Self = this.set("reports", js.Array(value :_*))
    
    @scala.inline
    def setReports(value: js.Array[Report]): Self = this.set("reports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReports: Self = this.set("reports", js.undefined)
    
    @scala.inline
    def setResourceQuotasRemaining(value: ResourceQuotasRemaining): Self = this.set("resourceQuotasRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceQuotasRemaining: Self = this.set("resourceQuotasRemaining", js.undefined)
  }
}

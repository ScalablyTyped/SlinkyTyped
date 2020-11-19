package typingsSlinky.googleapis.v3Mod.analyticsV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDataRealtimeGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A comma-separated list of real time dimensions. E.g.,
    * 'rt:medium,rt:city'.
    */
  var dimensions: js.UndefOr[String] = js.native
  
  /**
    * A comma-separated list of dimension or metric filters to be applied to
    * real time data.
    */
  var filters: js.UndefOr[String] = js.native
  
  /**
    * Unique table ID for retrieving real time data. Table ID is of the form
    * ga:XXXX, where XXXX is the Analytics view (profile) ID.
    */
  var ids: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of entries to include in this feed.
    */
  var `max-results`: js.UndefOr[Double] = js.native
  
  /**
    * A comma-separated list of real time metrics. E.g., 'rt:activeUsers'. At
    * least one metric must be specified.
    */
  var metrics: js.UndefOr[String] = js.native
  
  /**
    * A comma-separated list of dimensions or metrics that determine the sort
    * order for real time data.
    */
  var sort: js.UndefOr[String] = js.native
}
object ParamsResourceDataRealtimeGet {
  
  @scala.inline
  def apply(): ParamsResourceDataRealtimeGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDataRealtimeGet]
  }
  
  @scala.inline
  implicit class ParamsResourceDataRealtimeGetOps[Self <: ParamsResourceDataRealtimeGet] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setDimensions(value: String): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setIds(value: String): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    
    @scala.inline
    def `setMax-results`(value: Double): Self = this.set("max-results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-results`: Self = this.set("max-results", js.undefined)
    
    @scala.inline
    def setMetrics(value: String): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}

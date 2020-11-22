package typingsSlinky.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricHeader extends js.Object {
  
  /** Headers for the metrics in the response. */
  var metricHeaderEntries: js.UndefOr[js.Array[MetricHeaderEntry]] = js.native
  
  /** Headers for the pivots in the response. */
  var pivotHeaders: js.UndefOr[js.Array[PivotHeader]] = js.native
}
object MetricHeader {
  
  @scala.inline
  def apply(): MetricHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricHeader]
  }
  
  @scala.inline
  implicit class MetricHeaderOps[Self <: MetricHeader] (val x: Self) extends AnyVal {
    
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
    def setMetricHeaderEntriesVarargs(value: MetricHeaderEntry*): Self = this.set("metricHeaderEntries", js.Array(value :_*))
    
    @scala.inline
    def setMetricHeaderEntries(value: js.Array[MetricHeaderEntry]): Self = this.set("metricHeaderEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricHeaderEntries: Self = this.set("metricHeaderEntries", js.undefined)
    
    @scala.inline
    def setPivotHeadersVarargs(value: PivotHeader*): Self = this.set("pivotHeaders", js.Array(value :_*))
    
    @scala.inline
    def setPivotHeaders(value: js.Array[PivotHeader]): Self = this.set("pivotHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotHeaders: Self = this.set("pivotHeaders", js.undefined)
  }
}

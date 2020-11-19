package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReachReportCompatibleFields extends js.Object {
  
  /** Dimensions which are compatible to be selected in the "dimensionFilters" section of the report. */
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** Dimensions which are compatible to be selected in the "dimensions" section of the report. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** The kind of resource this is, in this case dfareporting#reachReportCompatibleFields. */
  var kind: js.UndefOr[String] = js.native
  
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  
  /** Metrics which are compatible to be selected as activity metrics to pivot on in the "activities" section of the report. */
  var pivotedActivityMetrics: js.UndefOr[js.Array[Metric]] = js.native
  
  /** Metrics which are compatible to be selected in the "reachByFrequencyMetricNames" section of the report. */
  var reachByFrequencyMetrics: js.UndefOr[js.Array[Metric]] = js.native
}
object ReachReportCompatibleFields {
  
  @scala.inline
  def apply(): ReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReachReportCompatibleFields]
  }
  
  @scala.inline
  implicit class ReachReportCompatibleFieldsOps[Self <: ReachReportCompatibleFields] (val x: Self) extends AnyVal {
    
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
    def setDimensionFiltersVarargs(value: Dimension*): Self = this.set("dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setDimensionFilters(value: js.Array[Dimension]): Self = this.set("dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionFilters: Self = this.set("dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[Dimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: Metric*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[Metric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setPivotedActivityMetricsVarargs(value: Metric*): Self = this.set("pivotedActivityMetrics", js.Array(value :_*))
    
    @scala.inline
    def setPivotedActivityMetrics(value: js.Array[Metric]): Self = this.set("pivotedActivityMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotedActivityMetrics: Self = this.set("pivotedActivityMetrics", js.undefined)
    
    @scala.inline
    def setReachByFrequencyMetricsVarargs(value: Metric*): Self = this.set("reachByFrequencyMetrics", js.Array(value :_*))
    
    @scala.inline
    def setReachByFrequencyMetrics(value: js.Array[Metric]): Self = this.set("reachByFrequencyMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReachByFrequencyMetrics: Self = this.set("reachByFrequencyMetrics", js.undefined)
  }
}

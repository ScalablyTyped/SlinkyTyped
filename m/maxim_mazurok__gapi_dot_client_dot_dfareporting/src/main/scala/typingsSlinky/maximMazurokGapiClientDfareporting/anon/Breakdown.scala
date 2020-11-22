package typingsSlinky.maximMazurokGapiClientDfareporting.anon

import typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Breakdown extends js.Object {
  
  /** The list of dimensions the report should include. */
  var breakdown: js.UndefOr[js.Array[SortedDimension]] = js.native
  
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[
    typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange
  ] = js.native
  
  /** The dimension option. */
  var dimension: js.UndefOr[String] = js.native
  
  /** The list of filters on which dimensions are filtered. */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  
  /** The list of names of overlap metrics the report should include. */
  var overlapMetricNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether the report is pivoted or not. Defaults to true. */
  var pivoted: js.UndefOr[Boolean] = js.native
}
object Breakdown {
  
  @scala.inline
  def apply(): Breakdown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Breakdown]
  }
  
  @scala.inline
  implicit class BreakdownOps[Self <: Breakdown] (val x: Self) extends AnyVal {
    
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
    def setBreakdownVarargs(value: SortedDimension*): Self = this.set("breakdown", js.Array(value :_*))
    
    @scala.inline
    def setBreakdown(value: js.Array[SortedDimension]): Self = this.set("breakdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakdown: Self = this.set("breakdown", js.undefined)
    
    @scala.inline
    def setDateRange(value: typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    
    @scala.inline
    def setDimension(value: String): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: DimensionValue*): Self = this.set("dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setDimensionFilters(value: js.Array[DimensionValue]): Self = this.set("dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionFilters: Self = this.set("dimensionFilters", js.undefined)
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = this.set("metricNames", js.Array(value :_*))
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = this.set("metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricNames: Self = this.set("metricNames", js.undefined)
    
    @scala.inline
    def setOverlapMetricNamesVarargs(value: String*): Self = this.set("overlapMetricNames", js.Array(value :_*))
    
    @scala.inline
    def setOverlapMetricNames(value: js.Array[String]): Self = this.set("overlapMetricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlapMetricNames: Self = this.set("overlapMetricNames", js.undefined)
    
    @scala.inline
    def setPivoted(value: Boolean): Self = this.set("pivoted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivoted: Self = this.set("pivoted", js.undefined)
  }
}

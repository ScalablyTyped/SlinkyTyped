package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportCriteria extends js.Object {
  
  var activities: js.UndefOr[Activities] = js.native
  
  var customRichMediaEvents: js.UndefOr[CustomRichMediaEvents] = js.native
  
  var dateRange: js.UndefOr[DateRange] = js.native
  
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  
  var metricNames: js.UndefOr[js.Array[String]] = js.native
}
object ReportCriteria {
  
  @scala.inline
  def apply(): ReportCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportCriteria]
  }
  
  @scala.inline
  implicit class ReportCriteriaOps[Self <: ReportCriteria] (val x: Self) extends AnyVal {
    
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
    def setActivities(value: Activities): Self = this.set("activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivities: Self = this.set("activities", js.undefined)
    
    @scala.inline
    def setCustomRichMediaEvents(value: CustomRichMediaEvents): Self = this.set("customRichMediaEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRichMediaEvents: Self = this.set("customRichMediaEvents", js.undefined)
    
    @scala.inline
    def setDateRange(value: DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: DimensionValue*): Self = this.set("dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setDimensionFilters(value: js.Array[DimensionValue]): Self = this.set("dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionFilters: Self = this.set("dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: SortedDimension*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[SortedDimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = this.set("metricNames", js.Array(value :_*))
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = this.set("metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricNames: Self = this.set("metricNames", js.undefined)
  }
}

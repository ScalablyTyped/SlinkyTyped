package typingsSlinky.googleapis.anon

import typingsSlinky.googleapis.v31Mod.dfareportingV31.SchemaActivities
import typingsSlinky.googleapis.v31Mod.dfareportingV31.SchemaCustomRichMediaEvents
import typingsSlinky.googleapis.v31Mod.dfareportingV31.SchemaDateRange
import typingsSlinky.googleapis.v31Mod.dfareportingV31.SchemaDimensionValue
import typingsSlinky.googleapis.v31Mod.dfareportingV31.SchemaSortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRange extends StObject {
  
  var activities: js.UndefOr[SchemaActivities] = js.native
  
  var customRichMediaEvents: js.UndefOr[SchemaCustomRichMediaEvents] = js.native
  
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  
  var dimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  
  var enableAllDimensionCombinations: js.UndefOr[Boolean] = js.native
  
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  
  var reachByFrequencyMetricNames: js.UndefOr[js.Array[String]] = js.native
}
object DateRange {
  
  @scala.inline
  def apply(): DateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRange]
  }
  
  @scala.inline
  implicit class DateRangeMutableBuilder[Self <: DateRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: SchemaActivities): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setCustomRichMediaEvents(value: SchemaCustomRichMediaEvents): Self = StObject.set(x, "customRichMediaEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRichMediaEventsUndefined: Self = StObject.set(x, "customRichMediaEvents", js.undefined)
    
    @scala.inline
    def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    @scala.inline
    def setDimensionFilters(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[SchemaSortedDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: SchemaSortedDimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setEnableAllDimensionCombinations(value: Boolean): Self = StObject.set(x, "enableAllDimensionCombinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAllDimensionCombinationsUndefined: Self = StObject.set(x, "enableAllDimensionCombinations", js.undefined)
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
    
    @scala.inline
    def setReachByFrequencyMetricNames(value: js.Array[String]): Self = StObject.set(x, "reachByFrequencyMetricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachByFrequencyMetricNamesUndefined: Self = StObject.set(x, "reachByFrequencyMetricNames", js.undefined)
    
    @scala.inline
    def setReachByFrequencyMetricNamesVarargs(value: String*): Self = StObject.set(x, "reachByFrequencyMetricNames", js.Array(value :_*))
  }
}

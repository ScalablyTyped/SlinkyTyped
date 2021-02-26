package typingsSlinky.googleapis.anon

import typingsSlinky.googleapis.v32Mod.dfareportingV32.SchemaDateRange
import typingsSlinky.googleapis.v32Mod.dfareportingV32.SchemaDimensionValue
import typingsSlinky.googleapis.v32Mod.dfareportingV32.SchemaSortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dimension extends StObject {
  
  var breakdown: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  
  var dimension: js.UndefOr[String] = js.native
  
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  
  var overlapMetricNames: js.UndefOr[js.Array[String]] = js.native
  
  var pivoted: js.UndefOr[Boolean] = js.native
}
object Dimension {
  
  @scala.inline
  def apply(): Dimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimension]
  }
  
  @scala.inline
  implicit class DimensionMutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakdown(value: js.Array[SchemaSortedDimension]): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakdownUndefined: Self = StObject.set(x, "breakdown", js.undefined)
    
    @scala.inline
    def setBreakdownVarargs(value: SchemaSortedDimension*): Self = StObject.set(x, "breakdown", js.Array(value :_*))
    
    @scala.inline
    def setDateRange(value: SchemaDateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    @scala.inline
    def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFilters(value: js.Array[SchemaDimensionValue]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: SchemaDimensionValue*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
    
    @scala.inline
    def setOverlapMetricNames(value: js.Array[String]): Self = StObject.set(x, "overlapMetricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapMetricNamesUndefined: Self = StObject.set(x, "overlapMetricNames", js.undefined)
    
    @scala.inline
    def setOverlapMetricNamesVarargs(value: String*): Self = StObject.set(x, "overlapMetricNames", js.Array(value :_*))
    
    @scala.inline
    def setPivoted(value: Boolean): Self = StObject.set(x, "pivoted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotedUndefined: Self = StObject.set(x, "pivoted", js.undefined)
  }
}

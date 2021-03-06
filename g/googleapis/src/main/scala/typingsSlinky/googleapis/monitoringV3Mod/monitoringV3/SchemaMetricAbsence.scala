package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A condition type that checks that monitored resources are reporting data.
  * The configuration defines a metric and a set of monitored resources. The
  * predicate is considered in violation when a time series for the specified
  * metric of a monitored resource does not include any data in the specified
  * duration.
  */
@js.native
trait SchemaMetricAbsence extends StObject {
  
  /**
    * Specifies the alignment of data points in individual time series as well
    * as how to combine the retrieved time series together (such as when
    * aggregating multiple streams on each resource to a single stream for each
    * resource or when aggregating streams across all members of a group of
    * resrouces). Multiple aggregations are applied in the order specified.This
    * field is similar to the one in the MetricService.ListTimeSeries request.
    * It is advisable to use the ListTimeSeries method when debugging this
    * field.
    */
  var aggregations: js.UndefOr[js.Array[SchemaAggregation]] = js.native
  
  /**
    * The amount of time that a time series must fail to report new data to be
    * considered failing. Currently, only values that are a multiple of a
    * minute--e.g. 60, 120, or 300 seconds--are supported. If an invalid value
    * is given, an error will be returned. The Duration.nanos field is ignored.
    */
  var duration: js.UndefOr[String] = js.native
  
  /**
    * A filter that identifies which time series should be compared with the
    * threshold.The filter is similar to the one that is specified in the
    * MetricService.ListTimeSeries request (that call is useful to verify the
    * time series that will be retrieved / processed) and must specify the
    * metric type and optionally may contain restrictions on resource type,
    * resource labels, and metric labels. This field may not exceed 2048
    * Unicode characters in length.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * The number/percent of time series for which the comparison must hold in
    * order for the condition to trigger. If unspecified, then the condition
    * will trigger if the comparison is true for any of the time series that
    * have been identified by filter and aggregations.
    */
  var trigger: js.UndefOr[SchemaTrigger] = js.native
}
object SchemaMetricAbsence {
  
  @scala.inline
  def apply(): SchemaMetricAbsence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricAbsence]
  }
  
  @scala.inline
  implicit class SchemaMetricAbsenceMutableBuilder[Self <: SchemaMetricAbsence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregations(value: js.Array[SchemaAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    @scala.inline
    def setAggregationsVarargs(value: SchemaAggregation*): Self = StObject.set(x, "aggregations", js.Array(value :_*))
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setTrigger(value: SchemaTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}

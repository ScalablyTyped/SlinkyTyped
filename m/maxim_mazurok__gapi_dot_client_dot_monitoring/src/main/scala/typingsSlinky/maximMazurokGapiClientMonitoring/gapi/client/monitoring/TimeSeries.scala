package typingsSlinky.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSeries extends StObject {
  
  /**
    * Output only. The associated monitored resource metadata. When reading a time series, this field will include metadata labels that are explicitly named in the reduction. When
    * creating a time series, this field is ignored.
    */
  var metadata: js.UndefOr[MonitoredResourceMetadata] = js.native
  
  /** The associated metric. A fully-specified metric used to identify the time series. */
  var metric: js.UndefOr[Metric] = js.native
  
  /**
    * The metric kind of the time series. When listing time series, this metric kind might be different from the metric kind of the associated metric if this time series is an alignment
    * or reduction of other time series.When creating a time series, this field is optional. If present, it must be the same as the metric kind of the associated metric. If the associated
    * metric's descriptor must be auto-created, then this field specifies the metric kind of the new descriptor and must be either GAUGE (the default) or CUMULATIVE.
    */
  var metricKind: js.UndefOr[String] = js.native
  
  /**
    * The data points of this time series. When listing time series, points are returned in reverse time order.When creating a time series, this field must contain exactly one point and
    * the point's type must be the same as the value type of the associated metric. If the associated metric's descriptor must be auto-created, then the value type of the descriptor is
    * determined by the point's type, which must be BOOL, INT64, DOUBLE, or DISTRIBUTION.
    */
  var points: js.UndefOr[js.Array[Point]] = js.native
  
  /** The associated monitored resource. Custom metrics can use only certain monitored resource types in their time series data. */
  var resource: js.UndefOr[MonitoredResource] = js.native
  
  /**
    * The units in which the metric value is reported. It is only applicable if the value_type is INT64, DOUBLE, or DISTRIBUTION. The unit defines the representation of the stored metric
    * values.
    */
  var unit: js.UndefOr[String] = js.native
  
  /**
    * The value type of the time series. When listing time series, this value type might be different from the value type of the associated metric if this time series is an alignment or
    * reduction of other time series.When creating a time series, this field is optional. If present, it must be the same as the type of the data in the points field.
    */
  var valueType: js.UndefOr[String] = js.native
}
object TimeSeries {
  
  @scala.inline
  def apply(): TimeSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeries]
  }
  
  @scala.inline
  implicit class TimeSeriesMutableBuilder[Self <: TimeSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: MonitoredResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMetric(value: Metric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricKind(value: String): Self = StObject.set(x, "metricKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricKindUndefined: Self = StObject.set(x, "metricKind", js.undefined)
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: MonitoredResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}

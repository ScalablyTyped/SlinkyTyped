package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of data points that describes the time-varying values of a
  * metric. A time series is identified by a combination of a fully-specified
  * monitored resource and a fully-specified metric. This type is used for both
  * listing and creating time series.
  */
@js.native
trait SchemaTimeSeries extends js.Object {
  /**
    * Output only. The associated monitored resource metadata. When reading a a
    * timeseries, this field will include metadata labels that are explicitly
    * named in the reduction. When creating a timeseries, this field is
    * ignored.
    */
  var metadata: js.UndefOr[SchemaMonitoredResourceMetadata] = js.native
  /**
    * The associated metric. A fully-specified metric used to identify the time
    * series.
    */
  var metric: js.UndefOr[SchemaMetric] = js.native
  /**
    * The metric kind of the time series. When listing time series, this metric
    * kind might be different from the metric kind of the associated metric if
    * this time series is an alignment or reduction of other time series.When
    * creating a time series, this field is optional. If present, it must be
    * the same as the metric kind of the associated metric. If the associated
    * metric&#39;s descriptor must be auto-created, then this field specifies
    * the metric kind of the new descriptor and must be either GAUGE (the
    * default) or CUMULATIVE.
    */
  var metricKind: js.UndefOr[String] = js.native
  /**
    * The data points of this time series. When listing time series, points are
    * returned in reverse time order.When creating a time series, this field
    * must contain exactly one point and the point&#39;s type must be the same
    * as the value type of the associated metric. If the associated
    * metric&#39;s descriptor must be auto-created, then the value type of the
    * descriptor is determined by the point&#39;s type, which must be BOOL,
    * INT64, DOUBLE, or DISTRIBUTION.
    */
  var points: js.UndefOr[js.Array[SchemaPoint]] = js.native
  /**
    * The associated monitored resource. Custom metrics can use only certain
    * monitored resource types in their time series data.
    */
  var resource: js.UndefOr[SchemaMonitoredResource] = js.native
  /**
    * The value type of the time series. When listing time series, this value
    * type might be different from the value type of the associated metric if
    * this time series is an alignment or reduction of other time series.When
    * creating a time series, this field is optional. If present, it must be
    * the same as the type of the data in the points field.
    */
  var valueType: js.UndefOr[String] = js.native
}

object SchemaTimeSeries {
  @scala.inline
  def apply(): SchemaTimeSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeSeries]
  }
  @scala.inline
  implicit class SchemaTimeSeriesOps[Self <: SchemaTimeSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: SchemaMonitoredResourceMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMetric(value: SchemaMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricKind")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[SchemaPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: SchemaMonitoredResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withValueType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(js.undefined)
        ret
    }
  }
  
}


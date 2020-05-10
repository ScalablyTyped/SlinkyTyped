package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDatum extends js.Object {
  /**
    * Array of numbers that is used along with the Values array. Each number in the Count array is the number of times the corresponding value in the Values array occurred during the period.  If you omit the Counts array, the default of 1 is used as the value for each count. If you include a Counts array, it must include the same amount of values as the Values array.
    */
  var Counts: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Counts] = js.native
  /**
    * The dimensions associated with the metric.
    */
  var Dimensions: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Dimensions] = js.native
  /**
    * The name of the metric.
    */
  var MetricName: typingsSlinky.awsSdk.cloudwatchMod.MetricName = js.native
  /**
    * The statistical values for the metric.
    */
  var StatisticValues: js.UndefOr[StatisticSet] = js.native
  /**
    * Valid values are 1 and 60. Setting this to 1 specifies this metric as a high-resolution metric, so that CloudWatch stores the metric with sub-minute resolution down to one second. Setting this to 60 specifies this metric as a regular-resolution metric, which CloudWatch stores at 1-minute resolution. Currently, high resolution is available only for custom metrics. For more information about high-resolution metrics, see High-Resolution Metrics in the Amazon CloudWatch User Guide.  This field is optional, if you do not specify it the default of 60 is used.
    */
  var StorageResolution: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.StorageResolution] = js.native
  /**
    * The time the metric data was received, expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC.
    */
  var Timestamp: js.UndefOr[js.Date] = js.native
  /**
    * When you are using a Put operation, this defines what unit you want to use when storing the metric. In a Get operation, this displays the unit that is used for the metric.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
  /**
    * The value for the metric. Although the parameter accepts numbers of type Double, CloudWatch rejects values that are either too small or too large. Values must be in the range of -2^360 to 2^360. In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
    */
  var Value: js.UndefOr[DatapointValue] = js.native
  /**
    * Array of numbers representing the values for the metric during the period. Each unique value is listed just once in this array, and the corresponding number in the Counts array specifies the number of times that value occurred during the period. You can include up to 150 unique values in each PutMetricData action that specifies a Values array. Although the Values array accepts numbers of type Double, CloudWatch rejects values that are either too small or too large. Values must be in the range of -2^360 to 2^360. In addition, special values (for example, NaN, +Infinity, -Infinity) are not supported.
    */
  var Values: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Values] = js.native
}

object MetricDatum {
  @scala.inline
  def apply(MetricName: MetricName): MetricDatum = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDatum]
  }
  @scala.inline
  implicit class MetricDatumOps[Self <: MetricDatum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCounts(value: Counts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Counts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Counts")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensions(value: Dimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withStatisticValues(value: StatisticSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatisticValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatisticValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatisticValues")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageResolution(value: StorageResolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: StandardUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unit")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: DatapointValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: Values): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(js.undefined)
        ret
    }
  }
  
}


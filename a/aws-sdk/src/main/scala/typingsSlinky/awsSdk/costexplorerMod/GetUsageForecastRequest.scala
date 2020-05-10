package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsageForecastRequest extends js.Object {
  /**
    * The filters that you want to use to filter your forecast. Cost Explorer API supports all of the Cost Explorer filters.
    */
  var Filter: js.UndefOr[Expression] = js.native
  /**
    * How granular you want the forecast to be. You can get 3 months of DAILY forecasts or 12 months of MONTHLY forecasts. The GetUsageForecast operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: typingsSlinky.awsSdk.costexplorerMod.Granularity = js.native
  /**
    * Which metric Cost Explorer uses to create your forecast. Valid values for a GetUsageForecast call are the following:   USAGE_QUANTITY   NORMALIZED_USAGE_AMOUNT  
    */
  var Metric: typingsSlinky.awsSdk.costexplorerMod.Metric = js.native
  /**
    * Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction intervals.
    */
  var PredictionIntervalLevel: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.PredictionIntervalLevel] = js.native
  /**
    * The start and end dates of the period that you want to retrieve usage forecast for. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01.
    */
  var TimePeriod: DateInterval = js.native
}

object GetUsageForecastRequest {
  @scala.inline
  def apply(Granularity: Granularity, Metric: Metric, TimePeriod: DateInterval): GetUsageForecastRequest = {
    val __obj = js.Dynamic.literal(Granularity = Granularity.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any], TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageForecastRequest]
  }
  @scala.inline
  implicit class GetUsageForecastRequestOps[Self <: GetUsageForecastRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGranularity(value: Granularity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Granularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetric(value: Metric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimePeriod(value: DateInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictionIntervalLevel(value: PredictionIntervalLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictionIntervalLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictionIntervalLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictionIntervalLevel")(js.undefined)
        ret
    }
  }
  
}


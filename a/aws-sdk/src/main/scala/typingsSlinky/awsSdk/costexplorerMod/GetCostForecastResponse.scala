package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCostForecastResponse extends js.Object {
  /**
    * The forecasts for your query, in order. For DAILY forecasts, this is a list of days. For MONTHLY forecasts, this is a list of months.
    */
  var ForecastResultsByTime: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ForecastResultsByTime] = js.native
  /**
    * How much you are forecasted to spend over the forecast period, in USD.
    */
  var Total: js.UndefOr[MetricValue] = js.native
}

object GetCostForecastResponse {
  @scala.inline
  def apply(): GetCostForecastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCostForecastResponse]
  }
  @scala.inline
  implicit class GetCostForecastResponseOps[Self <: GetCostForecastResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForecastResultsByTime(value: ForecastResultsByTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastResultsByTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForecastResultsByTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastResultsByTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(js.undefined)
        ret
    }
  }
  
}


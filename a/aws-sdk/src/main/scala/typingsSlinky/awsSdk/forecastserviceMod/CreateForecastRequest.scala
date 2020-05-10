package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateForecastRequest extends js.Object {
  /**
    * A name for the forecast.
    */
  var ForecastName: Name = js.native
  /**
    * The quantiles at which probabilistic forecasts are generated. You can specify up to 5 quantiles per forecast. Accepted values include 0.01 to 0.99 (increments of .01 only) and mean. The mean forecast is different from the median (0.50) when the distribution is not symmetric (e.g. Beta, Negative Binomial). The default value is ["0.1", "0.5", "0.9"].
    */
  var ForecastTypes: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.ForecastTypes] = js.native
  /**
    * The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
    */
  var PredictorArn: Arn = js.native
}

object CreateForecastRequest {
  @scala.inline
  def apply(ForecastName: Name, PredictorArn: Arn): CreateForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastName = ForecastName.asInstanceOf[js.Any], PredictorArn = PredictorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateForecastRequest]
  }
  @scala.inline
  implicit class CreateForecastRequestOps[Self <: CreateForecastRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForecastName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredictorArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForecastTypes(value: ForecastTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForecastTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastTypes")(js.undefined)
        ret
    }
  }
  
}


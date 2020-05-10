package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForecastResult extends js.Object {
  /**
    * The mean value of the forecast.
    */
  var MeanValue: js.UndefOr[GenericString] = js.native
  /**
    * The lower limit for the prediction interval. 
    */
  var PredictionIntervalLowerBound: js.UndefOr[GenericString] = js.native
  /**
    * The upper limit for the prediction interval. 
    */
  var PredictionIntervalUpperBound: js.UndefOr[GenericString] = js.native
  /**
    * The period of time that the forecast covers.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.native
}

object ForecastResult {
  @scala.inline
  def apply(): ForecastResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForecastResult]
  }
  @scala.inline
  implicit class ForecastResultOps[Self <: ForecastResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeanValue(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeanValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeanValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeanValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictionIntervalLowerBound(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictionIntervalLowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictionIntervalLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictionIntervalLowerBound")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictionIntervalUpperBound(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictionIntervalUpperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictionIntervalUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictionIntervalUpperBound")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePeriod(value: DateInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePeriod")(js.undefined)
        ret
    }
  }
  
}


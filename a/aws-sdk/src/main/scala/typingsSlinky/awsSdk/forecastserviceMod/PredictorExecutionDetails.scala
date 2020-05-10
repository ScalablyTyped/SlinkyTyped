package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredictorExecutionDetails extends js.Object {
  /**
    * An array of the backtests performed to evaluate the accuracy of the predictor against a particular algorithm. The NumberOfBacktestWindows from the object determines the number of windows in the array.
    */
  var PredictorExecutions: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.PredictorExecutions] = js.native
}

object PredictorExecutionDetails {
  @scala.inline
  def apply(): PredictorExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictorExecutionDetails]
  }
  @scala.inline
  implicit class PredictorExecutionDetailsOps[Self <: PredictorExecutionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPredictorExecutions(value: PredictorExecutions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictorExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorExecutions")(js.undefined)
        ret
    }
  }
  
}


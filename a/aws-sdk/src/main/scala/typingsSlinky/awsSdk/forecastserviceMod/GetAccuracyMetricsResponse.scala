package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccuracyMetricsResponse extends js.Object {
  /**
    * An array of results from evaluating the predictor.
    */
  var PredictorEvaluationResults: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.PredictorEvaluationResults] = js.native
}

object GetAccuracyMetricsResponse {
  @scala.inline
  def apply(): GetAccuracyMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccuracyMetricsResponse]
  }
  @scala.inline
  implicit class GetAccuracyMetricsResponseOps[Self <: GetAccuracyMetricsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPredictorEvaluationResults(value: PredictorEvaluationResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorEvaluationResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictorEvaluationResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorEvaluationResults")(js.undefined)
        ret
    }
  }
  
}


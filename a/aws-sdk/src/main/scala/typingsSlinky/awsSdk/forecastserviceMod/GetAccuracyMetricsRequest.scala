package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccuracyMetricsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the predictor to get metrics for.
    */
  var PredictorArn: Arn = js.native
}

object GetAccuracyMetricsRequest {
  @scala.inline
  def apply(PredictorArn: Arn): GetAccuracyMetricsRequest = {
    val __obj = js.Dynamic.literal(PredictorArn = PredictorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccuracyMetricsRequest]
  }
  @scala.inline
  implicit class GetAccuracyMetricsRequestOps[Self <: GetAccuracyMetricsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPredictorArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


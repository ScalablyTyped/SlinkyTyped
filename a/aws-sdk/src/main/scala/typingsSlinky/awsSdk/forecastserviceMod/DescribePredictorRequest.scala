package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePredictorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the predictor that you want information about.
    */
  var PredictorArn: Arn = js.native
}

object DescribePredictorRequest {
  @scala.inline
  def apply(PredictorArn: Arn): DescribePredictorRequest = {
    val __obj = js.Dynamic.literal(PredictorArn = PredictorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePredictorRequest]
  }
  @scala.inline
  implicit class DescribePredictorRequestOps[Self <: DescribePredictorRequest] (val x: Self) extends AnyVal {
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


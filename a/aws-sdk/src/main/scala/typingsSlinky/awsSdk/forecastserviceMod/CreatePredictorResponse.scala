package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePredictorResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the predictor.
    */
  var PredictorArn: js.UndefOr[Arn] = js.native
}

object CreatePredictorResponse {
  @scala.inline
  def apply(): CreatePredictorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePredictorResponse]
  }
  @scala.inline
  implicit class CreatePredictorResponseOps[Self <: CreatePredictorResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutPredictorArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredictorArn")(js.undefined)
        ret
    }
  }
  
}


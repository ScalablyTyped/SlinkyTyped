package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredictOutput extends js.Object {
  var Prediction: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.Prediction] = js.native
}

object PredictOutput {
  @scala.inline
  def apply(): PredictOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictOutput]
  }
  @scala.inline
  implicit class PredictOutputOps[Self <: PredictOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrediction(value: Prediction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prediction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrediction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prediction")(js.undefined)
        ret
    }
  }
  
}


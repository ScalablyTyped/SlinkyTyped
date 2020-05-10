package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prediction extends js.Object {
  var details: js.UndefOr[DetailsMap] = js.native
  /**
    * The prediction label for either a BINARY or MULTICLASS MLModel.
    */
  var predictedLabel: js.UndefOr[Label] = js.native
  var predictedScores: js.UndefOr[ScoreValuePerLabelMap] = js.native
  /**
    * The prediction value for REGRESSION MLModel.
    */
  var predictedValue: js.UndefOr[floatLabel] = js.native
}

object Prediction {
  @scala.inline
  def apply(): Prediction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prediction]
  }
  @scala.inline
  implicit class PredictionOps[Self <: Prediction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: DetailsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictedLabel(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictedLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictedLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictedLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictedScores(value: ScoreValuePerLabelMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictedScores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictedScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictedScores")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictedValue(value: floatLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictedValue")(js.undefined)
        ret
    }
  }
  
}


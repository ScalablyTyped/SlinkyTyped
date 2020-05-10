package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelScores extends js.Object {
  /**
    * The model version.
    */
  var modelVersion: js.UndefOr[ModelVersion] = js.native
  /**
    * The model's fraud prediction scores.
    */
  var scores: js.UndefOr[ModelPredictionMap] = js.native
}

object ModelScores {
  @scala.inline
  def apply(): ModelScores = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelScores]
  }
  @scala.inline
  implicit class ModelScoresOps[Self <: ModelScores] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModelVersion(value: ModelVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withScores(value: ModelPredictionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scores")(js.undefined)
        ret
    }
  }
  
}


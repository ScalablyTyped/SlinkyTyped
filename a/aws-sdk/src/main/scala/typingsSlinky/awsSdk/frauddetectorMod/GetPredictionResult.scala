package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPredictionResult extends js.Object {
  /**
    * The model scores for models used in the detector version.
    */
  var modelScores: js.UndefOr[ListOfModelScores] = js.native
  /**
    * The prediction outcomes.
    */
  var outcomes: js.UndefOr[ListOfStrings] = js.native
}

object GetPredictionResult {
  @scala.inline
  def apply(): GetPredictionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPredictionResult]
  }
  @scala.inline
  implicit class GetPredictionResultOps[Self <: GetPredictionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModelScores(value: ListOfModelScores): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelScores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelScores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelScores")(js.undefined)
        ret
    }
    @scala.inline
    def withOutcomes(value: ListOfStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcomes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutcomes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcomes")(js.undefined)
        ret
    }
  }
  
}


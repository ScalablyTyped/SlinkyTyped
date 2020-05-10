package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BqmlIterationResult extends js.Object {
  var durationMs: js.UndefOr[String] = js.native
  var evalLoss: js.UndefOr[Double] = js.native
  var index: js.UndefOr[Double] = js.native
  var learnRate: js.UndefOr[Double] = js.native
  var trainingLoss: js.UndefOr[Double] = js.native
}

object BqmlIterationResult {
  @scala.inline
  def apply(): BqmlIterationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BqmlIterationResult]
  }
  @scala.inline
  implicit class BqmlIterationResultOps[Self <: BqmlIterationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMs")(js.undefined)
        ret
    }
    @scala.inline
    def withEvalLoss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalLoss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvalLoss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalLoss")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLearnRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("learnRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLearnRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("learnRate")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingLoss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingLoss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingLoss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingLoss")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBqmlIterationResult extends js.Object {
  /**
    * [Output-only, Beta] Time taken to run the training iteration in
    * milliseconds.
    */
  var durationMs: js.UndefOr[String] = js.native
  /**
    * [Output-only, Beta] Eval loss computed on the eval data at the end of the
    * iteration. The eval loss is used for early stopping to avoid overfitting.
    * No eval loss if eval_split_method option is specified as no_split or
    * auto_split with input data size less than 500 rows.
    */
  var evalLoss: js.UndefOr[Double] = js.native
  /**
    * [Output-only, Beta] Index of the ML training iteration, starting from
    * zero for each training run.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * [Output-only, Beta] Learning rate used for this iteration, it varies for
    * different training iterations if learn_rate_strategy option is not
    * constant.
    */
  var learnRate: js.UndefOr[Double] = js.native
  /**
    * [Output-only, Beta] Training loss computed on the training data at the
    * end of the iteration. The training loss function is defined by model
    * type.
    */
  var trainingLoss: js.UndefOr[Double] = js.native
}

object SchemaBqmlIterationResult {
  @scala.inline
  def apply(): SchemaBqmlIterationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBqmlIterationResult]
  }
  @scala.inline
  implicit class SchemaBqmlIterationResultOps[Self <: SchemaBqmlIterationResult] (val x: Self) extends AnyVal {
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


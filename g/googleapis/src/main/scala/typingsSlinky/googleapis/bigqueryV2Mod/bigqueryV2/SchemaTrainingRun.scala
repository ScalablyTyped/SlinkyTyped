package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single training query run for the model.
  */
@js.native
trait SchemaTrainingRun extends js.Object {
  /**
    * The evaluation metrics over training/eval data that were computed at the
    * end of training.
    */
  var evaluationMetrics: js.UndefOr[SchemaEvaluationMetrics] = js.native
  /**
    * Output of each iteration run, results.size() &lt;= max_iterations.
    */
  var results: js.UndefOr[js.Array[SchemaIterationResult]] = js.native
  /**
    * The start time of this training run.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Options that were used for this training run, includes user specified and
    * default options that were used.
    */
  var trainingOptions: js.UndefOr[SchemaTrainingOptions] = js.native
}

object SchemaTrainingRun {
  @scala.inline
  def apply(): SchemaTrainingRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrainingRun]
  }
  @scala.inline
  implicit class SchemaTrainingRunOps[Self <: SchemaTrainingRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluationMetrics(value: SchemaEvaluationMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluationMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluationMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[SchemaIterationResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingOptions(value: SchemaTrainingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingOptions")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single iteration of the training run.
  */
@js.native
trait SchemaIterationResult extends js.Object {
  /**
    * [Beta] Information about top clusters for clustering models.
    */
  var clusterInfos: js.UndefOr[js.Array[SchemaClusterInfo]] = js.native
  /**
    * Time taken to run the iteration in milliseconds.
    */
  var durationMs: js.UndefOr[String] = js.native
  /**
    * Loss computed on the eval data at the end of iteration.
    */
  var evalLoss: js.UndefOr[Double] = js.native
  /**
    * Index of the iteration, 0 based.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Learn rate used for this iteration.
    */
  var learnRate: js.UndefOr[Double] = js.native
  /**
    * Loss computed on the training data at the end of iteration.
    */
  var trainingLoss: js.UndefOr[Double] = js.native
}

object SchemaIterationResult {
  @scala.inline
  def apply(): SchemaIterationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIterationResult]
  }
  @scala.inline
  implicit class SchemaIterationResultOps[Self <: SchemaIterationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterInfos(value: js.Array[SchemaClusterInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterInfos")(js.undefined)
        ret
    }
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


package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTrainingOptions extends js.Object {
  /**
    * The column to split data with. This column won&#39;t be used as a
    * feature. 1. When data_split_method is CUSTOM, the corresponding column
    * should be boolean. The rows with true value tag are eval data, and the
    * false are training data. 2. When data_split_method is SEQ, the first
    * DATA_SPLIT_EVAL_FRACTION rows (from smallest to largest) in the
    * corresponding column are used as training data, and the rest are eval
    * data. It respects the order in Orderable data types:
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types#data-type-properties
    */
  var dataSplitColumn: js.UndefOr[String] = js.native
  /**
    * The fraction of evaluation data over the whole input data. The rest of
    * data will be used as training data. The format should be double. Accurate
    * to two decimal places. Default value is 0.2.
    */
  var dataSplitEvalFraction: js.UndefOr[Double] = js.native
  /**
    * The data split type for training and evaluation, e.g. RANDOM.
    */
  var dataSplitMethod: js.UndefOr[String] = js.native
  /**
    * [Beta] Distance type for clustering models.
    */
  var distanceType: js.UndefOr[String] = js.native
  /**
    * Whether to stop early when the loss doesn&#39;t improve significantly any
    * more (compared to min_relative_progress).
    */
  var earlyStop: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the initial learning rate for line search to start at.
    */
  var initialLearnRate: js.UndefOr[Double] = js.native
  /**
    * Name of input label columns in training data.
    */
  var inputLabelColumns: js.UndefOr[js.Array[String]] = js.native
  /**
    * L1 regularization coefficient.
    */
  var l1Regularization: js.UndefOr[Double] = js.native
  /**
    * L2 regularization coefficient.
    */
  var l2Regularization: js.UndefOr[Double] = js.native
  /**
    * Weights associated with each label class, for rebalancing the training
    * data.
    */
  var labelClassWeights: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Learning rate in training.
    */
  var learnRate: js.UndefOr[Double] = js.native
  /**
    * The strategy to determine learning rate.
    */
  var learnRateStrategy: js.UndefOr[String] = js.native
  /**
    * Type of loss function used during training run.
    */
  var lossType: js.UndefOr[String] = js.native
  /**
    * The maximum number of iterations in training.
    */
  var maxIterations: js.UndefOr[String] = js.native
  /**
    * When early_stop is true, stops training when accuracy improvement is less
    * than &#39;min_relative_progress&#39;.
    */
  var minRelativeProgress: js.UndefOr[Double] = js.native
  /**
    * [Beta] Number of clusters for clustering models.
    */
  var numClusters: js.UndefOr[String] = js.native
  /**
    * Whether to train a model from the last checkpoint.
    */
  var warmStart: js.UndefOr[Boolean] = js.native
}

object SchemaTrainingOptions {
  @scala.inline
  def apply(): SchemaTrainingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrainingOptions]
  }
  @scala.inline
  implicit class SchemaTrainingOptionsOps[Self <: SchemaTrainingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSplitColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSplitColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSplitColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSplitColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSplitEvalFraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSplitEvalFraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSplitEvalFraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSplitEvalFraction")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSplitMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSplitMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSplitMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSplitMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withEarlyStop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarlyStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyStop")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialLearnRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialLearnRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialLearnRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialLearnRate")(js.undefined)
        ret
    }
    @scala.inline
    def withInputLabelColumns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputLabelColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputLabelColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputLabelColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withL1Regularization(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l1Regularization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL1Regularization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l1Regularization")(js.undefined)
        ret
    }
    @scala.inline
    def withL2Regularization(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l2Regularization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL2Regularization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l2Regularization")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelClassWeights(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClassWeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelClassWeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClassWeights")(js.undefined)
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
    def withLearnRateStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("learnRateStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLearnRateStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("learnRateStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withLossType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLossType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossType")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxIterations(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIterations")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRelativeProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRelativeProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRelativeProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRelativeProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withNumClusters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numClusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumClusters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numClusters")(js.undefined)
        ret
    }
    @scala.inline
    def withWarmStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warmStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarmStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warmStart")(js.undefined)
        ret
    }
  }
  
}


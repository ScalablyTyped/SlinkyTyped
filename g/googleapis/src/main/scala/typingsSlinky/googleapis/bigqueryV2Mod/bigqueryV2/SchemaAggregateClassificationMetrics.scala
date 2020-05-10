package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Aggregate metrics for classification models. For multi-class models, the
  * metrics are either macro-averaged: metrics are calculated for each label
  * and then an unweighted average is taken of those values or micro-averaged:
  * the metric is calculated globally by counting the total number of correctly
  * predicted rows.
  */
@js.native
trait SchemaAggregateClassificationMetrics extends js.Object {
  /**
    * Accuracy is the fraction of predictions given the correct label. For
    * multiclass this is a micro-averaged metric.
    */
  var accuracy: js.UndefOr[Double] = js.native
  /**
    * The F1 score is an average of recall and precision. For multiclass this
    * is a macro-averaged metric.
    */
  var f1Score: js.UndefOr[Double] = js.native
  /**
    * Logarithmic Loss. For multiclass this is a macro-averaged metric.
    */
  var logLoss: js.UndefOr[Double] = js.native
  /**
    * Precision is the fraction of actual positive predictions that had
    * positive actual labels. For multiclass this is a macro-averaged metric
    * treating each class as a binary classifier.
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Recall is the fraction of actual positive labels that were given a
    * positive prediction. For multiclass this is a macro-averaged metric.
    */
  var recall: js.UndefOr[Double] = js.native
  /**
    * Area Under a ROC Curve. For multiclass this is a macro-averaged metric.
    */
  var rocAuc: js.UndefOr[Double] = js.native
  /**
    * Threshold at which the metrics are computed. For binary classification
    * models this is the positive class threshold. For multi-class
    * classfication models this is the confidence threshold.
    */
  var threshold: js.UndefOr[Double] = js.native
}

object SchemaAggregateClassificationMetrics {
  @scala.inline
  def apply(): SchemaAggregateClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateClassificationMetrics]
  }
  @scala.inline
  implicit class SchemaAggregateClassificationMetricsOps[Self <: SchemaAggregateClassificationMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withF1Score(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f1Score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF1Score: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f1Score")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLoss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLoss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLoss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLoss")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withRecall(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recall")(js.undefined)
        ret
    }
    @scala.inline
    def withRocAuc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rocAuc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRocAuc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rocAuc")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}


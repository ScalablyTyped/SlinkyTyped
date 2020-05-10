package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Evaluation metrics for multi-class classification models.
  */
@js.native
trait SchemaMultiClassClassificationMetrics extends js.Object {
  /**
    * Aggregate classification metrics.
    */
  var aggregateClassificationMetrics: js.UndefOr[SchemaAggregateClassificationMetrics] = js.native
  /**
    * Confusion matrix at different thresholds.
    */
  var confusionMatrixList: js.UndefOr[js.Array[SchemaConfusionMatrix]] = js.native
}

object SchemaMultiClassClassificationMetrics {
  @scala.inline
  def apply(): SchemaMultiClassClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultiClassClassificationMetrics]
  }
  @scala.inline
  implicit class SchemaMultiClassClassificationMetricsOps[Self <: SchemaMultiClassClassificationMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateClassificationMetrics(value: SchemaAggregateClassificationMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateClassificationMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateClassificationMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateClassificationMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withConfusionMatrixList(value: js.Array[SchemaConfusionMatrix]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confusionMatrixList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfusionMatrixList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confusionMatrixList")(js.undefined)
        ret
    }
  }
  
}


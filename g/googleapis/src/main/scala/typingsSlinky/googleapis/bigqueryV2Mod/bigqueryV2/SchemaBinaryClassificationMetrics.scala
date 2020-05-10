package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Evaluation metrics for binary classification models.
  */
@js.native
trait SchemaBinaryClassificationMetrics extends js.Object {
  /**
    * Aggregate classification metrics.
    */
  var aggregateClassificationMetrics: js.UndefOr[SchemaAggregateClassificationMetrics] = js.native
  /**
    * Binary confusion matrix at multiple thresholds.
    */
  var binaryConfusionMatrixList: js.UndefOr[js.Array[SchemaBinaryConfusionMatrix]] = js.native
}

object SchemaBinaryClassificationMetrics {
  @scala.inline
  def apply(): SchemaBinaryClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinaryClassificationMetrics]
  }
  @scala.inline
  implicit class SchemaBinaryClassificationMetricsOps[Self <: SchemaBinaryClassificationMetrics] (val x: Self) extends AnyVal {
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
    def withBinaryConfusionMatrixList(value: js.Array[SchemaBinaryConfusionMatrix]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryConfusionMatrixList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryConfusionMatrixList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryConfusionMatrixList")(js.undefined)
        ret
    }
  }
  
}


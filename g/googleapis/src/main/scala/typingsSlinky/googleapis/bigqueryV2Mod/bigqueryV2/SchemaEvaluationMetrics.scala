package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Evaluation metrics of a model. These are either computed on all training
  * data or just the eval data based on whether eval data was used during
  * training.
  */
@js.native
trait SchemaEvaluationMetrics extends js.Object {
  /**
    * Populated for binary classification models.
    */
  var binaryClassificationMetrics: js.UndefOr[SchemaBinaryClassificationMetrics] = js.native
  /**
    * [Beta] Populated for clustering models.
    */
  var clusteringMetrics: js.UndefOr[SchemaClusteringMetrics] = js.native
  /**
    * Populated for multi-class classification models.
    */
  var multiClassClassificationMetrics: js.UndefOr[SchemaMultiClassClassificationMetrics] = js.native
  /**
    * Populated for regression models.
    */
  var regressionMetrics: js.UndefOr[SchemaRegressionMetrics] = js.native
}

object SchemaEvaluationMetrics {
  @scala.inline
  def apply(): SchemaEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvaluationMetrics]
  }
  @scala.inline
  implicit class SchemaEvaluationMetricsOps[Self <: SchemaEvaluationMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaryClassificationMetrics(value: SchemaBinaryClassificationMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryClassificationMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryClassificationMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryClassificationMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withClusteringMetrics(value: SchemaClusteringMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusteringMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusteringMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusteringMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiClassClassificationMetrics(value: SchemaMultiClassClassificationMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiClassClassificationMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiClassClassificationMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiClassClassificationMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withRegressionMetrics(value: SchemaRegressionMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regressionMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegressionMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regressionMetrics")(js.undefined)
        ret
    }
  }
  
}


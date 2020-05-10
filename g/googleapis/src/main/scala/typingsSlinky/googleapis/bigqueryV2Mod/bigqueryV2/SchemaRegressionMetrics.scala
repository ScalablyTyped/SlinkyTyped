package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Evaluation metrics for regression models.
  */
@js.native
trait SchemaRegressionMetrics extends js.Object {
  /**
    * Mean absolute error.
    */
  var meanAbsoluteError: js.UndefOr[Double] = js.native
  /**
    * Mean squared error.
    */
  var meanSquaredError: js.UndefOr[Double] = js.native
  /**
    * Mean squared log error.
    */
  var meanSquaredLogError: js.UndefOr[Double] = js.native
  /**
    * Median absolute error.
    */
  var medianAbsoluteError: js.UndefOr[Double] = js.native
  /**
    * R^2 score.
    */
  var rSquared: js.UndefOr[Double] = js.native
}

object SchemaRegressionMetrics {
  @scala.inline
  def apply(): SchemaRegressionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegressionMetrics]
  }
  @scala.inline
  implicit class SchemaRegressionMetricsOps[Self <: SchemaRegressionMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeanAbsoluteError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanAbsoluteError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeanAbsoluteError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanAbsoluteError")(js.undefined)
        ret
    }
    @scala.inline
    def withMeanSquaredError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanSquaredError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeanSquaredError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanSquaredError")(js.undefined)
        ret
    }
    @scala.inline
    def withMeanSquaredLogError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanSquaredLogError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeanSquaredLogError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanSquaredLogError")(js.undefined)
        ret
    }
    @scala.inline
    def withMedianAbsoluteError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianAbsoluteError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedianAbsoluteError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medianAbsoluteError")(js.undefined)
        ret
    }
    @scala.inline
    def withRSquared(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rSquared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRSquared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rSquared")(js.undefined)
        ret
    }
  }
  
}


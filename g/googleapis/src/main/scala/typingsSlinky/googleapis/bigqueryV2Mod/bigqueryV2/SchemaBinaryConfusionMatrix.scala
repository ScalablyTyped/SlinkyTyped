package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Confusion matrix for binary classification models.
  */
@js.native
trait SchemaBinaryConfusionMatrix extends js.Object {
  /**
    * Number of false samples predicted as false.
    */
  var falseNegatives: js.UndefOr[String] = js.native
  /**
    * Number of false samples predicted as true.
    */
  var falsePositives: js.UndefOr[String] = js.native
  /**
    * Threshold value used when computing each of the following metric.
    */
  var positiveClassThreshold: js.UndefOr[Double] = js.native
  /**
    * Aggregate precision.
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Aggregate recall.
    */
  var recall: js.UndefOr[Double] = js.native
  /**
    * Number of true samples predicted as false.
    */
  var trueNegatives: js.UndefOr[String] = js.native
  /**
    * Number of true samples predicted as true.
    */
  var truePositives: js.UndefOr[String] = js.native
}

object SchemaBinaryConfusionMatrix {
  @scala.inline
  def apply(): SchemaBinaryConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinaryConfusionMatrix]
  }
  @scala.inline
  implicit class SchemaBinaryConfusionMatrixOps[Self <: SchemaBinaryConfusionMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFalseNegatives(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseNegatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFalseNegatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseNegatives")(js.undefined)
        ret
    }
    @scala.inline
    def withFalsePositives(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falsePositives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFalsePositives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falsePositives")(js.undefined)
        ret
    }
    @scala.inline
    def withPositiveClassThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveClassThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositiveClassThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveClassThreshold")(js.undefined)
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
    def withTrueNegatives(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueNegatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrueNegatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueNegatives")(js.undefined)
        ret
    }
    @scala.inline
    def withTruePositives(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truePositives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruePositives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truePositives")(js.undefined)
        ret
    }
  }
  
}


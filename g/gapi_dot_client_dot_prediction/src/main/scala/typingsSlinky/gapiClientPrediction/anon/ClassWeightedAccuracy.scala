package typingsSlinky.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassWeightedAccuracy extends js.Object {
  /** Estimated accuracy of model taking utility weights into account (Categorical models only). */
  var classWeightedAccuracy: js.UndefOr[String] = js.native
  /**
    * A number between 0.0 and 1.0, where 1.0 is 100% accurate. This is an estimate, based on the amount and quality of the training data, of the estimated
    * prediction accuracy. You can use this is a guide to decide whether the results are accurate enough for your needs. This estimate will be more reliable
    * if your real input data is similar to your training data (Categorical models only).
    */
  var classificationAccuracy: js.UndefOr[String] = js.native
  /** An estimated mean squared error. The can be used to measure the quality of the predicted model (Regression models only). */
  var meanSquaredError: js.UndefOr[String] = js.native
  /** Type of predictive model (CLASSIFICATION or REGRESSION). */
  var modelType: js.UndefOr[String] = js.native
  /** Number of valid data instances used in the trained model. */
  var numberInstances: js.UndefOr[String] = js.native
  /** Number of class labels in the trained model (Categorical models only). */
  var numberLabels: js.UndefOr[String] = js.native
}

object ClassWeightedAccuracy {
  @scala.inline
  def apply(): ClassWeightedAccuracy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassWeightedAccuracy]
  }
  @scala.inline
  implicit class ClassWeightedAccuracyOps[Self <: ClassWeightedAccuracy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassWeightedAccuracy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classWeightedAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassWeightedAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classWeightedAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withClassificationAccuracy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassificationAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classificationAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withMeanSquaredError(value: String): Self = {
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
    def withModelType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberInstances(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberLabels(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberLabels")(js.undefined)
        ret
    }
  }
  
}


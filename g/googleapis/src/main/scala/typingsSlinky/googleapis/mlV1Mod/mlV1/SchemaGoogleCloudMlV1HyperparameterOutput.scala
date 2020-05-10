package typingsSlinky.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of a single hyperparameter tuning trial from a
  * training job. The TrainingOutput object that is returned on successful
  * completion of a training job with hyperparameter tuning includes a list of
  * HyperparameterOutput objects, one for each successful trial.
  */
@js.native
trait SchemaGoogleCloudMlV1HyperparameterOutput extends js.Object {
  /**
    * All recorded object metrics for this trial. This field is not currently
    * populated.
    */
  var allMetrics: js.UndefOr[js.Array[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric]] = js.native
  /**
    * Details related to built-in algorithms job. Only set this for built-in
    * algorithms jobs and for trials that succeeded.
    */
  var builtInAlgorithmOutput: js.UndefOr[SchemaGoogleCloudMlV1BuiltInAlgorithmOutput] = js.native
  /**
    * The final objective metric seen for this trial.
    */
  var finalMetric: js.UndefOr[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric] = js.native
  /**
    * The hyperparameters given to this trial.
    */
  var hyperparameters: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * True if the trial is stopped early.
    */
  var isTrialStoppedEarly: js.UndefOr[Boolean] = js.native
  /**
    * The trial id for these results.
    */
  var trialId: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1HyperparameterOutput {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1HyperparameterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1HyperparameterOutput]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1HyperparameterOutputOps[Self <: SchemaGoogleCloudMlV1HyperparameterOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllMetrics(value: js.Array[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withBuiltInAlgorithmOutput(value: SchemaGoogleCloudMlV1BuiltInAlgorithmOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtInAlgorithmOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltInAlgorithmOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtInAlgorithmOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalMetric(value: SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalMetric")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperparameters(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperparameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperparameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperparameters")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTrialStoppedEarly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrialStoppedEarly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTrialStoppedEarly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrialStoppedEarly")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialId")(js.undefined)
        ret
    }
  }
  
}


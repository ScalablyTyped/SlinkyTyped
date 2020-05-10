package typingsSlinky.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents results of a training job. Output only.
  */
@js.native
trait SchemaGoogleCloudMlV1TrainingOutput extends js.Object {
  /**
    * Details related to built-in algorithms job. Only set for built-in
    * algorithms jobs.
    */
  var builtInAlgorithmOutput: js.UndefOr[SchemaGoogleCloudMlV1BuiltInAlgorithmOutput] = js.native
  /**
    * The number of hyperparameter tuning trials that completed successfully.
    * Only set for hyperparameter tuning jobs.
    */
  var completedTrialCount: js.UndefOr[String] = js.native
  /**
    * The amount of ML units consumed by the job.
    */
  var consumedMLUnits: js.UndefOr[Double] = js.native
  /**
    * Whether this job is a built-in Algorithm job.
    */
  var isBuiltInAlgorithmJob: js.UndefOr[Boolean] = js.native
  /**
    * Whether this job is a hyperparameter tuning job.
    */
  var isHyperparameterTuningJob: js.UndefOr[Boolean] = js.native
  /**
    * Results for individual Hyperparameter trials. Only set for hyperparameter
    * tuning jobs.
    */
  var trials: js.UndefOr[js.Array[SchemaGoogleCloudMlV1HyperparameterOutput]] = js.native
}

object SchemaGoogleCloudMlV1TrainingOutput {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1TrainingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1TrainingOutput]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1TrainingOutputOps[Self <: SchemaGoogleCloudMlV1TrainingOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCompletedTrialCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedTrialCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedTrialCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedTrialCount")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumedMLUnits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumedMLUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumedMLUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumedMLUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBuiltInAlgorithmJob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBuiltInAlgorithmJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBuiltInAlgorithmJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBuiltInAlgorithmJob")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHyperparameterTuningJob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHyperparameterTuningJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHyperparameterTuningJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHyperparameterTuningJob")(js.undefined)
        ret
    }
    @scala.inline
    def withTrials(value: js.Array[SchemaGoogleCloudMlV1HyperparameterOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trials")(js.undefined)
        ret
    }
  }
  
}


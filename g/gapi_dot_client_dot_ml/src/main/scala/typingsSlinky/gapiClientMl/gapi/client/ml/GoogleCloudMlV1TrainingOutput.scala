package typingsSlinky.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1TrainingOutput extends js.Object {
  /**
    * The number of hyperparameter tuning trials that completed successfully.
    * Only set for hyperparameter tuning jobs.
    */
  var completedTrialCount: js.UndefOr[String] = js.native
  /** The amount of ML units consumed by the job. */
  var consumedMLUnits: js.UndefOr[Double] = js.native
  /** Whether this job is a hyperparameter tuning job. */
  var isHyperparameterTuningJob: js.UndefOr[Boolean] = js.native
  /**
    * Results for individual Hyperparameter trials.
    * Only set for hyperparameter tuning jobs.
    */
  var trials: js.UndefOr[js.Array[GoogleCloudMlV1HyperparameterOutput]] = js.native
}

object GoogleCloudMlV1TrainingOutput {
  @scala.inline
  def apply(): GoogleCloudMlV1TrainingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1TrainingOutput]
  }
  @scala.inline
  implicit class GoogleCloudMlV1TrainingOutputOps[Self <: GoogleCloudMlV1TrainingOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTrials(value: js.Array[GoogleCloudMlV1HyperparameterOutput]): Self = {
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


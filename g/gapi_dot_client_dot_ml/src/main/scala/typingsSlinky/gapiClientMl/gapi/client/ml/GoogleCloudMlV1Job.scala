package typingsSlinky.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1Job extends js.Object {
  /** Output only. When the job was created. */
  var createTime: js.UndefOr[String] = js.native
  /** Output only. When the job processing was completed. */
  var endTime: js.UndefOr[String] = js.native
  /** Output only. The details of a failure or a cancellation. */
  var errorMessage: js.UndefOr[String] = js.native
  /** Required. The user-specified id of the job. */
  var jobId: js.UndefOr[String] = js.native
  /** Input parameters to create a prediction job. */
  var predictionInput: js.UndefOr[GoogleCloudMlV1PredictionInput] = js.native
  /** The current prediction job result. */
  var predictionOutput: js.UndefOr[GoogleCloudMlV1PredictionOutput] = js.native
  /** Output only. When the job processing was started. */
  var startTime: js.UndefOr[String] = js.native
  /** Output only. The detailed state of a job. */
  var state: js.UndefOr[String] = js.native
  /** Input parameters to create a training job. */
  var trainingInput: js.UndefOr[GoogleCloudMlV1TrainingInput] = js.native
  /** The current training job result. */
  var trainingOutput: js.UndefOr[GoogleCloudMlV1TrainingOutput] = js.native
}

object GoogleCloudMlV1Job {
  @scala.inline
  def apply(): GoogleCloudMlV1Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Job]
  }
  @scala.inline
  implicit class GoogleCloudMlV1JobOps[Self <: GoogleCloudMlV1Job] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictionInput(value: GoogleCloudMlV1PredictionInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictionInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictionInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictionInput")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictionOutput(value: GoogleCloudMlV1PredictionOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictionOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictionOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictionOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingInput(value: GoogleCloudMlV1TrainingInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingInput")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingOutput(value: GoogleCloudMlV1TrainingOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingOutput")(js.undefined)
        ret
    }
  }
  
}


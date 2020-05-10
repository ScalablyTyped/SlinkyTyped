package typingsSlinky.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a training, prediction or explanation job.
  */
@js.native
trait SchemaGoogleCloudMlV1Job extends js.Object {
  /**
    * Output only. When the job was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. When the job processing was completed.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Output only. The details of a failure or a cancellation.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * `etag` is used for optimistic concurrency control as a way to help
    * prevent simultaneous updates of a job from overwriting each other. It is
    * strongly suggested that systems make use of the `etag` in the
    * read-modify-write cycle to perform job updates in order to avoid race
    * conditions: An `etag` is returned in the response to `GetJob`, and
    * systems are expected to put that etag in the request to `UpdateJob` to
    * ensure that their change will be applied to the same version of the job.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Required. The user-specified id of the job.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * Optional. One or more labels that you can add, to organize your jobs.
    * Each label is a key-value pair, where both the key and the value are
    * arbitrary strings that you supply. For more information, see the
    * documentation on &lt;a
    * href=&quot;/ml-engine/docs/tensorflow/resource-labels&quot;&gt;using
    * labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Input parameters to create a prediction job.
    */
  var predictionInput: js.UndefOr[SchemaGoogleCloudMlV1PredictionInput] = js.native
  /**
    * The current prediction job result.
    */
  var predictionOutput: js.UndefOr[SchemaGoogleCloudMlV1PredictionOutput] = js.native
  /**
    * Output only. When the job processing was started.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Output only. The detailed state of a job.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Input parameters to create a training job.
    */
  var trainingInput: js.UndefOr[SchemaGoogleCloudMlV1TrainingInput] = js.native
  /**
    * The current training job result.
    */
  var trainingOutput: js.UndefOr[SchemaGoogleCloudMlV1TrainingOutput] = js.native
}

object SchemaGoogleCloudMlV1Job {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Job]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1JobOps[Self <: SchemaGoogleCloudMlV1Job] (val x: Self) extends AnyVal {
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
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
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
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withPredictionInput(value: SchemaGoogleCloudMlV1PredictionInput): Self = {
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
    def withPredictionOutput(value: SchemaGoogleCloudMlV1PredictionOutput): Self = {
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
    def withTrainingInput(value: SchemaGoogleCloudMlV1TrainingInput): Self = {
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
    def withTrainingOutput(value: SchemaGoogleCloudMlV1TrainingOutput): Self = {
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


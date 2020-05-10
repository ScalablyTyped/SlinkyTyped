package typingsSlinky.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of hyperparameters to optimize.
  */
@js.native
trait SchemaGoogleCloudMlV1HyperparameterSpec extends js.Object {
  /**
    * Optional. The search algorithm specified for the hyperparameter tuning
    * job. Uses the default CloudML Engine hyperparameter tuning algorithm if
    * unspecified.
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * Optional. Indicates if the hyperparameter tuning job enables auto trial
    * early stopping.
    */
  var enableTrialEarlyStopping: js.UndefOr[Boolean] = js.native
  /**
    * Required. The type of goal to use for tuning. Available types are
    * `MAXIMIZE` and `MINIMIZE`.  Defaults to `MAXIMIZE`.
    */
  var goal: js.UndefOr[String] = js.native
  /**
    * Optional. The Tensorflow summary tag name to use for optimizing trials.
    * For current versions of Tensorflow, this tag name should exactly match
    * what is shown in Tensorboard, including all scopes.  For versions of
    * Tensorflow prior to 0.12, this should be only the tag passed to
    * tf.Summary. By default, &quot;training/hptuning/metric&quot; will be
    * used.
    */
  var hyperparameterMetricTag: js.UndefOr[String] = js.native
  /**
    * Optional. How many failed trials that need to be seen before failing the
    * hyperparameter tuning job. User can specify this field to override the
    * default failing criteria for CloudML Engine hyperparameter tuning jobs.
    * Defaults to zero, which means to let the service decide when a
    * hyperparameter job should fail.
    */
  var maxFailedTrials: js.UndefOr[Double] = js.native
  /**
    * Optional. The number of training trials to run concurrently. You can
    * reduce the time it takes to perform hyperparameter tuning by adding
    * trials in parallel. However, each trail only benefits from the
    * information gained in completed trials. That means that a trial does not
    * get access to the results of trials running at the same time, which could
    * reduce the quality of the overall optimization.  Each trial will use the
    * same scale tier and machine types.  Defaults to one.
    */
  var maxParallelTrials: js.UndefOr[Double] = js.native
  /**
    * Optional. How many training trials should be attempted to optimize the
    * specified hyperparameters.  Defaults to one.
    */
  var maxTrials: js.UndefOr[Double] = js.native
  /**
    * Required. The set of parameters to tune.
    */
  var params: js.UndefOr[js.Array[SchemaGoogleCloudMlV1ParameterSpec]] = js.native
  /**
    * Optional. The prior hyperparameter tuning job id that users hope to
    * continue with. The job id will be used to find the corresponding vizier
    * study guid and resume the study.
    */
  var resumePreviousJobId: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1HyperparameterSpec {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1HyperparameterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1HyperparameterSpec]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1HyperparameterSpecOps[Self <: SchemaGoogleCloudMlV1HyperparameterSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTrialEarlyStopping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTrialEarlyStopping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTrialEarlyStopping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTrialEarlyStopping")(js.undefined)
        ret
    }
    @scala.inline
    def withGoal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goal")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperparameterMetricTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperparameterMetricTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperparameterMetricTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperparameterMetricTag")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFailedTrials(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFailedTrials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFailedTrials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFailedTrials")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxParallelTrials(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParallelTrials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxParallelTrials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxParallelTrials")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTrials(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTrials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTrials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTrials")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Array[SchemaGoogleCloudMlV1ParameterSpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withResumePreviousJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumePreviousJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumePreviousJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumePreviousJobId")(js.undefined)
        ret
    }
  }
  
}


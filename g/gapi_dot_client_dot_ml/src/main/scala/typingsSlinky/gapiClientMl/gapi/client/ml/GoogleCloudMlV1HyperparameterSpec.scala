package typingsSlinky.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1HyperparameterSpec extends js.Object {
  /**
    * Required. The type of goal to use for tuning. Available types are
    * `MAXIMIZE` and `MINIMIZE`.
    *
    * Defaults to `MAXIMIZE`.
    */
  var goal: js.UndefOr[String] = js.native
  /**
    * Optional. The Tensorflow summary tag name to use for optimizing trials. For
    * current versions of Tensorflow, this tag name should exactly match what is
    * shown in Tensorboard, including all scopes.  For versions of Tensorflow
    * prior to 0.12, this should be only the tag passed to tf.Summary.
    * By default, "training/hptuning/metric" will be used.
    */
  var hyperparameterMetricTag: js.UndefOr[String] = js.native
  /**
    * Optional. The number of training trials to run concurrently.
    * You can reduce the time it takes to perform hyperparameter tuning by adding
    * trials in parallel. However, each trail only benefits from the information
    * gained in completed trials. That means that a trial does not get access to
    * the results of trials running at the same time, which could reduce the
    * quality of the overall optimization.
    *
    * Each trial will use the same scale tier and machine types.
    *
    * Defaults to one.
    */
  var maxParallelTrials: js.UndefOr[Double] = js.native
  /**
    * Optional. How many training trials should be attempted to optimize
    * the specified hyperparameters.
    *
    * Defaults to one.
    */
  var maxTrials: js.UndefOr[Double] = js.native
  /** Required. The set of parameters to tune. */
  var params: js.UndefOr[js.Array[GoogleCloudMlV1ParameterSpec]] = js.native
}

object GoogleCloudMlV1HyperparameterSpec {
  @scala.inline
  def apply(): GoogleCloudMlV1HyperparameterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1HyperparameterSpec]
  }
  @scala.inline
  implicit class GoogleCloudMlV1HyperparameterSpecOps[Self <: GoogleCloudMlV1HyperparameterSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withParams(value: js.Array[GoogleCloudMlV1ParameterSpec]): Self = {
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
  }
  
}


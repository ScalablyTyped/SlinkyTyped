package typingsSlinky.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudMlV1TrainingInput extends js.Object {
  /** Optional. Command line arguments to pass to the program. */
  var args: js.UndefOr[js.Array[String]] = js.native
  /** Optional. The set of Hyperparameters to tune. */
  var hyperparameters: js.UndefOr[GoogleCloudMlV1HyperparameterSpec] = js.native
  /**
    * Optional. A Google Cloud Storage path in which to store training outputs
    * and other data needed for training. This path is passed to your TensorFlow
    * program as the 'job_dir' command-line argument. The benefit of specifying
    * this field is that Cloud ML validates the path for use in training.
    */
  var jobDir: js.UndefOr[String] = js.native
  /**
    * Optional. Specifies the type of virtual machine to use for your training
    * job's master worker.
    *
    * The following types are supported:
    *
    * <dl>
    * <dt>standard</dt>
    * <dd>
    * A basic machine configuration suitable for training simple models with
    * small to moderate datasets.
    * </dd>
    * <dt>large_model</dt>
    * <dd>
    * A machine with a lot of memory, specially suited for parameter servers
    * when your model is large (having many hidden layers or layers with very
    * large numbers of nodes).
    * </dd>
    * <dt>complex_model_s</dt>
    * <dd>
    * A machine suitable for the master and workers of the cluster when your
    * model requires more computation than the standard machine can handle
    * satisfactorily.
    * </dd>
    * <dt>complex_model_m</dt>
    * <dd>
    * A machine with roughly twice the number of cores and roughly double the
    * memory of <code suppresswarning="true">complex_model_s</code>.
    * </dd>
    * <dt>complex_model_l</dt>
    * <dd>
    * A machine with roughly twice the number of cores and roughly double the
    * memory of <code suppresswarning="true">complex_model_m</code>.
    * </dd>
    * <dt>standard_gpu</dt>
    * <dd>
    * A machine equivalent to <code suppresswarning="true">standard</code> that
    * also includes a
    * <a href="/ml-engine/docs/how-tos/using-gpus">
    * GPU that you can use in your trainer</a>.
    * </dd>
    * <dt>complex_model_m_gpu</dt>
    * <dd>
    * A machine equivalent to
    * <code suppresswarning="true">complex_model_m</code> that also includes
    * four GPUs.
    * </dd>
    * </dl>
    *
    * You must set this value when `scaleTier` is set to `CUSTOM`.
    */
  var masterType: js.UndefOr[String] = js.native
  /**
    * Required. The Google Cloud Storage location of the packages with
    * the training program and any additional dependencies.
    * The maximum number of package URIs is 100.
    */
  var packageUris: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The number of parameter server replicas to use for the training
    * job. Each replica in the cluster will be of the type specified in
    * `parameter_server_type`.
    *
    * This value can only be used when `scale_tier` is set to `CUSTOM`.If you
    * set this value, you must also set `parameter_server_type`.
    */
  var parameterServerCount: js.UndefOr[String] = js.native
  /**
    * Optional. Specifies the type of virtual machine to use for your training
    * job's parameter server.
    *
    * The supported values are the same as those described in the entry for
    * `master_type`.
    *
    * This value must be present when `scaleTier` is set to `CUSTOM` and
    * `parameter_server_count` is greater than zero.
    */
  var parameterServerType: js.UndefOr[String] = js.native
  /** Required. The Python module name to run after installing the packages. */
  var pythonModule: js.UndefOr[String] = js.native
  /** Required. The Google Compute Engine region to run the training job in. */
  var region: js.UndefOr[String] = js.native
  /**
    * Optional. The Google Cloud ML runtime version to use for training.  If not
    * set, Google Cloud ML will choose the latest stable version.
    */
  var runtimeVersion: js.UndefOr[String] = js.native
  /**
    * Required. Specifies the machine types, the number of replicas for workers
    * and parameter servers.
    */
  var scaleTier: js.UndefOr[String] = js.native
  /**
    * Optional. The number of worker replicas to use for the training job. Each
    * replica in the cluster will be of the type specified in `worker_type`.
    *
    * This value can only be used when `scale_tier` is set to `CUSTOM`. If you
    * set this value, you must also set `worker_type`.
    */
  var workerCount: js.UndefOr[String] = js.native
  /**
    * Optional. Specifies the type of virtual machine to use for your training
    * job's worker nodes.
    *
    * The supported values are the same as those described in the entry for
    * `masterType`.
    *
    * This value must be present when `scaleTier` is set to `CUSTOM` and
    * `workerCount` is greater than zero.
    */
  var workerType: js.UndefOr[String] = js.native
}

object GoogleCloudMlV1TrainingInput {
  @scala.inline
  def apply(): GoogleCloudMlV1TrainingInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1TrainingInput]
  }
  @scala.inline
  implicit class GoogleCloudMlV1TrainingInputOps[Self <: GoogleCloudMlV1TrainingInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperparameters(value: GoogleCloudMlV1HyperparameterSpec): Self = {
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
    def withJobDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDir")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterType")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageUris")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterServerCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterServerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterServerCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterServerCount")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterServerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterServerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterServerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterServerType")(js.undefined)
        ret
    }
    @scala.inline
    def withPythonModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pythonModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPythonModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pythonModule")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleTier")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerType")(js.undefined)
        ret
    }
  }
  
}


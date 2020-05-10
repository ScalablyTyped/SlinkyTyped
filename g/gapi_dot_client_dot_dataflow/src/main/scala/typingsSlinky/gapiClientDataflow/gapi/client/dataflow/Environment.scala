package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  /**
    * The type of cluster manager API to use.  If unknown or
    * unspecified, the service will attempt to choose a reasonable
    * default.  This should be in the form of the API service name,
    * e.g. "compute.googleapis.com".
    */
  var clusterManagerApiService: js.UndefOr[String] = js.native
  /**
    * The dataset for the current project where various workflow
    * related tables are stored.
    *
    * The supported resource type is:
    *
    * Google BigQuery:
    * bigquery.googleapis.com/{dataset}
    */
  var dataset: js.UndefOr[String] = js.native
  /** The list of experiments to enable. */
  var experiments: js.UndefOr[js.Array[String]] = js.native
  /** Experimental settings. */
  var internalExperiments: js.UndefOr[Record[String, _]] = js.native
  /**
    * The Cloud Dataflow SDK pipeline options specified by the user. These
    * options are passed through the service and are used to recreate the
    * SDK pipeline options on the worker in a language agnostic and platform
    * independent way.
    */
  var sdkPipelineOptions: js.UndefOr[Record[String, _]] = js.native
  /** Identity to run virtual machines as. Defaults to the default account. */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  /**
    * The prefix of the resources the system should use for temporary
    * storage.  The system will append the suffix "/temp-{JOBNAME} to
    * this resource prefix, where {JOBNAME} is the value of the
    * job_name field.  The resulting bucket and object prefix is used
    * as the prefix of the resources used to store temporary data
    * needed during the job execution.  NOTE: This will override the
    * value in taskrunner_settings.
    * The supported resource type is:
    *
    * Google Cloud Storage:
    *
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempStoragePrefix: js.UndefOr[String] = js.native
  /** A description of the process that generated the request. */
  var userAgent: js.UndefOr[Record[String, _]] = js.native
  /**
    * A structure describing which components and their versions of the service
    * are required in order to run the job.
    */
  var version: js.UndefOr[Record[String, _]] = js.native
  /**
    * The worker pools. At least one "harness" worker pool must be
    * specified in order for the job to have workers.
    */
  var workerPools: js.UndefOr[js.Array[WorkerPool]] = js.native
}

object Environment {
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterManagerApiService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterManagerApiService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterManagerApiService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterManagerApiService")(js.undefined)
        ret
    }
    @scala.inline
    def withDataset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(js.undefined)
        ret
    }
    @scala.inline
    def withExperiments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experiments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperiments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experiments")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalExperiments(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalExperiments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalExperiments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalExperiments")(js.undefined)
        ret
    }
    @scala.inline
    def withSdkPipelineOptions(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkPipelineOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdkPipelineOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkPipelineOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withTempStoragePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempStoragePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempStoragePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempStoragePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerPools(value: js.Array[WorkerPool]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerPools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerPools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerPools")(js.undefined)
        ret
    }
  }
  
}


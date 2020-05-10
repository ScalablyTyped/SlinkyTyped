package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the environment in which a Dataflow Job runs.
  */
@js.native
trait SchemaEnvironment extends js.Object {
  /**
    * The type of cluster manager API to use.  If unknown or unspecified, the
    * service will attempt to choose a reasonable default.  This should be in
    * the form of the API service name, e.g.
    * &quot;compute.googleapis.com&quot;.
    */
  var clusterManagerApiService: js.UndefOr[String] = js.native
  /**
    * The dataset for the current project where various workflow related tables
    * are stored.  The supported resource type is:  Google BigQuery:
    * bigquery.googleapis.com/{dataset}
    */
  var dataset: js.UndefOr[String] = js.native
  /**
    * The list of experiments to enable.
    */
  var experiments: js.UndefOr[js.Array[String]] = js.native
  /**
    * Which Flexible Resource Scheduling mode to run in.
    */
  var flexResourceSchedulingGoal: js.UndefOr[String] = js.native
  /**
    * Experimental settings.
    */
  var internalExperiments: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The Cloud Dataflow SDK pipeline options specified by the user. These
    * options are passed through the service and are used to recreate the SDK
    * pipeline options on the worker in a language agnostic and platform
    * independent way.
    */
  var sdkPipelineOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Identity to run virtual machines as. Defaults to the default account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  /**
    * If set, contains the Cloud KMS key identifier used to encrypt data at
    * rest, AKA a Customer Managed Encryption Key (CMEK).  Format:
    * projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY
    */
  var serviceKmsKeyName: js.UndefOr[String] = js.native
  /**
    * The prefix of the resources the system should use for temporary storage.
    * The system will append the suffix &quot;/temp-{JOBNAME} to this resource
    * prefix, where {JOBNAME} is the value of the job_name field.  The
    * resulting bucket and object prefix is used as the prefix of the resources
    * used to store temporary data needed during the job execution.  NOTE: This
    * will override the value in taskrunner_settings. The supported resource
    * type is:  Google Cloud Storage: storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempStoragePrefix: js.UndefOr[String] = js.native
  /**
    * A description of the process that generated the request.
    */
  var userAgent: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * A structure describing which components and their versions of the service
    * are required in order to run the job.
    */
  var version: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The worker pools. At least one &quot;harness&quot; worker pool must be
    * specified in order for the job to have workers.
    */
  var workerPools: js.UndefOr[js.Array[SchemaWorkerPool]] = js.native
}

object SchemaEnvironment {
  @scala.inline
  def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  @scala.inline
  implicit class SchemaEnvironmentOps[Self <: SchemaEnvironment] (val x: Self) extends AnyVal {
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
    def withFlexResourceSchedulingGoal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexResourceSchedulingGoal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexResourceSchedulingGoal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexResourceSchedulingGoal")(js.undefined)
        ret
    }
    @scala.inline
    def withInternalExperiments(value: StringDictionary[js.Any]): Self = {
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
    def withSdkPipelineOptions(value: StringDictionary[js.Any]): Self = {
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
    def withServiceKmsKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceKmsKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceKmsKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceKmsKeyName")(js.undefined)
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
    def withUserAgent(value: StringDictionary[js.Any]): Self = {
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
    def withVersion(value: StringDictionary[js.Any]): Self = {
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
    def withWorkerPools(value: js.Array[SchemaWorkerPool]): Self = {
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


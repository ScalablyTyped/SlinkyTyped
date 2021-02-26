package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends StObject {
  
  /**
    * The type of cluster manager API to use. If unknown or unspecified, the service will attempt to choose a reasonable default. This should be in the form of the API service name, e.g.
    * "compute.googleapis.com".
    */
  var clusterManagerApiService: js.UndefOr[String] = js.native
  
  /** The dataset for the current project where various workflow related tables are stored. The supported resource type is: Google BigQuery: bigquery.googleapis.com/{dataset} */
  var dataset: js.UndefOr[String] = js.native
  
  /** The list of experiments to enable. */
  var experiments: js.UndefOr[js.Array[String]] = js.native
  
  /** Which Flexible Resource Scheduling mode to run in. */
  var flexResourceSchedulingGoal: js.UndefOr[String] = js.native
  
  /** Experimental settings. */
  var internalExperiments: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.Environment with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The Cloud Dataflow SDK pipeline options specified by the user. These options are passed through the service and are used to recreate the SDK pipeline options on the worker in a
    * language agnostic and platform independent way.
    */
  var sdkPipelineOptions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.Environment with TopLevel[js.Any]
  ] = js.native
  
  /** Identity to run virtual machines as. Defaults to the default account. */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  
  /**
    * If set, contains the Cloud KMS key identifier used to encrypt data at rest, AKA a Customer Managed Encryption Key (CMEK). Format:
    * projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY
    */
  var serviceKmsKeyName: js.UndefOr[String] = js.native
  
  /**
    * The prefix of the resources the system should use for temporary storage. The system will append the suffix "/temp-{JOBNAME} to this resource prefix, where {JOBNAME} is the value of
    * the job_name field. The resulting bucket and object prefix is used as the prefix of the resources used to store temporary data needed during the job execution. NOTE: This will
    * override the value in taskrunner_settings. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket}/{object} bucket.storage.googleapis.com/{object}
    */
  var tempStoragePrefix: js.UndefOr[String] = js.native
  
  /** A description of the process that generated the request. */
  var userAgent: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.Environment with TopLevel[js.Any]
  ] = js.native
  
  /** A structure describing which components and their versions of the service are required in order to run the job. */
  var version: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.Environment with TopLevel[js.Any]
  ] = js.native
  
  /** The worker pools. At least one "harness" worker pool must be specified in order for the job to have workers. */
  var workerPools: js.UndefOr[js.Array[WorkerPool]] = js.native
  
  /**
    * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1". Mutually exclusive with
    * worker_zone. If neither worker_region nor worker_zone is specified, default to the control plane's region.
    */
  var workerRegion: js.UndefOr[String] = js.native
  
  /**
    * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with
    * worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane's region is chosen based on available capacity.
    */
  var workerZone: js.UndefOr[String] = js.native
}
object Environment {
  
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterManagerApiService(value: String): Self = StObject.set(x, "clusterManagerApiService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterManagerApiServiceUndefined: Self = StObject.set(x, "clusterManagerApiService", js.undefined)
    
    @scala.inline
    def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setExperiments(value: js.Array[String]): Self = StObject.set(x, "experiments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentsUndefined: Self = StObject.set(x, "experiments", js.undefined)
    
    @scala.inline
    def setExperimentsVarargs(value: String*): Self = StObject.set(x, "experiments", js.Array(value :_*))
    
    @scala.inline
    def setFlexResourceSchedulingGoal(value: String): Self = StObject.set(x, "flexResourceSchedulingGoal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexResourceSchedulingGoalUndefined: Self = StObject.set(x, "flexResourceSchedulingGoal", js.undefined)
    
    @scala.inline
    def setInternalExperiments(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.Environment with TopLevel[js.Any]
    ): Self = StObject.set(x, "internalExperiments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalExperimentsUndefined: Self = StObject.set(x, "internalExperiments", js.undefined)
    
    @scala.inline
    def setSdkPipelineOptions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.Environment with TopLevel[js.Any]
    ): Self = StObject.set(x, "sdkPipelineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkPipelineOptionsUndefined: Self = StObject.set(x, "sdkPipelineOptions", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setServiceKmsKeyName(value: String): Self = StObject.set(x, "serviceKmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceKmsKeyNameUndefined: Self = StObject.set(x, "serviceKmsKeyName", js.undefined)
    
    @scala.inline
    def setTempStoragePrefix(value: String): Self = StObject.set(x, "tempStoragePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempStoragePrefixUndefined: Self = StObject.set(x, "tempStoragePrefix", js.undefined)
    
    @scala.inline
    def setUserAgent(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.Environment with TopLevel[js.Any]
    ): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    @scala.inline
    def setVersion(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.Environment with TopLevel[js.Any]
    ): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWorkerPools(value: js.Array[WorkerPool]): Self = StObject.set(x, "workerPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerPoolsUndefined: Self = StObject.set(x, "workerPools", js.undefined)
    
    @scala.inline
    def setWorkerPoolsVarargs(value: WorkerPool*): Self = StObject.set(x, "workerPools", js.Array(value :_*))
    
    @scala.inline
    def setWorkerRegion(value: String): Self = StObject.set(x, "workerRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerRegionUndefined: Self = StObject.set(x, "workerRegion", js.undefined)
    
    @scala.inline
    def setWorkerZone(value: String): Self = StObject.set(x, "workerZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerZoneUndefined: Self = StObject.set(x, "workerZone", js.undefined)
  }
}

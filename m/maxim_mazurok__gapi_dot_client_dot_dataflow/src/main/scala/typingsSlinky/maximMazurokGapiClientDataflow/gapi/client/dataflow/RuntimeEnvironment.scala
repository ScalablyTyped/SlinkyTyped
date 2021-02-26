package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeEnvironment extends StObject {
  
  /** Additional experiment flags for the job. */
  var additionalExperiments: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Additional user labels to be specified for the job. Keys and values should follow the restrictions specified in the [labeling
    * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass":
    * "1kg", "count": "3" }.
    */
  var additionalUserLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.RuntimeEnvironment with TopLevel[js.Any]
  ] = js.native
  
  /** Whether to bypass the safety checks for the job's temporary directory. Use with caution. */
  var bypassTempDirValidation: js.UndefOr[Boolean] = js.native
  
  /** Whether to enable Streaming Engine for the job. */
  var enableStreamingEngine: js.UndefOr[Boolean] = js.native
  
  /** Configuration for VM IPs. */
  var ipConfiguration: js.UndefOr[String] = js.native
  
  /** Name for the Cloud KMS key for the job. Key format is: projects//locations//keyRings//cryptoKeys/ */
  var kmsKeyName: js.UndefOr[String] = js.native
  
  /** The machine type to use for the job. Defaults to the value from the template if not specified. */
  var machineType: js.UndefOr[String] = js.native
  
  /** The maximum number of Google Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000. */
  var maxWorkers: js.UndefOr[Double] = js.native
  
  /** Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default". */
  var network: js.UndefOr[String] = js.native
  
  /** The initial number of Google Compute Engine instnaces for the job. */
  var numWorkers: js.UndefOr[Double] = js.native
  
  /** The email address of the service account to run the job as. */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  
  /**
    * Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form
    * "https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK" or "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in a
    * Shared VPC network, you must use the complete URL.
    */
  var subnetwork: js.UndefOr[String] = js.native
  
  /** The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with `gs://`. */
  var tempLocation: js.UndefOr[String] = js.native
  
  /**
    * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1". Mutually exclusive with
    * worker_zone. If neither worker_region nor worker_zone is specified, default to the control plane's region.
    */
  var workerRegion: js.UndefOr[String] = js.native
  
  /**
    * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with
    * worker_region. If neither worker_region nor worker_zone is specified, a zone in the control plane's region is chosen based on available capacity. If both `worker_zone` and `zone`
    * are set, `worker_zone` takes precedence.
    */
  var workerZone: js.UndefOr[String] = js.native
  
  /**
    * The Compute Engine [availability zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones) for launching worker instances to run your pipeline. In the future,
    * worker_zone will take precedence.
    */
  var zone: js.UndefOr[String] = js.native
}
object RuntimeEnvironment {
  
  @scala.inline
  def apply(): RuntimeEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeEnvironment]
  }
  
  @scala.inline
  implicit class RuntimeEnvironmentMutableBuilder[Self <: RuntimeEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalExperiments(value: js.Array[String]): Self = StObject.set(x, "additionalExperiments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalExperimentsUndefined: Self = StObject.set(x, "additionalExperiments", js.undefined)
    
    @scala.inline
    def setAdditionalExperimentsVarargs(value: String*): Self = StObject.set(x, "additionalExperiments", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalUserLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.RuntimeEnvironment with TopLevel[js.Any]
    ): Self = StObject.set(x, "additionalUserLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalUserLabelsUndefined: Self = StObject.set(x, "additionalUserLabels", js.undefined)
    
    @scala.inline
    def setBypassTempDirValidation(value: Boolean): Self = StObject.set(x, "bypassTempDirValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassTempDirValidationUndefined: Self = StObject.set(x, "bypassTempDirValidation", js.undefined)
    
    @scala.inline
    def setEnableStreamingEngine(value: Boolean): Self = StObject.set(x, "enableStreamingEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableStreamingEngineUndefined: Self = StObject.set(x, "enableStreamingEngine", js.undefined)
    
    @scala.inline
    def setIpConfiguration(value: String): Self = StObject.set(x, "ipConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpConfigurationUndefined: Self = StObject.set(x, "ipConfiguration", js.undefined)
    
    @scala.inline
    def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    @scala.inline
    def setTempLocation(value: String): Self = StObject.set(x, "tempLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempLocationUndefined: Self = StObject.set(x, "tempLocation", js.undefined)
    
    @scala.inline
    def setWorkerRegion(value: String): Self = StObject.set(x, "workerRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerRegionUndefined: Self = StObject.set(x, "workerRegion", js.undefined)
    
    @scala.inline
    def setWorkerZone(value: String): Self = StObject.set(x, "workerZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerZoneUndefined: Self = StObject.set(x, "workerZone", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}

package typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig extends StObject {
  
  /** The accelerator card attached to each VM. */
  var accelerator: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig] = js.native
  
  /** Required. Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/ */
  var diskSizeGb: js.UndefOr[String] = js.native
  
  /** Required. Disk Type to use for the worker. See [Storage options](https://cloud.google.com/compute/docs/disks/#introduction). Currently only `pd-standard` and `pd-ssd` are supported. */
  var diskType: js.UndefOr[String] = js.native
  
  /**
    * Labels associated with the workers. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes.
    * International letters are permitted. Label keys must start with a letter. Label values are optional. There can not be more than 64 labels per resource.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Required. Machine type of the worker, such as `n1-standard-2`. See https://cloud.google.com/compute/docs/machine-types for a list of supported machine types. Note that `f1-micro`
    * and `g1-small` are not yet supported.
    */
  var machineType: js.UndefOr[String] = js.native
  
  /** The maximum number of actions a worker can execute concurrently. */
  var maxConcurrentActions: js.UndefOr[String] = js.native
  
  /** Minimum CPU platform to use when creating the worker. See [CPU Platforms](https://cloud.google.com/compute/docs/cpu-platforms). */
  var minCpuPlatform: js.UndefOr[String] = js.native
  
  /**
    * Determines the type of network access granted to workers. Possible values: - "public": Workers can connect to the public internet. - "private": Workers can only connect to Google
    * APIs and services. - "restricted-private": Workers can only connect to Google APIs that are reachable through `restricted.googleapis.com` (`199.36.153.4/30`).
    */
  var networkAccess: js.UndefOr[String] = js.native
  
  /**
    * Determines whether the worker is reserved (equivalent to a Compute Engine on-demand VM and therefore won't be preempted). See [Preemptible
    * VMs](https://cloud.google.com/preemptible-vms/) for more details.
    */
  var reserved: js.UndefOr[Boolean] = js.native
  
  /** Sole-tenant node information for pools hosted on STNs. */
  var soleTenancy: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaSoleTenancyConfig] = js.native
  
  /** The name of the image used by each VM. */
  var vmImage: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigMutableBuilder[Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerator(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
    
    @scala.inline
    def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    @scala.inline
    def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setMaxConcurrentActions(value: String): Self = StObject.set(x, "maxConcurrentActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentActionsUndefined: Self = StObject.set(x, "maxConcurrentActions", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    @scala.inline
    def setNetworkAccess(value: String): Self = StObject.set(x, "networkAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAccessUndefined: Self = StObject.set(x, "networkAccess", js.undefined)
    
    @scala.inline
    def setReserved(value: Boolean): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
    
    @scala.inline
    def setSoleTenancy(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaSoleTenancyConfig): Self = StObject.set(x, "soleTenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoleTenancyUndefined: Self = StObject.set(x, "soleTenancy", js.undefined)
    
    @scala.inline
    def setVmImage(value: String): Self = StObject.set(x, "vmImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmImageUndefined: Self = StObject.set(x, "vmImage", js.undefined)
  }
}

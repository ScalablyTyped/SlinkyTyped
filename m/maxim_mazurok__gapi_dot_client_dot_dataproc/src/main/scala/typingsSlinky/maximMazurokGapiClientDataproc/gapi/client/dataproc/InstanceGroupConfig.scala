package typingsSlinky.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupConfig extends StObject {
  
  /** Optional. The Compute Engine accelerator configuration for these instances. */
  var accelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.native
  
  /** Optional. Disk option config settings. */
  var diskConfig: js.UndefOr[DiskConfig] = js.native
  
  /**
    * Optional. The Compute Engine image resource used for cluster instances.The URI can represent an image or image family.Image examples:
    * https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id] projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will
    * use the most recent image from the family: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-image-family-name]
    * projects/[project_id]/global/images/family/[custom-image-family-name]If the URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system default.
    */
  var imageUri: js.UndefOr[String] = js.native
  
  /** Output only. The list of instance names. Dataproc derives the names from cluster_name, num_instances, and the instance group. */
  var instanceNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. List of references to Compute Engine instances. */
  var instanceReferences: js.UndefOr[js.Array[InstanceReference]] = js.native
  
  /** Output only. Specifies that this instance group contains preemptible instances. */
  var isPreemptible: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * n1-standard-2Auto Zone Exception: If you are using the Dataproc Auto Zone Placement
    * (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for
    * example, n1-standard-2.
    */
  var machineTypeUri: js.UndefOr[String] = js.native
  
  /** Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups. */
  var managedGroupConfig: js.UndefOr[ManagedGroupConfig] = js.native
  
  /** Optional. Specifies the minimum cpu platform for the Instance Group. See Dataproc -> Minimum CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu). */
  var minCpuPlatform: js.UndefOr[String] = js.native
  
  /** Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1. */
  var numInstances: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Specifies the preemptibility of the instance group.The default value for master and worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for
    * secondary instances is PREEMPTIBLE.
    */
  var preemptibility: js.UndefOr[String] = js.native
}
object InstanceGroupConfig {
  
  @scala.inline
  def apply(): InstanceGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupConfig]
  }
  
  @scala.inline
  implicit class InstanceGroupConfigMutableBuilder[Self <: InstanceGroupConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerators(value: js.Array[AcceleratorConfig]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    @scala.inline
    def setAcceleratorsVarargs(value: AcceleratorConfig*): Self = StObject.set(x, "accelerators", js.Array(value :_*))
    
    @scala.inline
    def setDiskConfig(value: DiskConfig): Self = StObject.set(x, "diskConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskConfigUndefined: Self = StObject.set(x, "diskConfig", js.undefined)
    
    @scala.inline
    def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    @scala.inline
    def setInstanceNames(value: js.Array[String]): Self = StObject.set(x, "instanceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNamesUndefined: Self = StObject.set(x, "instanceNames", js.undefined)
    
    @scala.inline
    def setInstanceNamesVarargs(value: String*): Self = StObject.set(x, "instanceNames", js.Array(value :_*))
    
    @scala.inline
    def setInstanceReferences(value: js.Array[InstanceReference]): Self = StObject.set(x, "instanceReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceReferencesUndefined: Self = StObject.set(x, "instanceReferences", js.undefined)
    
    @scala.inline
    def setInstanceReferencesVarargs(value: InstanceReference*): Self = StObject.set(x, "instanceReferences", js.Array(value :_*))
    
    @scala.inline
    def setIsPreemptible(value: Boolean): Self = StObject.set(x, "isPreemptible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPreemptibleUndefined: Self = StObject.set(x, "isPreemptible", js.undefined)
    
    @scala.inline
    def setMachineTypeUri(value: String): Self = StObject.set(x, "machineTypeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUriUndefined: Self = StObject.set(x, "machineTypeUri", js.undefined)
    
    @scala.inline
    def setManagedGroupConfig(value: ManagedGroupConfig): Self = StObject.set(x, "managedGroupConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedGroupConfigUndefined: Self = StObject.set(x, "managedGroupConfig", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    @scala.inline
    def setNumInstances(value: Double): Self = StObject.set(x, "numInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumInstancesUndefined: Self = StObject.set(x, "numInstances", js.undefined)
    
    @scala.inline
    def setPreemptibility(value: String): Self = StObject.set(x, "preemptibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreemptibilityUndefined: Self = StObject.set(x, "preemptibility", js.undefined)
  }
}

package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a vSphere volume resource.
  */
@js.native
trait VsphereVirtualDiskVolumeSource extends StObject {
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: String = js.native
  
  /**
    * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
    */
  var storagePolicyID: String = js.native
  
  /**
    * Storage Policy Based Management (SPBM) profile name.
    */
  var storagePolicyName: String = js.native
  
  /**
    * Path that identifies vSphere volume vmdk
    */
  var volumePath: String = js.native
}
object VsphereVirtualDiskVolumeSource {
  
  @scala.inline
  def apply(fsType: String, storagePolicyID: String, storagePolicyName: String, volumePath: String): VsphereVirtualDiskVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], storagePolicyID = storagePolicyID.asInstanceOf[js.Any], storagePolicyName = storagePolicyName.asInstanceOf[js.Any], volumePath = volumePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[VsphereVirtualDiskVolumeSource]
  }
  
  @scala.inline
  implicit class VsphereVirtualDiskVolumeSourceMutableBuilder[Self <: VsphereVirtualDiskVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoragePolicyID(value: String): Self = StObject.set(x, "storagePolicyID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoragePolicyName(value: String): Self = StObject.set(x, "storagePolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumePath(value: String): Self = StObject.set(x, "volumePath", value.asInstanceOf[js.Any])
  }
}

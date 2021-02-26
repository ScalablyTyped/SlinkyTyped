package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a StorageOS persistent volume resource.
  */
@js.native
trait StorageOSPersistentVolumeSource extends StObject {
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: String = js.native
  
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean = js.native
  
  /**
    * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
    */
  var secretRef: ObjectReference = js.native
  
  /**
    * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
    */
  var volumeName: String = js.native
  
  /**
    * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
    */
  var volumeNamespace: String = js.native
}
object StorageOSPersistentVolumeSource {
  
  @scala.inline
  def apply(
    fsType: String,
    readOnly: Boolean,
    secretRef: ObjectReference,
    volumeName: String,
    volumeNamespace: String
  ): StorageOSPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], volumeName = volumeName.asInstanceOf[js.Any], volumeNamespace = volumeNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageOSPersistentVolumeSource]
  }
  
  @scala.inline
  implicit class StorageOSPersistentVolumeSourceMutableBuilder[Self <: StorageOSPersistentVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretRef(value: ObjectReference): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeName(value: String): Self = StObject.set(x, "volumeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeNamespace(value: String): Self = StObject.set(x, "volumeNamespace", value.asInstanceOf[js.Any])
  }
}

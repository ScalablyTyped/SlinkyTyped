package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlexPersistentVolumeSource represents a generic persistent volume resource that is provisioned/attached using an exec based plugin.
  */
@js.native
trait FlexPersistentVolumeSource extends StObject {
  
  /**
    * Driver is the name of the driver to use for this volume.
    */
  var driver: String = js.native
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default filesystem depends on FlexVolume script.
    */
  var fsType: String = js.native
  
  /**
    * Optional: Extra command options if any.
    */
  var options: StringDictionary[String] = js.native
  
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: Boolean = js.native
  
  /**
    * Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
    */
  var secretRef: SecretReference = js.native
}
object FlexPersistentVolumeSource {
  
  @scala.inline
  def apply(
    driver: String,
    fsType: String,
    options: StringDictionary[String],
    readOnly: Boolean,
    secretRef: SecretReference
  ): FlexPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPersistentVolumeSource]
  }
  
  @scala.inline
  implicit class FlexPersistentVolumeSourceMutableBuilder[Self <: FlexPersistentVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsType(value: String): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretRef(value: SecretReference): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resources extends StObject {
  
  /** Number of CPU cores needed. */
  var cpu: js.UndefOr[Double] = js.native
  
  /** Disk size (GB) needed. */
  var diskGb: js.UndefOr[Double] = js.native
  
  /** The name of the encryption key that is stored in Google Cloud KMS. Only should be used by Cloud Composer to encrypt the vm disk */
  var kmsKeyReference: js.UndefOr[String] = js.native
  
  /** Memory (GB) needed. */
  var memoryGb: js.UndefOr[Double] = js.native
  
  /** User specified volumes. */
  var volumes: js.UndefOr[js.Array[Volume]] = js.native
}
object Resources {
  
  @scala.inline
  def apply(): Resources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resources]
  }
  
  @scala.inline
  implicit class ResourcesMutableBuilder[Self <: Resources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    @scala.inline
    def setDiskGb(value: Double): Self = StObject.set(x, "diskGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskGbUndefined: Self = StObject.set(x, "diskGb", js.undefined)
    
    @scala.inline
    def setKmsKeyReference(value: String): Self = StObject.set(x, "kmsKeyReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyReferenceUndefined: Self = StObject.set(x, "kmsKeyReference", js.undefined)
    
    @scala.inline
    def setMemoryGb(value: Double): Self = StObject.set(x, "memoryGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryGbUndefined: Self = StObject.set(x, "memoryGb", js.undefined)
    
    @scala.inline
    def setVolumes(value: js.Array[Volume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "volumes", js.Array(value :_*))
  }
}

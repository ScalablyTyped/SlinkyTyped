package typingsSlinky.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Volume extends StObject {
  
  /** Configuration for a existing disk. */
  var existingDisk: js.UndefOr[ExistingDisk] = js.native
  
  /** Configuration for an NFS mount. */
  var nfsMount: js.UndefOr[NFSMount] = js.native
  
  /** Configuration for a persistent disk. */
  var persistentDisk: js.UndefOr[PersistentDisk] = js.native
  
  /**
    * A user-supplied name for the volume. Used when mounting the volume into `Actions`. The name must contain only upper and lowercase alphanumeric characters and hyphens and cannot
    * start with a hyphen.
    */
  var volume: js.UndefOr[String] = js.native
}
object Volume {
  
  @scala.inline
  def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  @scala.inline
  implicit class VolumeMutableBuilder[Self <: Volume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExistingDisk(value: ExistingDisk): Self = StObject.set(x, "existingDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistingDiskUndefined: Self = StObject.set(x, "existingDisk", js.undefined)
    
    @scala.inline
    def setNfsMount(value: NFSMount): Self = StObject.set(x, "nfsMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNfsMountUndefined: Self = StObject.set(x, "nfsMount", js.undefined)
    
    @scala.inline
    def setPersistentDisk(value: PersistentDisk): Self = StObject.set(x, "persistentDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentDiskUndefined: Self = StObject.set(x, "persistentDisk", js.undefined)
    
    @scala.inline
    def setVolume(value: String): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}

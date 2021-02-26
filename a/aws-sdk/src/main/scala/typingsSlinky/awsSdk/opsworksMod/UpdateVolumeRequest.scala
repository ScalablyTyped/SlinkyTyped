package typingsSlinky.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVolumeRequest extends StObject {
  
  /**
    * The new mount point.
    */
  var MountPoint: js.UndefOr[String] = js.native
  
  /**
    * The new name.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The volume ID.
    */
  var VolumeId: String = js.native
}
object UpdateVolumeRequest {
  
  @scala.inline
  def apply(VolumeId: String): UpdateVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVolumeRequest]
  }
  
  @scala.inline
  implicit class UpdateVolumeRequestMutableBuilder[Self <: UpdateVolumeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMountPoint(value: String): Self = StObject.set(x, "MountPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountPointUndefined: Self = StObject.set(x, "MountPoint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}

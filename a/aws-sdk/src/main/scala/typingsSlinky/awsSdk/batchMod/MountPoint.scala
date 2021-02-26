package typingsSlinky.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MountPoint extends StObject {
  
  /**
    * The path on the container at which to mount the host volume.
    */
  var containerPath: js.UndefOr[String] = js.native
  
  /**
    * If this value is true, the container has read-only access to the volume; otherwise, the container can write to the volume. The default value is false.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the volume to mount.
    */
  var sourceVolume: js.UndefOr[String] = js.native
}
object MountPoint {
  
  @scala.inline
  def apply(): MountPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MountPoint]
  }
  
  @scala.inline
  implicit class MountPointMutableBuilder[Self <: MountPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerPath(value: String): Self = StObject.set(x, "containerPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPathUndefined: Self = StObject.set(x, "containerPath", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSourceVolume(value: String): Self = StObject.set(x, "sourceVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVolumeUndefined: Self = StObject.set(x, "sourceVolume", js.undefined)
  }
}

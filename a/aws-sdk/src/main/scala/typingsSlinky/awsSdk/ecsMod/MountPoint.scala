package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MountPoint extends js.Object {
  
  /**
    * The path on the container to mount the host volume at.
    */
  var containerPath: js.UndefOr[String] = js.native
  
  /**
    * If this value is true, the container has read-only access to the volume. If this value is false, then the container can write to the volume. The default value is false.
    */
  var readOnly: js.UndefOr[BoxedBoolean] = js.native
  
  /**
    * The name of the volume to mount. Must be a volume name referenced in the name parameter of task definition volume.
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
  implicit class MountPointOps[Self <: MountPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerPath(value: String): Self = this.set("containerPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerPath: Self = this.set("containerPath", js.undefined)
    
    @scala.inline
    def setReadOnly(value: BoxedBoolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setSourceVolume(value: String): Self = this.set("sourceVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceVolume: Self = this.set("sourceVolume", js.undefined)
  }
}

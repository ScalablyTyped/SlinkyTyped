package typingsSlinky.pulumiAws.outputMod.efs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessPointRootDirectory extends js.Object {
  
  /**
    * Specifies the POSIX IDs and permissions to apply to the access point's Root Directory. See Creation Info below.
    */
  var creationInfo: AccessPointRootDirectoryCreationInfo = js.native
  
  /**
    * Specifies the path on the EFS file system to expose as the root directory to NFS clients using the access point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not exist, you are required to provide `creationInfo`.
    */
  var path: String = js.native
}
object AccessPointRootDirectory {
  
  @scala.inline
  def apply(creationInfo: AccessPointRootDirectoryCreationInfo, path: String): AccessPointRootDirectory = {
    val __obj = js.Dynamic.literal(creationInfo = creationInfo.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPointRootDirectory]
  }
  
  @scala.inline
  implicit class AccessPointRootDirectoryOps[Self <: AccessPointRootDirectory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationInfo(value: AccessPointRootDirectoryCreationInfo): Self = this.set("creationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}

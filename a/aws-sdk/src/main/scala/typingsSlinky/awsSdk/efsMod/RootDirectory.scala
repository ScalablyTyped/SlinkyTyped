package typingsSlinky.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootDirectory extends StObject {
  
  /**
    * (Optional) Specifies the POSIX IDs and permissions to apply to the access point's RootDirectory. If the RootDirectory &gt; Path specified does not exist, EFS creates the root directory using the CreationInfo settings when a client connects to an access point. When specifying the CreationInfo, you must provide values for all properties.   If you do not provide CreationInfo and the specified RootDirectory &gt; Path does not exist, attempts to mount the file system using the access point will fail. 
    */
  var CreationInfo: js.UndefOr[typingsSlinky.awsSdk.efsMod.CreationInfo] = js.native
  
  /**
    * Specifies the path on the EFS file system to expose as the root directory to NFS clients using the access point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not exist, you are required to provide the CreationInfo.
    */
  var Path: js.UndefOr[typingsSlinky.awsSdk.efsMod.Path] = js.native
}
object RootDirectory {
  
  @scala.inline
  def apply(): RootDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootDirectory]
  }
  
  @scala.inline
  implicit class RootDirectoryMutableBuilder[Self <: RootDirectory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationInfo(value: CreationInfo): Self = StObject.set(x, "CreationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationInfoUndefined: Self = StObject.set(x, "CreationInfo", js.undefined)
    
    @scala.inline
    def setPath(value: Path): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}

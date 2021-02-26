package typingsSlinky.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMountTargetRequest extends StObject {
  
  /**
    * The ID of the mount target to delete (String).
    */
  var MountTargetId: typingsSlinky.awsSdk.efsMod.MountTargetId = js.native
}
object DeleteMountTargetRequest {
  
  @scala.inline
  def apply(MountTargetId: MountTargetId): DeleteMountTargetRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMountTargetRequest]
  }
  
  @scala.inline
  implicit class DeleteMountTargetRequestMutableBuilder[Self <: DeleteMountTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMountTargetId(value: MountTargetId): Self = StObject.set(x, "MountTargetId", value.asInstanceOf[js.Any])
  }
}

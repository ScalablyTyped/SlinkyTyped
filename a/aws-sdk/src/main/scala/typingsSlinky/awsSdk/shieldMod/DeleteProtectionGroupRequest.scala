package typingsSlinky.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProtectionGroupRequest extends StObject {
  
  /**
    * The name of the protection group. You use this to identify the protection group in lists and to manage the protection group, for example to update, delete, or describe it. 
    */
  var ProtectionGroupId: typingsSlinky.awsSdk.shieldMod.ProtectionGroupId = js.native
}
object DeleteProtectionGroupRequest {
  
  @scala.inline
  def apply(ProtectionGroupId: ProtectionGroupId): DeleteProtectionGroupRequest = {
    val __obj = js.Dynamic.literal(ProtectionGroupId = ProtectionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProtectionGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteProtectionGroupRequestMutableBuilder[Self <: DeleteProtectionGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectionGroupId(value: ProtectionGroupId): Self = StObject.set(x, "ProtectionGroupId", value.asInstanceOf[js.Any])
  }
}

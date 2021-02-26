package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteInputSecurityGroupRequest extends StObject {
  
  /**
    * The Input Security Group to delete
    */
  var InputSecurityGroupId: string = js.native
}
object DeleteInputSecurityGroupRequest {
  
  @scala.inline
  def apply(InputSecurityGroupId: string): DeleteInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInputSecurityGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteInputSecurityGroupRequestMutableBuilder[Self <: DeleteInputSecurityGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputSecurityGroupId(value: string): Self = StObject.set(x, "InputSecurityGroupId", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGroupRequest extends StObject {
  
  /**
    * The ARN of the group that was generated on creation.
    */
  var GroupARN: js.UndefOr[typingsSlinky.awsSdk.xrayMod.GroupARN] = js.native
  
  /**
    * The case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[typingsSlinky.awsSdk.xrayMod.GroupName] = js.native
}
object DeleteGroupRequest {
  
  @scala.inline
  def apply(): DeleteGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteGroupRequestMutableBuilder[Self <: DeleteGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupARN(value: GroupARN): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}

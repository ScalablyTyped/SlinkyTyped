package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGroupRequest extends js.Object {
  
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
  implicit class DeleteGroupRequestOps[Self <: DeleteGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setGroupARN(value: GroupARN): Self = this.set("GroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupARN: Self = this.set("GroupARN", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
  }
}

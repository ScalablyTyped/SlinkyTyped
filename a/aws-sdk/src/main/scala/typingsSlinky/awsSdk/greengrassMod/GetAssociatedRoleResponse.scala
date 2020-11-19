package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssociatedRoleResponse extends js.Object {
  
  /**
    * The time when the role was associated with the group.
    */
  var AssociatedAt: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the role that is associated with the group.
    */
  var RoleArn: js.UndefOr[string] = js.native
}
object GetAssociatedRoleResponse {
  
  @scala.inline
  def apply(): GetAssociatedRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociatedRoleResponse]
  }
  
  @scala.inline
  implicit class GetAssociatedRoleResponseOps[Self <: GetAssociatedRoleResponse] (val x: Self) extends AnyVal {
    
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
    def setAssociatedAt(value: string): Self = this.set("AssociatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedAt: Self = this.set("AssociatedAt", js.undefined)
    
    @scala.inline
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
}

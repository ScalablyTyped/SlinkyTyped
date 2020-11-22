package typingsSlinky.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePermissionSetResponse extends js.Object {
  
  /**
    * Defines the level of access on an AWS account.
    */
  var PermissionSet: js.UndefOr[typingsSlinky.awsSdk.ssoadminMod.PermissionSet] = js.native
}
object CreatePermissionSetResponse {
  
  @scala.inline
  def apply(): CreatePermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePermissionSetResponse]
  }
  
  @scala.inline
  implicit class CreatePermissionSetResponseOps[Self <: CreatePermissionSetResponse] (val x: Self) extends AnyVal {
    
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
    def setPermissionSet(value: PermissionSet): Self = this.set("PermissionSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionSet: Self = this.set("PermissionSet", js.undefined)
  }
}

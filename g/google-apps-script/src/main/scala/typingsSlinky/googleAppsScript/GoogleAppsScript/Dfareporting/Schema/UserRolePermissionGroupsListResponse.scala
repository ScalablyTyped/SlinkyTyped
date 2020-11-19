package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRolePermissionGroupsListResponse extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var userRolePermissionGroups: js.UndefOr[js.Array[UserRolePermissionGroup]] = js.native
}
object UserRolePermissionGroupsListResponse {
  
  @scala.inline
  def apply(): UserRolePermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserRolePermissionGroupsListResponse]
  }
  
  @scala.inline
  implicit class UserRolePermissionGroupsListResponseOps[Self <: UserRolePermissionGroupsListResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setUserRolePermissionGroupsVarargs(value: UserRolePermissionGroup*): Self = this.set("userRolePermissionGroups", js.Array(value :_*))
    
    @scala.inline
    def setUserRolePermissionGroups(value: js.Array[UserRolePermissionGroup]): Self = this.set("userRolePermissionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRolePermissionGroups: Self = this.set("userRolePermissionGroups", js.undefined)
  }
}

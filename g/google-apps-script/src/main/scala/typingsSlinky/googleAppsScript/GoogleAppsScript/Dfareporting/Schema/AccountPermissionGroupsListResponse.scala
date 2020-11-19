package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPermissionGroupsListResponse extends js.Object {
  
  var accountPermissionGroups: js.UndefOr[js.Array[AccountPermissionGroup]] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object AccountPermissionGroupsListResponse {
  
  @scala.inline
  def apply(): AccountPermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPermissionGroupsListResponse]
  }
  
  @scala.inline
  implicit class AccountPermissionGroupsListResponseOps[Self <: AccountPermissionGroupsListResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountPermissionGroupsVarargs(value: AccountPermissionGroup*): Self = this.set("accountPermissionGroups", js.Array(value :_*))
    
    @scala.inline
    def setAccountPermissionGroups(value: js.Array[AccountPermissionGroup]): Self = this.set("accountPermissionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountPermissionGroups: Self = this.set("accountPermissionGroups", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}

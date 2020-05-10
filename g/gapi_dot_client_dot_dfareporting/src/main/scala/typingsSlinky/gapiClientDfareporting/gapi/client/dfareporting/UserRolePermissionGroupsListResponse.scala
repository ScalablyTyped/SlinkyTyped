package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRolePermissionGroupsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userRolePermissionGroupsListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** User role permission group collection. */
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withUserRolePermissionGroups(value: js.Array[UserRolePermissionGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRolePermissionGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRolePermissionGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRolePermissionGroups")(js.undefined)
        ret
    }
  }
  
}


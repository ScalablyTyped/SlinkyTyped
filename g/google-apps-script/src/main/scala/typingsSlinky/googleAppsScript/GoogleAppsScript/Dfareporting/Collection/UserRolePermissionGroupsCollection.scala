package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.UserRolePermissionGroup
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.UserRolePermissionGroupsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRolePermissionGroupsCollection extends js.Object {
  // Gets one user role permission group by ID.
  def get(profileId: String, id: String): UserRolePermissionGroup = js.native
  // Gets a list of all supported user role permission groups.
  def list(profileId: String): UserRolePermissionGroupsListResponse = js.native
}

object UserRolePermissionGroupsCollection {
  @scala.inline
  def apply(
    get: (String, String) => UserRolePermissionGroup,
    list: String => UserRolePermissionGroupsListResponse
  ): UserRolePermissionGroupsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UserRolePermissionGroupsCollection]
  }
  @scala.inline
  implicit class UserRolePermissionGroupsCollectionOps[Self <: UserRolePermissionGroupsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (String, String) => UserRolePermissionGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: String => UserRolePermissionGroupsListResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


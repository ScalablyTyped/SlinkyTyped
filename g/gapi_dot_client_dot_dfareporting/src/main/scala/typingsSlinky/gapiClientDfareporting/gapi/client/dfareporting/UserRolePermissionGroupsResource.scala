package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRolePermissionGroupsResource extends js.Object {
  /** Gets one user role permission group by ID. */
  def get(request: AnonFields): Request_[UserRolePermissionGroup] = js.native
  /** Gets a list of all supported user role permission groups. */
  def list(request: AnonKey): Request_[UserRolePermissionGroupsListResponse] = js.native
}

object UserRolePermissionGroupsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[UserRolePermissionGroup],
    list: AnonKey => Request_[UserRolePermissionGroupsListResponse]
  ): UserRolePermissionGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UserRolePermissionGroupsResource]
  }
  @scala.inline
  implicit class UserRolePermissionGroupsResourceOps[Self <: UserRolePermissionGroupsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonFields => Request_[UserRolePermissionGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[UserRolePermissionGroupsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


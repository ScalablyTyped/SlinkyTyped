package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonAltFields
import typingsSlinky.gapiClientDfareporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRolePermissionsResource extends js.Object {
  /** Gets one user role permission by ID. */
  def get(request: AnonFields): Request_[UserRolePermission] = js.native
  /** Gets a list of user role permissions, possibly filtered. */
  def list(request: AnonAltFields): Request_[UserRolePermissionsListResponse] = js.native
}

object UserRolePermissionsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[UserRolePermission],
    list: AnonAltFields => Request_[UserRolePermissionsListResponse]
  ): UserRolePermissionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UserRolePermissionsResource]
  }
  @scala.inline
  implicit class UserRolePermissionsResourceOps[Self <: UserRolePermissionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonFields => Request_[UserRolePermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAltFields => Request_[UserRolePermissionsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


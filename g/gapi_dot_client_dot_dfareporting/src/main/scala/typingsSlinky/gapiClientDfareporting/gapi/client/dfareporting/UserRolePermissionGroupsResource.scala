package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionGroupsResource extends js.Object {
  /** Gets one user role permission group by ID. */
  def get(request: AnonFields): Request_[UserRolePermissionGroup]
  /** Gets a list of all supported user role permission groups. */
  def list(request: AnonKey): Request_[UserRolePermissionGroupsListResponse]
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
}


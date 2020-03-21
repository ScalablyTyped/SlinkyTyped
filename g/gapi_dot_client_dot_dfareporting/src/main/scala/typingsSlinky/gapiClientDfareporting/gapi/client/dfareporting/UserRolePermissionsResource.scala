package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonAltFields
import typingsSlinky.gapiClientDfareporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionsResource extends js.Object {
  /** Gets one user role permission by ID. */
  def get(request: AnonFields): Request_[UserRolePermission]
  /** Gets a list of user role permissions, possibly filtered. */
  def list(request: AnonAltFields): Request_[UserRolePermissionsListResponse]
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
}


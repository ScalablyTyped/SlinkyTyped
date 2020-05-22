package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTagmanager.anon.Alt
import typingsSlinky.gapiClientTagmanager.anon.Fields
import typingsSlinky.gapiClientTagmanager.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPermissionsResource extends js.Object {
  /** Creates a user's Account & Container access. */
  def create(request: Alt): Request[UserPermission]
  /** Removes a user from the account, revoking access to it and all of its containers. */
  def delete(request: Fields): Request[Unit]
  /** Gets a user's Account & Container access. */
  def get(request: Fields): Request[UserPermission]
  /** List all users that have access to the account along with Account and Container user access granted to each of them. */
  def list(request: Key): Request[ListUserPermissionsResponse]
  /** Updates a user's Account & Container access. */
  def update(request: Fields): Request[UserPermission]
}

object UserPermissionsResource {
  @scala.inline
  def apply(
    create: Alt => Request[UserPermission],
    delete: Fields => Request[Unit],
    get: Fields => Request[UserPermission],
    list: Key => Request[ListUserPermissionsResponse],
    update: Fields => Request[UserPermission]
  ): UserPermissionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[UserPermissionsResource]
  }
}


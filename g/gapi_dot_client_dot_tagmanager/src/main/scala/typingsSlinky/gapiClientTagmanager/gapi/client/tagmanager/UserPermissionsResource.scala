package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTagmanager.anon.Alt
import typingsSlinky.gapiClientTagmanager.anon.Fields
import typingsSlinky.gapiClientTagmanager.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPermissionsResource extends js.Object {
  /** Creates a user's Account & Container access. */
  def create(request: Alt): Request[UserPermission] = js.native
  /** Removes a user from the account, revoking access to it and all of its containers. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets a user's Account & Container access. */
  def get(request: Fields): Request[UserPermission] = js.native
  /** List all users that have access to the account along with Account and Container user access granted to each of them. */
  def list(request: Key): Request[ListUserPermissionsResponse] = js.native
  /** Updates a user's Account & Container access. */
  def update(request: Fields): Request[UserPermission] = js.native
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
  @scala.inline
  implicit class UserPermissionsResourceOps[Self <: UserPermissionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Alt => Request[UserPermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[UserPermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[ListUserPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Fields => Request[UserPermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTagmanager.anon.Fields
import typingsSlinky.gapiClientTagmanager.anon.Fingerprint
import typingsSlinky.gapiClientTagmanager.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  var containers: ContainersResource = js.native
  var user_permissions: UserPermissionsResource = js.native
  /** Gets a GTM Account. */
  def get(request: Fields): Request[Account] = js.native
  /** Lists all GTM Accounts that a user has access to. */
  def list(request: QuotaUser): Request[ListAccountsResponse] = js.native
  /** Updates a GTM Account. */
  def update(request: Fingerprint): Request[Account] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(
    containers: ContainersResource,
    get: Fields => Request[Account],
    list: QuotaUser => Request[ListAccountsResponse],
    update: Fingerprint => Request[Account],
    user_permissions: UserPermissionsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), user_permissions = user_permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsResource]
  }
  @scala.inline
  implicit class AccountsResourceOps[Self <: AccountsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainers(value: ContainersResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: QuotaUser => Request[ListAccountsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Fingerprint => Request[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUser_permissions(value: UserPermissionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_permissions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


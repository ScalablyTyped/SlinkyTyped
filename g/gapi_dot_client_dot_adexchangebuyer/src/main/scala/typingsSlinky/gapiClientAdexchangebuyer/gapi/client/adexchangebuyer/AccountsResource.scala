package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangebuyer.anon.Alt
import typingsSlinky.gapiClientAdexchangebuyer.anon.ConfirmUnsafeAccountChange
import typingsSlinky.gapiClientAdexchangebuyer.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: Alt): Request[Account] = js.native
  /** Retrieves the authenticated user's list of accounts. */
  def list(request: Fields): Request[AccountsList] = js.native
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: ConfirmUnsafeAccountChange): Request[Account] = js.native
  /** Updates an existing account. */
  def update(request: ConfirmUnsafeAccountChange): Request[Account] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(
    get: Alt => Request[Account],
    list: Fields => Request[AccountsList],
    patch: ConfirmUnsafeAccountChange => Request[Account],
    update: ConfirmUnsafeAccountChange => Request[Account]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccountsResource]
  }
  @scala.inline
  implicit class AccountsResourceOps[Self <: AccountsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Alt => Request[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[AccountsList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: ConfirmUnsafeAccountChange => Request[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: ConfirmUnsafeAccountChange => Request[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


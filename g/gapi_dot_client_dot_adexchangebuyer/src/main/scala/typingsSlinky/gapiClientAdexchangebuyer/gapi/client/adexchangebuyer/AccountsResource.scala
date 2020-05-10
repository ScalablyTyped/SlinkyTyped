package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer.AnonAlt
import typingsSlinky.gapiClientAdexchangebuyer.AnonConfirmUnsafeAccountChange
import typingsSlinky.gapiClientAdexchangebuyer.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: AnonAlt): Request_[Account] = js.native
  /** Retrieves the authenticated user's list of accounts. */
  def list(request: AnonFields): Request_[AccountsList] = js.native
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: AnonConfirmUnsafeAccountChange): Request_[Account] = js.native
  /** Updates an existing account. */
  def update(request: AnonConfirmUnsafeAccountChange): Request_[Account] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(
    get: AnonAlt => Request_[Account],
    list: AnonFields => Request_[AccountsList],
    patch: AnonConfirmUnsafeAccountChange => Request_[Account],
    update: AnonConfirmUnsafeAccountChange => Request_[Account]
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
    def withGet(value: AnonAlt => Request_[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[AccountsList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonConfirmUnsafeAccountChange => Request_[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonConfirmUnsafeAccountChange => Request_[Account]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


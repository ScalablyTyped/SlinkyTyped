package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import typingsSlinky.gapiClientDfareporting.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubaccountsResource extends js.Object {
  /** Gets one subaccount by ID. */
  def get(request: AnonFields): Request_[Subaccount] = js.native
  /** Inserts a new subaccount. */
  def insert(request: AnonKey): Request_[Subaccount] = js.native
  /** Gets a list of subaccounts, possibly filtered. This method supports paging. */
  def list(request: AnonOauthtoken): Request_[SubaccountsListResponse] = js.native
  /** Updates an existing subaccount. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Subaccount] = js.native
  /** Updates an existing subaccount. */
  def update(request: AnonKey): Request_[Subaccount] = js.native
}

object SubaccountsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[Subaccount],
    insert: AnonKey => Request_[Subaccount],
    list: AnonOauthtoken => Request_[SubaccountsListResponse],
    patch: AnonFields => Request_[Subaccount],
    update: AnonKey => Request_[Subaccount]
  ): SubaccountsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SubaccountsResource]
  }
  @scala.inline
  implicit class SubaccountsResourceOps[Self <: SubaccountsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonFields => Request_[Subaccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[Subaccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonOauthtoken => Request_[SubaccountsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[Subaccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[Subaccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


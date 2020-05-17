package typingsSlinky.gapiClientVault.gapi.client.vault

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientVault.anon.Accesstoken
import typingsSlinky.gapiClientVault.anon.Alt
import typingsSlinky.gapiClientVault.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoldsResource extends js.Object {
  var accounts: AccountsResource = js.native
  /** Creates a hold in the given matter. */
  def create(request: Alt): Request[Hold] = js.native
  /** Removes a hold by ID. This will release any HeldAccounts on this Hold. */
  def delete(request: Accesstoken): Request[js.Object] = js.native
  /** Gets a hold by ID. */
  def get(request: Accesstoken): Request[Hold] = js.native
  /**
    * Lists holds within a matter. An empty page token in ListHoldsResponse
    * denotes no more holds to list.
    */
  def list(request: Bearertoken): Request[ListHoldsResponse] = js.native
  /**
    * Updates the OU and/or query parameters of a hold. You cannot add accounts
    * to a hold that covers an OU, nor can you add OUs to a hold that covers
    * individual accounts. Accounts listed in the hold will be ignored.
    */
  def update(request: Accesstoken): Request[Hold] = js.native
}

object HoldsResource {
  @scala.inline
  def apply(
    accounts: AccountsResource,
    create: Alt => Request[Hold],
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[Hold],
    list: Bearertoken => Request[ListHoldsResponse],
    update: Accesstoken => Request[Hold]
  ): HoldsResource = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[HoldsResource]
  }
  @scala.inline
  implicit class HoldsResourceOps[Self <: HoldsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts(value: AccountsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: Alt => Request[Hold]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Accesstoken => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Accesstoken => Request[Hold]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Bearertoken => Request[ListHoldsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Accesstoken => Request[Hold]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


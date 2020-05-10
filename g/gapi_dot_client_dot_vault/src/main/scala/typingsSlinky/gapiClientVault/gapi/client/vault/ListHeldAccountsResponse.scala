package typingsSlinky.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHeldAccountsResponse extends js.Object {
  /** The held accounts on a hold. */
  var accounts: js.UndefOr[js.Array[HeldAccount]] = js.native
}

object ListHeldAccountsResponse {
  @scala.inline
  def apply(): ListHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHeldAccountsResponse]
  }
  @scala.inline
  implicit class ListHeldAccountsResponseOps[Self <: ListHeldAccountsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts(value: js.Array[HeldAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeldAccount extends js.Object {
  /**
    * The account's ID as provided by the
    * <a href="https://developers.google.com/admin-sdk/">Admin SDK</a>.
    */
  var accountId: js.UndefOr[String] = js.native
  /** When the account was put on hold. */
  var holdTime: js.UndefOr[String] = js.native
}

object HeldAccount {
  @scala.inline
  def apply(): HeldAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldAccount]
  }
  @scala.inline
  implicit class HeldAccountOps[Self <: HeldAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withHoldTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoldTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdTime")(js.undefined)
        ret
    }
  }
  
}


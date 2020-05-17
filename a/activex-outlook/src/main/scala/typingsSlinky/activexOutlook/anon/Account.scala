package typingsSlinky.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  val Account: typingsSlinky.activexOutlook.Outlook.Account = js.native
}

object Account {
  @scala.inline
  def apply(Account: typingsSlinky.activexOutlook.Outlook.Account): Account = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: typingsSlinky.activexOutlook.Outlook.Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


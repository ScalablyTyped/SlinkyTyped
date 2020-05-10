package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccount extends js.Object {
  val Account: typingsSlinky.activexOutlook.Outlook.Account = js.native
}

object AnonAccount {
  @scala.inline
  def apply(Account: Account): AnonAccount = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccount]
  }
  @scala.inline
  implicit class AnonAccountOps[Self <: AnonAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


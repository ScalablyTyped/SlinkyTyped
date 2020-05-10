package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSelectedAccount extends js.Object {
  val SelectedAccount: Account = js.native
}

object AnonSelectedAccount {
  @scala.inline
  def apply(SelectedAccount: Account): AnonSelectedAccount = {
    val __obj = js.Dynamic.literal(SelectedAccount = SelectedAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelectedAccount]
  }
  @scala.inline
  implicit class AnonSelectedAccountOps[Self <: AnonSelectedAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedAccount(value: Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedAccount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


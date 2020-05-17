package typingsSlinky.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedAccount extends js.Object {
  val SelectedAccount: typingsSlinky.activexOutlook.Outlook.Account = js.native
}

object SelectedAccount {
  @scala.inline
  def apply(SelectedAccount: typingsSlinky.activexOutlook.Outlook.Account): SelectedAccount = {
    val __obj = js.Dynamic.literal(SelectedAccount = SelectedAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedAccount]
  }
  @scala.inline
  implicit class SelectedAccountOps[Self <: SelectedAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedAccount(value: typingsSlinky.activexOutlook.Outlook.Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedAccount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


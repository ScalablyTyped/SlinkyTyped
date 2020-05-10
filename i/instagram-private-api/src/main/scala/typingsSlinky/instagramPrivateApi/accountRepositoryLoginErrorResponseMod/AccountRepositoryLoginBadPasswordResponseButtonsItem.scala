package typingsSlinky.instagramPrivateApi.accountRepositoryLoginErrorResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRepositoryLoginBadPasswordResponseButtonsItem extends js.Object {
  var action: String = js.native
  var title: String = js.native
}

object AccountRepositoryLoginBadPasswordResponseButtonsItem {
  @scala.inline
  def apply(action: String, title: String): AccountRepositoryLoginBadPasswordResponseButtonsItem = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRepositoryLoginBadPasswordResponseButtonsItem]
  }
  @scala.inline
  implicit class AccountRepositoryLoginBadPasswordResponseButtonsItemOps[Self <: AccountRepositoryLoginBadPasswordResponseButtonsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


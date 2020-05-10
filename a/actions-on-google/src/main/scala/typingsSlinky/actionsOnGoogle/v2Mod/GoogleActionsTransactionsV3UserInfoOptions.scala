package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3UserInfoOptions extends js.Object {
  /**
    * List of user info properties.
    */
  var userInfoProperties: js.UndefOr[js.Array[GoogleActionsTransactionsV3UserInfoOptionsUserInfoProperties]] = js.native
}

object GoogleActionsTransactionsV3UserInfoOptions {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3UserInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3UserInfoOptions]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3UserInfoOptionsOps[Self <: GoogleActionsTransactionsV3UserInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserInfoProperties(value: js.Array[GoogleActionsTransactionsV3UserInfoOptionsUserInfoProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfoProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserInfoProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfoProperties")(js.undefined)
        ret
    }
  }
  
}


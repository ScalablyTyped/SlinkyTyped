package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountGoogleMyBusinessLink extends js.Object {
  var gmbEmail: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object AccountGoogleMyBusinessLink {
  @scala.inline
  def apply(): AccountGoogleMyBusinessLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountGoogleMyBusinessLink]
  }
  @scala.inline
  implicit class AccountGoogleMyBusinessLinkOps[Self <: AccountGoogleMyBusinessLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGmbEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmbEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmbEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmbEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}


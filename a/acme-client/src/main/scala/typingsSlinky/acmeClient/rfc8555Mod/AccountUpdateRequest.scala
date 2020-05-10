package typingsSlinky.acmeClient.rfc8555Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUpdateRequest extends js.Object {
  var contact: js.UndefOr[js.Array[String]] = js.native
  var status: js.UndefOr[String] = js.native
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.native
}

object AccountUpdateRequest {
  @scala.inline
  def apply(): AccountUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUpdateRequest]
  }
  @scala.inline
  implicit class AccountUpdateRequestOps[Self <: AccountUpdateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContact(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(js.undefined)
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
    @scala.inline
    def withTermsOfServiceAgreed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsOfServiceAgreed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermsOfServiceAgreed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsOfServiceAgreed")(js.undefined)
        ret
    }
  }
  
}


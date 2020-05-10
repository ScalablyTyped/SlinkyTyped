package typingsSlinky.acmeClient.rfc8555Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountCreateRequest extends js.Object {
  var contact: js.UndefOr[js.Array[String]] = js.native
  var externalAccountBinding: js.UndefOr[js.Object] = js.native
  var onlyReturnExisting: js.UndefOr[Boolean] = js.native
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.native
}

object AccountCreateRequest {
  @scala.inline
  def apply(): AccountCreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCreateRequest]
  }
  @scala.inline
  implicit class AccountCreateRequestOps[Self <: AccountCreateRequest] (val x: Self) extends AnyVal {
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
    def withExternalAccountBinding(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalAccountBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalAccountBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalAccountBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyReturnExisting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyReturnExisting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyReturnExisting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyReturnExisting")(js.undefined)
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


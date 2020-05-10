package typingsSlinky.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoginRequestUrlOptions extends js.Object {
  var auth_context: js.UndefOr[AuthnContextClassRef] = js.native
  var force_authn: js.UndefOr[Boolean] = js.native
  var nameid_format: js.UndefOr[String] = js.native
  var relay_state: js.UndefOr[String] = js.native
  var sign_get_request: js.UndefOr[Boolean] = js.native
}

object CreateLoginRequestUrlOptions {
  @scala.inline
  def apply(): CreateLoginRequestUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLoginRequestUrlOptions]
  }
  @scala.inline
  implicit class CreateLoginRequestUrlOptionsOps[Self <: CreateLoginRequestUrlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth_context(value: AuthnContextClassRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth_context: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_context")(js.undefined)
        ret
    }
    @scala.inline
    def withForce_authn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_authn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce_authn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_authn")(js.undefined)
        ret
    }
    @scala.inline
    def withNameid_format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameid_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameid_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameid_format")(js.undefined)
        ret
    }
    @scala.inline
    def withRelay_state(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relay_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelay_state: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relay_state")(js.undefined)
        ret
    }
    @scala.inline
    def withSign_get_request(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_get_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSign_get_request: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_get_request")(js.undefined)
        ret
    }
  }
  
}


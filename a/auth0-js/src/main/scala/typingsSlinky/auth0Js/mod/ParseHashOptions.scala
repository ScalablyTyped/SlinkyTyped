package typingsSlinky.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseHashOptions extends js.Object {
  /** indicates that you want to allow IdP-Initiated flows. See {@link https://auth0.com/docs/protocols/saml/idp-initiated-sso#lock-auth0-js} */
  var __enableIdPInitiatedLogin: js.UndefOr[Boolean] = js.native
  var _idTokenVerification: js.UndefOr[Boolean] = js.native
  var hash: js.UndefOr[String] = js.native
  var nonce: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object ParseHashOptions {
  @scala.inline
  def apply(): ParseHashOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseHashOptions]
  }
  @scala.inline
  implicit class ParseHashOptionsOps[Self <: ParseHashOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__enableIdPInitiatedLogin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__enableIdPInitiatedLogin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__enableIdPInitiatedLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__enableIdPInitiatedLogin")(js.undefined)
        ret
    }
    @scala.inline
    def with_idTokenVerification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_idTokenVerification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_idTokenVerification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_idTokenVerification")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitytoolkitRelyingpartyVerifyCustomTokenRequest extends js.Object {
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[String] = js.native
  /** Whether return sts id token and refresh token instead of gitkit token. */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
  /** The custom token to verify */
  var token: js.UndefOr[String] = js.native
}

object IdentitytoolkitRelyingpartyVerifyCustomTokenRequest {
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyVerifyCustomTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyCustomTokenRequest]
  }
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyVerifyCustomTokenRequestOps[Self <: IdentitytoolkitRelyingpartyVerifyCustomTokenRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelegatedProjectNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatedProjectNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegatedProjectNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatedProjectNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnSecureToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnSecureToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnSecureToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnSecureToken")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}


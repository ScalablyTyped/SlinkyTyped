package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignInToken extends js.Object {
  var access_token: String = js.native
  var expiry: Double = js.native
  var id_token: js.UndefOr[String] = js.native
  var token_type: js.UndefOr[String] = js.native
}

object SignInToken {
  @scala.inline
  def apply(access_token: String, expiry: Double): SignInToken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInToken]
  }
  @scala.inline
  implicit class SignInTokenOps[Self <: SignInToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_token")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_type")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.jsforce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsforce.jsforce/connection.PartialOAuth2Options> */
@js.native
trait PartialPartialOAuth2Optio extends js.Object {
  var authzServiceUrl: js.UndefOr[String] = js.native
  var clientId: js.UndefOr[String] = js.native
  var clientSecret: js.UndefOr[String] = js.native
  var loginUrl: js.UndefOr[String] = js.native
  var redirectUri: js.UndefOr[String] = js.native
  var tokenServiceUrl: js.UndefOr[String] = js.native
}

object PartialPartialOAuth2Optio {
  @scala.inline
  def apply(): PartialPartialOAuth2Optio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPartialOAuth2Optio]
  }
  @scala.inline
  implicit class PartialPartialOAuth2OptioOps[Self <: PartialPartialOAuth2Optio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthzServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authzServiceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthzServiceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authzServiceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withClientSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withLoginUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenServiceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenServiceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenServiceUrl")(js.undefined)
        ret
    }
  }
  
}


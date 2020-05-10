package typingsSlinky.angularOauth2.mod.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthConfig extends js.Object {
  var baseUrl: String = js.native
  var clientId: String = js.native
  var clientSecret: js.UndefOr[String] = js.native
  var grantPath: js.UndefOr[String] = js.native
  var revokePath: js.UndefOr[String] = js.native
}

object OAuthConfig {
  @scala.inline
  def apply(baseUrl: String, clientId: String): OAuthConfig = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthConfig]
  }
  @scala.inline
  implicit class OAuthConfigOps[Self <: OAuthConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
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
    def withGrantPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRevokePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevokePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokePath")(js.undefined)
        ret
    }
  }
  
}


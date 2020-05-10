package typingsSlinky.ionic.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2FlowOptions extends js.Object {
  val authorizationUrl: String = js.native
  val clientId: String = js.native
  val redirectHost: js.UndefOr[String] = js.native
  val redirectPort: js.UndefOr[Double] = js.native
  val tokenUrl: String = js.native
}

object OAuth2FlowOptions {
  @scala.inline
  def apply(authorizationUrl: String, clientId: String, tokenUrl: String): OAuth2FlowOptions = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2FlowOptions]
  }
  @scala.inline
  implicit class OAuth2FlowOptionsOps[Self <: OAuth2FlowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectHost")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectPort")(js.undefined)
        ret
    }
  }
  
}


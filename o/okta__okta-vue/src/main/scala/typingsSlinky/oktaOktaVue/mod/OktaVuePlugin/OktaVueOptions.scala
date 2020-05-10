package typingsSlinky.oktaOktaVue.mod.OktaVuePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OktaVueOptions extends OktaAuthJsOptions {
  var clientId: String = js.native
  var issuer: String = js.native
  var redirectUri: String = js.native
}

object OktaVueOptions {
  @scala.inline
  def apply(clientId: String, issuer: String, redirectUri: String): OktaVueOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[OktaVueOptions]
  }
  @scala.inline
  implicit class OktaVueOptionsOps[Self <: OktaVueOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


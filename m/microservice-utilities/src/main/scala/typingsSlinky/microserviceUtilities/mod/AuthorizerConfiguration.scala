package typingsSlinky.microserviceUtilities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizerConfiguration extends js.Object {
  var authorizerContextResolver: js.UndefOr[String] = js.native
  var jwkKeyListUrl: String = js.native
}

object AuthorizerConfiguration {
  @scala.inline
  def apply(jwkKeyListUrl: String): AuthorizerConfiguration = {
    val __obj = js.Dynamic.literal(jwkKeyListUrl = jwkKeyListUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizerConfiguration]
  }
  @scala.inline
  implicit class AuthorizerConfigurationOps[Self <: AuthorizerConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJwkKeyListUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwkKeyListUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorizerContextResolver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerContextResolver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerContextResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerContextResolver")(js.undefined)
        ret
    }
  }
  
}


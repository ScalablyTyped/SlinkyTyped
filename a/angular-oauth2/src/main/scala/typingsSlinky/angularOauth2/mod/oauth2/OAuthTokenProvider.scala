package typingsSlinky.angularOauth2.mod.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthTokenProvider extends js.Object {
  def configure(params: OAuthTokenConfig): OAuthTokenConfig = js.native
}

object OAuthTokenProvider {
  @scala.inline
  def apply(configure: OAuthTokenConfig => OAuthTokenConfig): OAuthTokenProvider = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
    __obj.asInstanceOf[OAuthTokenProvider]
  }
  @scala.inline
  implicit class OAuthTokenProviderOps[Self <: OAuthTokenProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigure(value: OAuthTokenConfig => OAuthTokenConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


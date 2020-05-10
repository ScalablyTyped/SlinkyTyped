package typingsSlinky.asana.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthAuthenticatorOptions extends js.Object {
  var credentials: js.UndefOr[Credentials | String] = js.native
  var flowType: js.UndefOr[FlowType] = js.native
}

object OauthAuthenticatorOptions {
  @scala.inline
  def apply(): OauthAuthenticatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OauthAuthenticatorOptions]
  }
  @scala.inline
  implicit class OauthAuthenticatorOptionsOps[Self <: OauthAuthenticatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: Credentials | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowType(value: FlowType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowType")(js.undefined)
        ret
    }
  }
  
}


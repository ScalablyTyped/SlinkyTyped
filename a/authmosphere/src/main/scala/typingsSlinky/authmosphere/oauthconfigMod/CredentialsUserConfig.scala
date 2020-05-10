package typingsSlinky.authmosphere.oauthconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialsUserConfig extends js.Object {
  var applicationPassword: String = js.native
  var applicationUsername: String = js.native
}

object CredentialsUserConfig {
  @scala.inline
  def apply(applicationPassword: String, applicationUsername: String): CredentialsUserConfig = {
    val __obj = js.Dynamic.literal(applicationPassword = applicationPassword.asInstanceOf[js.Any], applicationUsername = applicationUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsUserConfig]
  }
  @scala.inline
  implicit class CredentialsUserConfigOps[Self <: CredentialsUserConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationUsername")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


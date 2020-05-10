package typingsSlinky.authmosphere.oauthconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialsDirConfig extends CredentialsConfig {
  var credentialsDir: String = js.native
}

object CredentialsDirConfig {
  @scala.inline
  def apply(credentialsDir: String): CredentialsDirConfig = {
    val __obj = js.Dynamic.literal(credentialsDir = credentialsDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsDirConfig]
  }
  @scala.inline
  implicit class CredentialsDirConfigOps[Self <: CredentialsDirConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentialsDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialsDir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


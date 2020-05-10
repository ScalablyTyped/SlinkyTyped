package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credential extends js.Object {
  /**
    * The RFC2617 compliant password associated with the SIP credentials, in US-ASCII format.
    */
  var Password: js.UndefOr[SensitiveString] = js.native
  /**
    * The RFC2617 compliant user name associated with the SIP credentials, in US-ASCII format.
    */
  var Username: js.UndefOr[SensitiveString] = js.native
}

object Credential {
  @scala.inline
  def apply(): Credential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credential]
  }
  @scala.inline
  implicit class CredentialOps[Self <: Credential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(js.undefined)
        ret
    }
  }
  
}


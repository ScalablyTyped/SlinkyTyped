package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentProxyInfo extends js.Object {
  var accountName: String = js.native
  var credentialId: Double = js.native
  var credentialIdentity: String = js.native
  var credentialName: String = js.native
  var description: String = js.native
  var id: Double = js.native
  var isEnabled: Boolean = js.native
}

object AgentProxyInfo {
  @scala.inline
  def apply(
    accountName: String,
    credentialId: Double,
    credentialIdentity: String,
    credentialName: String,
    description: String,
    id: Double,
    isEnabled: Boolean
  ): AgentProxyInfo = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], credentialId = credentialId.asInstanceOf[js.Any], credentialIdentity = credentialIdentity.asInstanceOf[js.Any], credentialName = credentialName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentProxyInfo]
  }
  @scala.inline
  implicit class AgentProxyInfoOps[Self <: AgentProxyInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentialId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentialIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentialName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


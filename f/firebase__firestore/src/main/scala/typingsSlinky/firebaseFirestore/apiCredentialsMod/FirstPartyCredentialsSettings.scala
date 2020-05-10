package typingsSlinky.firebaseFirestore.apiCredentialsMod

import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.gapi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstPartyCredentialsSettings extends CredentialsSettings {
  var client: js.Any = js.native
  var sessionIndex: String = js.native
  var `type`: gapi = js.native
}

object FirstPartyCredentialsSettings {
  @scala.inline
  def apply(client: js.Any, sessionIndex: String, `type`: gapi): FirstPartyCredentialsSettings = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], sessionIndex = sessionIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstPartyCredentialsSettings]
  }
  @scala.inline
  implicit class FirstPartyCredentialsSettingsOps[Self <: FirstPartyCredentialsSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: gapi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


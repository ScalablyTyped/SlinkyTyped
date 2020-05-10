package typingsSlinky.googleAuthLibrary.googleauthMod

import typingsSlinky.googleAuthLibrary.oauth2clientMod.OAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ADCResponse extends js.Object {
  var credential: OAuth2Client = js.native
  var projectId: String | Null = js.native
}

object ADCResponse {
  @scala.inline
  def apply(credential: OAuth2Client): ADCResponse = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADCResponse]
  }
  @scala.inline
  implicit class ADCResponseOps[Self <: ADCResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredential(value: OAuth2Client): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(null)
        ret
    }
  }
  
}


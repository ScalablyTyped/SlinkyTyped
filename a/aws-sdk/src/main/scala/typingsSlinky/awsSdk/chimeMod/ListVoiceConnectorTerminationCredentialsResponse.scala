package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVoiceConnectorTerminationCredentialsResponse extends js.Object {
  /**
    * A list of user names.
    */
  var Usernames: js.UndefOr[SensitiveStringList] = js.native
}

object ListVoiceConnectorTerminationCredentialsResponse {
  @scala.inline
  def apply(): ListVoiceConnectorTerminationCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceConnectorTerminationCredentialsResponse]
  }
  @scala.inline
  implicit class ListVoiceConnectorTerminationCredentialsResponseOps[Self <: ListVoiceConnectorTerminationCredentialsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsernames(value: SensitiveStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Usernames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Usernames")(js.undefined)
        ret
    }
  }
  
}


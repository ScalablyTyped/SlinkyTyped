package typingsSlinky.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestRecipient extends js.Object {
  var did: js.UndefOr[DID] = js.native
  var name: js.UndefOr[AgentName] = js.native
}

object RequestRecipient {
  @scala.inline
  def apply(): RequestRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestRecipient]
  }
  @scala.inline
  implicit class RequestRecipientOps[Self <: RequestRecipient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDid(value: DID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("did")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("did")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: AgentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}


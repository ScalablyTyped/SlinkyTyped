package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clientpayload extends js.Object {
  var client_payload: Type = js.native
  var event_type: Type = js.native
  var owner: Required = js.native
  var repo: Required = js.native
}

object Clientpayload {
  @scala.inline
  def apply(client_payload: Type, event_type: Type, owner: Required, repo: Required): Clientpayload = {
    val __obj = js.Dynamic.literal(client_payload = client_payload.asInstanceOf[js.Any], event_type = event_type.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clientpayload]
  }
  @scala.inline
  implicit class ClientpayloadOps[Self <: Clientpayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_payload(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent_type(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


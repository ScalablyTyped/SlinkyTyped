package typingsSlinky.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentResponse extends js.Object {
  var did: DID = js.native
  var name: AgentName = js.native
  var results: js.Array[CredentialDefinition | CredentialSchema] = js.native
}

object AgentResponse {
  @scala.inline
  def apply(did: DID, name: AgentName, results: js.Array[CredentialDefinition | CredentialSchema]): AgentResponse = {
    val __obj = js.Dynamic.literal(did = did.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentResponse]
  }
  @scala.inline
  implicit class AgentResponseOps[Self <: AgentResponse] (val x: Self) extends AnyVal {
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
    def withName(value: AgentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[CredentialDefinition | CredentialSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


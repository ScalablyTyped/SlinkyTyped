package typingsSlinky.openssiWebsdk.mod

import typingsSlinky.openssiWebsdk.anon.Did
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionAgent extends js.Object {
  var name: AgentName = js.native
  var pairwise: Did = js.native
  var public: Did = js.native
  var role: String = js.native
  var url: AgentURL = js.native
}

object ConnectionAgent {
  @scala.inline
  def apply(name: AgentName, pairwise: Did, public: Did, role: String, url: AgentURL): ConnectionAgent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairwise = pairwise.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAgent]
  }
  @scala.inline
  implicit class ConnectionAgentOps[Self <: ConnectionAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: AgentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPairwise(value: Did): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pairwise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic(value: Did): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: AgentURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


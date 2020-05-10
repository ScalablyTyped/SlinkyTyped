package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnPremConfig extends js.Object {
  /**
    * ARNs)of the agents to use for an NFS location.
    */
  var AgentArns: AgentArnList = js.native
}

object OnPremConfig {
  @scala.inline
  def apply(AgentArns: AgentArnList): OnPremConfig = {
    val __obj = js.Dynamic.literal(AgentArns = AgentArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPremConfig]
  }
  @scala.inline
  implicit class OnPremConfigOps[Self <: OnPremConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentArns(value: AgentArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentArns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


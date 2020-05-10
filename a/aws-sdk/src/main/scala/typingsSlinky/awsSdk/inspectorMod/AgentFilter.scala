package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentFilter extends js.Object {
  /**
    * The detailed health state of the agent. Values can be set to IDLE, RUNNING, SHUTDOWN, UNHEALTHY, THROTTLED, and UNKNOWN. 
    */
  var agentHealthCodes: AgentHealthCodeList = js.native
  /**
    * The current health state of the agent. Values can be set to HEALTHY or UNHEALTHY.
    */
  var agentHealths: AgentHealthList = js.native
}

object AgentFilter {
  @scala.inline
  def apply(agentHealthCodes: AgentHealthCodeList, agentHealths: AgentHealthList): AgentFilter = {
    val __obj = js.Dynamic.literal(agentHealthCodes = agentHealthCodes.asInstanceOf[js.Any], agentHealths = agentHealths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentFilter]
  }
  @scala.inline
  implicit class AgentFilterOps[Self <: AgentFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentHealthCodes(value: AgentHealthCodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentHealthCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentHealths(value: AgentHealthList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentHealths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


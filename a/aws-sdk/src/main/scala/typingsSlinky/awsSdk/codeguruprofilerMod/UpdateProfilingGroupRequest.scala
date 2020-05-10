package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProfilingGroupRequest extends js.Object {
  /**
    * 
    */
  var agentOrchestrationConfig: AgentOrchestrationConfig = js.native
  /**
    * The name of the profiling group to update.
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object UpdateProfilingGroupRequest {
  @scala.inline
  def apply(agentOrchestrationConfig: AgentOrchestrationConfig, profilingGroupName: ProfilingGroupName): UpdateProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(agentOrchestrationConfig = agentOrchestrationConfig.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfilingGroupRequest]
  }
  @scala.inline
  implicit class UpdateProfilingGroupRequestOps[Self <: UpdateProfilingGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentOrchestrationConfig(value: AgentOrchestrationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentOrchestrationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfilingGroupName(value: ProfilingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProfilingGroupRequest extends js.Object {
  /**
    * The agent orchestration configuration.
    */
  var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This parameter specifies a unique identifier for the new profiling group that helps ensure idempotency.
    */
  var clientToken: ClientToken = js.native
  /**
    * The name of the profiling group.
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object CreateProfilingGroupRequest {
  @scala.inline
  def apply(clientToken: ClientToken, profilingGroupName: ProfilingGroupName): CreateProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfilingGroupRequest]
  }
  @scala.inline
  implicit class CreateProfilingGroupRequestOps[Self <: CreateProfilingGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfilingGroupName(value: ProfilingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentOrchestrationConfig(value: AgentOrchestrationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentOrchestrationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentOrchestrationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentOrchestrationConfig")(js.undefined)
        ret
    }
  }
  
}


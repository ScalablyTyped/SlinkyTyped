package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilingGroupDescription extends js.Object {
  /**
    * 
    */
  var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) identifying the profiling group.
    */
  var arn: js.UndefOr[ProfilingGroupArn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the profiling group was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The name of the profiling group.
    */
  var name: js.UndefOr[ProfilingGroupName] = js.native
  /**
    * The status of the profiling group.
    */
  var profilingStatus: js.UndefOr[ProfilingStatus] = js.native
  /**
    * The time, in milliseconds since the epoch, when the profiling group was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.native
}

object ProfilingGroupDescription {
  @scala.inline
  def apply(): ProfilingGroupDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfilingGroupDescription]
  }
  @scala.inline
  implicit class ProfilingGroupDescriptionOps[Self <: ProfilingGroupDescription] (val x: Self) extends AnyVal {
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
    def withoutAgentOrchestrationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentOrchestrationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: ProfilingGroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ProfilingGroupName): Self = {
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
    @scala.inline
    def withProfilingStatus(value: ProfilingStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfilingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilingStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(js.undefined)
        ret
    }
  }
  
}


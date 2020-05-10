package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentPreview extends js.Object {
  /**
    * The health status of the Amazon Inspector Agent.
    */
  var agentHealth: js.UndefOr[AgentHealth] = js.native
  /**
    * The ID of the EC2 instance where the agent is installed.
    */
  var agentId: AgentId = js.native
  /**
    * The version of the Amazon Inspector Agent.
    */
  var agentVersion: js.UndefOr[AgentVersion] = js.native
  /**
    * The Auto Scaling group for the EC2 instance where the agent is installed.
    */
  var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.native
  /**
    * The hostname of the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var hostname: js.UndefOr[Hostname] = js.native
  /**
    * The IP address of the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var ipv4Address: js.UndefOr[Ipv4Address] = js.native
  /**
    * The kernel version of the operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var kernelVersion: js.UndefOr[KernelVersion] = js.native
  /**
    * The operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
    */
  var operatingSystem: js.UndefOr[OperatingSystem] = js.native
}

object AgentPreview {
  @scala.inline
  def apply(agentId: AgentId): AgentPreview = {
    val __obj = js.Dynamic.literal(agentId = agentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentPreview]
  }
  @scala.inline
  implicit class AgentPreviewOps[Self <: AgentPreview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentId(value: AgentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentHealth(value: AgentHealth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentHealth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentHealth")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentVersion(value: AgentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScalingGroup(value: AutoScalingGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: Hostname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv4Address(value: Ipv4Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv4Address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4Address")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelVersion(value: KernelVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystem(value: OperatingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(js.undefined)
        ret
    }
  }
  
}


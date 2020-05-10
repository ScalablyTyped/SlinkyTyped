package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAgentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent.
    */
  var AgentArn: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.AgentArn] = js.native
  /**
    * The time that the agent was activated (that is, created in your account).
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The type of endpoint that your agent is connected to. If the endpoint is a VPC endpoint, the agent is not accessible over the public Internet. 
    */
  var EndpointType: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.EndpointType] = js.native
  /**
    * The time that the agent last connected to DataSyc.
    */
  var LastConnectionTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the agent.
    */
  var Name: js.UndefOr[TagValue] = js.native
  /**
    * The subnet and the security group that DataSync used to access a VPC endpoint.
    */
  var PrivateLinkConfig: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.PrivateLinkConfig] = js.native
  /**
    * The status of the agent. If the status is ONLINE, then the agent is configured properly and is available to use. The Running status is the normal running status for an agent. If the status is OFFLINE, the agent's VM is turned off or the agent is in an unhealthy state. When the issue that caused the unhealthy state is resolved, the agent returns to ONLINE status.
    */
  var Status: js.UndefOr[AgentStatus] = js.native
}

object DescribeAgentResponse {
  @scala.inline
  def apply(): DescribeAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAgentResponse]
  }
  @scala.inline
  implicit class DescribeAgentResponseOps[Self <: DescribeAgentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentArn(value: AgentArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointType(value: EndpointType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointType")(js.undefined)
        ret
    }
    @scala.inline
    def withLastConnectionTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastConnectionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastConnectionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastConnectionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: TagValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateLinkConfig(value: PrivateLinkConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateLinkConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateLinkConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateLinkConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: AgentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}


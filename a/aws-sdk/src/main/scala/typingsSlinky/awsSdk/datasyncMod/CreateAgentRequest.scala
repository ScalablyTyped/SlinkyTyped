package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAgentRequest extends js.Object {
  /**
    * Your agent activation key. You can get the activation key either by sending an HTTP GET request with redirects that enable you to get the agent IP address (port 80). Alternatively, you can get it from the AWS DataSync console. The redirect URL returned in the response provides you the activation key for your agent in the query string parameter activationKey. It might also include other activation-related parameters; however, these are merely defaults. The arguments you pass to this API call determine the actual configuration of your agent. For more information, see Activating an Agent in the AWS DataSync User Guide. 
    */
  var ActivationKey: typingsSlinky.awsSdk.datasyncMod.ActivationKey = js.native
  /**
    * The name you configured for your agent. This value is a text reference that is used to identify the agent in the console.
    */
  var AgentName: js.UndefOr[TagValue] = js.native
  /**
    * The ARNs of the security groups used to protect your data transfer task subnets. See CreateAgentRequest$SubnetArns.
    */
  var SecurityGroupArns: js.UndefOr[PLSecurityGroupArnList] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the subnets in which DataSync will create elastic network interfaces for each data transfer task. The agent that runs a task must be private. When you start a task that is associated with an agent created in a VPC, or one that has access to an IP address in a VPC, then the task is also private. In this case, DataSync creates four network interfaces for each task in your subnet. For a data transfer to work, the agent must be able to route to all these four network interfaces.
    */
  var SubnetArns: js.UndefOr[PLSubnetArnList] = js.native
  /**
    * The key-value pair that represents the tag that you want to associate with the agent. The value can be an empty string. This value helps you manage, filter, and search for your agents.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @.  
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC (Virtual Private Cloud) endpoint that the agent has access to. This is the client-side VPC endpoint, also called a PrivateLink. If you don't have a PrivateLink VPC endpoint, see Creating a VPC Endpoint Service Configuration in the AWS VPC User Guide. VPC endpoint ID looks like this: vpce-01234d5aff67890e1.
    */
  var VpcEndpointId: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.VpcEndpointId] = js.native
}

object CreateAgentRequest {
  @scala.inline
  def apply(ActivationKey: ActivationKey): CreateAgentRequest = {
    val __obj = js.Dynamic.literal(ActivationKey = ActivationKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentRequest]
  }
  @scala.inline
  implicit class CreateAgentRequestOps[Self <: CreateAgentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationKey(value: ActivationKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivationKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentName(value: TagValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentName")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupArns(value: PLSecurityGroupArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupArns")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetArns(value: PLSubnetArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetArns")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcEndpointId(value: VpcEndpointId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointId")(js.undefined)
        ret
    }
  }
  
}


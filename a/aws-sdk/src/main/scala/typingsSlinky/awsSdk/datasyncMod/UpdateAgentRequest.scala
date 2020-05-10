package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAgentRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent to update.
    */
  var AgentArn: typingsSlinky.awsSdk.datasyncMod.AgentArn = js.native
  /**
    * The name that you want to use to configure the agent.
    */
  var Name: js.UndefOr[TagValue] = js.native
}

object UpdateAgentRequest {
  @scala.inline
  def apply(AgentArn: AgentArn): UpdateAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentRequest]
  }
  @scala.inline
  implicit class UpdateAgentRequestOps[Self <: UpdateAgentRequest] (val x: Self) extends AnyVal {
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
  }
  
}


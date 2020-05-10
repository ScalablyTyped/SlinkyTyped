package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAgentRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent to describe.
    */
  var AgentArn: typingsSlinky.awsSdk.datasyncMod.AgentArn = js.native
}

object DescribeAgentRequest {
  @scala.inline
  def apply(AgentArn: AgentArn): DescribeAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgentRequest]
  }
  @scala.inline
  implicit class DescribeAgentRequestOps[Self <: DescribeAgentRequest] (val x: Self) extends AnyVal {
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
  }
  
}


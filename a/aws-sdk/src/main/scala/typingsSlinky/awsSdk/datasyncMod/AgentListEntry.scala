package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentListEntry extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent.
    */
  var AgentArn: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.AgentArn] = js.native
  /**
    * The name of the agent.
    */
  var Name: js.UndefOr[TagValue] = js.native
  /**
    * The status of the agent.
    */
  var Status: js.UndefOr[AgentStatus] = js.native
}

object AgentListEntry {
  @scala.inline
  def apply(): AgentListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentListEntry]
  }
  @scala.inline
  implicit class AgentListEntryOps[Self <: AgentListEntry] (val x: Self) extends AnyVal {
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


package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentConfigurationStatus extends js.Object {
  /**
    * The agent/connector ID.
    */
  var agentId: js.UndefOr[String] = js.native
  /**
    * A description of the operation performed.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Information about the status of the StartDataCollection and StopDataCollection operations. The system has recorded the data collection operation. The agent/connector receives this command the next time it polls for a new command. 
    */
  var operationSucceeded: js.UndefOr[Boolean] = js.native
}

object AgentConfigurationStatus {
  @scala.inline
  def apply(): AgentConfigurationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentConfigurationStatus]
  }
  @scala.inline
  implicit class AgentConfigurationStatusOps[Self <: AgentConfigurationStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationSucceeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationSucceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationSucceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationSucceeded")(js.undefined)
        ret
    }
  }
  
}


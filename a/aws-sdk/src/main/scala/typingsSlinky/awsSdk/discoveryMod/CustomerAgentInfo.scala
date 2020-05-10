package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerAgentInfo extends js.Object {
  /**
    * Number of active discovery agents.
    */
  var activeAgents: Integer = js.native
  /**
    * Number of blacklisted discovery agents.
    */
  var blackListedAgents: Integer = js.native
  /**
    * Number of healthy discovery agents
    */
  var healthyAgents: Integer = js.native
  /**
    * Number of discovery agents with status SHUTDOWN.
    */
  var shutdownAgents: Integer = js.native
  /**
    * Total number of discovery agents.
    */
  var totalAgents: Integer = js.native
  /**
    * Number of unhealthy discovery agents.
    */
  var unhealthyAgents: Integer = js.native
  /**
    * Number of unknown discovery agents.
    */
  var unknownAgents: Integer = js.native
}

object CustomerAgentInfo {
  @scala.inline
  def apply(
    activeAgents: Integer,
    blackListedAgents: Integer,
    healthyAgents: Integer,
    shutdownAgents: Integer,
    totalAgents: Integer,
    unhealthyAgents: Integer,
    unknownAgents: Integer
  ): CustomerAgentInfo = {
    val __obj = js.Dynamic.literal(activeAgents = activeAgents.asInstanceOf[js.Any], blackListedAgents = blackListedAgents.asInstanceOf[js.Any], healthyAgents = healthyAgents.asInstanceOf[js.Any], shutdownAgents = shutdownAgents.asInstanceOf[js.Any], totalAgents = totalAgents.asInstanceOf[js.Any], unhealthyAgents = unhealthyAgents.asInstanceOf[js.Any], unknownAgents = unknownAgents.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerAgentInfo]
  }
  @scala.inline
  implicit class CustomerAgentInfoOps[Self <: CustomerAgentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveAgents(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAgents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlackListedAgents(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackListedAgents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthyAgents(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthyAgents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShutdownAgents(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownAgents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalAgents(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalAgents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnhealthyAgents(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhealthyAgents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknownAgents(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownAgents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiscoverySummaryResponse extends js.Object {
  /**
    * Details about discovered agents, including agent status and health.
    */
  var agentSummary: js.UndefOr[CustomerAgentInfo] = js.native
  /**
    * The number of applications discovered.
    */
  var applications: js.UndefOr[Long] = js.native
  /**
    * Details about discovered connectors, including connector status and health.
    */
  var connectorSummary: js.UndefOr[CustomerConnectorInfo] = js.native
  /**
    * The number of servers discovered.
    */
  var servers: js.UndefOr[Long] = js.native
  /**
    * The number of servers mapped to applications.
    */
  var serversMappedToApplications: js.UndefOr[Long] = js.native
  /**
    * The number of servers mapped to tags.
    */
  var serversMappedtoTags: js.UndefOr[Long] = js.native
}

object GetDiscoverySummaryResponse {
  @scala.inline
  def apply(): GetDiscoverySummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiscoverySummaryResponse]
  }
  @scala.inline
  implicit class GetDiscoverySummaryResponseOps[Self <: GetDiscoverySummaryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentSummary(value: CustomerAgentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withApplications(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applications")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorSummary(value: CustomerConnectorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withServers(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servers")(js.undefined)
        ret
    }
    @scala.inline
    def withServersMappedToApplications(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serversMappedToApplications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServersMappedToApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serversMappedToApplications")(js.undefined)
        ret
    }
    @scala.inline
    def withServersMappedtoTags(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serversMappedtoTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServersMappedtoTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serversMappedtoTags")(js.undefined)
        ret
    }
  }
  
}


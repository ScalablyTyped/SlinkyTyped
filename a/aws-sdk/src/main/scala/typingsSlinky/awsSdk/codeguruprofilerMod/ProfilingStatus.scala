package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilingStatus extends js.Object {
  /**
    * The time, in milliseconds since the epoch, when the latest agent was orchestrated.
    */
  var latestAgentOrchestratedAt: js.UndefOr[js.Date] = js.native
  /**
    * The time, in milliseconds since the epoch, when the latest agent was reported..
    */
  var latestAgentProfileReportedAt: js.UndefOr[js.Date] = js.native
  /**
    * The latest aggregated profile
    */
  var latestAggregatedProfile: js.UndefOr[AggregatedProfileTime] = js.native
}

object ProfilingStatus {
  @scala.inline
  def apply(): ProfilingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfilingStatus]
  }
  @scala.inline
  implicit class ProfilingStatusOps[Self <: ProfilingStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatestAgentOrchestratedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestAgentOrchestratedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestAgentOrchestratedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestAgentOrchestratedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestAgentProfileReportedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestAgentProfileReportedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestAgentProfileReportedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestAgentProfileReportedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestAggregatedProfile(value: AggregatedProfileTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestAggregatedProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestAggregatedProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestAggregatedProfile")(js.undefined)
        ret
    }
  }
  
}


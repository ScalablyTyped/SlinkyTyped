package typingsSlinky.postmark.statsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutboundStatistics extends js.Object {
  var BounceRate: Double = js.native
  var Bounced: Double = js.native
  var Opens: Double = js.native
  var SMTPApiErrors: Double = js.native
  var Sent: Double = js.native
  var SpamComplaints: Double = js.native
  var SpamComplaintsRate: Double = js.native
  var TotalClicks: Double = js.native
  var TotalTrackedLinksSent: Double = js.native
  var Tracked: Double = js.native
  var UniqueLinksClicked: Double = js.native
  var UniqueOpens: Double = js.native
  var WithClientRecorded: Double = js.native
  var WithLinkTracking: Double = js.native
  var WithOpenTracking: Double = js.native
  var WithPlatformRecorded: Double = js.native
  var WithReadTimeRecorded: Double = js.native
}

object OutboundStatistics {
  @scala.inline
  def apply(
    BounceRate: Double,
    Bounced: Double,
    Opens: Double,
    SMTPApiErrors: Double,
    Sent: Double,
    SpamComplaints: Double,
    SpamComplaintsRate: Double,
    TotalClicks: Double,
    TotalTrackedLinksSent: Double,
    Tracked: Double,
    UniqueLinksClicked: Double,
    UniqueOpens: Double,
    WithClientRecorded: Double,
    WithLinkTracking: Double,
    WithOpenTracking: Double,
    WithPlatformRecorded: Double,
    WithReadTimeRecorded: Double
  ): OutboundStatistics = {
    val __obj = js.Dynamic.literal(BounceRate = BounceRate.asInstanceOf[js.Any], Bounced = Bounced.asInstanceOf[js.Any], Opens = Opens.asInstanceOf[js.Any], SMTPApiErrors = SMTPApiErrors.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any], SpamComplaints = SpamComplaints.asInstanceOf[js.Any], SpamComplaintsRate = SpamComplaintsRate.asInstanceOf[js.Any], TotalClicks = TotalClicks.asInstanceOf[js.Any], TotalTrackedLinksSent = TotalTrackedLinksSent.asInstanceOf[js.Any], Tracked = Tracked.asInstanceOf[js.Any], UniqueLinksClicked = UniqueLinksClicked.asInstanceOf[js.Any], UniqueOpens = UniqueOpens.asInstanceOf[js.Any], WithClientRecorded = WithClientRecorded.asInstanceOf[js.Any], WithLinkTracking = WithLinkTracking.asInstanceOf[js.Any], WithOpenTracking = WithOpenTracking.asInstanceOf[js.Any], WithPlatformRecorded = WithPlatformRecorded.asInstanceOf[js.Any], WithReadTimeRecorded = WithReadTimeRecorded.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundStatistics]
  }
  @scala.inline
  implicit class OutboundStatisticsOps[Self <: OutboundStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounceRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BounceRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounced(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpens(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Opens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSMTPApiErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMTPApiErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpamComplaints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpamComplaints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpamComplaintsRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpamComplaintsRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalClicks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalClicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTrackedLinksSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalTrackedLinksSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tracked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueLinksClicked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueLinksClicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueOpens(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueOpens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithClientRecorded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WithClientRecorded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithLinkTracking(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WithLinkTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithOpenTracking(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WithOpenTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithPlatformRecorded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WithPlatformRecorded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithReadTimeRecorded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WithReadTimeRecorded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


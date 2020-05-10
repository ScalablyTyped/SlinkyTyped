package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SponsorSnippet extends js.Object {
  var channelId: js.UndefOr[String] = js.native
  var cumulativeDurationMonths: js.UndefOr[Double] = js.native
  var sponsorDetails: js.UndefOr[ChannelProfileDetails] = js.native
  var sponsorSince: js.UndefOr[String] = js.native
}

object SponsorSnippet {
  @scala.inline
  def apply(): SponsorSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SponsorSnippet]
  }
  @scala.inline
  implicit class SponsorSnippetOps[Self <: SponsorSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(js.undefined)
        ret
    }
    @scala.inline
    def withCumulativeDurationMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulativeDurationMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCumulativeDurationMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulativeDurationMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withSponsorDetails(value: ChannelProfileDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sponsorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSponsorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sponsorDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withSponsorSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sponsorSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSponsorSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sponsorSince")(js.undefined)
        ret
    }
  }
  
}


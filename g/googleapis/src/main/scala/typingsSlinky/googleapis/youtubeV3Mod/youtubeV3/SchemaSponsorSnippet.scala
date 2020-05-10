package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSponsorSnippet extends js.Object {
  /**
    * The id of the channel being sponsored.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The cumulative time a user has been a sponsor in months.
    */
  var cumulativeDurationMonths: js.UndefOr[Double] = js.native
  /**
    * Details about the sponsor.
    */
  var sponsorDetails: js.UndefOr[SchemaChannelProfileDetails] = js.native
  /**
    * The date and time when the user became a sponsor. The value is specified
    * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var sponsorSince: js.UndefOr[String] = js.native
}

object SchemaSponsorSnippet {
  @scala.inline
  def apply(): SchemaSponsorSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSponsorSnippet]
  }
  @scala.inline
  implicit class SchemaSponsorSnippetOps[Self <: SchemaSponsorSnippet] (val x: Self) extends AnyVal {
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
    def withSponsorDetails(value: SchemaChannelProfileDetails): Self = {
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


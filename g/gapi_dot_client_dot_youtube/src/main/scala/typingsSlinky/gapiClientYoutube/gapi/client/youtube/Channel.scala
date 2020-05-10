package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  /** The auditionDetails object encapsulates channel data that is relevant for YouTube Partners during the audition process. */
  var auditDetails: js.UndefOr[ChannelAuditDetails] = js.native
  /** The brandingSettings object encapsulates information about the branding of the channel. */
  var brandingSettings: js.UndefOr[ChannelBrandingSettings] = js.native
  /** The contentDetails object encapsulates information about the channel's content. */
  var contentDetails: js.UndefOr[ChannelContentDetails] = js.native
  /** The contentOwnerDetails object encapsulates channel data that is relevant for YouTube Partners linked with the channel. */
  var contentOwnerDetails: js.UndefOr[ChannelContentOwnerDetails] = js.native
  /** The conversionPings object encapsulates information about conversion pings that need to be respected by the channel. */
  var conversionPings: js.UndefOr[ChannelConversionPings] = js.native
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  /** The ID that YouTube uses to uniquely identify the channel. */
  var id: js.UndefOr[String] = js.native
  /** The invideoPromotion object encapsulates information about promotion campaign associated with the channel. */
  var invideoPromotion: js.UndefOr[InvideoPromotion] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#channel". */
  var kind: js.UndefOr[String] = js.native
  /** Localizations for different languages */
  var localizations: js.UndefOr[Record[String, ChannelLocalization]] = js.native
  /** The snippet object contains basic details about the channel, such as its title, description, and thumbnail images. */
  var snippet: js.UndefOr[ChannelSnippet] = js.native
  /** The statistics object encapsulates statistics for the channel. */
  var statistics: js.UndefOr[ChannelStatistics] = js.native
  /** The status object encapsulates information about the privacy status of the channel. */
  var status: js.UndefOr[ChannelStatus] = js.native
  /** The topicDetails object encapsulates information about Freebase topics associated with the channel. */
  var topicDetails: js.UndefOr[ChannelTopicDetails] = js.native
}

object Channel {
  @scala.inline
  def apply(): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditDetails(value: ChannelAuditDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withBrandingSettings(value: ChannelBrandingSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrandingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brandingSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDetails(value: ChannelContentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withContentOwnerDetails(value: ChannelContentOwnerDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOwnerDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentOwnerDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOwnerDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withConversionPings(value: ChannelConversionPings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionPings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionPings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionPings")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInvideoPromotion(value: InvideoPromotion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invideoPromotion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvideoPromotion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invideoPromotion")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalizations(value: Record[String, ChannelLocalization]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizations")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippet(value: ChannelSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippet")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistics(value: ChannelStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ChannelStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicDetails(value: ChannelTopicDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicDetails")(js.undefined)
        ret
    }
  }
  
}


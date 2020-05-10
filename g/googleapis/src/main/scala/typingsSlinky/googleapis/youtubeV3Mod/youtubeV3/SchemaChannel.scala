package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A channel resource contains information about a YouTube channel.
  */
@js.native
trait SchemaChannel extends js.Object {
  /**
    * The auditionDetails object encapsulates channel data that is relevant for
    * YouTube Partners during the audition process.
    */
  var auditDetails: js.UndefOr[SchemaChannelAuditDetails] = js.native
  /**
    * The brandingSettings object encapsulates information about the branding
    * of the channel.
    */
  var brandingSettings: js.UndefOr[SchemaChannelBrandingSettings] = js.native
  /**
    * The contentDetails object encapsulates information about the
    * channel&#39;s content.
    */
  var contentDetails: js.UndefOr[SchemaChannelContentDetails] = js.native
  /**
    * The contentOwnerDetails object encapsulates channel data that is relevant
    * for YouTube Partners linked with the channel.
    */
  var contentOwnerDetails: js.UndefOr[SchemaChannelContentOwnerDetails] = js.native
  /**
    * The conversionPings object encapsulates information about conversion
    * pings that need to be respected by the channel.
    */
  var conversionPings: js.UndefOr[SchemaChannelConversionPings] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the channel.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The invideoPromotion object encapsulates information about promotion
    * campaign associated with the channel.
    */
  var invideoPromotion: js.UndefOr[SchemaInvideoPromotion] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#channel&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Localizations for different languages
    */
  var localizations: js.UndefOr[StringDictionary[SchemaChannelLocalization]] = js.native
  /**
    * The snippet object contains basic details about the channel, such as its
    * title, description, and thumbnail images.
    */
  var snippet: js.UndefOr[SchemaChannelSnippet] = js.native
  /**
    * The statistics object encapsulates statistics for the channel.
    */
  var statistics: js.UndefOr[SchemaChannelStatistics] = js.native
  /**
    * The status object encapsulates information about the privacy status of
    * the channel.
    */
  var status: js.UndefOr[SchemaChannelStatus] = js.native
  /**
    * The topicDetails object encapsulates information about Freebase topics
    * associated with the channel.
    */
  var topicDetails: js.UndefOr[SchemaChannelTopicDetails] = js.native
}

object SchemaChannel {
  @scala.inline
  def apply(): SchemaChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannel]
  }
  @scala.inline
  implicit class SchemaChannelOps[Self <: SchemaChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditDetails(value: SchemaChannelAuditDetails): Self = {
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
    def withBrandingSettings(value: SchemaChannelBrandingSettings): Self = {
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
    def withContentDetails(value: SchemaChannelContentDetails): Self = {
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
    def withContentOwnerDetails(value: SchemaChannelContentOwnerDetails): Self = {
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
    def withConversionPings(value: SchemaChannelConversionPings): Self = {
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
    def withInvideoPromotion(value: SchemaInvideoPromotion): Self = {
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
    def withLocalizations(value: StringDictionary[SchemaChannelLocalization]): Self = {
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
    def withSnippet(value: SchemaChannelSnippet): Self = {
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
    def withStatistics(value: SchemaChannelStatistics): Self = {
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
    def withStatus(value: SchemaChannelStatus): Self = {
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
    def withTopicDetails(value: SchemaChannelTopicDetails): Self = {
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


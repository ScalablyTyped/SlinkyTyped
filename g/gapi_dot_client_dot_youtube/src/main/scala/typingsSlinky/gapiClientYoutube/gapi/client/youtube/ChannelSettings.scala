package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSettings extends js.Object {
  /** The country of the channel. */
  var country: js.UndefOr[String] = js.native
  var defaultLanguage: js.UndefOr[String] = js.native
  /** Which content tab users should see when viewing the channel. */
  var defaultTab: js.UndefOr[String] = js.native
  /** Specifies the channel description. */
  var description: js.UndefOr[String] = js.native
  /** Title for the featured channels tab. */
  var featuredChannelsTitle: js.UndefOr[String] = js.native
  /** The list of featured channels. */
  var featuredChannelsUrls: js.UndefOr[js.Array[String]] = js.native
  /** Lists keywords associated with the channel, comma-separated. */
  var keywords: js.UndefOr[String] = js.native
  /** Whether user-submitted comments left on the channel page need to be approved by the channel owner to be publicly visible. */
  var moderateComments: js.UndefOr[Boolean] = js.native
  /** A prominent color that can be rendered on this channel page. */
  var profileColor: js.UndefOr[String] = js.native
  /** Whether the tab to browse the videos should be displayed. */
  var showBrowseView: js.UndefOr[Boolean] = js.native
  /** Whether related channels should be proposed. */
  var showRelatedChannels: js.UndefOr[Boolean] = js.native
  /** Specifies the channel title. */
  var title: js.UndefOr[String] = js.native
  /** The ID for a Google Analytics account to track and measure traffic to the channels. */
  var trackingAnalyticsAccountId: js.UndefOr[String] = js.native
  /** The trailer of the channel, for users that are not subscribers. */
  var unsubscribedTrailer: js.UndefOr[String] = js.native
}

object ChannelSettings {
  @scala.inline
  def apply(): ChannelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSettings]
  }
  @scala.inline
  implicit class ChannelSettingsOps[Self <: ChannelSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTab(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTab")(js.undefined)
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
    def withFeaturedChannelsTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredChannelsTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturedChannelsTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredChannelsTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withFeaturedChannelsUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredChannelsUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturedChannelsUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuredChannelsUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withModerateComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderateComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModerateComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderateComments")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBrowseView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBrowseView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBrowseView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBrowseView")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRelatedChannels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRelatedChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRelatedChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRelatedChannels")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingAnalyticsAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingAnalyticsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingAnalyticsAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingAnalyticsAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsubscribedTrailer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribedTrailer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsubscribedTrailer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribedTrailer")(js.undefined)
        ret
    }
  }
  
}


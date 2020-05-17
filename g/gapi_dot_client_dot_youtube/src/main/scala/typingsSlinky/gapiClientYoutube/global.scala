package typingsSlinky.gapiClientYoutube

import typingsSlinky.gapiClientYoutube.gapi.client.youtube.ActivitiesResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.CaptionsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.ChannelBannersResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.ChannelSectionsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.ChannelsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.CommentThreadsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.CommentsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.FanFundingEventsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.GuideCategoriesResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.I18nLanguagesResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.I18nRegionsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.LiveBroadcastsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.LiveChatBansResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.LiveChatMessagesResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.LiveChatModeratorsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.LiveStreamsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.PlaylistItemsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.PlaylistsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.SearchResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.SponsorsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.SubscriptionsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.SuperChatEventsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.ThumbnailsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.VideoAbuseReportReasonsResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.VideoCategoriesResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.VideosResource
import typingsSlinky.gapiClientYoutube.gapi.client.youtube.WatermarksResource
import typingsSlinky.gapiClientYoutube.gapiClientYoutubeStrings.v3
import typingsSlinky.gapiClientYoutube.gapiClientYoutubeStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val activities: ActivitiesResource = js.native
      val captions: CaptionsResource = js.native
      val channelBanners: ChannelBannersResource = js.native
      val channelSections: ChannelSectionsResource = js.native
      val channels: ChannelsResource = js.native
      val commentThreads: CommentThreadsResource = js.native
      val comments: CommentsResource = js.native
      val fanFundingEvents: FanFundingEventsResource = js.native
      val guideCategories: GuideCategoriesResource = js.native
      val i18nLanguages: I18nLanguagesResource = js.native
      val i18nRegions: I18nRegionsResource = js.native
      val liveBroadcasts: LiveBroadcastsResource = js.native
      val liveChatBans: LiveChatBansResource = js.native
      val liveChatMessages: LiveChatMessagesResource = js.native
      val liveChatModerators: LiveChatModeratorsResource = js.native
      val liveStreams: LiveStreamsResource = js.native
      val playlistItems: PlaylistItemsResource = js.native
      val playlists: PlaylistsResource = js.native
      val search: SearchResource = js.native
      val sponsors: SponsorsResource = js.native
      val subscriptions: SubscriptionsResource = js.native
      val superChatEvents: SuperChatEventsResource = js.native
      val thumbnails: ThumbnailsResource = js.native
      val videoAbuseReportReasons: VideoAbuseReportReasonsResource = js.native
      val videoCategories: VideoCategoriesResource = js.native
      val videos: VideosResource = js.native
      val watermarks: WatermarksResource = js.native
      /** Load YouTube Data API v3 */
      def load(name: youtube, version: v3): js.Thenable[Unit] = js.native
      def load(name: youtube, version: v3, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}


package typingsSlinky.maximMazurokGapiClientYoutube

import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.AbuseReportsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.ActivitiesResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.CaptionsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.ChannelBannersResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.ChannelSectionsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.ChannelsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.CommentThreadsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.CommentsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.I18nLanguagesResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.I18nRegionsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.LiveBroadcastsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.LiveChatBansResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.LiveChatMessagesResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.LiveChatModeratorsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.LiveStreamsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.MembersResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.MembershipsLevelsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.PlaylistItemsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.PlaylistsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.SearchResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.SponsorsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.SubscriptionsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.SuperChatEventsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.TestsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.ThirdPartyLinksResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.ThumbnailsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.VideoAbuseReportReasonsResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.VideoCategoriesResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.VideosResource
import typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube.WatermarksResource
import typingsSlinky.maximMazurokGapiClientYoutube.maximMazurokGapiClientYoutubeStrings.v3
import typingsSlinky.maximMazurokGapiClientYoutube.maximMazurokGapiClientYoutubeStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load YouTube Data API v3 v3 */
      def load(name: youtube, version: v3): js.Thenable[Unit] = js.native
      def load(name: youtube, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object youtube extends js.Object {
        
        val abuseReports: AbuseReportsResource = js.native
        
        val activities: ActivitiesResource = js.native
        
        val captions: CaptionsResource = js.native
        
        val channelBanners: ChannelBannersResource = js.native
        
        val channelSections: ChannelSectionsResource = js.native
        
        val channels: ChannelsResource = js.native
        
        val commentThreads: CommentThreadsResource = js.native
        
        val comments: CommentsResource = js.native
        
        val i18nLanguages: I18nLanguagesResource = js.native
        
        val i18nRegions: I18nRegionsResource = js.native
        
        val liveBroadcasts: LiveBroadcastsResource = js.native
        
        val liveChatBans: LiveChatBansResource = js.native
        
        val liveChatMessages: LiveChatMessagesResource = js.native
        
        val liveChatModerators: LiveChatModeratorsResource = js.native
        
        val liveStreams: LiveStreamsResource = js.native
        
        val members: MembersResource = js.native
        
        val membershipsLevels: MembershipsLevelsResource = js.native
        
        val playlistItems: PlaylistItemsResource = js.native
        
        val playlists: PlaylistsResource = js.native
        
        val search: SearchResource = js.native
        
        val sponsors: SponsorsResource = js.native
        
        val subscriptions: SubscriptionsResource = js.native
        
        val superChatEvents: SuperChatEventsResource = js.native
        
        val tests: TestsResource = js.native
        
        val thirdPartyLinks: ThirdPartyLinksResource = js.native
        
        val thumbnails: ThumbnailsResource = js.native
        
        val videoAbuseReportReasons: VideoAbuseReportReasonsResource = js.native
        
        val videoCategories: VideoCategoriesResource = js.native
        
        val videos: VideosResource = js.native
        
        val watermarks: WatermarksResource = js.native
      }
    }
  }
}

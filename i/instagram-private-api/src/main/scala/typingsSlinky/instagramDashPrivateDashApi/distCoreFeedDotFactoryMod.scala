package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreClientMod.IgApiClient
import typingsSlinky.instagramDashPrivateDashApi.distFeedsListDashReelDashMediaDashViewerDotFeedMod.ListReelMediaViewerFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMediaDotInlineDashChildDashCommentsDotFeedMod.MediaInlineChildCommentsFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.AccountFollowersFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.AccountFollowingFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.BlockedUsersFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.DirectInboxFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.DirectPendingInboxFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.DirectThreadFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.DiscoverFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.LocationFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.MediaCommentsFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.MusicGenreFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.MusicMoodFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.MusicSearchFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.MusicTrendingFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.NewsFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.PendingFriendshipsFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.PostsInsightsFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.ReelsMediaFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.ReelsTrayFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.SavedFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.StoriesInsightsFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.TagFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.TagsFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.TimelineFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.UserFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsMod.UsertagsFeed
import typingsSlinky.instagramDashPrivateDashApi.distFeedsUserDashStoryDotFeedMod.UserStoryFeed
import typingsSlinky.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgAppModule
import typingsSlinky.instagramDashPrivateDashApi.distTypesInsightsDotOptionsMod.PostsInsightsFeedOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesTimelineDashFeedDotTypesMod.TimelineFeedReason
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ONE_DAY
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ONE_WEEK
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.TWO_WEEKS
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.cold_start
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.places
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.pull_to_refresh
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ranked
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.recent
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/feed.factory", JSImport.Namespace)
@js.native
object distCoreFeedDotFactoryMod extends js.Object {
  @js.native
  class FeedFactory protected () extends js.Object {
    def this(client: IgApiClient) = this()
    var client: js.Any = js.native
    def accountFollowers(): AccountFollowersFeed = js.native
    def accountFollowers(id: String): AccountFollowersFeed = js.native
    def accountFollowers(id: Double): AccountFollowersFeed = js.native
    def accountFollowing(): AccountFollowingFeed = js.native
    def accountFollowing(id: String): AccountFollowingFeed = js.native
    def accountFollowing(id: Double): AccountFollowingFeed = js.native
    def blockedUsers(): BlockedUsersFeed = js.native
    def directInbox(): DirectInboxFeed = js.native
    def directPending(): DirectPendingInboxFeed = js.native
    def directThread(options: PickDirectInboxFeedResponseThreadsItemthreadidolde): DirectThreadFeed = js.native
    def directThread(options: PickDirectInboxFeedResponseThreadsItemthreadidolde, seqId: Double): DirectThreadFeed = js.native
    def discover(): DiscoverFeed = js.native
    def listReelMediaViewers(mediaId: String): ListReelMediaViewerFeed = js.native
    def location(id: String): LocationFeed = js.native
    def location(id: Double): LocationFeed = js.native
    @JSName("location")
    def location_ranked(id: String, tab: ranked): LocationFeed = js.native
    @JSName("location")
    def location_ranked(id: Double, tab: ranked): LocationFeed = js.native
    @JSName("location")
    def location_recent(id: String, tab: recent): LocationFeed = js.native
    @JSName("location")
    def location_recent(id: Double, tab: recent): LocationFeed = js.native
    def mediaComments(id: String): MediaCommentsFeed = js.native
    def mediaInlineChildComments(mediaId: String, commentId: String): MediaInlineChildCommentsFeed = js.native
    def mediaInlineChildComments(mediaId: String, commentId: String, minId: String): MediaInlineChildCommentsFeed = js.native
    def musicGenre(id: String): MusicGenreFeed = js.native
    def musicGenre(id: String, product: IgAppModule): MusicGenreFeed = js.native
    def musicGenre(id: Double): MusicGenreFeed = js.native
    def musicGenre(id: Double, product: IgAppModule): MusicGenreFeed = js.native
    def musicMood(id: String): MusicMoodFeed = js.native
    def musicMood(id: String, product: IgAppModule): MusicMoodFeed = js.native
    def musicMood(id: Double): MusicMoodFeed = js.native
    def musicMood(id: Double, product: IgAppModule): MusicMoodFeed = js.native
    def musicSearch(query: String): MusicSearchFeed = js.native
    def musicSearch(query: String, product: IgAppModule): MusicSearchFeed = js.native
    def musicTrending(): MusicTrendingFeed = js.native
    def musicTrending(product: IgAppModule): MusicTrendingFeed = js.native
    def news(): NewsFeed = js.native
    def pendingFriendships(): PendingFriendshipsFeed = js.native
    def postsInsightsFeed(options: PostsInsightsFeedOptions): PostsInsightsFeed = js.native
    def reelsMedia(options: Anon_Source): ReelsMediaFeed = js.native
    def reelsTray(): ReelsTrayFeed = js.native
    @JSName("reelsTray")
    def reelsTray_coldstart(reason: cold_start): ReelsTrayFeed = js.native
    @JSName("reelsTray")
    def reelsTray_pulltorefresh(reason: pull_to_refresh): ReelsTrayFeed = js.native
    def saved(): SavedFeed = js.native
    @JSName("storiesInsights")
    def storiesInsights_ONEDAY(timeframe: ONE_DAY): StoriesInsightsFeed = js.native
    @JSName("storiesInsights")
    def storiesInsights_ONEWEEK(timeframe: ONE_WEEK): StoriesInsightsFeed = js.native
    @JSName("storiesInsights")
    def storiesInsights_TWOWEEKS(timeframe: TWO_WEEKS): StoriesInsightsFeed = js.native
    def tag(tag: String): TagFeed = js.native
    def tags(tag: String): TagsFeed = js.native
    @JSName("tags")
    def tags_places(tag: String, tab: places): TagsFeed = js.native
    @JSName("tags")
    def tags_recent(tag: String, tab: recent): TagsFeed = js.native
    @JSName("tags")
    def tags_top(tag: String, tab: top): TagsFeed = js.native
    def timeline(): TimelineFeed = js.native
    def timeline(reason: TimelineFeedReason): TimelineFeed = js.native
    def user(id: String): UserFeed = js.native
    def user(id: Double): UserFeed = js.native
    def userStory(userId: String): UserStoryFeed = js.native
    def userStory(userId: Double): UserStoryFeed = js.native
    def usertags(id: String): UsertagsFeed = js.native
    def usertags(id: Double): UsertagsFeed = js.native
  }
  
}


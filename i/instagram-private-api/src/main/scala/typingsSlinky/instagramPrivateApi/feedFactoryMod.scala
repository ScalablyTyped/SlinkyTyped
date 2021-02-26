package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.PartialPickAccountFollowe
import typingsSlinky.instagramPrivateApi.anon.PartialPickAccountFollowi
import typingsSlinky.instagramPrivateApi.anon.PartialPickTopicalExplore
import typingsSlinky.instagramPrivateApi.anon.PickDirectInboxFeedRespon
import typingsSlinky.instagramPrivateApi.anon.Source
import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.commonTypesMod.IgAppModule
import typingsSlinky.instagramPrivateApi.feedsMod.AccountFollowersFeed
import typingsSlinky.instagramPrivateApi.feedsMod.AccountFollowingFeed
import typingsSlinky.instagramPrivateApi.feedsMod.BestiesFeed
import typingsSlinky.instagramPrivateApi.feedsMod.BlockedUsersFeed
import typingsSlinky.instagramPrivateApi.feedsMod.DirectInboxFeed
import typingsSlinky.instagramPrivateApi.feedsMod.DirectPendingInboxFeed
import typingsSlinky.instagramPrivateApi.feedsMod.DirectThreadFeed
import typingsSlinky.instagramPrivateApi.feedsMod.DiscoverFeed
import typingsSlinky.instagramPrivateApi.feedsMod.IgtvBrowseFeed
import typingsSlinky.instagramPrivateApi.feedsMod.IgtvChannelFeed
import typingsSlinky.instagramPrivateApi.feedsMod.LikedFeed
import typingsSlinky.instagramPrivateApi.feedsMod.LocationFeed
import typingsSlinky.instagramPrivateApi.feedsMod.MediaCommentsFeed
import typingsSlinky.instagramPrivateApi.feedsMod.MusicGenreFeed
import typingsSlinky.instagramPrivateApi.feedsMod.MusicMoodFeed
import typingsSlinky.instagramPrivateApi.feedsMod.MusicSearchFeed
import typingsSlinky.instagramPrivateApi.feedsMod.MusicTrendingFeed
import typingsSlinky.instagramPrivateApi.feedsMod.NewsFeed
import typingsSlinky.instagramPrivateApi.feedsMod.PendingFriendshipsFeed
import typingsSlinky.instagramPrivateApi.feedsMod.PostsInsightsFeed
import typingsSlinky.instagramPrivateApi.feedsMod.ReelsMediaFeed
import typingsSlinky.instagramPrivateApi.feedsMod.ReelsTrayFeed
import typingsSlinky.instagramPrivateApi.feedsMod.SavedFeed
import typingsSlinky.instagramPrivateApi.feedsMod.StoriesInsightsFeed
import typingsSlinky.instagramPrivateApi.feedsMod.TagFeed
import typingsSlinky.instagramPrivateApi.feedsMod.TagsFeed
import typingsSlinky.instagramPrivateApi.feedsMod.TimelineFeed
import typingsSlinky.instagramPrivateApi.feedsMod.TopicalExploreFeed
import typingsSlinky.instagramPrivateApi.feedsMod.UserFeed
import typingsSlinky.instagramPrivateApi.feedsMod.UsertagsFeed
import typingsSlinky.instagramPrivateApi.insightsOptionsMod.PostsInsightsFeedOptions
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ONE_DAY
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ONE_WEEK
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.TWO_WEEKS
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.cold_start
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.places
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ranked
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.recent
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.top
import typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedMod.ListReelMediaViewerFeed
import typingsSlinky.instagramPrivateApi.mediaInlineChildCommentsFeedMod.MediaInlineChildCommentsFeed
import typingsSlinky.instagramPrivateApi.mediaStickerResponsesFeedMod.MediaStickerResponsesFeed
import typingsSlinky.instagramPrivateApi.storyPollVotersFeedResponseMod.StoryPollVotersFeedResponseRootObject
import typingsSlinky.instagramPrivateApi.storyPollVotersFeedResponseMod.StoryPollVotersFeedResponseVotersItem
import typingsSlinky.instagramPrivateApi.storyQuestionResponsesFeedResponseMod.StoryQuestionResponsesFeedResponseRespondersItem
import typingsSlinky.instagramPrivateApi.storyQuestionResponsesFeedResponseMod.StoryQuestionResponsesFeedResponseRootObject
import typingsSlinky.instagramPrivateApi.storyQuizParticipantsFeedResponseMod.StoryQuizParticipantsFeedResponseParticipantsItem
import typingsSlinky.instagramPrivateApi.storyQuizParticipantsFeedResponseMod.StoryQuizParticipantsFeedResponseRootObject
import typingsSlinky.instagramPrivateApi.storySliderVotersFeedResponseResponseMod.StorySliderVotersFeedResponseResponseRootObject
import typingsSlinky.instagramPrivateApi.storySliderVotersFeedResponseResponseMod.StorySliderVotersFeedResponseResponseVotersItem
import typingsSlinky.instagramPrivateApi.timelineFeedTypesMod.TimelineFeedReason
import typingsSlinky.instagramPrivateApi.userStoryFeedMod.UserStoryFeed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedFactoryMod {
  
  @JSImport("instagram-private-api/dist/core/feed.factory", "FeedFactory")
  @js.native
  class FeedFactory protected () extends StObject {
    def this(client: IgApiClient) = this()
    
    def accountFollowers(): AccountFollowersFeed = js.native
    def accountFollowers(options: String): AccountFollowersFeed = js.native
    def accountFollowers(options: Double): AccountFollowersFeed = js.native
    def accountFollowers(options: PartialPickAccountFollowe): AccountFollowersFeed = js.native
    
    def accountFollowing(): AccountFollowingFeed = js.native
    def accountFollowing(options: String): AccountFollowingFeed = js.native
    def accountFollowing(options: Double): AccountFollowingFeed = js.native
    def accountFollowing(options: PartialPickAccountFollowi): AccountFollowingFeed = js.native
    
    def bestFriendships(): BestiesFeed = js.native
    
    def blockedUsers(): BlockedUsersFeed = js.native
    
    var client: js.Any = js.native
    
    def directInbox(): DirectInboxFeed = js.native
    
    def directPending(): DirectPendingInboxFeed = js.native
    
    def directThread(options: PickDirectInboxFeedRespon): DirectThreadFeed = js.native
    def directThread(options: PickDirectInboxFeedRespon, seqId: Double): DirectThreadFeed = js.native
    
    def discover(): DiscoverFeed = js.native
    
    def igtvBrowse(): IgtvBrowseFeed = js.native
    def igtvBrowse(isPrefetch: Boolean): IgtvBrowseFeed = js.native
    
    def igtvChaining(id: String): IgtvChannelFeed = js.native
    def igtvChaining(id: Double): IgtvChannelFeed = js.native
    
    def igtvChannel(id: String): IgtvChannelFeed = js.native
    def igtvChannel(id: Double): IgtvChannelFeed = js.native
    
    def liked(): LikedFeed = js.native
    
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
    
    def reelsMedia(options: Source): ReelsMediaFeed = js.native
    
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
    
    def storyPollVoters(mediaId: String, stickerId: String): MediaStickerResponsesFeed[StoryPollVotersFeedResponseRootObject, StoryPollVotersFeedResponseVotersItem] = js.native
    def storyPollVoters(mediaId: String, stickerId: Double): MediaStickerResponsesFeed[StoryPollVotersFeedResponseRootObject, StoryPollVotersFeedResponseVotersItem] = js.native
    
    def storyQuestionResponses(mediaId: String, stickerId: String): MediaStickerResponsesFeed[
        StoryQuestionResponsesFeedResponseRootObject, 
        StoryQuestionResponsesFeedResponseRespondersItem
      ] = js.native
    def storyQuestionResponses(mediaId: String, stickerId: Double): MediaStickerResponsesFeed[
        StoryQuestionResponsesFeedResponseRootObject, 
        StoryQuestionResponsesFeedResponseRespondersItem
      ] = js.native
    
    def storyQuizParticipants(mediaId: String, stickerId: String): MediaStickerResponsesFeed[
        StoryQuizParticipantsFeedResponseRootObject, 
        StoryQuizParticipantsFeedResponseParticipantsItem
      ] = js.native
    def storyQuizParticipants(mediaId: String, stickerId: Double): MediaStickerResponsesFeed[
        StoryQuizParticipantsFeedResponseRootObject, 
        StoryQuizParticipantsFeedResponseParticipantsItem
      ] = js.native
    
    def storySliderVoters(mediaId: String, stickerId: String): MediaStickerResponsesFeed[
        StorySliderVotersFeedResponseResponseRootObject, 
        StorySliderVotersFeedResponseResponseVotersItem
      ] = js.native
    def storySliderVoters(mediaId: String, stickerId: Double): MediaStickerResponsesFeed[
        StorySliderVotersFeedResponseResponseRootObject, 
        StorySliderVotersFeedResponseResponseVotersItem
      ] = js.native
    
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
    
    def topicalExplore(): TopicalExploreFeed = js.native
    def topicalExplore(options: PartialPickTopicalExplore): TopicalExploreFeed = js.native
    
    def user(id: String): UserFeed = js.native
    def user(id: Double): UserFeed = js.native
    
    def userStory(userId: String): UserStoryFeed = js.native
    def userStory(userId: Double): UserStoryFeed = js.native
    
    def usertags(id: String): UsertagsFeed = js.native
    def usertags(id: Double): UsertagsFeed = js.native
  }
}

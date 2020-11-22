package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.BroadcastId_
import typingsSlinky.instagramPrivateApi.anon.CoverUploadId
import typingsSlinky.instagramPrivateApi.anon.LastFetchTs
import typingsSlinky.instagramPrivateApi.anon.Message
import typingsSlinky.instagramPrivateApi.liveAddPostLiveToIgtvResponseMod.LiveAddPostLiveToIgtvResponseRootObject
import typingsSlinky.instagramPrivateApi.liveAddToPostResponseMod.LiveAddToPostResponse
import typingsSlinky.instagramPrivateApi.liveCommentsResponseMod.LiveCommentsResponseRootObject
import typingsSlinky.instagramPrivateApi.liveCreateBroadcastResponseMod.LiveCreateBroadcastResponseRootObject
import typingsSlinky.instagramPrivateApi.liveFinalViewersResponseMod.LiveFinalViewersResponseRootObject
import typingsSlinky.instagramPrivateApi.liveGetQuestionsResponseMod.LiveGetQuestionsResponseRootObject
import typingsSlinky.instagramPrivateApi.liveHeartbeatViewerCountResponseMod.LiveHeartbeatViewerCountResponseRootObject
import typingsSlinky.instagramPrivateApi.liveInfoResponseMod.LiveInfoResponseRootObject
import typingsSlinky.instagramPrivateApi.liveJoinRequestCountsResponseMod.LiveJoinRequestCountsResponseRootObject
import typingsSlinky.instagramPrivateApi.liveLikeCountResponseMod.LiveLikeCountResponseRootObject
import typingsSlinky.instagramPrivateApi.liveLikeResponseMod.LiveLikeResponseRootObject
import typingsSlinky.instagramPrivateApi.livePostLiveThumbnailsResponseMod.LivePostLiveThumbnailsResponseRootObject
import typingsSlinky.instagramPrivateApi.liveStartBroadcastResponseMod.LiveStartBroadcastResponseRootObject
import typingsSlinky.instagramPrivateApi.liveSwitchCommentsResponseMod.LiveSwitchCommentsResponseRootObject
import typingsSlinky.instagramPrivateApi.liveViewerListResponseMod.LiveViewerListResponseRootObject
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/repositories/live.repository", JSImport.Namespace)
@js.native
object liveRepositoryMod extends js.Object {
  
  @js.native
  class LiveRepository () extends Repository {
    
    def activateQuestion(broadcastId: String, questionId: String): js.Promise[_] = js.native
    
    def addPostLiveToIgtv(hasBroadcastIdTitleDescriptionCoverUploadIdIgtvSharePreviewToFeed: CoverUploadId): js.Promise[LiveAddPostLiveToIgtvResponseRootObject] = js.native
    
    def addToPostLive(broadcastId: String): js.Promise[LiveAddToPostResponse] = js.native
    
    def comment(broadcastId: String, message: String): js.Promise[_] = js.native
    
    def create(hasPreviewHeightPreviewWidthMessage: Message): js.Promise[LiveCreateBroadcastResponseRootObject] = js.native
    
    def createQuestion(broadcastId: String, question: String): js.Promise[_] = js.native
    
    def deactivateQuestion(broadcastId: String, questionId: String): js.Promise[_] = js.native
    
    def endBroadcast(broadcastId: String): js.Promise[_] = js.native
    def endBroadcast(broadcastId: String, endAfterCopyrightWarning: Boolean): js.Promise[_] = js.native
    
    def getComment(hasBroadcastIdCommentsRequestedLastCommentTs: BroadcastId_): js.Promise[LiveCommentsResponseRootObject] = js.native
    
    def getFinalViewerList(broadcastId: String): js.Promise[LiveFinalViewersResponseRootObject] = js.native
    
    def getJoinRequestCounts(hasBroadcastIdLastTotalCountLastSeenTsLastFetchTs: LastFetchTs): js.Promise[LiveJoinRequestCountsResponseRootObject] = js.native
    
    def getLikeCount(broadcastId: String): js.Promise[LiveLikeCountResponseRootObject] = js.native
    def getLikeCount(broadcastId: String, likeTs: String): js.Promise[LiveLikeCountResponseRootObject] = js.native
    def getLikeCount(broadcastId: String, likeTs: Double): js.Promise[LiveLikeCountResponseRootObject] = js.native
    
    def getLivePresence(): js.Promise[_] = js.native
    
    def getLiveQuestions(broadcastId: String): js.Promise[_] = js.native
    
    def getPostLiveThumbnails(broadcastId: String): js.Promise[LivePostLiveThumbnailsResponseRootObject] = js.native
    
    def getQuestions(): js.Promise[LiveGetQuestionsResponseRootObject] = js.native
    
    def getViewerList(broadcastId: String): js.Promise[LiveViewerListResponseRootObject] = js.native
    
    def heartbeatAndGetViewerCount(broadcastId: String): js.Promise[LiveHeartbeatViewerCountResponseRootObject] = js.native
    
    def info(broadcastId: String): js.Promise[LiveInfoResponseRootObject] = js.native
    
    def like(broadcastId: String): js.Promise[LiveLikeResponseRootObject] = js.native
    def like(broadcastId: String, likeCount: Double): js.Promise[LiveLikeResponseRootObject] = js.native
    
    def muteComment(broadcastId: String): js.Promise[LiveSwitchCommentsResponseRootObject] = js.native
    
    def pinComment(broadcastId: String, commentId: String): js.Promise[_] = js.native
    
    def resumeBroadcastAfterContentMatch(broadcastId: String): js.Promise[_] = js.native
    
    def start(broadcastId: String): js.Promise[LiveStartBroadcastResponseRootObject] = js.native
    def start(broadcastId: String, sendNotifications: Boolean): js.Promise[LiveStartBroadcastResponseRootObject] = js.native
    
    def unmuteComment(broadcastId: String): js.Promise[LiveSwitchCommentsResponseRootObject] = js.native
    
    def unpinComment(broadcastId: String, commentId: String): js.Promise[_] = js.native
    
    def wave(broadcastId: String, viewerId: String): js.Promise[_] = js.native
  }
}

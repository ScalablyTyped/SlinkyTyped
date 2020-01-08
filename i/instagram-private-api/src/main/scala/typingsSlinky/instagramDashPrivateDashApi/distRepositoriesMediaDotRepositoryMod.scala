package typingsSlinky.instagramDashPrivateDashApi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typingsSlinky.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotCheckDashOffensiveDashCommentDotResponseMod.MediaRepositoryCheckOffensiveCommentResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotCommentDotResponseMod.MediaRepositoryCommentResponseComment
import typingsSlinky.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotConfigureDotResponseMod.MediaRepositoryConfigureResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotInfoDotResponseMod.MediaEditResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotInfoDotResponseMod.MediaInfoResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotLikersDotResponseMod.MediaRepositoryLikersResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesMediaDotUpdatedDashMediaDotResponseMod.MediaUpdatedMediaResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distResponsesStatusDotResponseMod.StatusResponse
import typingsSlinky.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgAppModule
import typingsSlinky.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashSidecarDotOptionsMod.MediaConfigureSidecarOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod.MediaConfigureStoryPhotoOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod.MediaConfigureStoryVideoOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashToDashIgtvDotOptionsMod.MediaConfigureToIgtvOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashVideoDotOptionsMod.MediaConfigureTimelineVideoOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesMediaDotConfigureDotOptionsMod.MediaConfigureTimelineOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesMediaDotLikeDotOptionsMod.LikeRequestOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesMediaDotLikeDotOptionsMod.UnlikeRequestOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesStoryDashResponseDotOptionsMod.StoryMusicQuestionResponse
import typingsSlinky.instagramDashPrivateDashApi.distTypesStoryDashResponseDotOptionsMod.StoryTextQuestionResponse
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`0`
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`1`
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`2`
import typingsSlinky.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/media.repository", JSImport.Namespace)
@js.native
object distRepositoriesMediaDotRepositoryMod extends js.Object {
  @js.native
  class MediaRepository () extends Repository {
    var applyConfigureDefaults: js.Any = js.native
    var likeAction: js.Any = js.native
    def blocked(): js.Promise[js.Array[String]] = js.native
    def checkOffensiveComment(commentText: String): js.Promise[MediaRepositoryCheckOffensiveCommentResponseRootObject] = js.native
    def checkOffensiveComment(commentText: String, mediaId: String): js.Promise[MediaRepositoryCheckOffensiveCommentResponseRootObject] = js.native
    def comment(hasMediaIdTextReplyToCommentIdModule: Anon_MediaId): js.Promise[MediaRepositoryCommentResponseComment] = js.native
    def commentsBulkDelete(mediaId: String, commentIds: js.Array[String]): js.Promise[StatusResponse] = js.native
    def commentsDisable(mediaId: js.Any): js.Promise[_] = js.native
    def commentsEnable(mediaId: js.Any): js.Promise[_] = js.native
    def configure(options: MediaConfigureTimelineOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
    def configureSidecar(options: MediaConfigureSidecarOptions): js.Promise[_] = js.native
    def configureToIgtv(options: MediaConfigureToIgtvOptions): js.Promise[_] = js.native
    def configureToStory(options: MediaConfigureStoryPhotoOptions): js.Promise[_] = js.native
    def configureToStoryVideo(options: MediaConfigureStoryVideoOptions): js.Promise[_] = js.native
    def configureVideo(options: MediaConfigureTimelineVideoOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
    def delete(hasMediaIdMediaType: Anon_CAROUSEL): js.Promise[_] = js.native
    def editMedia(hasMediaIdCaptionText: Anon_CaptionText): js.Promise[MediaEditResponseRootObject] = js.native
    def info(mediaId: String): js.Promise[MediaInfoResponseRootObject] = js.native
    def like(options: LikeRequestOptions): js.Promise[_] = js.native
    def likers(id: String): js.Promise[MediaRepositoryLikersResponseRootObject] = js.native
    def onlyMe(mediaId: String): js.Promise[StatusResponse] = js.native
    def save(mediaId: String): js.Promise[_] = js.native
    def seen(reels: StringDictionary[js.Array[String]]): js.Promise[StatusResponse] = js.native
    def seen(reels: StringDictionary[js.Array[String]], module: IgAppModule): js.Promise[StatusResponse] = js.native
    @JSName("storyPollVote")
    def storyPollVote_0(mediaId: String, pollId: String, vote: `0`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyPollVote")
    def storyPollVote_0(mediaId: String, pollId: Double, vote: `0`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyPollVote")
    def storyPollVote_1(mediaId: String, pollId: String, vote: `1`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyPollVote")
    def storyPollVote_1(mediaId: String, pollId: Double, vote: `1`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    def storyQuestionResponse(mediaId: String, questionId: String, options: StoryMusicQuestionResponse): js.Promise[StatusResponse] = js.native
    def storyQuestionResponse(mediaId: String, questionId: String, options: StoryTextQuestionResponse): js.Promise[StatusResponse] = js.native
    def storyQuestionResponse(mediaId: String, questionId: Double, options: StoryMusicQuestionResponse): js.Promise[StatusResponse] = js.native
    def storyQuestionResponse(mediaId: String, questionId: Double, options: StoryTextQuestionResponse): js.Promise[StatusResponse] = js.native
    def storyQuizAnswer(mediaId: String, quizId: String, answer: String): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    def storyQuizAnswer(mediaId: String, quizId: Double, answer: String): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_0(mediaId: String, quizId: String, answer: `0`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_0(mediaId: String, quizId: Double, answer: `0`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_1(mediaId: String, quizId: String, answer: `1`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_1(mediaId: String, quizId: Double, answer: `1`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_2(mediaId: String, quizId: String, answer: `2`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_2(mediaId: String, quizId: Double, answer: `2`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_3(mediaId: String, quizId: String, answer: `3`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    @JSName("storyQuizAnswer")
    def storyQuizAnswer_3(mediaId: String, quizId: Double, answer: `3`): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    def storySliderVote(mediaId: String, sliderId: String, vote: Double): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    def storySliderVote(mediaId: String, sliderId: Double, vote: Double): js.Promise[MediaUpdatedMediaResponseRootObject] = js.native
    def undoOnlyMe(mediaId: String): js.Promise[StatusResponse] = js.native
    def unlike(options: UnlikeRequestOptions): js.Promise[_] = js.native
    def unsave(mediaId: String): js.Promise[_] = js.native
    def uploadFinish(options: Anon_Sourcetype): js.Promise[_] = js.native
  }
  
  /* static members */
  @js.native
  object MediaRepository extends js.Object {
    var stringifyStoryStickers: js.Any = js.native
  }
  
}


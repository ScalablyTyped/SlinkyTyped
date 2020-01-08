package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.bluebird.bluebirdMod.^
import typingsSlinky.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typingsSlinky.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotConfigureDotResponseMod.MediaRepositoryConfigureResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distTypesPostingDotAlbumDotOptionsMod.PostingAlbumOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesPostingDotIgtvDotOptionsMod.PostingIgtvOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesPostingDotPhotoDotOptionsMod.PostingPhotoOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesPostingDotPhotoDotOptionsMod.PostingStoryPhotoOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesPostingDotVideoDotOptionsMod.PostingStoryVideoOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesPostingDotVideoDotOptionsMod.PostingVideoOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/services/publish.service", JSImport.Namespace)
@js.native
object distServicesPublishDotServiceMod extends js.Object {
  @js.native
  class PublishService () extends Repository {
    var chance: js.Any = js.native
    var regularVideo: js.Any = js.native
    var segmentedVideo: js.Any = js.native
    var uploadAndConfigureStoryPhoto: js.Any = js.native
    var uploadAndConfigureStoryVideo: js.Any = js.native
    def album(options: PostingAlbumOptions): js.Promise[_] = js.native
    def igtvVideo(options: PostingIgtvOptions): js.Promise[_] = js.native
    def photo(options: PostingPhotoOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
    def story(options: PostingStoryPhotoOptions): js.Promise[_] = js.native
    def story(options: PostingStoryVideoOptions): js.Promise[_] = js.native
    def video(options: PostingVideoOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
  }
  
  /* static members */
  @js.native
  object PublishService extends js.Object {
    var makeLocationOptions: js.Any = js.native
    var read16: js.Any = js.native
    var read32: js.Any = js.native
    def catchTranscodeError(videoInfo: js.Any, transcodeDelayInMs: Double): js.Function1[/* error */ js.Any, ^[Unit]] = js.native
    def getVideoInfo(buffer: Buffer): Anon_Duration = js.native
  }
  
}


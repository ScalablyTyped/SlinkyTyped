package typingsSlinky.instagramPrivateApi

import typingsSlinky.bluebird.mod.^
import typingsSlinky.instagramPrivateApi.anon.Duration
import typingsSlinky.instagramPrivateApi.mediaRepositoryConfigureResponseMod.MediaRepositoryConfigureResponseRootObject
import typingsSlinky.instagramPrivateApi.postingAlbumOptionsMod.PostingAlbumOptions
import typingsSlinky.instagramPrivateApi.postingIgtvOptionsMod.PostingIgtvOptions
import typingsSlinky.instagramPrivateApi.postingPhotoOptionsMod.PostingPhotoOptions
import typingsSlinky.instagramPrivateApi.postingPhotoOptionsMod.PostingStoryPhotoOptions
import typingsSlinky.instagramPrivateApi.postingVideoOptionsMod.PostingStoryVideoOptions
import typingsSlinky.instagramPrivateApi.postingVideoOptionsMod.PostingVideoOptions
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/services/publish.service", JSImport.Namespace)
@js.native
object publishServiceMod extends js.Object {
  
  @js.native
  class PublishService () extends Repository {
    
    def album(options: PostingAlbumOptions): js.Promise[_] = js.native
    
    var chance: js.Any = js.native
    
    def igtvVideo(options: PostingIgtvOptions): js.Promise[_] = js.native
    
    def photo(options: PostingPhotoOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
    
    var regularVideo: js.Any = js.native
    
    var segmentedVideo: js.Any = js.native
    
    def story(options: PostingStoryPhotoOptions): js.Promise[_] = js.native
    def story(options: PostingStoryVideoOptions): js.Promise[_] = js.native
    
    var uploadAndConfigureStoryPhoto: js.Any = js.native
    
    var uploadAndConfigureStoryVideo: js.Any = js.native
    
    def video(options: PostingVideoOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
  }
  /* static members */
  @js.native
  object PublishService extends js.Object {
    
    def catchTranscodeError(videoInfo: js.Any, transcodeDelayInMs: Double): js.Function1[/* error */ js.Any, ^[Unit]] = js.native
    
    def getMP4Duration(buffer: Buffer): Double = js.native
    
    def getVideoInfo(buffer: Buffer): Duration = js.native
    
    var makeLocationOptions: js.Any = js.native
    
    var publishDebug: js.Any = js.native
    
    var read16: js.Any = js.native
    
    var read32: js.Any = js.native
  }
}

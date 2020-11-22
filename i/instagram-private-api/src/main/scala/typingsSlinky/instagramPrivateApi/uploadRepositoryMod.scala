package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.Offset
import typingsSlinky.instagramPrivateApi.anon.RuploadParams
import typingsSlinky.instagramPrivateApi.anon.StreamId_
import typingsSlinky.instagramPrivateApi.anon.Streamid
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.uploadPhotoOptionsMod.UploadPhotoOptions
import typingsSlinky.instagramPrivateApi.uploadRepositoryPhotoResponseMod.UploadRepositoryPhotoResponseRootObject
import typingsSlinky.instagramPrivateApi.uploadVideoOptionsMod.UploadRetryContext
import typingsSlinky.instagramPrivateApi.uploadVideoOptionsMod.UploadVideoOptions
import typingsSlinky.instagramPrivateApi.uploadVideoOptionsMod.UploadVideoSegmentInitOptions
import typingsSlinky.instagramPrivateApi.uploadVideoOptionsMod.UploadVideoSegmentTransferOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/repositories/upload.repository", JSImport.Namespace)
@js.native
object uploadRepositoryMod extends js.Object {
  
  @js.native
  class UploadRepository () extends Repository {
    
    var chance: js.Any = js.native
    
    def endSegmentedVideo(hasRuploadParamsStreamId: StreamId_): js.Promise[_] = js.native
    
    var getBaseHeaders: js.Any = js.native
    
    def initVideo(hasNameRuploadParamsWaterfallId: RuploadParams): js.Promise[Offset] = js.native
    
    def photo(options: UploadPhotoOptions): js.Promise[UploadRepositoryPhotoResponseRootObject] = js.native
    
    def startSegmentedVideo(ruploadParams: js.Any): js.Promise[Streamid] = js.native
    
    def video(options: UploadVideoOptions): js.Promise[_] = js.native
    
    def videoSegmentInit(options: UploadVideoSegmentInitOptions): js.Promise[Offset] = js.native
    
    def videoSegmentTransfer(options: UploadVideoSegmentTransferOptions): js.Promise[_] = js.native
  }
  /* static members */
  @js.native
  object UploadRepository extends js.Object {
    
    var createPhotoRuploadParams: js.Any = js.native
    
    def createVideoRuploadParams(options: UploadVideoOptions, uploadId: String): js.Any = js.native
    def createVideoRuploadParams(options: UploadVideoOptions, uploadId: String, retryContext: UploadRetryContext): js.Any = js.native
    def createVideoRuploadParams(options: UploadVideoOptions, uploadId: Double): js.Any = js.native
    def createVideoRuploadParams(options: UploadVideoOptions, uploadId: Double, retryContext: UploadRetryContext): js.Any = js.native
    
    var uploadDebug: js.Any = js.native
  }
}

package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typingsSlinky.instagramDashPrivateDashApi.distResponsesUploadDotRepositoryDotPhotoDotResponseMod.UploadRepositoryPhotoResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distTypesUploadDotPhotoDotOptionsMod.UploadPhotoOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesUploadDotVideoDotOptionsMod.UploadRetryContext
import typingsSlinky.instagramDashPrivateDashApi.distTypesUploadDotVideoDotOptionsMod.UploadVideoOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesUploadDotVideoDotOptionsMod.UploadVideoSegmentInitOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesUploadDotVideoDotOptionsMod.UploadVideoSegmentTransferOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/upload.repository", JSImport.Namespace)
@js.native
object distRepositoriesUploadDotRepositoryMod extends js.Object {
  @js.native
  class UploadRepository () extends Repository {
    var chance: js.Any = js.native
    var getBaseHeaders: js.Any = js.native
    def endSegmentedVideo(hasRuploadParamsStreamId: Anon_RuploadParams): js.Promise[_] = js.native
    def initVideo(hasNameRuploadParamsWaterfallId: Anon_NameRuploadParams): js.Promise[Anon_Offset] = js.native
    def photo(options: UploadPhotoOptions): js.Promise[UploadRepositoryPhotoResponseRootObject] = js.native
    def startSegmentedVideo(ruploadParams: js.Any): js.Promise[Anon_Streamid] = js.native
    def video(options: UploadVideoOptions): js.Promise[_] = js.native
    def videoSegmentInit(options: UploadVideoSegmentInitOptions): js.Promise[Anon_Offset] = js.native
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
  }
  
}


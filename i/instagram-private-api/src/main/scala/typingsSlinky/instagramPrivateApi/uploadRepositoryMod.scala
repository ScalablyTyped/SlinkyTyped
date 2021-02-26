package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.Offset
import typingsSlinky.instagramPrivateApi.anon.RuploadParams
import typingsSlinky.instagramPrivateApi.anon.StreamId_
import typingsSlinky.instagramPrivateApi.anon.Streamid
import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import typingsSlinky.instagramPrivateApi.uploadPhotoOptionsMod.UploadPhotoOptions
import typingsSlinky.instagramPrivateApi.uploadRepositoryPhotoResponseMod.UploadRepositoryPhotoResponseRootObject
import typingsSlinky.instagramPrivateApi.uploadVideoOptionsMod.UploadRetryContext
import typingsSlinky.instagramPrivateApi.uploadVideoOptionsMod.UploadVideoOptions
import typingsSlinky.instagramPrivateApi.uploadVideoOptionsMod.UploadVideoSegmentInitOptions
import typingsSlinky.instagramPrivateApi.uploadVideoOptionsMod.UploadVideoSegmentTransferOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/upload.repository", "UploadRepository")
  @js.native
  class UploadRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
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
  object UploadRepository {
    
    @JSImport("instagram-private-api/dist/repositories/upload.repository", "UploadRepository")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("instagram-private-api/dist/repositories/upload.repository", "UploadRepository.createPhotoRuploadParams")
    @js.native
    def createPhotoRuploadParams: js.Any = js.native
    @scala.inline
    def createPhotoRuploadParams_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createPhotoRuploadParams")(x.asInstanceOf[js.Any])
    
    @JSImport("instagram-private-api/dist/repositories/upload.repository", "UploadRepository.createVideoRuploadParams")
    @js.native
    def createVideoRuploadParams(options: UploadVideoOptions, uploadId: String): js.Any = js.native
    @JSImport("instagram-private-api/dist/repositories/upload.repository", "UploadRepository.createVideoRuploadParams")
    @js.native
    def createVideoRuploadParams(options: UploadVideoOptions, uploadId: String, retryContext: UploadRetryContext): js.Any = js.native
    @JSImport("instagram-private-api/dist/repositories/upload.repository", "UploadRepository.createVideoRuploadParams")
    @js.native
    def createVideoRuploadParams(options: UploadVideoOptions, uploadId: Double): js.Any = js.native
    @JSImport("instagram-private-api/dist/repositories/upload.repository", "UploadRepository.createVideoRuploadParams")
    @js.native
    def createVideoRuploadParams(options: UploadVideoOptions, uploadId: Double, retryContext: UploadRetryContext): js.Any = js.native
    
    @JSImport("instagram-private-api/dist/repositories/upload.repository", "UploadRepository.uploadDebug")
    @js.native
    def uploadDebug: js.Any = js.native
    @scala.inline
    def uploadDebug_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uploadDebug")(x.asInstanceOf[js.Any])
  }
}

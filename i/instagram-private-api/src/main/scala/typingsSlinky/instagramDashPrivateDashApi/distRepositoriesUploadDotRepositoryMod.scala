package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typingsSlinky.instagramDashPrivateDashApi.distResponsesUploadDotRepositoryDotPhotoDotResponseMod.UploadRepositoryPhotoResponseRootObject
import typingsSlinky.instagramDashPrivateDashApi.distTypesUploadDotPhotoDotOptionsMod.UploadPhotoOptions
import typingsSlinky.instagramDashPrivateDashApi.distTypesUploadDotVideoDotOptionsMod.UploadVideoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/upload.repository", JSImport.Namespace)
@js.native
object distRepositoriesUploadDotRepositoryMod extends js.Object {
  @js.native
  class UploadRepository () extends Repository {
    var chance: js.Any = js.native
    def photo(options: UploadPhotoOptions): js.Promise[UploadRepositoryPhotoResponseRootObject] = js.native
    def video(options: UploadVideoOptions): js.Promise[_] = js.native
  }
  
}


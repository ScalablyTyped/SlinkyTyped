package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgResponse
import typingsSlinky.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typingsSlinky.instagramPrivateApi.uploadRepositoryVideoResponseMod.UploadRepositoryVideoResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igUploadVideoErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-upload-video-error", "IgUploadVideoError")
  @js.native
  class IgUploadVideoError protected ()
    extends IgResponseError[js.Any] {
    def this(response: IgResponse[UploadRepositoryVideoResponseRootObject], videoInfo: js.Any) = this()
    
    var videoInfo: js.Any = js.native
  }
}

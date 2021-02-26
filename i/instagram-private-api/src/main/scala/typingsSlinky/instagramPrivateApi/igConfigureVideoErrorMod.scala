package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.commonTypesMod.IgResponse
import typingsSlinky.instagramPrivateApi.igUploadVideoErrorMod.IgUploadVideoError
import typingsSlinky.instagramPrivateApi.uploadRepositoryVideoResponseMod.UploadRepositoryVideoResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igConfigureVideoErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-configure-video-error", "IgConfigureVideoError")
  @js.native
  class IgConfigureVideoError protected () extends IgUploadVideoError {
    def this(response: IgResponse[UploadRepositoryVideoResponseRootObject], videoInfo: js.Any) = this()
  }
}

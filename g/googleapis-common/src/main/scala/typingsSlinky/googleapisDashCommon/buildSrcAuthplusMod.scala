package typingsSlinky.googleapisDashCommon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.GoogleAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis-common/build/src/authplus", JSImport.Namespace)
@js.native
object buildSrcAuthplusMod extends js.Object {
  @js.native
  class AuthPlus () extends GoogleAuth {
    var Compute: Instantiable0[typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute] = js.native
    var JWT: Instantiable1[
        /* options */ JWTOptions, 
        typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
      ] = js.native
    var OAuth2: TypeofClassOAuth2Client = js.native
  }
  
}


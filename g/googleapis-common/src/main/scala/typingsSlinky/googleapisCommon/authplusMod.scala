package typingsSlinky.googleapisCommon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleAuthLibrary.mod.GoogleAuth
import typingsSlinky.googleapisCommon.anon.TypeofOAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis-common/build/src/authplus", JSImport.Namespace)
@js.native
object authplusMod extends js.Object {
  
  @js.native
  class AuthPlus () extends GoogleAuth {
    
    var Compute: Instantiable0[typingsSlinky.googleAuthLibrary.mod.Compute] = js.native
    
    var JWT: Instantiable1[/* options */ JWTOptions, typingsSlinky.googleAuthLibrary.mod.JWT] = js.native
    
    var OAuth2: TypeofOAuth2Client = js.native
  }
}

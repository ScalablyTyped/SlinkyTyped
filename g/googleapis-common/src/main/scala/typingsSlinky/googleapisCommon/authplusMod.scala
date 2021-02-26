package typingsSlinky.googleapisCommon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typingsSlinky.googleAuthLibrary.jwtclientMod.JWTOptions
import typingsSlinky.googleAuthLibrary.mod.GoogleAuth
import typingsSlinky.googleapisCommon.anon.TypeofOAuth2Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authplusMod {
  
  @JSImport("googleapis-common/build/src/authplus", "AuthPlus")
  @js.native
  class AuthPlus () extends GoogleAuth {
    def this(opts: GoogleAuthOptions) = this()
    
    var Compute: Instantiable0[typingsSlinky.googleAuthLibrary.mod.Compute] = js.native
    
    var JWT: Instantiable1[/* options */ JWTOptions, typingsSlinky.googleAuthLibrary.mod.JWT] = js.native
    
    var OAuth2: TypeofOAuth2Client = js.native
  }
}

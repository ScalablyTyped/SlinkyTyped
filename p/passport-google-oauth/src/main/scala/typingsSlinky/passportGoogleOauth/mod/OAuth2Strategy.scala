package typingsSlinky.passportGoogleOauth.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passport.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-google-oauth", "OAuth2Strategy")
@js.native
class OAuth2Strategy protected () extends Strategy {
  def this(
    options: IOAuth2StrategyOptionWithRequest,
    verify: js.Function5[
        /* req */ Request_[ParamsDictionary, _, _, Query], 
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ VerifyFunction, 
        Unit
      ]
  ) = this()
  def this(
    options: IOAuth2StrategyOption,
    verify: js.Function4[
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ VerifyFunction, 
        Unit
      ]
  ) = this()
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
  
  @JSName("name")
  var name_OAuth2Strategy: String = js.native
}

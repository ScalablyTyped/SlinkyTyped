package typingsSlinky.passportGoogleOauth.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passport.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-google-oauth", "OAuthStrategy")
@js.native
class OAuthStrategy protected () extends Strategy {
  def this(
    options: IOAuthStrategyOption,
    verify: js.Function4[
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ VerifyFunction, 
        Unit
      ]
  ) = this()
  @JSName("name")
  var name_OAuthStrategy: String = js.native
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
}


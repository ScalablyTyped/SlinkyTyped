package typingsSlinky.passportGoogleOauth20.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.passportOauth2.mod.OAuth2Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-google-oauth20", "Strategy")
@js.native
class Strategy protected () extends OAuth2Strategy {
  def this(
    options: StrategyOptionsWithRequest,
    verify: js.Function5[
        /* req */ Request_[ParamsDictionary], 
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ VerifyCallback, 
        Unit
      ]
  ) = this()
  def this(
    options: StrategyOptions,
    verify: js.Function4[
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ VerifyCallback, 
        Unit
      ]
  ) = this()
}


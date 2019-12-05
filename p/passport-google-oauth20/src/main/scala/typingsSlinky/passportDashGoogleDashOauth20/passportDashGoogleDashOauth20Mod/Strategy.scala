package typingsSlinky.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Mod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.passportDashOauth2.passportDashOauth2Mod.OAuth2Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-google-oauth20", "Strategy")
@js.native
class Strategy protected () extends OAuth2Strategy {
  def this(
    options: StrategyOptionsWithRequest,
    verify: js.Function5[
        /* req */ Request[ParamsDictionary], 
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


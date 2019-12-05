package typingsSlinky.passportDashGithub2.passportDashGithub2Mod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.passport.passportMod.AuthenticateOptions
import typingsSlinky.passportDashOauth2.passportDashOauth2Mod.OAuth2Strategy
import typingsSlinky.passportDashOauth2.passportDashOauth2Mod.VerifyFunction
import typingsSlinky.passportDashOauth2.passportDashOauth2Mod.VerifyFunctionWithRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-github2", "Strategy")
@js.native
class Strategy protected () extends OAuth2Strategy {
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  def authenticate(req: Request[ParamsDictionary], options: AuthenticateOptions): Unit = js.native
}


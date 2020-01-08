package typingsSlinky.passportDashOauth2DashClientDashPassword.passportDashOauth2DashClientDashPasswordMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-oauth2-client-password", "Strategy")
@js.native
class Strategy protected ()
  extends typingsSlinky.passport.passportMod.Strategy {
  def this(verify: VerifyFunction) = this()
  def this(options: StrategyOptionsWithRequestInterface, verify: VerifyFunctionWithRequest) = this()
  def authenticate(req: Request[ParamsDictionary], options: js.Object): Unit = js.native
}


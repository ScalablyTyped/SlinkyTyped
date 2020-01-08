package typingsSlinky.passportDashLinkedinDashOauth2.passportDashLinkedinDashOauth2Mod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-linkedin-oauth2", "Strategy")
@js.native
class Strategy protected ()
  extends typingsSlinky.passport.passportMod.Strategy {
  def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOption, verify: VerifyFunction) = this()
  def authenticate(req: Request[ParamsDictionary], options: js.Object): Unit = js.native
}


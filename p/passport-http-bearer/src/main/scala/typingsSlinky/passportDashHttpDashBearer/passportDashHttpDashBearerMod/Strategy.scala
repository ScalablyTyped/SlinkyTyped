package typingsSlinky.passportDashHttpDashBearer.passportDashHttpDashBearerMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-http-bearer", "Strategy")
@js.native
class Strategy protected ()
  extends typingsSlinky.passport.passportMod.Strategy {
  def this(verify: VerifyFunction) = this()
  def this(options: IStrategyOptions, verify: VerifyFunction) = this()
  def this(options: IStrategyOptions, verify: VerifyFunctionWithRequest) = this()
  def authenticate(req: Request[ParamsDictionary]): Unit = js.native
  def authenticate(req: Request[ParamsDictionary], options: js.Object): Unit = js.native
}


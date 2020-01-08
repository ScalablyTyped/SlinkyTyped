package typingsSlinky.passportDashHttp.passportDashHttpMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.passport.passportMod.Strategy
import typingsSlinky.passportDashHttp.passportDashHttpBooleans.`false`
import typingsSlinky.passportDashHttp.passportDashHttpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-http", "BasicStrategy")
@js.native
class BasicStrategy protected () extends Strategy {
  def this(verify: BasicVerifyFunction) = this()
  def this(options: BasicStrategyOptions[`false`], verify: BasicVerifyFunction) = this()
  def this(options: BasicStrategyOptions[`true`], verify: BasicVerifyFunctionWithRequest) = this()
  @JSName("name")
  var name_BasicStrategy: String = js.native
  def authenticate(req: Request[ParamsDictionary], options: js.Object): Unit = js.native
}


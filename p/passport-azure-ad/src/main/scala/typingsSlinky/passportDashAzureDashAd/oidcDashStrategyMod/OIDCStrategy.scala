package typingsSlinky.passportDashAzureDashAd.oidcDashStrategyMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.passport.passportMod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-azure-ad/oidc-strategy", "OIDCStrategy")
@js.native
class OIDCStrategy protected () extends Strategy {
  def this(options: IOIDCStrategyOptionWithRequest, verify: VerifyOIDCFunctionWithReq) = this()
  def this(options: IOIDCStrategyOptionWithoutRequest, verify: VerifyOIDCFunction) = this()
  @JSName("name")
  var name_OIDCStrategy: String = js.native
  def authenticate(req: Request[ParamsDictionary], options: js.Object): Unit = js.native
}


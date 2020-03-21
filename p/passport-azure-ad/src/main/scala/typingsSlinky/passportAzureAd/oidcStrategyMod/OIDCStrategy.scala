package typingsSlinky.passportAzureAd.oidcStrategyMod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.passport.mod.Strategy
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
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}


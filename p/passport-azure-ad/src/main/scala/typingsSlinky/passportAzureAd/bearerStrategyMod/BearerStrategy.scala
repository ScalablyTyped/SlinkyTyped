package typingsSlinky.passportAzureAd.bearerStrategyMod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passport.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-azure-ad/bearer-strategy", "BearerStrategy")
@js.native
class BearerStrategy protected () extends Strategy {
  def this(options: IBearerStrategyOptionWithRequest, verify: VerifyBearerFunctionWithReq) = this()
  def this(options: IBearerStrategyOption, verify: VerifyBearerFunction) = this()
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
  
  @JSName("name")
  var name_BearerStrategy: String = js.native
}

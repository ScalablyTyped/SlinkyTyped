package typingsSlinky.riderizePassportStravaOauth2.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@riderize/passport-strava-oauth2", "Strategy")
@js.native
class Strategy protected ()
  extends typingsSlinky.passport.mod.Strategy {
  def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOption, verify: VerifyFunction) = this()
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
}

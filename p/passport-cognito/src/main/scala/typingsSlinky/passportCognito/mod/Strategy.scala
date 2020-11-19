package typingsSlinky.passportCognito.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-cognito", "Strategy")
@js.native
class Strategy protected ()
  extends typingsSlinky.passport.mod.Strategy {
  def this(options: CognitoStrategyOptions, verify: CognitoVerifyFunction) = this()
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
}

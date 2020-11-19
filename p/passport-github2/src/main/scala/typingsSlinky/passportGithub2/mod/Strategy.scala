package typingsSlinky.passportGithub2.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passport.mod.AuthenticateOptions
import typingsSlinky.passportOauth2.mod.OAuth2Strategy
import typingsSlinky.passportOauth2.mod.VerifyFunction
import typingsSlinky.passportOauth2.mod.VerifyFunctionWithRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-github2", "Strategy")
@js.native
class Strategy protected () extends OAuth2Strategy {
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: AuthenticateOptions): Unit = js.native
}

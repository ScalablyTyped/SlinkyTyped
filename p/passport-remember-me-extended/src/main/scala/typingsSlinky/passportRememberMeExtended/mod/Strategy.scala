package typingsSlinky.passportRememberMeExtended.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passport.mod.AuthenticateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-remember-me-extended", "Strategy")
@js.native
class Strategy protected ()
  extends typingsSlinky.passport.mod.Strategy {
  def this(verify: VerifyFunction, issue: IssueFunction) = this()
  def this(
    options: StrategyOptionWithRequest,
    verify: VerifyFunctionWithRequest,
    issue: IssueFunctionWithRequest
  ) = this()
  def this(options: StrategyOption, verify: VerifyFunction, issue: IssueFunction) = this()
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: AuthenticateOptions): Unit = js.native
}

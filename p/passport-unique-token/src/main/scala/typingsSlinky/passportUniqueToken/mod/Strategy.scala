package typingsSlinky.passportUniqueToken.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-unique-token", "Strategy")
@js.native
class Strategy protected ()
  extends typingsSlinky.passport.mod.Strategy {
  def this(verify: VerifyFunction) = this()
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
}


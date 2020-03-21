package typingsSlinky.passportHttpBearer.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-http-bearer", "Strategy")
@js.native
class Strategy protected ()
  extends typingsSlinky.passport.mod.Strategy {
  def this(verify: VerifyFunction) = this()
  def this(options: IStrategyOptions, verify: VerifyFunction) = this()
  def this(options: IStrategyOptions, verify: VerifyFunctionWithRequest) = this()
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}


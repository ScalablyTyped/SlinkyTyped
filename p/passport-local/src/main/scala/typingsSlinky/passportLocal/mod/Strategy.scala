package typingsSlinky.passportLocal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-local", "Strategy")
@js.native
class Strategy protected ()
  extends typingsSlinky.passportStrategy.mod.Strategy {
  def this(verify: VerifyFunction) = this()
  def this(options: IStrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: IStrategyOptions, verify: VerifyFunction) = this()
}


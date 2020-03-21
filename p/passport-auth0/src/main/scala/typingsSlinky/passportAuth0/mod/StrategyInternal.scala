package typingsSlinky.passportAuth0.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.passport.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyInternal extends Strategy {
  @JSName("name")
  var name_StrategyInternal: String = js.native
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}


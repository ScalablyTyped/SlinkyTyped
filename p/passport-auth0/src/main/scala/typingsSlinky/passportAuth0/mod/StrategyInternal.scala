package typingsSlinky.passportAuth0.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passport.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrategyInternal extends Strategy {
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
  
  @JSName("name")
  var name_StrategyInternal: String = js.native
}

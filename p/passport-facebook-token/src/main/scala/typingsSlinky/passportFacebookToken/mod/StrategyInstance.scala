package typingsSlinky.passportFacebookToken.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrategyInstance extends js.Object {
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query]): Unit = js.native
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Any): Unit = js.native
  
  var name: String = js.native
}

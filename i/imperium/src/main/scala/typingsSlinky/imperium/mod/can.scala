package typingsSlinky.imperium.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("imperium", "can")
@js.native
object can extends js.Object {
  
  def apply(actionS: String): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def apply(actionS: js.Array[Action | String]): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def apply(actionS: Action): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
}

package typingsSlinky.imperium.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "can")
@js.native
object can extends js.Object {
  def apply(actionS: String): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def apply(actionS: js.Array[Action | String]): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def apply(actionS: Action): js.Promise[RequestHandler[ParamsDictionary]] = js.native
}


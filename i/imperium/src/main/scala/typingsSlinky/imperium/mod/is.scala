package typingsSlinky.imperium.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "is")
@js.native
object is extends js.Object {
  def apply(roleNames: String): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def apply(roleNames: js.Array[String]): js.Promise[RequestHandler[ParamsDictionary]] = js.native
}


package typingsSlinky.easySession.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-session", "main")
@js.native
object main extends js.Object {
  def apply(session: js.Any): RequestHandler[ParamsDictionary] = js.native
  def apply(session: js.Any, options: SessionOptions): RequestHandler[ParamsDictionary] = js.native
}


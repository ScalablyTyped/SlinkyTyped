package typingsSlinky.jsonServer.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-server", "defaults")
@js.native
object defaults extends js.Object {
  def apply(): js.Array[RequestHandler[ParamsDictionary]] = js.native
  def apply(options: MiddlewaresOptions): js.Array[RequestHandler[ParamsDictionary]] = js.native
}


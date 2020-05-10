package typingsSlinky.lusca.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", "csrf")
@js.native
object csrf extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: csrfOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}


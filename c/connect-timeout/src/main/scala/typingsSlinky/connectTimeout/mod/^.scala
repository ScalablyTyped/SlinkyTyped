package typingsSlinky.connectTimeout.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-timeout", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(timeout: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(timeout: String, options: TimeoutOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}


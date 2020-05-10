package typingsSlinky.lasso

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso/middleware", JSImport.Namespace)
@js.native
object middlewareMod extends js.Object {
  def serveStatic(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def serveStatic(options: AnonLasso): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}


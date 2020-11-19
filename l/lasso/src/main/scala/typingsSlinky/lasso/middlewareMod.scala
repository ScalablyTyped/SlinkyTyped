package typingsSlinky.lasso

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.lasso.anon.Lasso
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lasso/middleware", JSImport.Namespace)
@js.native
object middlewareMod extends js.Object {
  
  def serveStatic(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def serveStatic(options: Lasso): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

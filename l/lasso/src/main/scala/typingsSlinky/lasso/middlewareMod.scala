package typingsSlinky.lasso

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.lasso.anon.Lasso
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  @JSImport("lasso/middleware", "serveStatic")
  @js.native
  def serveStatic(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("lasso/middleware", "serveStatic")
  @js.native
  def serveStatic(options: Lasso): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

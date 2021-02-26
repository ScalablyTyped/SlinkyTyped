package typingsSlinky.qsMiddleware

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.qs.mod.IParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qs-middleware", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("qs-middleware", JSImport.Namespace)
  @js.native
  def apply(options: IParseOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

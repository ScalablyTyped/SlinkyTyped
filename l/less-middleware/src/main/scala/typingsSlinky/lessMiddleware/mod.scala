package typingsSlinky.lessMiddleware

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.lessMiddleware.anon.CacheFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Middleware created to allow processing of Less files for Connect JS framework
    * and by extension the Express JS framework
    */
  @JSImport("less-middleware", JSImport.Namespace)
  @js.native
  def apply(source: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("less-middleware", JSImport.Namespace)
  @js.native
  def apply(source: String, options: CacheFile): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

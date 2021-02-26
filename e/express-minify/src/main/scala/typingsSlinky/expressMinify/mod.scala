package typingsSlinky.expressMinify

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressMinify.ExpressMinifyInterfaces.ExpressMinifyOptions
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-minify", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("express-minify", JSImport.Namespace)
  @js.native
  def apply(options: ExpressMinifyOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

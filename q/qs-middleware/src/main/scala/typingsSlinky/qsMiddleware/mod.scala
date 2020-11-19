package typingsSlinky.qsMiddleware

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.qs.mod.IParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("qs-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: IParseOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

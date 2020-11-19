package typingsSlinky.connectModrewrite

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("connect-modrewrite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(rewrites: js.Array[String]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

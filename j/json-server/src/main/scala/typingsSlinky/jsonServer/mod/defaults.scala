package typingsSlinky.jsonServer.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-server", "defaults")
@js.native
object defaults extends js.Object {
  
  def apply(): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def apply(options: MiddlewaresOptions): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
}

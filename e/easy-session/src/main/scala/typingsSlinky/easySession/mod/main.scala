package typingsSlinky.easySession.mod

import typingsSlinky.easySession.anon.Call
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("easy-session", "main")
@js.native
object main extends js.Object {
  
  def apply(session: Call): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(session: Call, options: SessionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

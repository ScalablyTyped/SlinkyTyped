package typingsSlinky.oauthShim.mod

import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.oauthShim.anon.Get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handler
  extends RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
  
  var credentials: Get = js.native
  
  def init(configs: js.Array[Config]): Unit = js.native
  
  def interpret(
    req: typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query],
    res: Response[_, Double],
    next: NextFunction
  ): js.Any = js.native
  @JSName("interpret")
  var interpret_Original: typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def proxy(
    req: typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query],
    res: Response[_, Double],
    next: NextFunction
  ): js.Any = js.native
  @JSName("proxy")
  var proxy_Original: typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def redirect(
    req: typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query],
    res: Response[_, Double],
    next: NextFunction
  ): js.Any = js.native
  @JSName("redirect")
  var redirect_Original: typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def unhandled(
    req: typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query],
    res: Response[_, Double],
    next: NextFunction
  ): js.Any = js.native
  @JSName("unhandled")
  var unhandled_Original: typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

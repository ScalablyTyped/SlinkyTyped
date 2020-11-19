package typingsSlinky.pollyjsNodeServer.mod

import typingsSlinky.express.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.pollyjsNodeServer.anon.PartialServerConfig
import typingsSlinky.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pollyjs/node-server", "Server")
@js.native
class Server () extends js.Object {
  def this(options: PartialServerConfig) = this()
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("app")
  var app_Original: Express = js.native
  
  var config: ServerConfig = js.native
  
  def listen(): typingsSlinky.node.httpMod.Server = js.native
  def listen(port: js.UndefOr[scala.Nothing], host: String): typingsSlinky.node.httpMod.Server = js.native
  def listen(port: Double): typingsSlinky.node.httpMod.Server = js.native
  def listen(port: Double, host: String): typingsSlinky.node.httpMod.Server = js.native
  
  var server: js.UndefOr[typingsSlinky.node.httpMod.Server] = js.native
}

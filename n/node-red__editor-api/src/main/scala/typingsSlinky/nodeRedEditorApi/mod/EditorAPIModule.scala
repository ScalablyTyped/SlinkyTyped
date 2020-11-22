package typingsSlinky.nodeRedEditorApi.mod

import typingsSlinky.express.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.httpsMod.Server
import typingsSlinky.nodeRedRuntime.mod.LocalSettings
import typingsSlinky.nodeRedRuntime.mod.RuntimeModule
import typingsSlinky.nodeRedRuntime.mod.StorageModule
import typingsSlinky.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorAPIModule extends js.Object {
  
  var auth: Auth = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  /**
    * The Express app used to serve the Node-RED Editor
    */
  def httpAdmin(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  /**
    * The Express app used to serve the Node-RED Editor
    */
  def httpAdmin(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  /**
    * The Express app used to serve the Node-RED Editor
    */
  def httpAdmin(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  /**
    * The Express app used to serve the Node-RED Editor
    */
  def httpAdmin(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  /**
    * The Express app used to serve the Node-RED Editor
    */
  @JSName("httpAdmin")
  val httpAdmin_Original: Express = js.native
  
  /**
    * Initialise the module.
    * @param  settings   The runtime settings
    * @param  _server    An instance of HTTP Server
    * @param  storage    An instance of Node-RED Storage
    * @param  runtimeAPI An instance of Node-RED Runtime
    */
  def init(settings: LocalSettings, _server: Server, storage: StorageModule, runtimeAPI: RuntimeModule): Unit = js.native
  
  /**
    * Start the module.
    */
  def start(): js.Promise[Unit] = js.native
  
  /**
    * Stop the module.
    */
  def stop(): js.Promise[Unit] = js.native
}

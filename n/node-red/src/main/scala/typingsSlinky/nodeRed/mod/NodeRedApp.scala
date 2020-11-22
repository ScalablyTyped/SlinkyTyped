package typingsSlinky.nodeRed.mod

import typingsSlinky.express.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.Server
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.nodeRedEditorApi.mod.Auth
import typingsSlinky.nodeRedRuntime.mod.InternalNodesModule
import typingsSlinky.nodeRedRuntime.mod.LocalSettings
import typingsSlinky.nodeRedRuntime.mod.PersistentSettings
import typingsSlinky.nodeRedRuntime.mod.RuntimeModule
import typingsSlinky.nodeRedUtil.mod.Log
import typingsSlinky.nodeRedUtil.mod.Util
import typingsSlinky.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRedApp extends js.Object {
  
  /**
    * The editor authentication api.
    */
  var auth: Auth = js.native
  
  /**
    * Runtime events emitter
    */
  var events: EventEmitter = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  /**
    * The express application for the Editor Admin API
    */
  def httpAdmin(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  /**
    * The express application for the Editor Admin API
    */
  def httpAdmin(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  /**
    * The express application for the Editor Admin API
    */
  def httpAdmin(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  /**
    * The express application for the Editor Admin API
    */
  def httpAdmin(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  /**
    * The express application for the Editor Admin API
    */
  @JSName("httpAdmin")
  val httpAdmin_Original: Express = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  /**
    * The express application for HTTP Nodes
    */
  def httpNode(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  /**
    * The express application for HTTP Nodes
    */
  def httpNode(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  /**
    * The express application for HTTP Nodes
    */
  def httpNode(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  /**
    * The express application for HTTP Nodes
    */
  def httpNode(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  /**
    * The express application for HTTP Nodes
    */
  @JSName("httpNode")
  val httpNode_Original: Express = js.native
  
  /**
    * Initialise the Node-RED application.
    * @param httpServer - the HTTP server object to use
    * @param userSettings - an object containing the runtime settings
    */
  def init(httpServer: Server, userSettings: LocalSettings): Unit = js.native
  
  /**
    * Logging utilities
    */
  var log: Log = js.native
  
  /**
    * This provides access to the internal nodes module of the
    * runtime. The details of this API remain undocumented as they should not
    * be used directly.
    *
    * Most administrative actions should be performed use the runtime api
    * under @node-red/runtime.
    */
  val nodes: InternalNodesModule = js.native
  
  /**
    * The runtime api
    */
  var runtime: RuntimeModule = js.native
  
  /**
    * The HTTP Server used by the runtime
    */
  val server: Server = js.native
  
  /**
    * This provides access to the internal settings module of the
    * runtime.
    */
  val settings: PersistentSettings = js.native
  
  /**
    * Start the Node-RED application.
    */
  def start(): js.Promise[Unit] = js.native
  
  /**
    * Stop the Node-RED application.
    */
  def stop(): js.Promise[Unit] = js.native
  
  /**
    * General utilities
    */
  var util: Util = js.native
  
  /**
    * Get the version of the runtime
    */
  val version: String = js.native
}

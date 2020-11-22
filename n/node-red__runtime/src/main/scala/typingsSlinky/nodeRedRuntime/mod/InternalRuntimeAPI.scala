package typingsSlinky.nodeRedRuntime.mod

import typingsSlinky.express.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.httpsMod.Server
import typingsSlinky.nodeRedUtil.mod.I18n
import typingsSlinky.nodeRedUtil.mod.Log
import typingsSlinky.nodeRedUtil.mod.Util
import typingsSlinky.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-line:no-empty-interface
@js.native
trait InternalRuntimeAPI extends js.Object {
  
  val adminApi: js.Object = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def adminApp(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  def adminApp(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def adminApp(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  def adminApp(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("adminApp")
  val adminApp_Original: Express = js.native
  
  var events: EventEmitter = js.native
  
  var exec: InternalExecModule = js.native
  
  val i18n: I18n = js.native
  
  def isStarted(): Boolean = js.native
  
  var library: InternalLibraryModule = js.native
  
  val log: Log = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def nodeApp(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  def nodeApp(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def nodeApp(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  def nodeApp(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("nodeApp")
  val nodeApp_Original: Express = js.native
  
  var nodes: InternalNodesModule = js.native
  
  val server: Server = js.native
  
  var settings: PersistentSettings = js.native
  
  var storage: StorageModule = js.native
  
  var util: Util = js.native
  
  def version(): String = js.native
}

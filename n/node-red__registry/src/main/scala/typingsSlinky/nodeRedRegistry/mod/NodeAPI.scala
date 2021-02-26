package typingsSlinky.nodeRedRegistry.mod

import typingsSlinky.express.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.httpsMod.Server
import typingsSlinky.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Runtime API provided to nodes by Node Registry
  */
@js.native
trait NodeAPI[TSets /* <: NodeAPISettingsWithData */] extends StObject {
  
  @JSName("_")
  var _underscore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.I18nTFunction */ js.Any = js.native
  
  var auth: NodeAPIAuth = js.native
  
  var comms: NodeAPIComms = js.native
  
  var events: EventEmitter = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def httpAdmin(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  def httpAdmin(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def httpAdmin(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  def httpAdmin(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("httpAdmin")
  val httpAdmin_Original: Express = js.native
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def httpNode(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  def httpNode(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def httpNode(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  def httpNode(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("httpNode")
  val httpNode_Original: Express = js.native
  
  var library: NodeAPILibrary = js.native
  
  var log: NodeApiLog = js.native
  
  var nodes: NodeAPINodes = js.native
  
  def require(id: String): js.Any = js.native
  
  val server: Server = js.native
  
  var settings: TSets = js.native
  
  var util: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.Util */ js.Any = js.native
  
  def version(): js.Promise[String] = js.native
}

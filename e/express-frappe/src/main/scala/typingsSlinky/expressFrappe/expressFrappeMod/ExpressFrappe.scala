package typingsSlinky.expressFrappe.expressFrappeMod

import typingsSlinky.expressServeStaticCore.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.Server
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-frappe/dist/express-frappe", "ExpressFrappe")
@js.native
class ExpressFrappe protected () extends js.Object {
  def this(config: ExpressFrappeConfig) = this()
  
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
  
  var server: Server = js.native
}

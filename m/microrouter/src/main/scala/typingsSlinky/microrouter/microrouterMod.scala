package typingsSlinky.microrouter

import typingsSlinky.micro.microMod.RequestHandler
import typingsSlinky.microrouter.microrouterMod.AugmentedRequestHandler
import typingsSlinky.microrouter.microrouterMod.RouteHandler
import typingsSlinky.microrouter.microrouterMod.ServerRequest
import typingsSlinky.microrouter.microrouterMod.ServerResponse
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microrouter", JSImport.Namespace)
@js.native
object microrouterMod extends js.Object {
  val del: RouteHandler = js.native
  val get: RouteHandler = js.native
  val head: RouteHandler = js.native
  val options: RouteHandler = js.native
  val patch: RouteHandler = js.native
  val post: RouteHandler = js.native
  val put: RouteHandler = js.native
  def router(routes: RequestHandler*): RequestHandler = js.native
  def withNamespace(namespace: String): js.Function1[/* repeated */ RequestHandler, RequestHandler] = js.native
  type AugmentedRequestHandler = js.Function2[/* req */ ServerRequest, /* res */ ServerResponse, js.Any]
  type RouteHandler = js.Function2[/* path */ String, /* handler */ AugmentedRequestHandler, RequestHandler]
  type ServerRequest = IncomingMessage with Anon_Key
  type ServerResponse = typingsSlinky.node.httpMod.ServerResponse
}


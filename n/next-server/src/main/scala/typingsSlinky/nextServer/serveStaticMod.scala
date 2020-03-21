package typingsSlinky.nextServer

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/server/serve-static", JSImport.Namespace)
@js.native
object serveStaticMod extends js.Object {
  def serveStatic(req: IncomingMessage, res: ServerResponse, path: String): js.Promise[Unit] = js.native
}


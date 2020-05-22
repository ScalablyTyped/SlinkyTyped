package typingsSlinky.nextReactDevOverlay.middlewareMod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@next/react-dev-overlay/lib/middleware", "getOverlayMiddleware")
@js.native
object getOverlayMiddleware extends js.Object {
  def apply(options: OverlayMiddlewareOptions): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function, 
    js.Promise[_]
  ] = js.native
}


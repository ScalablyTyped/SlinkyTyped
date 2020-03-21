package typingsSlinky.ddTrace

import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.opentracing.mod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  /**
    * Hook to execute just before the request span finishes.
    */
  var request: js.UndefOr[
    js.Function3[
      /* span */ js.UndefOr[Span], 
      /* req */ js.UndefOr[IncomingMessage | ClientRequest], 
      /* res */ js.UndefOr[ServerResponse | IncomingMessage], 
      _
    ]
  ] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(
    request: (/* span */ js.UndefOr[Span], /* req */ js.UndefOr[IncomingMessage | ClientRequest], /* res */ js.UndefOr[ServerResponse | IncomingMessage]) => _ = null
  ): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction3(request))
    __obj.asInstanceOf[Anon1]
  }
}


package typingsSlinky.findMyWay.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.http2Mod.Http2ServerRequest
import typingsSlinky.node.http2Mod.Http2ServerResponse
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindResult[V /* <: HTTPVersion */] extends js.Object {
  @JSName("handler")
  var handler_Original: Handler[V] = js.native
  var params: StringDictionary[js.UndefOr[String]] = js.native
  var store: js.Any = js.native
  def handler(
    req: Http2ServerRequest | IncomingMessage,
    res: Http2ServerResponse | ServerResponse,
    params: StringDictionary[js.UndefOr[String]],
    store: js.Any
  ): Unit = js.native
}


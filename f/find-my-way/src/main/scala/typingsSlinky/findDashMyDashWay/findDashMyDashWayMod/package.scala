package typingsSlinky.findDashMyDashWay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object findDashMyDashWayMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.node.http2Mod.Http2ServerRequest
  import typingsSlinky.node.http2Mod.Http2ServerResponse
  import typingsSlinky.node.httpMod.IncomingMessage
  import typingsSlinky.node.httpMod.ServerResponse

  type Handler[V /* <: HTTPVersion */] = js.Function4[
    /* req */ Http2ServerRequest | IncomingMessage, 
    /* res */ Http2ServerResponse | ServerResponse, 
    /* params */ StringDictionary[js.UndefOr[String]], 
    /* store */ js.Any, 
    Unit
  ]
}

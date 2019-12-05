package typingsSlinky.browserDashSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browserDashSyncMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.node.httpMod.IncomingMessage
  import typingsSlinky.node.httpMod.ServerResponse

  type Hash[T] = StringDictionary[T]
  type MiddlewareHandler = js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    js.Any
  ]
  type ProxyResponseMiddleware = js.Function3[
    /* proxyRes */ ServerResponse | IncomingMessage, 
    /* res */ ServerResponse, 
    /* req */ IncomingMessage, 
    Unit
  ]
}

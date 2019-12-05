package typingsSlinky.httpDashProxyDashMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpDashProxyDashMiddlewareMod {
  import typingsSlinky.connect.connectMod.NextHandleFunction
  import typingsSlinky.node.httpMod.IncomingMessage

  type Filter = js.Function2[/* pathname */ String, /* req */ IncomingMessage, Boolean]
  type Logger = js.Function1[/* repeated */ js.Any, Unit]
  type Proxy = NextHandleFunction
}

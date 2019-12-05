package typingsSlinky.httpDashProxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpDashProxyMod {
  import typingsSlinky.node.httpMod.IncomingMessage
  import typingsSlinky.node.httpMod.ServerResponse
  import typingsSlinky.node.urlMod.Url
  import typingsSlinky.std.Partial

  type ErrorCallback = js.Function4[
    /* err */ js.Error, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* target */ js.UndefOr[ProxyTargetUrl], 
    Unit
  ]
  type ProxyTargetUrl = String | Partial[Url]
}

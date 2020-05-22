package typingsSlinky.httpProxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorCallback = js.Function4[
    /* err */ js.Error, 
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    /* target */ js.UndefOr[typingsSlinky.httpProxy.mod.ProxyTargetUrl], 
    scala.Unit
  ]
  type ProxyTarget = typingsSlinky.httpProxy.mod.ProxyTargetUrl | typingsSlinky.httpProxy.mod.ProxyTargetDetailed
  type ProxyTargetUrl = java.lang.String | typingsSlinky.httpProxy.anon.PartialUrl
}

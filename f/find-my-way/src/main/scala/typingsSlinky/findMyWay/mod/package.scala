package typingsSlinky.findMyWay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handler[V /* <: typingsSlinky.findMyWay.mod.HTTPVersion */] = js.Function4[
    /* req */ typingsSlinky.findMyWay.mod.Req[V], 
    /* res */ typingsSlinky.findMyWay.mod.Res[V], 
    /* params */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]], 
    /* store */ js.Any, 
    scala.Unit
  ]
  type Req[V] = typingsSlinky.node.http2Mod.Http2ServerRequest | typingsSlinky.node.httpMod.IncomingMessage
  type Res[V] = typingsSlinky.node.http2Mod.Http2ServerResponse | typingsSlinky.node.httpMod.ServerResponse
}

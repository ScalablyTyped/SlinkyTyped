package typingsSlinky.nock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InterceptFunction = js.Function3[
    /* uri */ java.lang.String | js.RegExp | (js.Function1[/* uri */ java.lang.String, scala.Boolean]), 
    /* requestBody */ js.UndefOr[typingsSlinky.nock.mod.RequestBodyMatcher], 
    /* interceptorOptions */ js.UndefOr[typingsSlinky.nock.mod.Options], 
    typingsSlinky.nock.mod.Interceptor
  ]
  type ReplyHeaderFunction = js.Function3[
    /* req */ typingsSlinky.node.httpMod.ClientRequest, 
    /* res */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* body */ java.lang.String | typingsSlinky.node.Buffer, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type StatusCode = scala.Double
}

package typingsSlinky.logfmt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object logfmtMod {
  import typingsSlinky.node.httpMod.IncomingMessage
  import typingsSlinky.node.httpMod.ServerResponse

  type HTTPHandler = js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
    js.Any
  ]
  type RequestLoggerFormatter = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, js.Object]
}

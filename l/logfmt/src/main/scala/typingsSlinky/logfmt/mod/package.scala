package typingsSlinky.logfmt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HTTPHandler = js.Function3[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    js.Any
  ]
  type RequestLoggerFormatter = js.Function2[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    js.Object
  ]
}

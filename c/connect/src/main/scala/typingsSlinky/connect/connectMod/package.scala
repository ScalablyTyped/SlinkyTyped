package typingsSlinky.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectMod {
  import typingsSlinky.node.httpMod.IncomingMessage
  import typingsSlinky.node.httpMod.ServerResponse

  type ErrorHandleFunction = js.Function4[
    /* err */ js.Any, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ NextFunction, 
    Unit
  ]
  type HandleFunction = SimpleHandleFunction | NextHandleFunction | ErrorHandleFunction
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], Unit]
  type NextHandleFunction = js.Function3[/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ NextFunction, Unit]
  type ServerHandle = HandleFunction | typingsSlinky.node.httpMod.Server
  type SimpleHandleFunction = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Unit]
}

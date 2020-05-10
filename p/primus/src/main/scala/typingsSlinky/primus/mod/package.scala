package typingsSlinky.primus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AuthorizationHandler = js.Function2[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* done */ js.Function1[
      /* err */ js.UndefOr[java.lang.String | js.Error | typingsSlinky.primus.AnonAuthenticate], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type Middleware = js.Function2[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* res */ typingsSlinky.node.httpMod.ServerResponse, 
    scala.Unit
  ]
}

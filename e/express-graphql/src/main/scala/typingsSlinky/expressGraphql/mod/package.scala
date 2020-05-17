package typingsSlinky.expressGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Middleware = js.Function2[
    /* request */ typingsSlinky.expressGraphql.mod.Request, 
    /* response */ typingsSlinky.expressGraphql.mod.Response, 
    js.Promise[js.UndefOr[scala.Nothing]]
  ]
  type Request = typingsSlinky.node.httpMod.IncomingMessage
  type Response = typingsSlinky.node.httpMod.ServerResponse
}

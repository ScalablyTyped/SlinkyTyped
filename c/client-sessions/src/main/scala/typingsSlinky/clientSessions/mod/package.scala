package typingsSlinky.clientSessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]
  type RequestHandler = js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ typingsSlinky.clientSessions.mod.NextFunction, 
    js.Any
  ]
}

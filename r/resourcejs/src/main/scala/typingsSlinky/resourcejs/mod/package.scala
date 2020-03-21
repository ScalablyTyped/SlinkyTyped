package typingsSlinky.resourcejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HttpHandler = js.Function3[
    /* req */ typingsSlinky.resourcejs.mod.Request, 
    /* res */ typingsSlinky.resourcejs.mod.Response, 
    /* next */ typingsSlinky.express.mod.NextFunction, 
    scala.Unit
  ]
  type MethodBuild[T] = js.Function1[/* options */ js.UndefOr[T], typingsSlinky.resourcejs.mod.ResourceEndpoint]
}

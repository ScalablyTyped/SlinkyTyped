package typingsSlinky.combinedStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NextFunction = js.Function1[
    /* next */ js.Function1[/* stream */ typingsSlinky.combinedStream.mod.Appendable, js.Any], 
    js.Any
  ]
}

package typingsSlinky.graphqlToolsMerge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mergeTypedefsMod {
  type CompareFn[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
}

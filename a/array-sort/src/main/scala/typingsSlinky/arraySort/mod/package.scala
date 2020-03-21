package typingsSlinky.arraySort

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  type ComparisonArg[T] = java.lang.String | typingsSlinky.arraySort.mod.Comparator[T]
  type ComparisonArgs[T] = typingsSlinky.arraySort.mod.ComparisonArg[T] | js.Array[typingsSlinky.arraySort.mod.ComparisonArg[T]]
}

package typingsSlinky.matchSorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExtendedKeyOptions[T] = typingsSlinky.matchSorter.AnonKey[T] with (typingsSlinky.matchSorter.AnonMinRanking | typingsSlinky.matchSorter.AnonMaxRanking | typingsSlinky.matchSorter.AnonThreshold)
  type KeyOptions[T] = java.lang.String | (js.Function1[/* item */ T, java.lang.String | js.Array[java.lang.String]])
}

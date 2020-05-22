package typingsSlinky.matchSorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExtendedKeyOptions[T] = typingsSlinky.matchSorter.anon.Key[T] with (typingsSlinky.matchSorter.anon.MinRanking | typingsSlinky.matchSorter.anon.MaxRanking | typingsSlinky.matchSorter.anon.Threshold)
  type KeyOptions[T] = java.lang.String | (js.Function1[/* item */ T, java.lang.String | js.Array[java.lang.String]])
}

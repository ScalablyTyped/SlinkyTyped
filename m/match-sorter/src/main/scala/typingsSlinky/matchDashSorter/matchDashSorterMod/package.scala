package typingsSlinky.matchDashSorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object matchDashSorterMod {
  import typingsSlinky.matchDashSorter.Anon_Key
  import typingsSlinky.matchDashSorter.Anon_MaxRanking
  import typingsSlinky.matchDashSorter.Anon_MinRanking
  import typingsSlinky.matchDashSorter.Anon_Threshold

  type ExtendedKeyOptions[T] = Anon_Key[T] with (Anon_MinRanking | Anon_MaxRanking | Anon_Threshold)
  type KeyOptions[T] = String | (js.Function1[/* item */ T, String | js.Array[String]])
}

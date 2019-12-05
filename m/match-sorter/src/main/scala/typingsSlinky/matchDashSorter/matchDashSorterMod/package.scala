package typingsSlinky.matchDashSorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object matchDashSorterMod {
  import typingsSlinky.matchDashSorter.Anon_Item
  import typingsSlinky.matchDashSorter.Anon_MaxRanking
  import typingsSlinky.matchDashSorter.Anon_MinRanking
  import typingsSlinky.matchDashSorter.Anon_Threshold

  type ExtendedKeyOptions[T] = Anon_Item[T] with (Anon_MinRanking | Anon_MaxRanking | Anon_Threshold)
}

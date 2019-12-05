package typingsSlinky.atOracleOraclejet.ojdatagridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojDataGrid {
  import org.scalajs.dom.raw.CustomEvent

  type ojBeforeCurrentCell[K] = CustomEvent
  type ojBeforeEdit[K, D] = CustomEvent
  type ojBeforeEditEnd[K, D] = CustomEvent
  type ojResize = CustomEvent
  type ojScroll = CustomEvent
  type ojSort = CustomEvent
}

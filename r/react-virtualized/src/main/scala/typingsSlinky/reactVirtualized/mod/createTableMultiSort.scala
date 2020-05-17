package typingsSlinky.reactVirtualized.mod

import typingsSlinky.reactVirtualized.anon.SortBy
import typingsSlinky.reactVirtualized.esTableMod.MultiSortOptions
import typingsSlinky.reactVirtualized.esTableMod.MultiSortReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized", "createTableMultiSort")
@js.native
object createTableMultiSort extends js.Object {
  def apply(sortCallback: js.Function1[/* params */ SortBy, Unit]): MultiSortReturn = js.native
  def apply(sortCallback: js.Function1[/* params */ SortBy, Unit], options: MultiSortOptions): MultiSortReturn = js.native
}


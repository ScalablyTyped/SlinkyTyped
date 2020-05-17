package typingsSlinky.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esMasonryMod {
  type CellRenderer = js.Function1[
    /* props */ typingsSlinky.reactVirtualized.esMasonryMod.MasonryCellProps, 
    slinky.core.TagMod[scala.Any]
  ]
  type OnCellsRenderedCallback = js.Function1[/* params */ typingsSlinky.reactVirtualized.mod.IndexRange, scala.Unit]
  type OnScrollCallback = js.Function1[/* params */ typingsSlinky.reactVirtualized.anon.ClientHeight, scala.Unit]
  type Positioner = (js.Function1[/* index */ scala.Double, typingsSlinky.reactVirtualized.esMasonryMod.Position]) with typingsSlinky.reactVirtualized.anon.Reset
  type emptyObject = js.Object
  type identity = js.Function1[/* value */ js.Any, js.Any]
  type noop = js.Function0[scala.Unit]
}

package typingsSlinky.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esGridMod {
  type GridCellRangeRenderer = js.Function1[
    /* params */ typingsSlinky.reactVirtualized.esGridMod.GridCellRangeProps, 
    js.Array[slinky.core.TagMod[scala.Any]]
  ]
  type GridCellRenderer = js.Function1[
    /* props */ typingsSlinky.reactVirtualized.esGridMod.GridCellProps, 
    slinky.core.TagMod[scala.Any]
  ]
  type OverscanIndicesGetter = js.Function1[
    /* params */ typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetterParams, 
    typingsSlinky.reactVirtualized.esGridMod.OverscanIndices
  ]
  type SCROLL_DIRECTION_HORIZONTAL = typingsSlinky.reactVirtualized.reactVirtualizedStrings.horizontal
  type SCROLL_DIRECTION_VERTICAL = typingsSlinky.reactVirtualized.reactVirtualizedStrings.vertical
  type SectionRenderedParams = typingsSlinky.reactVirtualized.esGridMod.RenderedSection
}

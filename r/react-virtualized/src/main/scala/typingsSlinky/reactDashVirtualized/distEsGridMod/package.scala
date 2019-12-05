package typingsSlinky.reactDashVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsGridMod {
  import slinky.core.TagMod
  import typingsSlinky.reactDashVirtualized.Anon_CellRenderer
  import typingsSlinky.reactDashVirtualized.reactDashVirtualizedStrings.horizontal
  import typingsSlinky.reactDashVirtualized.reactDashVirtualizedStrings.vertical

  type GridCellRangeRenderer = js.Function1[/* params */ GridCellRangeProps, js.Array[TagMod[Any]]]
  type GridCellRenderer = js.Function1[/* props */ GridCellProps, TagMod[Any]]
  type GridProps = GridCoreProps with Anon_CellRenderer
  type OverscanIndicesGetter = js.Function1[/* params */ OverscanIndicesGetterParams, OverscanIndices]
  type SCROLL_DIRECTION_HORIZONTAL = horizontal
  type SCROLL_DIRECTION_VERTICAL = vertical
  type SectionRenderedParams = RenderedSection
}

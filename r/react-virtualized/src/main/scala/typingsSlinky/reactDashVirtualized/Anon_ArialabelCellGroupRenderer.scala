package typingsSlinky.reactDashVirtualized

import slinky.core.TagMod
import typingsSlinky.reactDashVirtualized.distEsCollectionMod.CollectionCellGroupRenderer
import typingsSlinky.reactDashVirtualized.distEsCollectionMod.CollectionCellGroupRendererParams
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArialabelCellGroupRenderer extends js.Object {
  var `aria-label`: grid
  var cellGroupRenderer: CollectionCellGroupRenderer
}

object Anon_ArialabelCellGroupRenderer {
  @scala.inline
  def apply(
    `aria-label`: grid,
    cellGroupRenderer: /* params */ CollectionCellGroupRendererParams => js.Array[TagMod[Any]]
  ): Anon_ArialabelCellGroupRenderer = {
    val __obj = js.Dynamic.literal(cellGroupRenderer = js.Any.fromFunction1(cellGroupRenderer))
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArialabelCellGroupRenderer]
  }
}


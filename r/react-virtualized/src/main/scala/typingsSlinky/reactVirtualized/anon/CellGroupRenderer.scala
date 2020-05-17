package typingsSlinky.reactVirtualized.anon

import slinky.core.TagMod
import typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellGroupRenderer
import typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams
import typingsSlinky.reactVirtualized.reactVirtualizedStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellGroupRenderer extends js.Object {
  var `aria-label`: grid = js.native
  var cellGroupRenderer: CollectionCellGroupRenderer = js.native
}

object CellGroupRenderer {
  @scala.inline
  def apply(
    `aria-label`: grid,
    cellGroupRenderer: /* params */ CollectionCellGroupRendererParams => js.Array[TagMod[Any]]
  ): CellGroupRenderer = {
    val __obj = js.Dynamic.literal(cellGroupRenderer = js.Any.fromFunction1(cellGroupRenderer))
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellGroupRenderer]
  }
  @scala.inline
  implicit class CellGroupRendererOps[Self <: CellGroupRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-label`(value: grid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellGroupRenderer(value: /* params */ CollectionCellGroupRendererParams => js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellGroupRenderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


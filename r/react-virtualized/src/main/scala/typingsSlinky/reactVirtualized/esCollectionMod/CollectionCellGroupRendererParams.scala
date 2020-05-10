package typingsSlinky.reactVirtualized.esCollectionMod

import slinky.core.TagMod
import typingsSlinky.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionCellGroupRendererParams extends js.Object {
  var cellRenderer: CollectionCellRenderer = js.native
  var cellSizeAndPositionGetter: CollectionCellSizeAndPositionGetter = js.native
  var indices: js.Array[Double] = js.native
}

object CollectionCellGroupRendererParams {
  @scala.inline
  def apply(
    cellRenderer: /* params */ CollectionCellRendererParams => TagMod[Any],
    cellSizeAndPositionGetter: /* params */ Index => CollectionCellSizeAndPosition,
    indices: js.Array[Double]
  ): CollectionCellGroupRendererParams = {
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction1(cellRenderer), cellSizeAndPositionGetter = js.Any.fromFunction1(cellSizeAndPositionGetter), indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionCellGroupRendererParams]
  }
  @scala.inline
  implicit class CollectionCellGroupRendererParamsOps[Self <: CollectionCellGroupRendererParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellRenderer(value: /* params */ CollectionCellRendererParams => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCellSizeAndPositionGetter(value: /* params */ Index => CollectionCellSizeAndPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSizeAndPositionGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


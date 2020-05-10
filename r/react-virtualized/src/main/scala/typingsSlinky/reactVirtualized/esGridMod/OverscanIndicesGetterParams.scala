package typingsSlinky.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverscanIndicesGetterParams extends js.Object {
  var cellCount: Double = js.native
  var direction: js.UndefOr[SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL] = js.native
  var overscanCellsCount: Double = js.native
  var scrollDirection: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL = js.native
  var startIndex: Double = js.native
  var stopIndex: Double = js.native
}

object OverscanIndicesGetterParams {
  @scala.inline
  def apply(
    cellCount: Double,
    overscanCellsCount: Double,
    scrollDirection: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL,
    startIndex: Double,
    stopIndex: Double
  ): OverscanIndicesGetterParams = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], overscanCellsCount = overscanCellsCount.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], stopIndex = stopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverscanIndicesGetterParams]
  }
  @scala.inline
  implicit class OverscanIndicesGetterParamsOps[Self <: OverscanIndicesGetterParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverscanCellsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanCellsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollDirection(value: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
  }
  
}


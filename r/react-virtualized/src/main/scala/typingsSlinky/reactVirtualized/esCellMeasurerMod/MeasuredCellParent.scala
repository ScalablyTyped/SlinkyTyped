package typingsSlinky.reactVirtualized.esCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeasuredCellParent extends js.Object {
  var invalidateCellSizeAfterRender: js.UndefOr[js.Function1[/* cell */ CellPosition, Unit]] = js.native
  var recomputeGridSize: js.UndefOr[js.Function1[/* cell */ CellPosition, Unit]] = js.native
}

object MeasuredCellParent {
  @scala.inline
  def apply(): MeasuredCellParent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasuredCellParent]
  }
  @scala.inline
  implicit class MeasuredCellParentOps[Self <: MeasuredCellParent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidateCellSizeAfterRender(value: /* cell */ CellPosition => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidateCellSizeAfterRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInvalidateCellSizeAfterRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidateCellSizeAfterRender")(js.undefined)
        ret
    }
    @scala.inline
    def withRecomputeGridSize(value: /* cell */ CellPosition => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recomputeGridSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRecomputeGridSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recomputeGridSize")(js.undefined)
        ret
    }
  }
  
}


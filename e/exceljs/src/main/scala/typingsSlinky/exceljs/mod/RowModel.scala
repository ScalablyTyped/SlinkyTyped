package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.PartialStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowModel extends js.Object {
  var cells: js.Array[CellModel] = js.native
  var collapsed: Boolean = js.native
  var height: Double = js.native
  var hidden: Boolean = js.native
  var max: Double = js.native
  var min: Double = js.native
  var number: Double = js.native
  var outlineLevel: Double = js.native
  var style: PartialStyle = js.native
}

object RowModel {
  @scala.inline
  def apply(
    cells: js.Array[CellModel],
    collapsed: Boolean,
    height: Double,
    hidden: Boolean,
    max: Double,
    min: Double,
    number: Double,
    outlineLevel: Double,
    style: PartialStyle
  ): RowModel = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], outlineLevel = outlineLevel.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowModel]
  }
  @scala.inline
  implicit class RowModelOps[Self <: RowModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[CellModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlineLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: PartialStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


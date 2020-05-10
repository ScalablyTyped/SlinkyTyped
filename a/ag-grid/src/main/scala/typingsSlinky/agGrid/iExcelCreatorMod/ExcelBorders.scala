package typingsSlinky.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelBorders extends js.Object {
  var borderBottom: ExcelBorder = js.native
  var borderLeft: ExcelBorder = js.native
  var borderRight: ExcelBorder = js.native
  var borderTop: ExcelBorder = js.native
}

object ExcelBorders {
  @scala.inline
  def apply(
    borderBottom: ExcelBorder,
    borderLeft: ExcelBorder,
    borderRight: ExcelBorder,
    borderTop: ExcelBorder
  ): ExcelBorders = {
    val __obj = js.Dynamic.literal(borderBottom = borderBottom.asInstanceOf[js.Any], borderLeft = borderLeft.asInstanceOf[js.Any], borderRight = borderRight.asInstanceOf[js.Any], borderTop = borderTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelBorders]
  }
  @scala.inline
  implicit class ExcelBordersOps[Self <: ExcelBorders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderBottom(value: ExcelBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderLeft(value: ExcelBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderRight(value: ExcelBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderTop(value: ExcelBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


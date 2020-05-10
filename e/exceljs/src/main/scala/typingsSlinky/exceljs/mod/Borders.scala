package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.PartialBorder
import typingsSlinky.exceljs.PartialBorderDiagonal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Borders extends js.Object {
  var bottom: PartialBorder = js.native
  var diagonal: PartialBorderDiagonal = js.native
  var left: PartialBorder = js.native
  var right: PartialBorder = js.native
  var top: PartialBorder = js.native
}

object Borders {
  @scala.inline
  def apply(
    bottom: PartialBorder,
    diagonal: PartialBorderDiagonal,
    left: PartialBorder,
    right: PartialBorder,
    top: PartialBorder
  ): Borders = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], diagonal = diagonal.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
  @scala.inline
  implicit class BordersOps[Self <: Borders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: PartialBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiagonal(value: PartialBorderDiagonal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagonal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: PartialBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: PartialBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: PartialBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


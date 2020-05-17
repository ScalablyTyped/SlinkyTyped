package typingsSlinky.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Borders> */
@js.native
trait PartialBordersBottom extends js.Object {
  var bottom: js.UndefOr[PartialBorderColor] = js.native
  var diagonal: js.UndefOr[PartialBorderDiagonalColor] = js.native
  var left: js.UndefOr[PartialBorderColor] = js.native
  var right: js.UndefOr[PartialBorderColor] = js.native
  var top: js.UndefOr[PartialBorderColor] = js.native
}

object PartialBordersBottom {
  @scala.inline
  def apply(): PartialBordersBottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBordersBottom]
  }
  @scala.inline
  implicit class PartialBordersBottomOps[Self <: PartialBordersBottom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: PartialBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagonal(value: PartialBorderDiagonalColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagonal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagonal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagonal")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: PartialBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: PartialBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: PartialBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}


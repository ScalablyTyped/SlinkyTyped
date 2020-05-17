package typingsSlinky.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Borders> */
@js.native
trait PartialBorders extends js.Object {
  var bottom: js.UndefOr[PartialBorder] = js.native
  var diagonal: js.UndefOr[PartialBorderDiagonal] = js.native
  var left: js.UndefOr[PartialBorder] = js.native
  var right: js.UndefOr[PartialBorder] = js.native
  var top: js.UndefOr[PartialBorder] = js.native
}

object PartialBorders {
  @scala.inline
  def apply(): PartialBorders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBorders]
  }
  @scala.inline
  implicit class PartialBordersOps[Self <: PartialBorders] (val x: Self) extends AnyVal {
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
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagonal(value: PartialBorderDiagonal): Self = {
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
    def withLeft(value: PartialBorder): Self = {
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
    def withRight(value: PartialBorder): Self = {
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
    def withTop(value: PartialBorder): Self = {
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


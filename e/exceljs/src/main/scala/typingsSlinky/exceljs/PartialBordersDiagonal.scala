package typingsSlinky.exceljs

import typingsSlinky.exceljs.mod.Border
import typingsSlinky.exceljs.mod.BorderDiagonal
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Borders> */
@js.native
trait PartialBordersDiagonal extends js.Object {
  var bottom: js.UndefOr[Partial[Border]] = js.native
  var diagonal: js.UndefOr[Partial[BorderDiagonal]] = js.native
  var left: js.UndefOr[Partial[Border]] = js.native
  var right: js.UndefOr[Partial[Border]] = js.native
  var top: js.UndefOr[Partial[Border]] = js.native
}

object PartialBordersDiagonal {
  @scala.inline
  def apply(): PartialBordersDiagonal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBordersDiagonal]
  }
  @scala.inline
  implicit class PartialBordersDiagonalOps[Self <: PartialBordersDiagonal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: Partial[Border]): Self = {
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
    def withDiagonal(value: Partial[BorderDiagonal]): Self = {
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
    def withLeft(value: Partial[Border]): Self = {
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
    def withRight(value: Partial[Border]): Self = {
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
    def withTop(value: Partial[Border]): Self = {
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


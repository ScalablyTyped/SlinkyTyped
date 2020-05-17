package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.mod.Fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Style> */
@js.native
trait PartialStyleAlignment extends js.Object {
  var alignment: js.UndefOr[PartialAlignment] = js.native
  var border: js.UndefOr[PartialBordersDiagonal] = js.native
  var fill: js.UndefOr[Fill] = js.native
  var font: js.UndefOr[PartialFontBold] = js.native
  var numFmt: js.UndefOr[String] = js.native
  var protection: js.UndefOr[PartialProtection] = js.native
}

object PartialStyleAlignment {
  @scala.inline
  def apply(): PartialStyleAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleAlignment]
  }
  @scala.inline
  implicit class PartialStyleAlignmentOps[Self <: PartialStyleAlignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: PartialAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: PartialBordersDiagonal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Fill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: PartialFontBold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFmt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFmt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFmt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFmt")(js.undefined)
        ret
    }
    @scala.inline
    def withProtection(value: PartialProtection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(js.undefined)
        ret
    }
  }
  
}


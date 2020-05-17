package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.PartialAlignment
import typingsSlinky.exceljs.anon.PartialBorders
import typingsSlinky.exceljs.anon.PartialFont
import typingsSlinky.exceljs.anon.PartialProtection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  var alignment: PartialAlignment = js.native
  var border: PartialBorders = js.native
  var fill: Fill = js.native
  var font: PartialFont = js.native
  var numFmt: String = js.native
  var protection: PartialProtection = js.native
}

object Style {
  @scala.inline
  def apply(
    alignment: PartialAlignment,
    border: PartialBorders,
    fill: Fill,
    font: PartialFont,
    numFmt: String,
    protection: PartialProtection
  ): Style = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], numFmt = numFmt.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
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
    def withBorder(value: PartialBorders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: Fill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: PartialFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumFmt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFmt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtection(value: PartialProtection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


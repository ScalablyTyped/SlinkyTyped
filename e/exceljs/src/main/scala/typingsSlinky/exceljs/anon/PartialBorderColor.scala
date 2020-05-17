package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.mod.BorderStyle
import typingsSlinky.exceljs.mod.Color
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Border> */
@js.native
trait PartialBorderColor extends js.Object {
  var color: js.UndefOr[Partial[Color]] = js.native
  var style: js.UndefOr[BorderStyle] = js.native
}

object PartialBorderColor {
  @scala.inline
  def apply(): PartialBorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBorderColor]
  }
  @scala.inline
  implicit class PartialBorderColorOps[Self <: PartialBorderColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Partial[Color]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: BorderStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}


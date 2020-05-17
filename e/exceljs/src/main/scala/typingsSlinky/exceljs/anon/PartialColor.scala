package typingsSlinky.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Color> */
@js.native
trait PartialColor extends js.Object {
  var argb: js.UndefOr[String] = js.native
  var theme: js.UndefOr[Double] = js.native
}

object PartialColor {
  @scala.inline
  def apply(): PartialColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColor]
  }
  @scala.inline
  implicit class PartialColorOps[Self <: PartialColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argb")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}


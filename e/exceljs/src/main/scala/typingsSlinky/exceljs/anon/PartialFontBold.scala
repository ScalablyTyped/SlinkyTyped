package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.exceljsStrings.double
import typingsSlinky.exceljs.exceljsStrings.doubleAccounting
import typingsSlinky.exceljs.exceljsStrings.major
import typingsSlinky.exceljs.exceljsStrings.minor
import typingsSlinky.exceljs.exceljsStrings.none_
import typingsSlinky.exceljs.exceljsStrings.single
import typingsSlinky.exceljs.exceljsStrings.singleAccounting
import typingsSlinky.exceljs.exceljsStrings.subscript
import typingsSlinky.exceljs.exceljsStrings.superscript
import typingsSlinky.exceljs.mod.Color
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Font> */
@js.native
trait PartialFontBold extends js.Object {
  var bold: js.UndefOr[Boolean] = js.native
  var charset: js.UndefOr[Double] = js.native
  var color: js.UndefOr[Partial[Color]] = js.native
  var family: js.UndefOr[Double] = js.native
  var italic: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var outline: js.UndefOr[Boolean] = js.native
  var scheme: js.UndefOr[minor | major | none_] = js.native
  var size: js.UndefOr[Double] = js.native
  var strike: js.UndefOr[Boolean] = js.native
  var underline: js.UndefOr[Boolean | none_ | single | double | singleAccounting | doubleAccounting] = js.native
  var vertAlign: js.UndefOr[superscript | subscript] = js.native
}

object PartialFontBold {
  @scala.inline
  def apply(): PartialFontBold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFontBold]
  }
  @scala.inline
  implicit class PartialFontBoldOps[Self <: PartialFontBold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(js.undefined)
        ret
    }
    @scala.inline
    def withCharset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(js.undefined)
        ret
    }
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
    def withFamily(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
        ret
    }
    @scala.inline
    def withItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItalic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withScheme(value: minor | major | none_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStrike(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strike")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrike: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strike")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderline(value: Boolean | none_ | single | double | singleAccounting | doubleAccounting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline")(js.undefined)
        ret
    }
    @scala.inline
    def withVertAlign(value: superscript | subscript): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertAlign")(js.undefined)
        ret
    }
  }
  
}


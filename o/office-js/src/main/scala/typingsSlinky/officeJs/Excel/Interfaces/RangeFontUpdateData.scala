package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.RangeUnderlineStyle
import typingsSlinky.officeJs.officeJsStrings.DoubleAccountant
import typingsSlinky.officeJs.officeJsStrings.None
import typingsSlinky.officeJs.officeJsStrings.Single
import typingsSlinky.officeJs.officeJsStrings.SingleAccountant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeFont object, for use in `rangeFont.set({ ... })`. */
@js.native
trait RangeFontUpdateData extends js.Object {
  /**
    *
    * Represents the bold status of font.
    *
    * [Api set: ExcelApi 1.1]
    */
  var bold: js.UndefOr[Boolean] = js.native
  /**
    *
    * HTML color code representation of the text color. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Represents the italic status of the font.
    *
    * [Api set: ExcelApi 1.1]
    */
  var italic: js.UndefOr[Boolean] = js.native
  /**
    *
    * Font name (e.g. "Calibri")
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Font size.
    *
    * [Api set: ExcelApi 1.1]
    */
  var size: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the strikethrough status of font. A null value indicates that the entire range doesn't have uniform Strikethrough setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var strikethrough: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the Subscript status of font.
    Returns True if all the fonts of the range are Subscript.
    Returns False if all the fonts of the range are Superscript or normal (neither Superscript, nor Subscript).
    Returns Null otherwise.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subscript: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the Superscript status of font.
    Returns True if all the fonts of the range are Superscript.
    Returns False if all the fonts of the range are Subscript or normal (neither Superscript, nor Subscript).
    Returns Null otherwise.
    *
    * [Api set: ExcelApi 1.9]
    */
  var superscript: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Font, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the entire range doesn't have uniform font tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.native
  /**
    *
    * Type of underline applied to the font. See Excel.RangeUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var underline: js.UndefOr[
    RangeUnderlineStyle | None | Single | typingsSlinky.officeJs.officeJsStrings.Double | SingleAccountant | DoubleAccountant
  ] = js.native
}

object RangeFontUpdateData {
  @scala.inline
  def apply(): RangeFontUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeFontUpdateData]
  }
  @scala.inline
  implicit class RangeFontUpdateDataOps[Self <: RangeFontUpdateData] (val x: Self) extends AnyVal {
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
    def withColor(value: String): Self = {
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
    def withStrikethrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrikethrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscript")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperscript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperscript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superscript")(js.undefined)
        ret
    }
    @scala.inline
    def withTintAndShade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintAndShade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintAndShade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintAndShade")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderline(
      value: RangeUnderlineStyle | None | Single | typingsSlinky.officeJs.officeJsStrings.Double | SingleAccountant | DoubleAccountant
    ): Self = {
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
  }
  
}


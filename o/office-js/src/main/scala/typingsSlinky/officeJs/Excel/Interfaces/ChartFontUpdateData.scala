package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ChartUnderlineStyle
import typingsSlinky.officeJs.officeJsStrings.None
import typingsSlinky.officeJs.officeJsStrings.Single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartFont object, for use in `chartFont.set({ ... })`. */
@js.native
trait ChartFontUpdateData extends js.Object {
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
    * Size of the font (e.g. 11)
    *
    * [Api set: ExcelApi 1.1]
    */
  var size: js.UndefOr[Double] = js.native
  /**
    *
    * Type of underline applied to the font. See Excel.ChartUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var underline: js.UndefOr[ChartUnderlineStyle | None | Single] = js.native
}

object ChartFontUpdateData {
  @scala.inline
  def apply(): ChartFontUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartFontUpdateData]
  }
  @scala.inline
  implicit class ChartFontUpdateDataOps[Self <: ChartFontUpdateData] (val x: Self) extends AnyVal {
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
    def withUnderline(value: ChartUnderlineStyle | None | Single): Self = {
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


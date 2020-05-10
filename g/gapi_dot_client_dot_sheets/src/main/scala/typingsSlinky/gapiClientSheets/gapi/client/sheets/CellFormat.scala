package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellFormat extends js.Object {
  /** The background color of the cell. */
  var backgroundColor: js.UndefOr[Color] = js.native
  /**
    * The background color of the cell.
    * If background_color is also set, this field takes precedence.
    */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.native
  /** The borders of the cell. */
  var borders: js.UndefOr[Borders] = js.native
  /** The horizontal alignment of the value in the cell. */
  var horizontalAlignment: js.UndefOr[String] = js.native
  /** How a hyperlink, if it exists, should be displayed in the cell. */
  var hyperlinkDisplayType: js.UndefOr[String] = js.native
  /** A format describing how number values should be represented to the user. */
  var numberFormat: js.UndefOr[NumberFormat] = js.native
  /** The padding of the cell. */
  var padding: js.UndefOr[Padding] = js.native
  /** The direction of the text in the cell. */
  var textDirection: js.UndefOr[String] = js.native
  /** The format of the text in the cell (unless overridden by a format run). */
  var textFormat: js.UndefOr[TextFormat] = js.native
  /** The rotation applied to text in a cell */
  var textRotation: js.UndefOr[TextRotation] = js.native
  /** The vertical alignment of the value in the cell. */
  var verticalAlignment: js.UndefOr[String] = js.native
  /** The wrap strategy for the value in the cell. */
  var wrapStrategy: js.UndefOr[String] = js.native
}

object CellFormat {
  @scala.inline
  def apply(): CellFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellFormat]
  }
  @scala.inline
  implicit class CellFormatOps[Self <: CellFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorders(value: Borders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlinkDisplayType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkDisplayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperlinkDisplayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkDisplayType")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormat(value: NumberFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFormat(value: TextFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTextRotation(value: TextRotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapStrategy")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The format of a cell.
  */
@js.native
trait SchemaCellFormat extends js.Object {
  /**
    * The background color of the cell.
    */
  var backgroundColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The borders of the cell.
    */
  var borders: js.UndefOr[SchemaBorders] = js.native
  /**
    * The horizontal alignment of the value in the cell.
    */
  var horizontalAlignment: js.UndefOr[String] = js.native
  /**
    * How a hyperlink, if it exists, should be displayed in the cell.
    */
  var hyperlinkDisplayType: js.UndefOr[String] = js.native
  /**
    * A format describing how number values should be represented to the user.
    */
  var numberFormat: js.UndefOr[SchemaNumberFormat] = js.native
  /**
    * The padding of the cell.
    */
  var padding: js.UndefOr[SchemaPadding] = js.native
  /**
    * The direction of the text in the cell.
    */
  var textDirection: js.UndefOr[String] = js.native
  /**
    * The format of the text in the cell (unless overridden by a format run).
    */
  var textFormat: js.UndefOr[SchemaTextFormat] = js.native
  /**
    * The rotation applied to text in a cell
    */
  var textRotation: js.UndefOr[SchemaTextRotation] = js.native
  /**
    * The vertical alignment of the value in the cell.
    */
  var verticalAlignment: js.UndefOr[String] = js.native
  /**
    * The wrap strategy for the value in the cell.
    */
  var wrapStrategy: js.UndefOr[String] = js.native
}

object SchemaCellFormat {
  @scala.inline
  def apply(): SchemaCellFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCellFormat]
  }
  @scala.inline
  implicit class SchemaCellFormatOps[Self <: SchemaCellFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: SchemaColor): Self = {
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
    def withBorders(value: SchemaBorders): Self = {
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
    def withNumberFormat(value: SchemaNumberFormat): Self = {
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
    def withPadding(value: SchemaPadding): Self = {
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
    def withTextFormat(value: SchemaTextFormat): Self = {
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
    def withTextRotation(value: SchemaTextRotation): Self = {
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


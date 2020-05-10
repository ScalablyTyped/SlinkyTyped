package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DoubleAccountant
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Single
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SingleAccountant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.font` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.font` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellPropertiesFont extends js.Object {
  /**
    *
    * Represents the `format.font.bold` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `format.font.color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Represents the `format.font.italic` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var italic: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `format.font.name` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Represents the `format.font.size` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var size: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the `format.font.strikethrough` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var strikethrough: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `format.font.subscript` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subscript: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `format.font.superscript` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var superscript: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `format.font.tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the `format.font.underline` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underline: js.UndefOr[
    RangeUnderlineStyle | None | Single | typingsSlinky.officeJsPreview.officeJsPreviewStrings.Double | SingleAccountant | DoubleAccountant
  ] = js.native
}

object CellPropertiesFont {
  @scala.inline
  def apply(): CellPropertiesFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFont]
  }
  @scala.inline
  implicit class CellPropertiesFontOps[Self <: CellPropertiesFont] (val x: Self) extends AnyVal {
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
      value: RangeUnderlineStyle | None | Single | typingsSlinky.officeJsPreview.officeJsPreviewStrings.Double | SingleAccountant | DoubleAccountant
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


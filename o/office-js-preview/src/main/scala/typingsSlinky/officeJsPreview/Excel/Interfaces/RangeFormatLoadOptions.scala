package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A format object encapsulating the range's font, fill, borders, alignment, and other properties.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait RangeFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Indicates if text is automatically indented when text alignment is set to equal distribution.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoIndent: js.UndefOr[Boolean] = js.native
  /**
    *
    * Collection of border objects that apply to the overall range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var borders: js.UndefOr[RangeBorderCollectionLoadOptions] = js.native
  /**
    *
    * Gets or sets the width of all colums within the range. If the column widths are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the fill object defined on the overall range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var fill: js.UndefOr[RangeFillLoadOptions] = js.native
  /**
    *
    * Returns the font object defined on the overall range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[RangeFontLoadOptions] = js.native
  /**
    *
    * Represents the horizontal alignment for the specified object. See Excel.HorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * An integer from 0 to 250 that indicates the indent level.
    *
    * [Api set: ExcelApi 1.9]
    */
  var indentLevel: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the format protection object for a range.
    *
    * [Api set: ExcelApi 1.2]
    */
  var protection: js.UndefOr[FormatProtectionLoadOptions] = js.native
  /**
    *
    * The reading order for the range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the height of all rows in the range. If the row heights are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHeight: js.UndefOr[Boolean] = js.native
  /**
    *
    * Indicates if text automatically shrinks to fit in the available column width.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shrinkToFit: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the text orientation of all the cells within the range.
    The text orientation should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    If the orientation within a range are not uniform, then null will be returned.
    *
    * [Api set: ExcelApi 1.7]
    */
  var textOrientation: js.UndefOr[Boolean] = js.native
  /**
    *
    * Determines if the row height of the Range object equals the standard height of the sheet.
    Returns True if the row height of the Range object equals the standard height of the sheet.
    Returns Null if the range contains more than one row and the rows aren't all the same height.
    Returns False otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var useStandardHeight: js.UndefOr[Boolean] = js.native
  /**
    *
    * Indicates whether the column width of the Range object equals the standard width of the sheet.
    Returns True if the column width of the Range object equals the standard width of the sheet.
    Returns Null if the range contains more than one column and the columns aren't all the same height.
    Returns False otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var useStandardWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the vertical alignment for the specified object. See Excel.VerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap setting
    *
    * [Api set: ExcelApi 1.1]
    */
  var wrapText: js.UndefOr[Boolean] = js.native
}

object RangeFormatLoadOptions {
  @scala.inline
  def apply(): RangeFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeFormatLoadOptions]
  }
  @scala.inline
  implicit class RangeFormatLoadOptionsOps[Self <: RangeFormatLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withBorders(value: RangeBorderCollectionLoadOptions): Self = {
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
    def withColumnWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: RangeFillLoadOptions): Self = {
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
    def withFont(value: RangeFontLoadOptions): Self = {
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
    def withHorizontalAlignment(value: Boolean): Self = {
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
    def withIndentLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withProtection(value: FormatProtectionLoadOptions): Self = {
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
    @scala.inline
    def withReadingOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readingOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadingOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readingOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withShrinkToFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkToFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrinkToFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkToFit")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOrientation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStandardHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStandardHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStandardHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStandardHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStandardWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStandardWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStandardWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStandardWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: Boolean): Self = {
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
    def withWrapText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapText")(js.undefined)
        ret
    }
  }
  
}


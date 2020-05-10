package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.HorizontalAlignment
import typingsSlinky.officeJs.Excel.ReadingOrder
import typingsSlinky.officeJs.Excel.VerticalAlignment
import typingsSlinky.officeJs.officeJsStrings.Bottom
import typingsSlinky.officeJs.officeJsStrings.Center
import typingsSlinky.officeJs.officeJsStrings.CenterAcrossSelection
import typingsSlinky.officeJs.officeJsStrings.Context
import typingsSlinky.officeJs.officeJsStrings.Distributed
import typingsSlinky.officeJs.officeJsStrings.Fill
import typingsSlinky.officeJs.officeJsStrings.General
import typingsSlinky.officeJs.officeJsStrings.Justify
import typingsSlinky.officeJs.officeJsStrings.Left
import typingsSlinky.officeJs.officeJsStrings.LeftToRight
import typingsSlinky.officeJs.officeJsStrings.Right
import typingsSlinky.officeJs.officeJsStrings.RightToLeft
import typingsSlinky.officeJs.officeJsStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `style.toJSON()`. */
@js.native
trait StyleData extends js.Object {
  /**
    *
    * Indicates if text is automatically indented when the text alignment in a cell is set to equal distribution.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoIndent: js.UndefOr[Boolean] = js.native
  /**
    *
    * A Border collection of four Border objects that represent the style of the four borders.
    *
    * [Api set: ExcelApi 1.7]
    */
  var borders: js.UndefOr[js.Array[RangeBorderData]] = js.native
  /**
    *
    * Indicates if the style is a built-in style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var builtIn: js.UndefOr[Boolean] = js.native
  /**
    *
    * The Fill of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var fill: js.UndefOr[RangeFillData] = js.native
  /**
    *
    * A Font object that represents the font of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[RangeFontData] = js.native
  /**
    *
    * Indicates if the formula will be hidden when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the horizontal alignment for the style. See Excel.HorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var horizontalAlignment: js.UndefOr[
    HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
  ] = js.native
  /**
    *
    * Indicates if the style includes the AutoIndent, HorizontalAlignment, VerticalAlignment, WrapText, IndentLevel, and TextOrientation properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Indicates if the style includes the Color, ColorIndex, LineStyle, and Weight border properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeBorder: js.UndefOr[Boolean] = js.native
  /**
    *
    * Indicates if the style includes the Background, Bold, Color, ColorIndex, FontStyle, Italic, Name, Size, Strikethrough, Subscript, Superscript, and Underline font properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeFont: js.UndefOr[Boolean] = js.native
  /**
    *
    * Indicates if the style includes the NumberFormat property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeNumber: js.UndefOr[Boolean] = js.native
  /**
    *
    * Indicates if the style includes the Color, ColorIndex, InvertIfNegative, Pattern, PatternColor, and PatternColorIndex interior properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includePatterns: js.UndefOr[Boolean] = js.native
  /**
    *
    * Indicates if the style includes the FormulaHidden and Locked protection properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeProtection: js.UndefOr[Boolean] = js.native
  /**
    *
    * An integer from 0 to 250 that indicates the indent level for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var indentLevel: js.UndefOr[Double] = js.native
  /**
    *
    * Indicates if the object is locked when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var locked: js.UndefOr[Boolean] = js.native
  /**
    *
    * The name of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * The format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormat: js.UndefOr[String] = js.native
  /**
    *
    * The localized format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[String] = js.native
  /**
    *
    * The reading order for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var readingOrder: js.UndefOr[ReadingOrder | Context | LeftToRight | RightToLeft] = js.native
  /**
    *
    * Indicates if text automatically shrinks to fit in the available column width.
    *
    * [Api set: ExcelApi 1.7]
    */
  var shrinkToFit: js.UndefOr[Boolean] = js.native
  /**
    *
    * The text orientation for the style.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the vertical alignment for the style. See Excel.VerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Top | Center | Bottom | Justify | Distributed] = js.native
  /**
    *
    * Indicates if Microsoft Excel wraps the text in the object.
    *
    * [Api set: ExcelApi 1.7]
    */
  var wrapText: js.UndefOr[Boolean] = js.native
}

object StyleData {
  @scala.inline
  def apply(): StyleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleData]
  }
  @scala.inline
  implicit class StyleDataOps[Self <: StyleData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBorders(value: js.Array[RangeBorderData]): Self = {
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
    def withBuiltIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtIn")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: RangeFillData): Self = {
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
    def withFont(value: RangeFontData): Self = {
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
    def withFormulaHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulaHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormulaHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulaHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(
      value: HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
    ): Self = {
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
    def withIncludeAlignment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeFont(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFont")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePatterns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeProtection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentLevel(value: Double): Self = {
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
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
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
    def withNumberFormat(value: String): Self = {
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
    def withNumberFormatLocal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormatLocal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormatLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormatLocal")(js.undefined)
        ret
    }
    @scala.inline
    def withReadingOrder(value: ReadingOrder | Context | LeftToRight | RightToLeft): Self = {
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
    def withTextOrientation(value: Double): Self = {
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
    def withVerticalAlignment(value: VerticalAlignment | Top | Center | Bottom | Justify | Distributed): Self = {
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


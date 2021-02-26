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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `style.toJSON()`. */
@js.native
trait StyleData extends StObject {
  
  /**
    *
    * Specifies if text is automatically indented when the text alignment in a cell is set to equal distribution.
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
    * Specifies if the style is a built-in style.
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
    * Specifies if the formula will be hidden when the worksheet is protected.
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
    * Specifies if the style includes the AutoIndent, HorizontalAlignment, VerticalAlignment, WrapText, IndentLevel, and TextOrientation properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeAlignment: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the style includes the Color, ColorIndex, LineStyle, and Weight border properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeBorder: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the style includes the Background, Bold, Color, ColorIndex, FontStyle, Italic, Name, Size, Strikethrough, Subscript, Superscript, and Underline font properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeFont: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the style includes the NumberFormat property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeNumber: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the style includes the Color, ColorIndex, InvertIfNegative, Pattern, PatternColor, and PatternColorIndex interior properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includePatterns: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the style includes the FormulaHidden and Locked protection properties.
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
    * Specifies if the object is locked when the worksheet is protected.
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
    * Specifies if text automatically shrinks to fit in the available column width.
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
    * Specifies the vertical alignment for the style. See Excel.VerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Top | Center | Bottom | Justify | Distributed] = js.native
  
  /**
    *
    * Specifies if Excel wraps the text in the object.
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
  implicit class StyleDataMutableBuilder[Self <: StyleData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoIndent(value: Boolean): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
    
    @scala.inline
    def setBorders(value: js.Array[RangeBorderData]): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    @scala.inline
    def setBordersVarargs(value: RangeBorderData*): Self = StObject.set(x, "borders", js.Array(value :_*))
    
    @scala.inline
    def setBuiltIn(value: Boolean): Self = StObject.set(x, "builtIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInUndefined: Self = StObject.set(x, "builtIn", js.undefined)
    
    @scala.inline
    def setFill(value: RangeFillData): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFont(value: RangeFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormulaHidden(value: Boolean): Self = StObject.set(x, "formulaHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaHiddenUndefined: Self = StObject.set(x, "formulaHidden", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(
      value: HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
    ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setIncludeAlignment(value: Boolean): Self = StObject.set(x, "includeAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAlignmentUndefined: Self = StObject.set(x, "includeAlignment", js.undefined)
    
    @scala.inline
    def setIncludeBorder(value: Boolean): Self = StObject.set(x, "includeBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBorderUndefined: Self = StObject.set(x, "includeBorder", js.undefined)
    
    @scala.inline
    def setIncludeFont(value: Boolean): Self = StObject.set(x, "includeFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFontUndefined: Self = StObject.set(x, "includeFont", js.undefined)
    
    @scala.inline
    def setIncludeNumber(value: Boolean): Self = StObject.set(x, "includeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNumberUndefined: Self = StObject.set(x, "includeNumber", js.undefined)
    
    @scala.inline
    def setIncludePatterns(value: Boolean): Self = StObject.set(x, "includePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePatternsUndefined: Self = StObject.set(x, "includePatterns", js.undefined)
    
    @scala.inline
    def setIncludeProtection(value: Boolean): Self = StObject.set(x, "includeProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeProtectionUndefined: Self = StObject.set(x, "includeProtection", js.undefined)
    
    @scala.inline
    def setIndentLevel(value: Double): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatLocal(value: String): Self = StObject.set(x, "numberFormatLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatLocalUndefined: Self = StObject.set(x, "numberFormatLocal", js.undefined)
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setReadingOrder(value: ReadingOrder | Context | LeftToRight | RightToLeft): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingOrderUndefined: Self = StObject.set(x, "readingOrder", js.undefined)
    
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
    
    @scala.inline
    def setTextOrientation(value: Double): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: VerticalAlignment | Top | Center | Bottom | Justify | Distributed): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    @scala.inline
    def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
  }
}

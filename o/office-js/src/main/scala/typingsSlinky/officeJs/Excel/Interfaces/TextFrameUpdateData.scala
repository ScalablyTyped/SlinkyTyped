package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ShapeAutoSize
import typingsSlinky.officeJs.Excel.ShapeTextHorizontalAlignment
import typingsSlinky.officeJs.Excel.ShapeTextHorizontalOverflow
import typingsSlinky.officeJs.Excel.ShapeTextOrientation
import typingsSlinky.officeJs.Excel.ShapeTextReadingOrder
import typingsSlinky.officeJs.Excel.ShapeTextVerticalAlignment
import typingsSlinky.officeJs.Excel.ShapeTextVerticalOverflow
import typingsSlinky.officeJs.officeJsStrings.AutoSizeMixed
import typingsSlinky.officeJs.officeJsStrings.AutoSizeNone
import typingsSlinky.officeJs.officeJsStrings.AutoSizeShapeToFitText
import typingsSlinky.officeJs.officeJsStrings.AutoSizeTextToFitShape
import typingsSlinky.officeJs.officeJsStrings.Bottom
import typingsSlinky.officeJs.officeJsStrings.Center
import typingsSlinky.officeJs.officeJsStrings.Clip
import typingsSlinky.officeJs.officeJsStrings.Distributed
import typingsSlinky.officeJs.officeJsStrings.EastAsianVertical
import typingsSlinky.officeJs.officeJsStrings.Ellipsis
import typingsSlinky.officeJs.officeJsStrings.Horizontal
import typingsSlinky.officeJs.officeJsStrings.Justified
import typingsSlinky.officeJs.officeJsStrings.Justify
import typingsSlinky.officeJs.officeJsStrings.JustifyLow
import typingsSlinky.officeJs.officeJsStrings.Left
import typingsSlinky.officeJs.officeJsStrings.LeftToRight
import typingsSlinky.officeJs.officeJsStrings.Middle
import typingsSlinky.officeJs.officeJsStrings.MongolianVertical
import typingsSlinky.officeJs.officeJsStrings.Overflow
import typingsSlinky.officeJs.officeJsStrings.Right
import typingsSlinky.officeJs.officeJsStrings.RightToLeft
import typingsSlinky.officeJs.officeJsStrings.ThaiDistributed
import typingsSlinky.officeJs.officeJsStrings.Top
import typingsSlinky.officeJs.officeJsStrings.Vertical
import typingsSlinky.officeJs.officeJsStrings.Vertical270
import typingsSlinky.officeJs.officeJsStrings.WordArtVertical
import typingsSlinky.officeJs.officeJsStrings.WordArtVerticalRTL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TextFrame object, for use in `textFrame.set({ ... })`. */
@js.native
trait TextFrameUpdateData extends StObject {
  
  /**
    *
    * The automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSizeSetting: js.UndefOr[
    ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
  ] = js.native
  
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the horizontal alignment of the text frame. See Excel.ShapeTextHorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: js.UndefOr[
    ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
  ] = js.native
  
  /**
    *
    * Represents the horizontal overflow behavior of the text frame. See Excel.ShapeTextHorizontalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalOverflow: js.UndefOr[ShapeTextHorizontalOverflow | Overflow | Clip] = js.native
  
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the angle to which the text is oriented for the text frame. See Excel.ShapeTextOrientation for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[
    ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL
  ] = js.native
  
  /**
    *
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See Excel.ShapeTextReadingOrder for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[ShapeTextReadingOrder | LeftToRight | RightToLeft] = js.native
  
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the top margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the vertical alignment of the text frame. See Excel.ShapeTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed] = js.native
  
  /**
    *
    * Represents the vertical overflow behavior of the text frame. See Excel.ShapeTextVerticalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalOverflow: js.UndefOr[ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip] = js.native
}
object TextFrameUpdateData {
  
  @scala.inline
  def apply(): TextFrameUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFrameUpdateData]
  }
  
  @scala.inline
  implicit class TextFrameUpdateDataMutableBuilder[Self <: TextFrameUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSizeSetting(
      value: ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
    ): Self = StObject.set(x, "autoSizeSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSizeSettingUndefined: Self = StObject.set(x, "autoSizeSetting", js.undefined)
    
    @scala.inline
    def setBottomMargin(value: Double): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomMarginUndefined: Self = StObject.set(x, "bottomMargin", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(
      value: ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
    ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setHorizontalOverflow(value: ShapeTextHorizontalOverflow | Overflow | Clip): Self = StObject.set(x, "horizontalOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalOverflowUndefined: Self = StObject.set(x, "horizontalOverflow", js.undefined)
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMarginUndefined: Self = StObject.set(x, "leftMargin", js.undefined)
    
    @scala.inline
    def setOrientation(
      value: ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL
    ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setReadingOrder(value: ShapeTextReadingOrder | LeftToRight | RightToLeft): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingOrderUndefined: Self = StObject.set(x, "readingOrder", js.undefined)
    
    @scala.inline
    def setRightMargin(value: Double): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMarginUndefined: Self = StObject.set(x, "rightMargin", js.undefined)
    
    @scala.inline
    def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    @scala.inline
    def setVerticalOverflow(value: ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip): Self = StObject.set(x, "verticalOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOverflowUndefined: Self = StObject.set(x, "verticalOverflow", js.undefined)
  }
}

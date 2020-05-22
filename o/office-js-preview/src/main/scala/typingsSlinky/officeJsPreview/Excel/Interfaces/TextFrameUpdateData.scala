package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ShapeAutoSize
import typingsSlinky.officeJsPreview.Excel.ShapeTextHorizontalAlignment
import typingsSlinky.officeJsPreview.Excel.ShapeTextHorizontalOverflow
import typingsSlinky.officeJsPreview.Excel.ShapeTextOrientation
import typingsSlinky.officeJsPreview.Excel.ShapeTextReadingOrder
import typingsSlinky.officeJsPreview.Excel.ShapeTextVerticalAlignment
import typingsSlinky.officeJsPreview.Excel.ShapeTextVerticalOverflow
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AutoSizeMixed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AutoSizeNone
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AutoSizeShapeToFitText
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AutoSizeTextToFitShape
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Bottom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Center
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Clip
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Distributed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EastAsianVertical
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Ellipsis
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Horizontal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Justified
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Justify
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.JustifyLow
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Left
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LeftToRight
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Middle
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MongolianVertical
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Overflow
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Right
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RightToLeft
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThaiDistributed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Top
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Vertical
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Vertical270
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.WordArtVertical
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.WordArtVerticalRTL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TextFrame object, for use in `textFrame.set({ ... })`. */
trait TextFrameUpdateData extends js.Object {
  /**
    *
    * The automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSizeSetting: js.UndefOr[
    ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
  ] = js.undefined
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the horizontal alignment of the text frame. See Excel.ShapeTextHorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: js.UndefOr[
    ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
  ] = js.undefined
  /**
    *
    * Represents the horizontal overflow behavior of the text frame. See Excel.ShapeTextHorizontalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalOverflow: js.UndefOr[ShapeTextHorizontalOverflow | Overflow | Clip] = js.undefined
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the angle to which the text is oriented for the text frame. See Excel.ShapeTextOrientation for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[
    ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL
  ] = js.undefined
  /**
    *
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See Excel.ShapeTextReadingOrder for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[ShapeTextReadingOrder | LeftToRight | RightToLeft] = js.undefined
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the top margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the vertical alignment of the text frame. See Excel.ShapeTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed] = js.undefined
  /**
    *
    * Represents the vertical overflow behavior of the text frame. See Excel.ShapeTextVerticalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalOverflow: js.UndefOr[ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip] = js.undefined
}

object TextFrameUpdateData {
  @scala.inline
  def apply(
    autoSizeSetting: ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed = null,
    bottomMargin: js.UndefOr[Double] = js.undefined,
    horizontalAlignment: ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed = null,
    horizontalOverflow: ShapeTextHorizontalOverflow | Overflow | Clip = null,
    leftMargin: js.UndefOr[Double] = js.undefined,
    orientation: ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL = null,
    readingOrder: ShapeTextReadingOrder | LeftToRight | RightToLeft = null,
    rightMargin: js.UndefOr[Double] = js.undefined,
    topMargin: js.UndefOr[Double] = js.undefined,
    verticalAlignment: ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed = null,
    verticalOverflow: ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip = null
  ): TextFrameUpdateData = {
    val __obj = js.Dynamic.literal()
    if (autoSizeSetting != null) __obj.updateDynamic("autoSizeSetting")(autoSizeSetting.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomMargin)) __obj.updateDynamic("bottomMargin")(bottomMargin.get.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (horizontalOverflow != null) __obj.updateDynamic("horizontalOverflow")(horizontalOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(leftMargin)) __obj.updateDynamic("leftMargin")(leftMargin.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (readingOrder != null) __obj.updateDynamic("readingOrder")(readingOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(rightMargin)) __obj.updateDynamic("rightMargin")(rightMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topMargin)) __obj.updateDynamic("topMargin")(topMargin.get.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (verticalOverflow != null) __obj.updateDynamic("verticalOverflow")(verticalOverflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrameUpdateData]
  }
}


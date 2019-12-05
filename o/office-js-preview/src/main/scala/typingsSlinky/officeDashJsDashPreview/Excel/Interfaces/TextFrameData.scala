package typingsSlinky.officeDashJsDashPreview.Excel.Interfaces

import typingsSlinky.officeDashJsDashPreview.Excel.ShapeAutoSize
import typingsSlinky.officeDashJsDashPreview.Excel.ShapeTextHorizontalAlignment
import typingsSlinky.officeDashJsDashPreview.Excel.ShapeTextHorizontalOverflow
import typingsSlinky.officeDashJsDashPreview.Excel.ShapeTextOrientation
import typingsSlinky.officeDashJsDashPreview.Excel.ShapeTextReadingOrder
import typingsSlinky.officeDashJsDashPreview.Excel.ShapeTextVerticalAlignment
import typingsSlinky.officeDashJsDashPreview.Excel.ShapeTextVerticalOverflow
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AutoSizeMixed
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AutoSizeNone
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AutoSizeShapeToFitText
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AutoSizeTextToFitShape
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Bottom
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Center
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Clip
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Distributed
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EastAsianVertical
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Ellipsis
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Horizontal
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Justified
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Justify
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.JustifyLow
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Left
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LeftToRight
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Middle
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MongolianVertical
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Overflow
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Right
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RightToLeft
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThaiDistributed
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Top
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Vertical
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Vertical270
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.WordArtVertical
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.WordArtVerticalRTL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `textFrame.toJSON()`. */
trait TextFrameData extends js.Object {
  /**
    *
    * Gets or sets the automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
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
    * Specifies whether the text frame contains text.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hasText: js.UndefOr[Boolean] = js.undefined
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
    * Represents the text orientation of the text frame. See Excel.ShapeTextOrientation for details.
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

object TextFrameData {
  @scala.inline
  def apply(
    autoSizeSetting: ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed = null,
    bottomMargin: Int | Double = null,
    hasText: js.UndefOr[Boolean] = js.undefined,
    horizontalAlignment: ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed = null,
    horizontalOverflow: ShapeTextHorizontalOverflow | Overflow | Clip = null,
    leftMargin: Int | Double = null,
    orientation: ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL = null,
    readingOrder: ShapeTextReadingOrder | LeftToRight | RightToLeft = null,
    rightMargin: Int | Double = null,
    topMargin: Int | Double = null,
    verticalAlignment: ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed = null,
    verticalOverflow: ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip = null
  ): TextFrameData = {
    val __obj = js.Dynamic.literal()
    if (autoSizeSetting != null) __obj.updateDynamic("autoSizeSetting")(autoSizeSetting.asInstanceOf[js.Any])
    if (bottomMargin != null) __obj.updateDynamic("bottomMargin")(bottomMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(hasText)) __obj.updateDynamic("hasText")(hasText.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (horizontalOverflow != null) __obj.updateDynamic("horizontalOverflow")(horizontalOverflow.asInstanceOf[js.Any])
    if (leftMargin != null) __obj.updateDynamic("leftMargin")(leftMargin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (readingOrder != null) __obj.updateDynamic("readingOrder")(readingOrder.asInstanceOf[js.Any])
    if (rightMargin != null) __obj.updateDynamic("rightMargin")(rightMargin.asInstanceOf[js.Any])
    if (topMargin != null) __obj.updateDynamic("topMargin")(topMargin.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (verticalOverflow != null) __obj.updateDynamic("verticalOverflow")(verticalOverflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrameData]
  }
}


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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `textFrame.toJSON()`. */
@js.native
trait TextFrameData extends js.Object {
  /**
    *
    * Gets or sets the automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
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
    * Specifies whether the text frame contains text.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hasText: js.UndefOr[Boolean] = js.native
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

object TextFrameData {
  @scala.inline
  def apply(): TextFrameData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFrameData]
  }
  @scala.inline
  implicit class TextFrameDataOps[Self <: TextFrameData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSizeSetting(
      value: ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSizeSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSizeSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSizeSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withHasText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasText")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(
      value: ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
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
    def withHorizontalOverflow(value: ShapeTextHorizontalOverflow | Overflow | Clip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(
      value: ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withReadingOrder(value: ShapeTextReadingOrder | LeftToRight | RightToLeft): Self = {
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
    def withRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed): Self = {
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
    def withVerticalOverflow(value: ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOverflow")(js.undefined)
        ret
    }
  }
  
}


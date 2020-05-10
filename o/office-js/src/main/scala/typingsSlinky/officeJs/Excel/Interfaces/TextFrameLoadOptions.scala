package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the text frame of a shape object.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait TextFrameLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSizeSetting: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Boolean] = js.native
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
  var horizontalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the horizontal overflow behavior of the text frame. See Excel.ShapeTextHorizontalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalOverflow: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the angle to which the text is oriented for the text frame. See Excel.ShapeTextOrientation for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See Excel.ShapeTextReadingOrder for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the text that is attached to a shape in the text frame, and properties and methods for manipulating the text. See Excel.TextRange for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var textRange: js.UndefOr[TextRangeLoadOptions] = js.native
  /**
    *
    * Represents the top margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the vertical alignment of the text frame. See Excel.ShapeTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the vertical overflow behavior of the text frame. See Excel.ShapeTextVerticalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalOverflow: js.UndefOr[Boolean] = js.native
}

object TextFrameLoadOptions {
  @scala.inline
  def apply(): TextFrameLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFrameLoadOptions]
  }
  @scala.inline
  implicit class TextFrameLoadOptionsOps[Self <: TextFrameLoadOptions] (val x: Self) extends AnyVal {
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
    def withAutoSizeSetting(value: Boolean): Self = {
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
    def withBottomMargin(value: Boolean): Self = {
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
    def withHorizontalOverflow(value: Boolean): Self = {
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
    def withLeftMargin(value: Boolean): Self = {
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
    def withOrientation(value: Boolean): Self = {
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
    def withRightMargin(value: Boolean): Self = {
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
    def withTextRange(value: TextRangeLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRange")(js.undefined)
        ret
    }
    @scala.inline
    def withTopMargin(value: Boolean): Self = {
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
    def withVerticalOverflow(value: Boolean): Self = {
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


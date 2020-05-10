package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ConditionalRangeBorderIndex
import typingsSlinky.officeJsPreview.Excel.ConditionalRangeBorderLineStyle
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Continuous
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dash
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeBottom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeLeft
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeRight
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeTop
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `conditionalRangeBorder.toJSON()`. */
@js.native
trait ConditionalRangeBorderData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Constant value that indicates the specific side of the border. See Excel.ConditionalRangeBorderIndex for details. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var sideIndex: js.UndefOr[ConditionalRangeBorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight] = js.native
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[
    ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot
  ] = js.native
}

object ConditionalRangeBorderData {
  @scala.inline
  def apply(): ConditionalRangeBorderData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeBorderData]
  }
  @scala.inline
  implicit class ConditionalRangeBorderDataOps[Self <: ConditionalRangeBorderData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSideIndex(value: ConditionalRangeBorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: ConditionalRangeBorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}


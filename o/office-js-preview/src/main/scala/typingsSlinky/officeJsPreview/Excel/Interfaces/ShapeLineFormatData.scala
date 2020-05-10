package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ShapeLineDashStyle
import typingsSlinky.officeJsPreview.Excel.ShapeLineStyle
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dash
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LongDash
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LongDashDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LongDashDotDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RoundDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Single
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Solid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SquareDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SystemDash
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SystemDashDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SystemDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThickBetweenThin
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThickThin
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThick
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ThinThin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `shapeLineFormat.toJSON()`. */
@js.native
trait ShapeLineFormatData extends js.Object {
  /**
    *
    * Represents the line color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent dash styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dashStyle: js.UndefOr[
    ShapeLineDashStyle | Dash | DashDot | DashDotDot | LongDash | LongDashDot | RoundDot | Solid | SquareDot | LongDashDotDot | SystemDash | SystemDot | SystemDashDot
  ] = js.native
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[ShapeLineStyle | Single | ThickBetweenThin | ThickThin | ThinThick | ThinThin] = js.native
  /**
    *
    * Represents the degree of transparency of the specified line as a value from 0.0 (opaque) through 1.0 (clear). Returns null when the shape has inconsistent transparencies.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: js.UndefOr[Double] = js.native
  /**
    *
    * Represents whether or not the line formatting of a shape element is visible. Returns null when the shape has inconsistent visibilities.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the weight of the line, in points. Returns null when the line is not visible or there are inconsistent line weights.
    *
    * [Api set: ExcelApi 1.9]
    */
  var weight: js.UndefOr[Double] = js.native
}

object ShapeLineFormatData {
  @scala.inline
  def apply(): ShapeLineFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeLineFormatData]
  }
  @scala.inline
  implicit class ShapeLineFormatDataOps[Self <: ShapeLineFormatData] (val x: Self) extends AnyVal {
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
    def withDashStyle(
      value: ShapeLineDashStyle | Dash | DashDot | DashDotDot | LongDash | LongDashDot | RoundDot | Solid | SquareDot | LongDashDotDot | SystemDash | SystemDot | SystemDashDot
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: ShapeLineStyle | Single | ThickBetweenThin | ThickThin | ThinThick | ThinThin): Self = {
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
    @scala.inline
    def withTransparency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}


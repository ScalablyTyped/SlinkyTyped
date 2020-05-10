package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.FillPattern
import typingsSlinky.officeJs.officeJsStrings.Checker
import typingsSlinky.officeJs.officeJsStrings.CrissCross
import typingsSlinky.officeJs.officeJsStrings.Down
import typingsSlinky.officeJs.officeJsStrings.Gray16
import typingsSlinky.officeJs.officeJsStrings.Gray25
import typingsSlinky.officeJs.officeJsStrings.Gray50
import typingsSlinky.officeJs.officeJsStrings.Gray75
import typingsSlinky.officeJs.officeJsStrings.Gray8
import typingsSlinky.officeJs.officeJsStrings.Grid
import typingsSlinky.officeJs.officeJsStrings.Horizontal
import typingsSlinky.officeJs.officeJsStrings.LightDown
import typingsSlinky.officeJs.officeJsStrings.LightHorizontal
import typingsSlinky.officeJs.officeJsStrings.LightUp
import typingsSlinky.officeJs.officeJsStrings.LightVertical
import typingsSlinky.officeJs.officeJsStrings.LinearGradient
import typingsSlinky.officeJs.officeJsStrings.None
import typingsSlinky.officeJs.officeJsStrings.RectangularGradient
import typingsSlinky.officeJs.officeJsStrings.SemiGray75
import typingsSlinky.officeJs.officeJsStrings.Solid
import typingsSlinky.officeJs.officeJsStrings.Up
import typingsSlinky.officeJs.officeJsStrings.Vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `rangeFill.toJSON()`. */
@js.native
trait RangeFillData extends js.Object {
  /**
    *
    * HTML color code representing the color of the background, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the pattern of a Range. See Excel.FillPattern for details. LinearGradient and RectangularGradient are not supported.
    A null value indicates that the entire range doesn't have uniform pattern setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.native
  /**
    *
    * Sets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    Gets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500").
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.native
  /**
    *
    * Returns or sets a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.native
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.native
}

object RangeFillData {
  @scala.inline
  def apply(): RangeFillData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeFillData]
  }
  @scala.inline
  implicit class RangeFillDataOps[Self <: RangeFillData] (val x: Self) extends AnyVal {
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
    def withPattern(
      value: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withPatternColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatternColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPatternTintAndShade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternTintAndShade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatternTintAndShade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternTintAndShade")(js.undefined)
        ret
    }
    @scala.inline
    def withTintAndShade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintAndShade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintAndShade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintAndShade")(js.undefined)
        ret
    }
  }
  
}


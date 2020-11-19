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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the RangeFill object, for use in `rangeFill.set({ ... })`. */
@js.native
trait RangeFillUpdateData extends js.Object {
  
  /**
    *
    * HTML color code representing the color of the background, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange")
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    *
    * The pattern of a range. See Excel.FillPattern for details. LinearGradient and RectangularGradient are not supported.
    A null value indicates that the entire range doesn't have uniform pattern setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.native
  
  /**
    *
    * The HTML color code representing the color of the range pattern, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies a double that lightens or darkens a color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.native
}
object RangeFillUpdateData {
  
  @scala.inline
  def apply(): RangeFillUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeFillUpdateData]
  }
  
  @scala.inline
  implicit class RangeFillUpdateDataOps[Self <: RangeFillUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setPattern(
      value: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
    ): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setPatternColor(value: String): Self = this.set("patternColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternColor: Self = this.set("patternColor", js.undefined)
    
    @scala.inline
    def setPatternTintAndShade(value: Double): Self = this.set("patternTintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternTintAndShade: Self = this.set("patternTintAndShade", js.undefined)
    
    @scala.inline
    def setTintAndShade(value: Double): Self = this.set("tintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintAndShade: Self = this.set("tintAndShade", js.undefined)
  }
}

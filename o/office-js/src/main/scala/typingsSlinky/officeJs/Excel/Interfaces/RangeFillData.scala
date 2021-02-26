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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `rangeFill.toJSON()`. */
@js.native
trait RangeFillData extends StObject {
  
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
    * Specifies a double that lightens or darkens a color for Range Fill. The value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
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
  implicit class RangeFillDataMutableBuilder[Self <: RangeFillData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setPattern(
      value: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
    ): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternColor(value: String): Self = StObject.set(x, "patternColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternColorUndefined: Self = StObject.set(x, "patternColor", js.undefined)
    
    @scala.inline
    def setPatternTintAndShade(value: Double): Self = StObject.set(x, "patternTintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTintAndShadeUndefined: Self = StObject.set(x, "patternTintAndShade", js.undefined)
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setTintAndShade(value: Double): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
  }
}

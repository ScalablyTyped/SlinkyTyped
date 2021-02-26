package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ColorType
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.RgbColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation for a color.
  */
@js.native
trait Color extends StObject {
  
  def asRgbColor(): RgbColor = js.native
  
  def asThemeColor(): ThemeColor = js.native
  
  def getColorType(): ColorType = js.native
}
object Color {
  
  @scala.inline
  def apply(asRgbColor: () => RgbColor, asThemeColor: () => ThemeColor, getColorType: () => ColorType): Color = {
    val __obj = js.Dynamic.literal(asRgbColor = js.Any.fromFunction0(asRgbColor), asThemeColor = js.Any.fromFunction0(asThemeColor), getColorType = js.Any.fromFunction0(getColorType))
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsRgbColor(value: () => RgbColor): Self = StObject.set(x, "asRgbColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsThemeColor(value: () => ThemeColor): Self = StObject.set(x, "asThemeColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColorType(value: () => ColorType): Self = StObject.set(x, "getColorType", js.Any.fromFunction0(value))
  }
}

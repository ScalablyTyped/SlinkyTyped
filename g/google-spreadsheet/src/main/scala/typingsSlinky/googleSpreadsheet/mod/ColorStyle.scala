package typingsSlinky.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorStyle extends StObject {
  
  var rgbColor: Color = js.native
  
  var themeColor: ThemeColorType = js.native
}
object ColorStyle {
  
  @scala.inline
  def apply(rgbColor: Color, themeColor: ThemeColorType): ColorStyle = {
    val __obj = js.Dynamic.literal(rgbColor = rgbColor.asInstanceOf[js.Any], themeColor = themeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStyle]
  }
  
  @scala.inline
  implicit class ColorStyleMutableBuilder[Self <: ColorStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRgbColor(value: Color): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColor(value: ThemeColorType): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
  }
}

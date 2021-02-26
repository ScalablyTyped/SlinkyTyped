package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.gradient
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.source
import typingsSlinky.devextreme.devextremeStrings.target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorMode extends StObject {
  
  var border: js.UndefOr[ColorVisible] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var colorMode: js.UndefOr[none | source | target | gradient] = js.native
  
  var hoverStyle: js.UndefOr[ColorHatching] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
}
object ColorMode {
  
  @scala.inline
  def apply(): ColorMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorMode]
  }
  
  @scala.inline
  implicit class ColorModeMutableBuilder[Self <: ColorMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ColorVisible): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMode(value: none | source | target | gradient): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setHoverStyle(value: ColorHatching): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}

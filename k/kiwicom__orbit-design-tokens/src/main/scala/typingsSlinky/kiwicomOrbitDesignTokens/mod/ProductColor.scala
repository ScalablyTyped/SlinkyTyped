package typingsSlinky.kiwicomOrbitDesignTokens.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductColor extends StObject {
  
  var dark: String = js.native
  
  var darkActive: String = js.native
  
  var darkHover: String = js.native
  
  var darker: String = js.native
  
  var light: String = js.native
  
  var lightActive: String = js.native
  
  var lightHover: String = js.native
  
  var normal: String = js.native
  
  var normalActive: String = js.native
  
  var normalHover: String = js.native
}
object ProductColor {
  
  @scala.inline
  def apply(
    dark: String,
    darkActive: String,
    darkHover: String,
    darker: String,
    light: String,
    lightActive: String,
    lightHover: String,
    normal: String,
    normalActive: String,
    normalHover: String
  ): ProductColor = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], darkActive = darkActive.asInstanceOf[js.Any], darkHover = darkHover.asInstanceOf[js.Any], darker = darker.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], lightActive = lightActive.asInstanceOf[js.Any], lightHover = lightHover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalActive = normalActive.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductColor]
  }
  
  @scala.inline
  implicit class ProductColorMutableBuilder[Self <: ProductColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkActive(value: String): Self = StObject.set(x, "darkActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkHover(value: String): Self = StObject.set(x, "darkHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarker(value: String): Self = StObject.set(x, "darker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightActive(value: String): Self = StObject.set(x, "lightActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightHover(value: String): Self = StObject.set(x, "lightHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: String): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalActive(value: String): Self = StObject.set(x, "normalActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalHover(value: String): Self = StObject.set(x, "normalHover", value.asInstanceOf[js.Any])
  }
}

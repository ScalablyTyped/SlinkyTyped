package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorFlex extends StObject {
  
  var color: String = js.native
  
  var flex: Double = js.native
  
  var fontSize: Double = js.native
}
object ColorFlex {
  
  @scala.inline
  def apply(color: String, flex: Double, fontSize: Double): ColorFlex = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFlex]
  }
  
  @scala.inline
  implicit class ColorFlexMutableBuilder[Self <: ColorFlex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}

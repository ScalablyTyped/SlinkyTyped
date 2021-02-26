package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderTopColor extends StObject {
  
  var backgroundColor: String = js.native
  
  var borderTopColor: String = js.native
  
  var borderTopWidth: Double = js.native
}
object BorderTopColor {
  
  @scala.inline
  def apply(backgroundColor: String, borderTopColor: String, borderTopWidth: Double): BorderTopColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderTopColor = borderTopColor.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderTopColor]
  }
  
  @scala.inline
  implicit class BorderTopColorMutableBuilder[Self <: BorderTopColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopColor(value: String): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopWidth(value: Double): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginTop extends StObject {
  
  var color: String = js.native
  
  var fontSize: Double = js.native
  
  var marginTop: Double = js.native
}
object MarginTop {
  
  @scala.inline
  def apply(color: String, fontSize: Double, marginTop: Double): MarginTop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginTop]
  }
  
  @scala.inline
  implicit class MarginTopMutableBuilder[Self <: MarginTop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
  }
}

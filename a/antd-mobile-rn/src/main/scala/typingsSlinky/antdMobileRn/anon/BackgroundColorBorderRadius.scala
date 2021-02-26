package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorBorderRadius extends StObject {
  
  var backgroundColor: String = js.native
  
  var borderRadius: Double = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object BackgroundColorBorderRadius {
  
  @scala.inline
  def apply(backgroundColor: String, borderRadius: Double, height: Double, width: Double): BackgroundColorBorderRadius = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorBorderRadius]
  }
  
  @scala.inline
  implicit class BackgroundColorBorderRadiusMutableBuilder[Self <: BackgroundColorBorderRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

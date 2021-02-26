package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderRadiusBorderStyle extends StObject {
  
  var borderRadius: Double = js.native
  
  var borderStyle: String = js.native
  
  var borderWidth: Double = js.native
  
  var overflow: String = js.native
  
  var paddingHorizontal: Double = js.native
  
  var paddingVertical: Double = js.native
}
object BorderRadiusBorderStyle {
  
  @scala.inline
  def apply(
    borderRadius: Double,
    borderStyle: String,
    borderWidth: Double,
    overflow: String,
    paddingHorizontal: Double,
    paddingVertical: Double
  ): BorderRadiusBorderStyle = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadiusBorderStyle]
  }
  
  @scala.inline
  implicit class BorderRadiusBorderStyleMutableBuilder[Self <: BorderRadiusBorderStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVertical(value: Double): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
  }
}

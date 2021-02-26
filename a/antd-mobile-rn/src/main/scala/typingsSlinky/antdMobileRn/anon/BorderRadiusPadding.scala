package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderRadiusPadding extends StObject {
  
  var borderRadius: Double = js.native
  
  var padding: Double = js.native
}
object BorderRadiusPadding {
  
  @scala.inline
  def apply(borderRadius: Double, padding: Double): BorderRadiusPadding = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadiusPadding]
  }
  
  @scala.inline
  implicit class BorderRadiusPaddingMutableBuilder[Self <: BorderRadiusPadding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}

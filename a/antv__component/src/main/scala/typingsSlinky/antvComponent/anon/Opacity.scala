package typingsSlinky.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Opacity extends StObject {
  
  var fill: String = js.native
  
  var lineWidth: Double = js.native
  
  var opacity: Double = js.native
}
object Opacity {
  
  @scala.inline
  def apply(fill: String, lineWidth: Double, opacity: Double): Opacity = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
  
  @scala.inline
  implicit class OpacityMutableBuilder[Self <: Opacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform extends StObject {
  
  var color: String = js.native
  
  var fontSize: Double = js.native
  
  var fontWeight: String = js.native
  
  var textAlign: String = js.native
  
  var transform: js.Array[Rotate] = js.native
}
object Transform {
  
  @scala.inline
  def apply(
    color: String,
    fontSize: Double,
    fontWeight: String,
    textAlign: String,
    transform: js.Array[Rotate]
  ): Transform = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit class TransformMutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: js.Array[Rotate]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformVarargs(value: Rotate*): Self = StObject.set(x, "transform", js.Array(value :_*))
  }
}

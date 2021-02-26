package typingsSlinky.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillFontSize extends StObject {
  
  var fill: String = js.native
  
  var fontSize: Double = js.native
  
  var textAlign: String = js.native
  
  var textBaseline: String = js.native
}
object FillFontSize {
  
  @scala.inline
  def apply(fill: String, fontSize: Double, textAlign: String, textBaseline: String): FillFontSize = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillFontSize]
  }
  
  @scala.inline
  implicit class FillFontSizeMutableBuilder[Self <: FillFontSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
  }
}

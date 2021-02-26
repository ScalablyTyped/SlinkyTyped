package typingsSlinky.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontSizeNumberTextAlignString extends StObject {
  
  var fontSize: Double = js.native
  
  var textAlign: String = js.native
}
object FontSizeNumberTextAlignString {
  
  @scala.inline
  def apply(fontSize: Double, textAlign: String): FontSizeNumberTextAlignString = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeNumberTextAlignString]
  }
  
  @scala.inline
  implicit class FontSizeNumberTextAlignStringMutableBuilder[Self <: FontSizeNumberTextAlignString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextLayoutLine extends StObject {
  
  var ascender: Double = js.native
  
  var capHeight: Double = js.native
  
  var descender: Double = js.native
  
  var height: Double = js.native
  
  var text: String = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var xHeight: Double = js.native
  
  var y: Double = js.native
}
object TextLayoutLine {
  
  @scala.inline
  def apply(
    ascender: Double,
    capHeight: Double,
    descender: Double,
    height: Double,
    text: String,
    width: Double,
    x: Double,
    xHeight: Double,
    y: Double
  ): TextLayoutLine = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], capHeight = capHeight.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xHeight = xHeight.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLayoutLine]
  }
  
  @scala.inline
  implicit class TextLayoutLineMutableBuilder[Self <: TextLayoutLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscender(value: Double): Self = StObject.set(x, "ascender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapHeight(value: Double): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescender(value: Double): Self = StObject.set(x, "descender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXHeight(value: Double): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

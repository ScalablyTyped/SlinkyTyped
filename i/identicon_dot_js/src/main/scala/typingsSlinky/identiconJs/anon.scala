package typingsSlinky.identiconJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Color extends StObject {
    
    var color: typingsSlinky.identiconJs.mod.Color = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Color {
    
    @scala.inline
    def apply(color: typingsSlinky.identiconJs.mod.Color, height: Double, width: Double, x: Double, y: Double): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: typingsSlinky.identiconJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}

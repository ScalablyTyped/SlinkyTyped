package typingsSlinky.colorRgba

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("color-rgba", JSImport.Namespace)
  @js.native
  def apply(string: ColorValue): js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.colorRgba.mod.RGBTuple
    - typingsSlinky.colorRgba.mod.RGBColor
    - typingsSlinky.colorRgba.mod.RGBKeyedColor
    - typingsSlinky.colorRgba.mod.HSL
  */
  type ColorValue = _ColorValue | String | RGBTuple
  
  @js.native
  trait HSL extends _ColorValue {
    
    var h: Double = js.native
    
    var l: Double = js.native
    
    var s: Double = js.native
  }
  object HSL {
    
    @scala.inline
    def apply(h: Double, l: Double, s: Double): HSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSL]
    }
    
    @scala.inline
    implicit class HSLMutableBuilder[Self <: HSL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RGBColor extends _ColorValue {
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
  object RGBColor {
    
    @scala.inline
    def apply(b: Double, g: Double, r: Double): RGBColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBColor]
    }
    
    @scala.inline
    implicit class RGBColorMutableBuilder[Self <: RGBColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RGBKeyedColor extends _ColorValue {
    
    var blue: Double = js.native
    
    var green: Double = js.native
    
    var red: Double = js.native
  }
  object RGBKeyedColor {
    
    @scala.inline
    def apply(blue: Double, green: Double, red: Double): RGBKeyedColor = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBKeyedColor]
    }
    
    @scala.inline
    implicit class RGBKeyedColorMutableBuilder[Self <: RGBKeyedColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  type RGBTuple = js.Tuple3[Double, Double, Double]
  
  trait _ColorValue extends StObject
  object _ColorValue {
    
    @scala.inline
    def HSL(h: Double, l: Double, s: Double): typingsSlinky.colorRgba.mod.HSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.colorRgba.mod.HSL]
    }
    
    @scala.inline
    def RGBColor(b: Double, g: Double, r: Double): typingsSlinky.colorRgba.mod.RGBColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.colorRgba.mod.RGBColor]
    }
    
    @scala.inline
    def RGBKeyedColor(blue: Double, green: Double, red: Double): typingsSlinky.colorRgba.mod.RGBKeyedColor = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.colorRgba.mod.RGBKeyedColor]
    }
  }
}

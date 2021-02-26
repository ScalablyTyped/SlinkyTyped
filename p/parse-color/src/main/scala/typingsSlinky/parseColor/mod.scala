package typingsSlinky.parseColor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-color", JSImport.Namespace)
  @js.native
  def apply(cstr: String): Color = js.native
  
  @js.native
  trait Color extends StObject {
    
    var cmyk: js.Tuple4[Double, Double, Double, Double] = js.native
    
    var cmyka: js.Tuple5[Double, Double, Double, Double, Double] = js.native
    
    var hex: String = js.native
    
    var hsl: js.Tuple3[Double, Double, Double] = js.native
    
    var hsla: js.Tuple4[Double, Double, Double, Double] = js.native
    
    var hsv: js.Tuple3[Double, Double, Double] = js.native
    
    var hsva: js.Tuple4[Double, Double, Double, Double] = js.native
    
    var keyword: String = js.native
    
    var rgb: js.Tuple3[Double, Double, Double] = js.native
    
    var rgba: js.Tuple4[Double, Double, Double, Double] = js.native
  }
  object Color {
    
    @scala.inline
    def apply(
      cmyk: js.Tuple4[Double, Double, Double, Double],
      cmyka: js.Tuple5[Double, Double, Double, Double, Double],
      hex: String,
      hsl: js.Tuple3[Double, Double, Double],
      hsla: js.Tuple4[Double, Double, Double, Double],
      hsv: js.Tuple3[Double, Double, Double],
      hsva: js.Tuple4[Double, Double, Double, Double],
      keyword: String,
      rgb: js.Tuple3[Double, Double, Double],
      rgba: js.Tuple4[Double, Double, Double, Double]
    ): Color = {
      val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], cmyka = cmyka.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], hsva = hsva.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmyk(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "cmyk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCmyka(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "cmyka", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsl(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "hsl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsla(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "hsla", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsv(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "hsv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsva(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "hsva", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRgb(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRgba(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "rgba", value.asInstanceOf[js.Any])
    }
  }
}

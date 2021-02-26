package typingsSlinky.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hexToRgbMod {
  
  @JSImport("playable/dist/src/modules/ui/core/theme/utils/hexToRgb", JSImport.Default)
  @js.native
  def default(hex: String): IRGB = js.native
  
  @js.native
  trait IRGB extends StObject {
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
  object IRGB {
    
    @scala.inline
    def apply(b: Double, g: Double, r: Double): IRGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRGB]
    }
    
    @scala.inline
    implicit class IRGBMutableBuilder[Self <: IRGB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}

package typingsSlinky.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseRadiusMod {
  
  @JSImport("@antv/util/lib/parse-radius", JSImport.Default)
  @js.native
  def default(radius: js.Array[Double]): RadiusType = js.native
  @JSImport("@antv/util/lib/parse-radius", JSImport.Default)
  @js.native
  def default(radius: Double): RadiusType = js.native
  
  @js.native
  trait RadiusType extends StObject {
    
    var r1: Double = js.native
    
    var r2: Double = js.native
    
    var r3: Double = js.native
    
    var r4: Double = js.native
  }
  object RadiusType {
    
    @scala.inline
    def apply(r1: Double, r2: Double, r3: Double, r4: Double): RadiusType = {
      val __obj = js.Dynamic.literal(r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], r3 = r3.asInstanceOf[js.Any], r4 = r4.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadiusType]
    }
    
    @scala.inline
    implicit class RadiusTypeMutableBuilder[Self <: RadiusType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR3(value: Double): Self = StObject.set(x, "r3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR4(value: Double): Self = StObject.set(x, "r4", value.asInstanceOf[js.Any])
    }
  }
}

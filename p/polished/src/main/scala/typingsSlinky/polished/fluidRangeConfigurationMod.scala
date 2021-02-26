package typingsSlinky.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fluidRangeConfigurationMod {
  
  @js.native
  trait FluidRangeConfiguration extends StObject {
    
    var fromSize: String | Double = js.native
    
    var prop: String = js.native
    
    var toSize: String | Double = js.native
  }
  object FluidRangeConfiguration {
    
    @scala.inline
    def apply(fromSize: String | Double, prop: String, toSize: String | Double): FluidRangeConfiguration = {
      val __obj = js.Dynamic.literal(fromSize = fromSize.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], toSize = toSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluidRangeConfiguration]
    }
    
    @scala.inline
    implicit class FluidRangeConfigurationMutableBuilder[Self <: FluidRangeConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSize(value: String | Double): Self = StObject.set(x, "fromSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToSize(value: String | Double): Self = StObject.set(x, "toSize", value.asInstanceOf[js.Any])
    }
  }
}

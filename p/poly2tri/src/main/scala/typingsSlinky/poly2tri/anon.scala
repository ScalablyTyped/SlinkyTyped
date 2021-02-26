package typingsSlinky.poly2tri

import typingsSlinky.poly2tri.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Max extends StObject {
    
    var max: Point = js.native
    
    var min: Point = js.native
  }
  object Max {
    
    @scala.inline
    def apply(max: Point, min: Point): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Point): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Point): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
}

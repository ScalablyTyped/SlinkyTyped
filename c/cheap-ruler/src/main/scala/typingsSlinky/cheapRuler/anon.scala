package typingsSlinky.cheapRuler

import typingsSlinky.cheapRuler.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Index extends StObject {
    
    var index: Double = js.native
    
    var point: Point = js.native
    
    var t: Double = js.native
  }
  object Index {
    
    @scala.inline
    def apply(index: Double, point: Point, t: Double): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
}

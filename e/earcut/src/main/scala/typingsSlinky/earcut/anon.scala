package typingsSlinky.earcut

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dimensions extends StObject {
    
    var dimensions: Double = js.native
    
    var holes: js.Array[Double] = js.native
    
    var vertices: js.Array[Double] = js.native
  }
  object Dimensions {
    
    @scala.inline
    def apply(dimensions: Double, holes: js.Array[Double], vertices: js.Array[Double]): Dimensions = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], holes = holes.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensions]
    }
    
    @scala.inline
    implicit class DimensionsMutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: Double): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoles(value: js.Array[Double]): Self = StObject.set(x, "holes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHolesVarargs(value: Double*): Self = StObject.set(x, "holes", js.Array(value :_*))
      
      @scala.inline
      def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    }
  }
}

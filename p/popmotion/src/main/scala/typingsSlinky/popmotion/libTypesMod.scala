package typingsSlinky.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.popmotion.libTypesMod.Point2D
    - typingsSlinky.popmotion.libTypesMod.Point3D
  */
  trait Point extends StObject
  object Point {
    
    @scala.inline
    def Point2D(x: Double, y: Double): typingsSlinky.popmotion.libTypesMod.Point2D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.popmotion.libTypesMod.Point2D]
    }
    
    @scala.inline
    def Point3D(x: Double, y: Double, z: Double): typingsSlinky.popmotion.libTypesMod.Point3D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.popmotion.libTypesMod.Point3D]
    }
  }
  
  @js.native
  trait Point2D extends Point {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Point2D {
    
    @scala.inline
    def apply(x: Double, y: Double): Point2D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point2D]
    }
    
    @scala.inline
    implicit class Point2DMutableBuilder[Self <: Point2D] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined popmotion.popmotion/lib/types.Point2D & {  z :number} */
  @js.native
  trait Point3D extends Point {
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  object Point3D {
    
    @scala.inline
    def apply(x: Double, y: Double, z: Double): Point3D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point3D]
    }
    
    @scala.inline
    implicit class Point3DMutableBuilder[Self <: Point3D] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}

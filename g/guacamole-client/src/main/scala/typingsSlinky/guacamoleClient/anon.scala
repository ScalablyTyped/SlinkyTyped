package typingsSlinky.guacamoleClient

import typingsSlinky.guacamoleClient.clientMod.Client.ExportLayer
import typingsSlinky.std.CanvasFillRule
import typingsSlinky.std.Path2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined guacamole-client.guacamole-client/lib/Client.Client.ExportLayerBase & {  x :number,   y :number,   z :number,   alpha :number,   matrix :unknown,   parent :unknown} */
  @js.native
  trait ExportLayerBasexnumberynu extends ExportLayer {
    
    var alpha: Double = js.native
    
    var height: Double = js.native
    
    var matrix: js.Any = js.native
    
    var parent: js.Any = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  object ExportLayerBasexnumberynu {
    
    @scala.inline
    def apply(
      alpha: Double,
      height: Double,
      matrix: js.Any,
      parent: js.Any,
      width: Double,
      x: Double,
      y: Double,
      z: Double
    ): ExportLayerBasexnumberynu = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportLayerBasexnumberynu]
    }
    
    @scala.inline
    implicit class ExportLayerBasexnumberynuMutableBuilder[Self <: ExportLayerBasexnumberynu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrix(value: js.Any): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
    def apply(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
  }
  
  @js.native
  trait FnCallPathFillRule extends StObject {
    
    def apply(): Unit = js.native
    def apply(fillRule: CanvasFillRule): Unit = js.native
    def apply(path: Path2D): Unit = js.native
    def apply(path: Path2D, fillRule: CanvasFillRule): Unit = js.native
  }
}

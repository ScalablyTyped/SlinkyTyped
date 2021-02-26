package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import typingsSlinky.ol.colorlikeMod.ColorLike
import typingsSlinky.std.CanvasLineCap
import typingsSlinky.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regularShapeMod {
  
  @JSImport("ol/style/RegularShape", JSImport.Default)
  @js.native
  class default protected () extends RegularShape {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var angle: js.UndefOr[Double] = js.native
    
    var displacement: js.UndefOr[js.Array[Double]] = js.native
    
    var fill: js.UndefOr[typingsSlinky.ol.fillMod.default] = js.native
    
    var points: Double = js.native
    
    var radius: js.UndefOr[Double] = js.native
    
    var radius1: js.UndefOr[Double] = js.native
    
    var radius2: js.UndefOr[Double] = js.native
    
    var rotateWithView: js.UndefOr[Boolean] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var stroke: js.UndefOr[typingsSlinky.ol.strokeMod.default] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(points: Double): Options = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setDisplacement(value: js.Array[Double]): Self = StObject.set(x, "displacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplacementUndefined: Self = StObject.set(x, "displacement", js.undefined)
      
      @scala.inline
      def setDisplacementVarargs(value: Double*): Self = StObject.set(x, "displacement", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: typingsSlinky.ol.fillMod.default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius1(value: Double): Self = StObject.set(x, "radius1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius1Undefined: Self = StObject.set(x, "radius1", js.undefined)
      
      @scala.inline
      def setRadius2(value: Double): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setStroke(value: typingsSlinky.ol.strokeMod.default): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  @js.native
  trait RegularShape
    extends typingsSlinky.ol.styleImageMod.default {
    
    /* protected */ def createRenderOptions(): RenderOptions = js.native
    
    /**
      * Get the angle used in generating the shape.
      */
    def getAngle(): Double = js.native
    
    /**
      * Get the fill style for the shape.
      */
    def getFill(): typingsSlinky.ol.fillMod.default = js.native
    
    /**
      * Get the number of points for generating the shape.
      */
    def getPoints(): Double = js.native
    
    /**
      * Get the (primary) radius for the shape.
      */
    def getRadius(): Double = js.native
    
    /**
      * Get the secondary radius for the shape.
      */
    def getRadius2(): js.UndefOr[Double] = js.native
    
    /**
      * Get the stroke style for the shape.
      */
    def getStroke(): typingsSlinky.ol.strokeMod.default = js.native
    
    var radius_ : Double = js.native
    
    /* protected */ def render(): Unit = js.native
  }
  
  @js.native
  trait RenderOptions extends StObject {
    
    var lineCap: CanvasLineCap = js.native
    
    var lineDash: js.Array[Double] = js.native
    
    var lineDashOffset: Double = js.native
    
    var lineJoin: CanvasLineJoin = js.native
    
    var miterLimit: Double = js.native
    
    var size: Double = js.native
    
    var strokeStyle: js.UndefOr[ColorLike] = js.native
    
    var strokeWidth: Double = js.native
  }
  object RenderOptions {
    
    @scala.inline
    def apply(
      lineCap: CanvasLineCap,
      lineDash: js.Array[Double],
      lineDashOffset: Double,
      lineJoin: CanvasLineJoin,
      miterLimit: Double,
      size: Double,
      strokeWidth: Double
    ): RenderOptions = {
      val __obj = js.Dynamic.literal(lineCap = lineCap.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any], lineDashOffset = lineDashOffset.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value :_*))
      
      @scala.inline
      def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStyle(value: ColorLike): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStyleCanvasGradient(value: CanvasGradient): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStyleCanvasPattern(value: CanvasPattern): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    }
  }
}

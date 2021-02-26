package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.canvasMod.FillState
import typingsSlinky.ol.canvasMod.FillStrokeState
import typingsSlinky.ol.canvasMod.StrokeState
import typingsSlinky.ol.canvasMod.TextState
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olFeatureMod.FeatureLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builderMod {
  
  @JSImport("ol/render/canvas/Builder", JSImport.Default)
  @js.native
  class default protected () extends CanvasBuilder {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  trait CanvasBuilder
    extends typingsSlinky.ol.vectorContextMod.default {
    
    /* protected */ def appendFlatCoordinates(
      flatCoordinates: js.Array[Double],
      offset: Double,
      end: Double,
      stride: Double,
      closed: Boolean,
      skipFirst: Boolean
    ): Double = js.native
    
    /* protected */ def applyPixelRatio(dashArray: js.Array[Double]): js.Array[Double] = js.native
    
    def applyStroke(state: FillStrokeState): Unit = js.native
    
    /* protected */ def beginGeometry(geometry: typingsSlinky.ol.geometryMod.default, feature: FeatureLike): Unit = js.native
    /* protected */ def beginGeometry(geometry: typingsSlinky.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    var coordinates: js.Array[Double] = js.native
    
    def createFill(state: FillStrokeState): js.Array[_] = js.native
    
    def createStroke(state: FillStrokeState): js.Array[_] = js.native
    
    def drawCustomCoordinates_(
      flatCoordinates: js.Array[Double],
      offset: Double,
      ends: js.Array[Double],
      stride: Double,
      builderEnds: js.Array[Double]
    ): Double = js.native
    
    def endGeometry(feature: FeatureLike): Unit = js.native
    
    def finish(): SerializableInstructions = js.native
    
    /**
      * Get the buffered rendering extent.  Rendering will be clipped to the extent
      * provided to the constructor.  To account for symbolizers that may intersect
      * this extent, we calculate a buffered extent (e.g. based on stroke width).
      */
    /* protected */ def getBufferedMaxExtent(): Extent = js.native
    
    var hitDetectionInstructions: js.Array[_] = js.native
    
    var instructions: js.Array[_] = js.native
    
    var maxExtent: Extent = js.native
    
    var maxLineWidth: Double = js.native
    
    var pixelRatio: Double = js.native
    
    var resolution: Double = js.native
    
    /**
      * Reverse the hit detection instructions.
      */
    def reverseHitDetectionInstructions(): Unit = js.native
    
    var state: FillStrokeState = js.native
    
    var tolerance: Double = js.native
    
    def updateFillStyle(
      state: FillStrokeState,
      createFill: js.ThisFunction1[/* this */ this.type, /* p0 */ FillStrokeState, js.Array[_]]
    ): Unit = js.native
    
    def updateStrokeStyle(
      state: FillStrokeState,
      applyStroke: js.ThisFunction1[/* this */ this.type, /* p0 */ FillStrokeState, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait SerializableInstructions extends StObject {
    
    var coordinates: js.Array[Double] = js.native
    
    var fillStates: js.UndefOr[StringDictionary[FillState]] = js.native
    
    var hitDetectionInstructions: js.Array[_] = js.native
    
    var instructions: js.Array[_] = js.native
    
    var strokeStates: js.UndefOr[StringDictionary[StrokeState]] = js.native
    
    var textStates: js.UndefOr[StringDictionary[TextState]] = js.native
  }
  object SerializableInstructions {
    
    @scala.inline
    def apply(coordinates: js.Array[Double], hitDetectionInstructions: js.Array[_], instructions: js.Array[_]): SerializableInstructions = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], hitDetectionInstructions = hitDetectionInstructions.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializableInstructions]
    }
    
    @scala.inline
    implicit class SerializableInstructionsMutableBuilder[Self <: SerializableInstructions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setFillStates(value: StringDictionary[FillState]): Self = StObject.set(x, "fillStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillStatesUndefined: Self = StObject.set(x, "fillStates", js.undefined)
      
      @scala.inline
      def setHitDetectionInstructions(value: js.Array[_]): Self = StObject.set(x, "hitDetectionInstructions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitDetectionInstructionsVarargs(value: js.Any*): Self = StObject.set(x, "hitDetectionInstructions", js.Array(value :_*))
      
      @scala.inline
      def setInstructions(value: js.Array[_]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstructionsVarargs(value: js.Any*): Self = StObject.set(x, "instructions", js.Array(value :_*))
      
      @scala.inline
      def setStrokeStates(value: StringDictionary[StrokeState]): Self = StObject.set(x, "strokeStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStatesUndefined: Self = StObject.set(x, "strokeStates", js.undefined)
      
      @scala.inline
      def setTextStates(value: StringDictionary[TextState]): Self = StObject.set(x, "textStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStatesUndefined: Self = StObject.set(x, "textStates", js.undefined)
    }
  }
}

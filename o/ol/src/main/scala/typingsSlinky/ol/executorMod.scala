package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.ol.canvasMod.DeclutterGroup
import typingsSlinky.ol.canvasMod.FillState
import typingsSlinky.ol.canvasMod.Label
import typingsSlinky.ol.canvasMod.StrokeState
import typingsSlinky.ol.canvasMod.TextState
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.olMod.Transform
import typingsSlinky.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executorMod {
  
  @JSImport("ol/render/canvas/Executor", JSImport.Default)
  @js.native
  class default protected () extends Executor {
    def this(
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      instructions: SerializableInstructions,
      renderBuffer: Size
    ) = this()
  }
  
  @js.native
  trait Executor extends StObject {
    
    var coordinates: js.Array[Double] = js.native
    
    def createLabel(text: String, textKey: String, fillKey: String, strokeKey: String): Label = js.native
    
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean
    ): Unit = js.native
    
    def executeHitDetection[T](context: CanvasRenderingContext2D, transform: Transform, viewRotation: Double): js.UndefOr[T] = js.native
    def executeHitDetection[T](
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      opt_featureCallback: js.UndefOr[scala.Nothing],
      opt_hitExtent: Extent
    ): js.UndefOr[T] = js.native
    def executeHitDetection[T](
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      opt_featureCallback: js.Function0[Unit]
    ): js.UndefOr[T] = js.native
    def executeHitDetection[T](
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      opt_featureCallback: js.Function0[Unit],
      opt_hitExtent: Extent
    ): js.UndefOr[T] = js.native
    
    var hitDetectionInstructions: js.Array[_] = js.native
    
    var instructions: js.Array[_] = js.native
    
    var overlaps: Boolean = js.native
    
    var pixelRatio: Double = js.native
    
    def renderDeclutter(declutterGroup: DeclutterGroup, feature: FeatureLike, opacity: Double, declutterTree: js.Any): js.Any = js.native
    
    def replayTextBackground_(
      context: CanvasRenderingContext2D,
      p1: Coordinate,
      p2: Coordinate,
      p3: Coordinate,
      p4: Coordinate,
      fillInstruction: js.Array[_],
      strokeInstruction: js.Array[_],
      declutter: Boolean
    ): Unit = js.native
    
    var resolution: Double = js.native
  }
  
  @js.native
  trait SerializableInstructions extends StObject {
    
    var coordinates: js.Array[Double] = js.native
    
    var fillStates: StringDictionary[FillState] = js.native
    
    var hitDetectionInstructions: js.Array[_] = js.native
    
    var instructions: js.Array[_] = js.native
    
    var strokeStates: StringDictionary[StrokeState] = js.native
    
    var textStates: StringDictionary[TextState] = js.native
  }
  object SerializableInstructions {
    
    @scala.inline
    def apply(
      coordinates: js.Array[Double],
      fillStates: StringDictionary[FillState],
      hitDetectionInstructions: js.Array[_],
      instructions: js.Array[_],
      strokeStates: StringDictionary[StrokeState],
      textStates: StringDictionary[TextState]
    ): SerializableInstructions = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], fillStates = fillStates.asInstanceOf[js.Any], hitDetectionInstructions = hitDetectionInstructions.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], strokeStates = strokeStates.asInstanceOf[js.Any], textStates = textStates.asInstanceOf[js.Any])
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
      def setTextStates(value: StringDictionary[TextState]): Self = StObject.set(x, "textStates", value.asInstanceOf[js.Any])
    }
  }
}

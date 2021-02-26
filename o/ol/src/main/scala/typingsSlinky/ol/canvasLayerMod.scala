package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olMod.Transform
import typingsSlinky.ol.pluggableMapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasLayerMod {
  
  @JSImport("ol/renderer/canvas/Layer", JSImport.Default)
  @js.native
  abstract class default[LayerType /* <: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default] */] protected () extends CanvasLayerRenderer[LayerType] {
    def this(layer: LayerType) = this()
  }
  
  @js.native
  trait CanvasLayerRenderer[LayerType /* <: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default] */]
    extends typingsSlinky.ol.rendererLayerMod.default[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] {
    
    /* protected */ def clip(context: CanvasRenderingContext2D, frameState: FrameState, extent: Extent): Unit = js.native
    
    /* protected */ def clipUnrotated(context: CanvasRenderingContext2D, frameState: FrameState, extent: Extent): Unit = js.native
    
    var container: HTMLElement = js.native
    
    /**
      * Creates a transform for rendering to an element that will be rotated after rendering.
      */
    /* protected */ def getRenderTransform(
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      pixelRatio: Double,
      width: Double,
      height: Double,
      offsetX: Double
    ): Transform = js.native
    
    /**
      * The transform for viewport CSS pixels to rendered pixels.  This transform must
      * be set when rendering a frame and may be used by other functions after rendering.
      */
    var inversePixelTransform: Transform = js.native
    
    /**
      * The transform for rendered pixels to viewport CSS pixels.  This transform must
      * be set when rendering a frame and may be used by other functions after rendering.
      */
    var pixelTransform: Transform = js.native
    
    /* protected */ def postRender(context: CanvasRenderingContext2D, frameState: FrameState): Unit = js.native
    
    /* protected */ def preRender(context: CanvasRenderingContext2D, frameState: FrameState): Unit = js.native
    
    var renderedResolution: Double = js.native
    
    /**
      * A temporary transform.  The values in this transform should only be used in a
      * function that sets the values.
      */
    var tempTransform: Transform = js.native
    
    /**
      * Get a rendering container from an existing target, if compatible.
      */
    def useContainer(target: HTMLElement, transform: String, opacity: Double): Unit = js.native
  }
}

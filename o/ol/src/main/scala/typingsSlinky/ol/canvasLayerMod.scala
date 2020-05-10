package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olMod.Transform
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/Layer", JSImport.Namespace)
@js.native
object canvasLayerMod extends js.Object {
  @js.native
  trait CanvasLayerRenderer[LayerType /* <: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default] */]
    extends typingsSlinky.ol.rendererLayerMod.default[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] {
    var container: HTMLElement = js.native
    var context: CanvasRenderingContext2D = js.native
    var inversePixelTransform: Transform = js.native
    var pixelTransform: Transform = js.native
    var renderedResolution: Double = js.native
    /* protected */ def clip(context: CanvasRenderingContext2D, frameState: FrameState, extent: Extent): Unit = js.native
    /* protected */ def clipUnrotated(context: CanvasRenderingContext2D, frameState: FrameState, extent: Extent): Unit = js.native
    /* protected */ def getRenderTransform(
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      pixelRatio: Double,
      width: Double,
      height: Double,
      offsetX: Double
    ): Transform = js.native
    /* protected */ def postRender(context: CanvasRenderingContext2D, frameState: FrameState): Unit = js.native
    /* protected */ def preRender(context: CanvasRenderingContext2D, frameState: FrameState): Unit = js.native
    def useContainer(target: HTMLElement, transform: String, opacity: Double): Unit = js.native
  }
  
  @js.native
  abstract class default[LayerType /* <: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default] */] protected () extends CanvasLayerRenderer[LayerType] {
    def this(layer: LayerType) = this()
  }
  
}


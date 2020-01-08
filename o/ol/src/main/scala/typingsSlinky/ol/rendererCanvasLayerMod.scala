package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.layerLayerMod.State
import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/Layer", JSImport.Namespace)
@js.native
object rendererCanvasLayerMod extends js.Object {
  @js.native
  trait CanvasLayerRenderer
    extends typingsSlinky.ol.rendererLayerMod.default {
    var renderedResolution: Double = js.native
    /* protected */ def clip(context: CanvasRenderingContext2D, frameState: FrameState, extent: Extent): Unit = js.native
    def composeFrame(frameState: FrameState, layerState: State, context: CanvasRenderingContext2D): Unit = js.native
    /* protected */ def dispatchRenderEvent(context: CanvasRenderingContext2D, frameState: FrameState): Unit = js.native
    /* protected */ def dispatchRenderEvent(context: CanvasRenderingContext2D, frameState: FrameState, opt_transform: Transform): Unit = js.native
    def forEachLayerAtCoordinate[S, T, U](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ typingsSlinky.ol.layerLayerMod.default, 
          /* p1 */ scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Uint8Array, 
          T
        ],
      thisArg: S
    ): js.UndefOr[T] = js.native
    /* protected */ def getTransform(frameState: FrameState, offsetX: Double): Transform = js.native
    /* protected */ def postCompose(context: CanvasRenderingContext2D, frameState: FrameState, layerState: State): Unit = js.native
    /* protected */ def postCompose(
      context: CanvasRenderingContext2D,
      frameState: FrameState,
      layerState: State,
      opt_transform: Transform
    ): Unit = js.native
    /* protected */ def preCompose(context: CanvasRenderingContext2D, frameState: FrameState): Unit = js.native
    /* protected */ def preCompose(context: CanvasRenderingContext2D, frameState: FrameState, opt_transform: Transform): Unit = js.native
    def prepareFrame(frameState: FrameState, layerState: State): Boolean = js.native
  }
  
  @js.native
  class default protected () extends CanvasLayerRenderer {
    def this(layer: typingsSlinky.ol.layerLayerMod.default) = this()
  }
  
}


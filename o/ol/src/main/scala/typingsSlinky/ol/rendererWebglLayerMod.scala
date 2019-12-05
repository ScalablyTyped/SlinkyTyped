package typingsSlinky.ol

import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLTexture
import typingsSlinky.ol.layerLayerMod.State
import typingsSlinky.ol.pixelMod.Pixel
import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.rendererWebglLayerMod.WebGLLayerRenderer
import typingsSlinky.ol.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/webgl/Layer", JSImport.Namespace)
@js.native
object rendererWebglLayerMod extends js.Object {
  @js.native
  trait WebGLLayerRenderer
    extends typingsSlinky.ol.rendererLayerMod.default {
    var framebuffer: WebGLFramebuffer = js.native
    var framebufferDimension: Double = js.native
    var mapRenderer: typingsSlinky.ol.rendererWebglMapMod.default = js.native
    var projectionMatrix: Transform = js.native
    var texCoordMatrix: Transform = js.native
    var texture: WebGLTexture = js.native
    /* protected */ def bindFramebuffer(frameState: FrameState, framebufferDimension: Double): Unit = js.native
    def composeFrame(frameState: FrameState, layerState: State, context: typingsSlinky.ol.webglContextMod.default): Unit = js.native
    def forEachLayerAtPixel[S, T, U](
      pixel: Pixel,
      frameState: FrameState,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ typingsSlinky.ol.layerLayerMod.default, 
          /* p1 */ scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Uint8Array, 
          T
        ],
      thisArg: S
    ): js.UndefOr[T] = js.native
    def getProjectionMatrix(): Transform = js.native
    def getTexCoordMatrix(): Transform = js.native
    def getTexture(): WebGLTexture = js.native
    def handleWebGLContextLost(): Unit = js.native
    def prepareFrame(frameState: FrameState, layerState: State, context: typingsSlinky.ol.webglContextMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends WebGLLayerRenderer {
    def this(
      mapRenderer: typingsSlinky.ol.rendererWebglMapMod.default,
      layer: typingsSlinky.ol.layerLayerMod.default
    ) = this()
  }
  
}


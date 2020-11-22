package typingsSlinky.ol.pointsLayerMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLPointsLayerRenderer
  extends typingsSlinky.ol.webglLayerMod.default[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] {
  
  /**
    * Render the layer.
    */
  def renderFrame(frameState: FrameState): HTMLElement = js.native
  
  /**
    * Render the hit detection data to the corresponding render target
    */
  def renderHitDetection(frameState: FrameState): Unit = js.native
}

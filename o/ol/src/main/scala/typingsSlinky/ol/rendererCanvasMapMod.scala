package typingsSlinky.ol

import typingsSlinky.ol.pluggableMapMod.FrameState
import typingsSlinky.ol.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/Map", JSImport.Namespace)
@js.native
object rendererCanvasMapMod extends js.Object {
  @js.native
  trait CanvasMapRenderer
    extends typingsSlinky.ol.rendererMapMod.default {
    /* protected */ def getTransform(frameState: FrameState): Transform = js.native
  }
  
  @js.native
  class default protected () extends CanvasMapRenderer {
    def this(map: typingsSlinky.ol.pluggableMapMod.default) = this()
  }
  
}


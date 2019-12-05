package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/pointer/TouchSource", JSImport.Namespace)
@js.native
object pointerTouchSourceMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.ol.pointerEventSourceMod.default {
    def this(
      dispatcher: typingsSlinky.ol.pointerPointerEventHandlerMod.default,
      mouseSource: typingsSlinky.ol.pointerMouseSourceMod.default
    ) = this()
  }
  
  type TouchSource = typingsSlinky.ol.pointerEventSourceMod.default
}


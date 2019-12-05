package typingsSlinky.ol

import org.scalajs.dom.raw.Event
import typingsSlinky.ol.pointerMouseSourceMod.MouseSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/pointer/MouseSource", JSImport.Namespace)
@js.native
object pointerMouseSourceMod extends js.Object {
  @js.native
  trait MouseSource
    extends typingsSlinky.ol.pointerEventSourceMod.default {
    def cancel(inEvent: Event): Unit = js.native
    def cleanupMouse(): Unit = js.native
  }
  
  @js.native
  class default protected () extends MouseSource {
    def this(dispatcher: typingsSlinky.ol.pointerPointerEventHandlerMod.default) = this()
  }
  
  def prepareEvent(inEvent: Event, dispatcher: typingsSlinky.ol.pointerPointerEventHandlerMod.default): js.Any = js.native
}


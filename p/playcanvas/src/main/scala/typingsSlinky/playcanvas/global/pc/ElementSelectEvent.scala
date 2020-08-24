package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create an instance of a pc.ElementSelectEvent.
  * @property inputSource - The XR input source that this event was originally raised from.
  * @param event - The XRInputSourceEvent that was originally raised.
  * @param element - The ElementComponent that this event was originally raised on.
  * @param camera - The CameraComponent that this event was originally raised via.
  * @param inputSource - The XR input source that this event was originally raised from.
  */
@JSGlobal("pc.ElementSelectEvent")
@js.native
class ElementSelectEvent protected ()
  extends typingsSlinky.playcanvas.pc.ElementSelectEvent {
  def this(
    event: js.Any,
    element: typingsSlinky.playcanvas.pc.ElementComponent,
    camera: typingsSlinky.playcanvas.pc.CameraComponent,
    inputSource: typingsSlinky.playcanvas.pc.XrInputSource
  ) = this()
}


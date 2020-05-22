package typingsSlinky.playcanvas.mod

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
@JSImport("playcanvas", "ElementSelectEvent")
@js.native
class ElementSelectEvent protected ()
  extends typingsSlinky.playcanvas.pc.ElementSelectEvent {
  def this(
    event: js.Any,
    element: typingsSlinky.playcanvas.pc.ElementComponent,
    camera: typingsSlinky.playcanvas.pc.CameraComponent,
    inputSource: typingsSlinky.playcanvas.pc.XrInputSource
  ) = this()
  /**
    * The CameraComponent that this event was originally raised via.
    */
  /* CompleteClass */
  override var camera: typingsSlinky.playcanvas.pc.CameraComponent = js.native
  /**
    * The ElementComponent that this event was originally raised on.
    */
  /* CompleteClass */
  override var element: typingsSlinky.playcanvas.pc.ElementComponent = js.native
  /**
    * The MouseEvent or TouchEvent that was originally raised.
    */
  /* CompleteClass */
  override var event: typingsSlinky.playcanvas.pc.MouseEvent | typingsSlinky.playcanvas.pc.TouchEvent = js.native
  /**
    * The XR input source that this event was originally raised from.
    */
  /* CompleteClass */
  override var inputSource: typingsSlinky.playcanvas.pc.XrInputSource = js.native
  /**
    * Stop propagation of the event to parent {@link pc.ElementComponent}s. This also stops propagation of the event to other event listeners of the original DOM Event.
    */
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}


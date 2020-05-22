package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create an instance of a pc.ElementInputEvent.
  * @property event - The MouseEvent or TouchEvent that was originally raised.
  * @property element - The ElementComponent that this event was originally raised on.
  * @property camera - The CameraComponent that this event was originally raised via.
  * @param event - The MouseEvent or TouchEvent that was originally raised.
  * @param element - The ElementComponent that this event was originally raised on.
  * @param camera - The CameraComponent that this event was originally raised via.
  */
@JSImport("playcanvas", "ElementInputEvent")
@js.native
class ElementInputEvent protected ()
  extends typingsSlinky.playcanvas.pc.ElementInputEvent {
  def this(
    event: typingsSlinky.playcanvas.pc.MouseEvent,
    element: typingsSlinky.playcanvas.pc.ElementComponent,
    camera: typingsSlinky.playcanvas.pc.CameraComponent
  ) = this()
  def this(
    event: typingsSlinky.playcanvas.pc.TouchEvent,
    element: typingsSlinky.playcanvas.pc.ElementComponent,
    camera: typingsSlinky.playcanvas.pc.CameraComponent
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
    * Stop propagation of the event to parent {@link pc.ElementComponent}s. This also stops propagation of the event to other event listeners of the original DOM Event.
    */
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}


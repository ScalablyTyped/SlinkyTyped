package typingsSlinky.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

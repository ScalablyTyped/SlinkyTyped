package typingsSlinky.playcanvas.mod

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new Mouse device.
  * @param [element] - The Element that the mouse events are attached to.
  */
@JSImport("playcanvas", "Mouse")
@js.native
class Mouse ()
  extends typingsSlinky.playcanvas.pc.Mouse {
  def this(element: Element) = this()
}
object Mouse {
  
  /**
    * Check if the mouse pointer has been locked, using {@link pc.Mouse#enabledPointerLock}.
    * @returns True if locked.
    */
  /* static member */
  @JSImport("playcanvas", "Mouse.isPointerLocked")
  @js.native
  def isPointerLocked(): Boolean = js.native
}

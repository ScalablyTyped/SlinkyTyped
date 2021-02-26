package typingsSlinky.guacamoleClient.mod

import org.scalajs.dom.raw.HTMLDocument
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "Mouse")
@js.native
class Mouse protected ()
  extends typingsSlinky.guacamoleClient.mouseMod.Mouse {
  /**
    * @param element The Element to use to provide mouse events.
    */
  def this(element: HTMLDocument) = this()
  def this(element: HTMLElement) = this()
}
object Mouse {
  
  @JSImport("guacamole-client", "Mouse.GuacTouchDevice")
  @js.native
  class GuacTouchDevice protected ()
    extends typingsSlinky.guacamoleClient.mouseMod.Mouse.GuacTouchDevice {
    /**
      * @param element The Element to use to provide touch events.
      */
    def this(element: HTMLElement) = this()
  }
  
  @JSImport("guacamole-client", "Mouse.State")
  @js.native
  class State protected ()
    extends typingsSlinky.guacamoleClient.mouseMod.Mouse.State {
    /**
      * @param x The X position of the mouse pointer in pixels.
      * @param y The Y position of the mouse pointer in pixels.
      * @param left Whether the left mouse button is pressed.
      * @param middle Whether the middle mouse button is pressed.
      * @param right Whether the right mouse button is pressed.
      * @param up Whether the up mouse button is pressed (the fourth button, usually part of a scroll wheel).
      * @param down Whether the down mouse button is pressed (the fifth button, usually part of a scroll wheel).
      */
    def this(x: Double, y: Double, left: Boolean, middle: Boolean, right: Boolean, up: Boolean, down: Boolean) = this()
  }
  
  @JSImport("guacamole-client", "Mouse.Touchpad")
  @js.native
  class Touchpad protected ()
    extends typingsSlinky.guacamoleClient.mouseMod.Mouse.Touchpad {
    /**
      * @param element The Element to use to provide touch events.
      */
    def this(element: HTMLElement) = this()
  }
  
  @JSImport("guacamole-client", "Mouse.Touchscreen")
  @js.native
  class Touchscreen protected ()
    extends typingsSlinky.guacamoleClient.mouseMod.Mouse.Touchscreen {
    /**
      * @param element The Element to use to provide touch events.
      */
    def this(element: HTMLElement) = this()
  }
}
